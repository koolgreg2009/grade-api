package use_case;
import api.GradeDB;
import api.MongoGradeDB;
import entity.Grade;
import entity.Team;

public final class GetAverageGradeUseCase {
    private final GradeDB gradeDB;

    public GetAverageGradeUseCase(GradeDB gradeDB) {
        this.gradeDB = gradeDB;
    }

    public float getAverageGrade(String course) {
        // TODO: Get average grade for all students in your team.
        Grade grade = gradeDB.getGrade("lijiaro3", course);
        return grade.getGrade();
    }
}
