import models.Constructor;
import models.Student;

public class Main {
    public static void main(String[] args) {
        // Make new Object from Student Class
        // Create the first student
        Student std1 = new Student();
        // Set values for the first student
        std1.setName("Mbira");
        std1.setAge(16);
        std1.setGrade(12);
        std1.setSection("Yala");

        System.out.println("Name: " + std1.getName());
        System.out.println("Age: " + std1.getAge());

        System.out.println("Grade: "+ std1.getGrade());
        System.out.println("Section: "+ std1.getSection());


        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();

        // Set values for the other three students
        std2.setName("Aron");
        std2.setAge(18);
        std2.setGrade(12);
        std2.setSection("B");

        std3.setName("Maomao");
        std3.setAge(17);
        std3.setGrade(12);
        std3.setSection("meow");

        std4.setName("Ava");
        std4.setAge(14);
        std4.setGrade(9);
        std4.setSection("B");

        // Print values for the other three students
        System.out.println("Name: " + std2.getName());
        System.out.println("Age: " + std2.getAge());

        System.out.println("Grade: "+ std2.getGrade());
        System.out.println("Section: "+ std2.getSection());

        System.out.println("Name: " + std3.getName());
        System.out.println("Age: " + std3.getAge());
        System.out.println("Grade: "+ std3.getGrade());
        System.out.println("Section: "+ std3.getSection());

        System.out.println("Name: " + std4.getName());
        System.out.println("Age: " + std4.getAge());
        System.out.println("Grade: "+ std4.getGrade());
        System.out.println("Section: "+ std4.getSection());


        // Make new Object from ConstructorStudent
        int[] mark1={10,20,30,40,50,60,70,80,90,100};
        Constructor stud1=new Constructor("Mbira","Yala",12,mark1);
        stud1.displayInformation();

        int[] mark3={10,20,30,40,50,60,70,80};
        Constructor stud2=new Constructor("Maomao","meow",12,mark3);
        stud2.displayInformation();

        int[] mark2={10,20,30,40,50,60,70};
        Constructor stud3=new Constructor("Aron","B",9,mark2);
        stud3.displayInformation();

    }}