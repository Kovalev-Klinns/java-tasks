package Faculty;

import StudentsAndSubjects.GroupOfStudents;

public class ComputerScienceFaculty  extends Faculty {
    private static String facultyName = "Computer science faculty";

    public ComputerScienceFaculty(GroupOfStudents[] groupOfStudents) throws NoGroupAtFacultyException {
        super(groupOfStudents);
    }

    @Override
    public String toString() {
        return facultyName;
    }
}
