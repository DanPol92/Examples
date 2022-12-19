package StudentsExample;

public class Teacher extends Person {
        private String experience;

        public Teacher(String name, String email, int identifier,String experience ){
                super(name, email, identifier);
                this.experience=experience;
        }

        public String getExperience() {
                return experience;
        }

        public void whoAmI() {
                System.out.println("hello, i am a teacher and i have "+experience+ " of experience");
        }


}
