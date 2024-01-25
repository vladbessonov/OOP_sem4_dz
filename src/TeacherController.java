public class TeacherController implements UserController<Teacher> {

    @Override
    public Teacher create(int i, String firstName, String secondName, String lastName) {
        return new Teacher(firstName, secondName, lastName);

    }
}
