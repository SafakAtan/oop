package maltepe.edu.tr.oop;

public class Lab1mainn {
    public static void main(String[] args) {



            Person p1 = new Person();
            p1.setRole("student");
            p1.setID(2032103);
            Student S1 = new Student();
            S1.setName("Hiba");
            S1.setnumber(203);
            Prof P = new Prof("OOP", "Ensar Gul");

            System.out.println(p1.printString());
            System.out.println(S1.printString()+S1.welcome());
            System.out.println(P.printString()+P.Teaches());

        }
    }



