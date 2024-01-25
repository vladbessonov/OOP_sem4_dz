public interface UserController<T extends User> {
    T create(int UserId, String firstName, String secondName, String lastName);
}
