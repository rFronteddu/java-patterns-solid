package patterns.behavioral.visitor;

import java.util.HashMap;

public class AppraisalVisitor implements Visitor
{

    private final Ratings ratings = new Ratings ();

    @SuppressWarnings ("serial") public static class Ratings extends HashMap<Integer, PerformanceRating>
    {
        public int getFinalRating (final int empId) {
            return get (empId).getFinalRating ();
        }
    }

    @Override public void visit (final Programmer programmer) {
        PerformanceRating finalRating = new PerformanceRating (programmer.getEmployeeId (), programmer.getPerformanceRating ());

        finalRating.setFinalRating (programmer.getPerformanceRating ());

        ratings.put (programmer.getEmployeeId (), finalRating);
    }

    @Override public void visit (final ProjectLead lead) {
        //25% team & 75% personal
        PerformanceRating finalRating = new PerformanceRating (lead.getEmployeeId (), lead.getPerformanceRating ());

        int teamAverage = getTeamAverage (lead);
        int rating = Math.round (0.75f * lead.getPerformanceRating () + 0.25f * teamAverage);
        finalRating.setFinalRating (rating);
        finalRating.setTeamAverageRating (teamAverage);

        ratings.put (lead.getEmployeeId (), finalRating);

    }

    @Override public void visit (final Manager manager) {
        //50% team & 50% personal
        PerformanceRating finalRating = new PerformanceRating (manager.getEmployeeId (),
                manager.getPerformanceRating ());

        int teamAverage = getTeamAverage (manager);
        int rating = Math.round (0.5f * manager.getPerformanceRating () + 0.5f * teamAverage);
        finalRating.setFinalRating (rating);
        finalRating.setTeamAverageRating (teamAverage);

        ratings.put (manager.getEmployeeId (), finalRating);
    }

    @Override public void visit (final VicePresident vp) {
        //75% team & 25% personal
        PerformanceRating finalRating = new PerformanceRating (vp.getEmployeeId (), vp.getPerformanceRating ());

        int teamAverage = getTeamAverage (vp);
        int rating = Math.round (0.25f * vp.getPerformanceRating () + 0.75f * teamAverage);
        finalRating.setFinalRating (rating);
        finalRating.setTeamAverageRating (teamAverage);

        ratings.put (vp.getEmployeeId (), finalRating);

    }

    private int getTeamAverage (final Employee emp) {
        return (int) Math.round (emp.getDirectReports ().stream ()
                .mapToDouble (Employee::getPerformanceRating)
                .average ()
                .getAsDouble ());
    }

    public Ratings getFinalRatings () {
        return ratings;
    }
}
