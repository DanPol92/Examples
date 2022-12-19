package StudentsExample;

public abstract class Person {
    private String name;
    private String email;
    private int identifier;

    abstract void whoAmI();


    public Person(String name, String email, int identifier) {
        this.name = name;
        this.email = email;
        this.identifier = identifier;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void identifier(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
