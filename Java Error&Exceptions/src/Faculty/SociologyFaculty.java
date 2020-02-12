package Faculty;
import StudentsAndSubjects.GroupOfStudents;

public class SociologyFaculty extends Faculty{
    private static String facultyName = "Sociology Faculty";

    public SociologyFaculty(GroupOfStudents[] groupOfStudents) throws NoGroupAtFacultyException {
        super(groupOfStudents);
    }

    @Override
    public String toString() {
        return facultyName;
    }
}
