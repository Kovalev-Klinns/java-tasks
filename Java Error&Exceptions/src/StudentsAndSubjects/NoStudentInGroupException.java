package StudentsAndSubjects;

public class NoStudentInGroupException extends Exception {
    public NoStudentInGroupException() {
        System.err.println("Group should contain at least one student");
    }
}
