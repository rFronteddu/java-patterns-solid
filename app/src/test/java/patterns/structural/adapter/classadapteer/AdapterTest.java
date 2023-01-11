package patterns.structural.adapter.classadapteer;


import org.junit.Test;
import patterns.structural.adapter.objectadapter.EmployeeObjectAdapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdapterTest
{
    @Test public void classAdapterTest () {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter ();
        populateEmployeeData (adapter);
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner ();
        String card = businessCardDesigner.designCard (adapter);
        assertTrue (card.contains ("Jon Doe"));
    }

    @Test public void objectAdapterTest () {
        Employee employee = new Employee ();
        populateEmployeeData (employee);
        EmployeeObjectAdapter adapter = new EmployeeObjectAdapter (employee);
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner ();
        String card = businessCardDesigner.designCard (adapter);
        assertTrue (card.contains ("Jon Doe"));
    }

    private static void populateEmployeeData (final Employee employee) {
        employee.setFullName ("Jon Doe");
        employee.setJobTitle ("Security Engineer");
        employee.setOfficeLocation ("All safe Cyb, NYC, New York");
    }
}