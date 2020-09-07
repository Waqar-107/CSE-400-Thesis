class Person{ 
    private String name;

    Person(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }
}

class Student extends Person {
    private int studentID;

    Student(int studentID, String name){
        super(name);
        this.studentID = studentID;
    }

    int getID(){
        return this.studentID;
    }

    void setID(int studentID){
        this.studentID = studentID;
    }
}

public class tester {
    public static void main(String[] args){
        Student st = new Student(1505107, "waqar");
        System.out.println(st.getName() + " " + st.getID());
    }
}
