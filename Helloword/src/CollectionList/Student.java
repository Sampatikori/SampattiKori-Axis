package CollectionList;

public class Student {
    int rollNo;
    String name;
    String branch;
    String location;

    public Student() {
    }

    public Student(int rollNo, String name, String branch, String location) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.location = location;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
