package StudentsExample;

public class PublicTeacher extends Teacher{
    public PublicTeacher(String name, String email, int identifier, String experience) {
        super(name, email, identifier, experience);
    }

    @Override
    public void whoAmI() {
        System.out.println("hello, i am a public teacher and i have "+getExperience()+ " of experience");
    }
}
