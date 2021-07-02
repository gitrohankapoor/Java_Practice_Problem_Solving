import java.util.*;
import java.util.stream.Collectors;

public class TreeSetTest {
    public static void main(String args[]){
        SortedSet<Student> studentList = new TreeSet<>();
        studentList.add(new Student("Rohan",new Integer(1),new Integer(2020)));
        studentList.add(new Student("Shivani",new Integer(2),new Integer(2020)));
        studentList.add(new Student("Naresh",new Integer(3),new Integer(2021)));
        studentList.add(new Student("Rekha",new Integer(4),new Integer(2021)));
        System.out.println(studentList.size());

        studentList= new TreeSet(Comparator.comparing(Student::getName));
        System.out.println(studentList.size());
        studentList.forEach(s->System.out.println(s.toString()));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Rohan",new Integer(1),new Integer(2020)));
        students.add(new Student("Rohan",new Integer(2),new Integer(2020)));
        students.add(new Student("Naresh",new Integer(3),new Integer(2021)));
        students.add(new Student("Rekha",new Integer(4),new Integer(2021)));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                 if(o1.getName().compareTo(o2.getName())==0) {
                     return    o1.getRollNo()-o2.getRollNo();
                }
                 else
                     return o1.getName().compareTo(o2.getName());
            }
        });
        students.forEach(s->System.out.println(s.toString()));

        HashSet<Student> distinctStudent  = new HashSet<>();
        //students.forEach(s->distinctStudent.removeIf(d->!distinctStudent.add(s)));
        distinctStudent.addAll(students);
        distinctStudent.forEach(d->System.out.println(d.toString()));

    }
}
class Student implements Comparable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    String name;
    Integer rollNo;
    Integer year;
    Student(String name, Integer rollNo,Integer year){
        this.name=name;
        this.rollNo=rollNo;
        this.year=year;
    }
    @Override
    public String toString(){
        return "Student name "+name+" roll no"+rollNo;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        return s.getName().compareTo(this.getName());
    }
    @Override
    public boolean equals(Object o){
        Student s = (Student)o;
        if(s.getName().equalsIgnoreCase(this.getName())) return true;
        return false;
    }

}
