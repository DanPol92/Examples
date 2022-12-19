package StudentsExample;

public class SchoolClass {
    private final int maxvar = 5;
    private Person[] personsInTheClass = new Person[maxvar];

    public void addInClass() {
        personsInTheClass[0] = new Teacher("Dan","dan@mail.com",1,"10 years");
        personsInTheClass[1] = new Student("adad","adadaa",3,"101","10,9,10");
        personsInTheClass[2] = new PrivateTeacher("Aa","ddsdsa",2,"5 years");
        personsInTheClass[3] = new PublicTeacher("dsd","dsdsd",1,"4 years");

    }

    public void identification() {
        for (int i = 0; i < personsInTheClass.length; i++) {
            if (personsInTheClass[i] != null) {
                personsInTheClass[i].whoAmI();
                if (personsInTheClass[i].getIdentifier() == 1)
                    System.out.println(personsInTheClass[i]);
            }
        }
    }


    public static void main(String[] args) {

        SchoolClass sc = new SchoolClass();
        sc.addInClass();
        sc.identification();
    }
}
