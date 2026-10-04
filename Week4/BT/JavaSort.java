package Week4.BT;
import java.util.*;

class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;

    }
    public int getID(){
        return id;

    }

    public String getName(){
        return name;

    }

    public double getCgpa(){
        return cgpa;
    }

}

public class JavaSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Student> student = new ArrayList<Student>();
        while(n > 0) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            Student st = new Student(id, name, cgpa);
            student.add(st);
            n--;

        }

        Collections.sort(student, new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                if(Double.compare(s2.getCgpa(), s1.getCgpa()) != 0){
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }
                if(!s1.getName().equals(s2.getName())){
                    return s1.getName().compareTo(s2.getName());
                }

                return Integer.compare(s1.getID(), s2.getID());
            }
        });

        for(Student s : student){
            System.out.println(s.getName());
        }
        sc.close();
    }
}