public class StudentController implements UserController<Student> {
    @Override
    public Student create(int i, String firstName, String secondName, String lastName) {
        return new Student(firstName, secondName, lastName);
    }
}
