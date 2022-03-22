package maltepe.edu.tr.oop;

public class Student extends Person {

    private String Name;
    private int number;

    public Student() {

    }


    private String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;

    }
    private int getnumber() {
        return number;
    }
    public void setnumber(int number) {
        this.number = number;

    }

    public String welcome(){
        return "\nWelcome to the system " +getName()+ " this is your number  : "+getnumber();
    }
    public String printString() {
        return "StudentName="+getName()+ "  number:"+getnumber();

    }





}
