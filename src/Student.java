public class Student {
    private String fName;
    private String lName;
    private  String id;

    public Student(String fName, String lName, String id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }

    public Student() {

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student First Name : " + this.fName;
    }
}
