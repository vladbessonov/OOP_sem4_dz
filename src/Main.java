import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {
        Student student1 = new Student("aab", "aab", "aab");
        Student student2 = new Student("aaa", "aaa", "aaa");
        Student student3 = new Student("Aaa", "Aaa", "Aaa");
        Student student4 = new Student("bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        //StudentGroupService service = new StudentGroupService(studentGroup);
        //for (Student student : studentGroup) {
        //    System.out.println(student);
        //}
        //System.out.println();
        //for (Student student : service.getSortedStudentGroup()) {
        //    System.out.println(student);
        //}
        //System.out.println();
        //for (Student student : service.getSortedStudentGroupByFIO()) {
        //    System.out.println(student);
        //}

        StudentController controller= new StudentController();
        System.out.println(controller.create(1, "a", "a", "a"));
        test(new StudentView());
        test(new StudentController());


        Teacher teacher1 = new Teacher( "b", "b", "b");
        Teacher teacher2 = new Teacher("c", "c", "c");
        Teacher teacher3 = new Teacher("d", "d", "d");
        Teacher teacher4 = new Teacher("e", "e", "e");

        List<Teacher> teacherList = new ArrayList<>();
        TeacherGroup teacherGroup = new TeacherGroup(teacherList);

        teacherGroup.addTeacher(teacher1);
        teacherGroup.addTeacher(teacher2);
        teacherGroup.addTeacher(teacher3);
        teacherGroup.addTeacher(teacher4);

        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }



    }
    public static void test(UserView userView){};
    public static void test(UserController userView){};
    public static void test(User userView){};

}