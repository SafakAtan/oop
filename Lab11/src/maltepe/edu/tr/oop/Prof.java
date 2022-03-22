package maltepe.edu.tr.oop;

public class Prof extends Person {
    private String Subject;
    private String Constructor;

    public Prof(String Subject, String Constructor) {
        this.Subject = Subject;
        this.Constructor = Constructor;
    }


    private String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;

    }

    private String getConstructor() {

        return Constructor;
    }

    public void setConstructor(String Constructor) {
        this.Constructor = Constructor;

    }

    public String Teaches() {
        return "\nProfessor " + getConstructor() + " is teaching " + getSubject();
    }

    public String printString() {
        return "Subject=" + getSubject();

    }
}