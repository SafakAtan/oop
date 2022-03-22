package maltepe.edu.tr.oop;

public class Person {
    // Instance variables
    private String Role;
    private int ID;

    public Person(String Role, int ID) {
        this.Role = Role;
        this.ID = ID;
    }

    public Person() {
    }

    // Getters
    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String printString() {
        return "Role=" + getRole() + " ID:" + getID();

    }
}