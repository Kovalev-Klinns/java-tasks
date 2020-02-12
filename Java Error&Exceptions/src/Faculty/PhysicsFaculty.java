package Faculty;

import StudentsAndSubjects.GroupOfStudents;

public class PhysicsFaculty extends Faculty {
    private static String facultyName = "Physics faculty";

    public PhysicsFaculty(GroupOfStudents[] groupOfStudents) throws NoGroupAtFacultyException {
        super(groupOfStudents);
    }
    @Override
    public String toString() {
        return facultyName;
    }
}
