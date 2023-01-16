package patterns.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Report
{
    final private String name;
    // "NOT ADMIN", "FINANCE_USER AND ADMIN"
    final private String permission;
}
