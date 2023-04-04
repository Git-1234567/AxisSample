package CollectionFramework;

public class Student {
    int rno;
    String name;
    String branch;
    String city;
    public Student(){

    }
    public Student(int rno,String name,String branch,String city) {
        this.rno = rno;
        this.name=name;
        this.branch=branch;
        this.city=city;
    }
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
