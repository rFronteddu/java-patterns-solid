package patterns.behavioral.command;

import java.util.LinkedList;
import java.util.List;

// Do not use in production
// invoker executing commands
// starts a worker thead in charge of executing commands
public class MailTaskRunner implements Runnable
{
    private final Thread runner;

    private final List<Command> pendingCommands;

    private volatile boolean stop;

    private static final MailTaskRunner RUNNER = new MailTaskRunner ();

    public static MailTaskRunner getInstance () {
        return RUNNER;
    }

    private MailTaskRunner () {
        pendingCommands = new LinkedList<> ();
        runner = new Thread (this);
        runner.start ();
    }

    // execute pending commands
    @Override public void run () {
        System.out.println ("Starting runner...");
        while (true) {
            Command cmd;
            synchronized (pendingCommands) {
                if (pendingCommands.isEmpty ()) {
                    try {
                        pendingCommands.wait ();
                    }
                    catch (InterruptedException e) {
                        System.out.println ("Runner interrupted");
                        if (stop) {
                            System.out.println ("Runner stopping");
                            return;
                        }
                    }
                }
                cmd = pendingCommands.isEmpty () ? null : pendingCommands.remove (0);
            }
            if (cmd == null) {
                return;
            }
            cmd.execute();
        }

    }


    public void addCommand (final Command cmd) {
        synchronized (pendingCommands) {
            pendingCommands.add (cmd);
            pendingCommands.notifyAll ();
        }
    }

    public void shutdown () {
        this.stop = true;
        this.runner.interrupt ();
    }
}
