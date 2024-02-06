package school;

public class Car {
    public static void main(String[] args) {
        Student s = new Student(67, 1);
        System.out.println("The name is: "+s.rank);
        System.out.println("Marks of the student is: "+s.marks);
        Student s1 = s;
        s1.rank = 2;
        System.out.println("The new rank is :"+s.rank);
    }
}
