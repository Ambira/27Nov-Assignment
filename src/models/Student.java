package models;

public class Student {
    String Name,  Section;
    int Age, Grade;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    public int getGrade() {
        return Grade;
    }

    public void setGrade(int zGrade) {
        Grade = zGrade;

    }
}