package models;

public class Constructor {
      String Name, Section;
    int Grade = 12,fullMarks;
    int[] marks;

    public Constructor(String name, String section, int grade, int[] marks) {
        Name = name;
        Section = section;
        Grade = grade;
        this.marks = marks;
        this.fullMarks=calculateFullMarks(marks);
    }
    private int calculateFullMarks(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }
    public String getName() {
        return Name;
    }

    public String getSection() {
        return Section;
    }

    public int getGrade() {
        return Grade;
    }

    public int getFullMarks() {
        return fullMarks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void displayInformation(){
        String userName=this.Name;
        String userSection=this.Section;
        int userGrade=this.Grade;
        int userMarks=this.fullMarks;
        String DisplayInformation=userName+" Studying in "+userGrade+" section "+userSection+" obtained "+userMarks+" as Total Marks";
        System.out.println(DisplayInformation);
    }


}

