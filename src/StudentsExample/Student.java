package StudentsExample;

public class Student extends Person{
   private String classes;
   private String grades;

    @Override
    public void whoAmI() {

        System.out.println("hello, i am a student, i'm in class number "+classes+" and my grades are: "+grades);

    }

    public Student(String name, String email, int identifier, String classes, String grades) {
        super(name, email, identifier);
        this.classes = classes;
        this.grades = grades;
    }


}
