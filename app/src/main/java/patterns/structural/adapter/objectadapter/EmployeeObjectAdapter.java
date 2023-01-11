package patterns.structural.adapter.objectadapter;

import patterns.structural.adapter.classadapteer.Customer;
import patterns.structural.adapter.classadapteer.Employee;

/**
 * An object adapter. Using composition to translate interface
 */
public class EmployeeObjectAdapter implements Customer
{
    final Employee employee;

    public EmployeeObjectAdapter (final Employee employee) {
        this.employee = employee;
    }

    @Override public String getName () {
        return employee.getFullName ();
    }

    @Override public String getDesignation () {
        return employee.getFullName ();
    }

    @Override public String getAddress () {
        return employee.getOfficeLocation ();
    }
}
