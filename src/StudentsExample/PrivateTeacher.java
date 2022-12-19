package StudentsExample;

public class PrivateTeacher extends Teacher{
    public PrivateTeacher(String name, String email, int identifier, String experience) {
        super(name, email, identifier, experience);
    }


    @Override
    public void whoAmI() {
        System.out.println("hello, i am a private teacher and i have "+getExperience()+ " of experience");
    }

}
