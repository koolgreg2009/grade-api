package use_case;
import api.GradeDB;
import entity.Grade;
import entity.Team;
import java.util.List;
import java.util.LinkedList;


public final class GetAverageGradeUseCase {
    private final GradeDB gradeDB;

    public GetAverageGradeUseCase(GradeDB gradeDB) {
        this.gradeDB = gradeDB;
    }

    public float getAverageGrade(String course) {
        // TODO: Get average grade for all students in your team.

//        String [] membersArray = gradeDB.getMyTeam().getMembers(); // does this get the members in the team?
//        int total = 0;
//        for (String member: membersArray){
//            total += (gradeDB.getGrade(member, course).getGrade());
//        }
//        return (float) total / (float) membersArray.length;
            Team team = gradeDB.getMyTeam();
            if (team != null && team.getMembers() != null) {
                String[] membersArray = team.getMembers();
                int total = 0;
                for (String member : membersArray) {
                    total += (gradeDB.getGrade(member, course).getGrade());
                }
                return (float) total / membersArray.length;
            }
            return 0.0f;



    }
}
