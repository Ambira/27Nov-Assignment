
    import java.util.Arrays;

    public class Result {
        public static void displayResults(Students student) {
            System.out.println("----- Report Card for " + student.getName() + " -----");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Percentage: " + percentage(student.getMarks()) + "%");
            System.out.println("Result: " + result(student.getGrade()));
            System.out.println("------------------------------------");
        }

        private static double percentage(int[] marks) {
            int totalMarks = Arrays.stream(marks).sum();
            return (double) totalMarks / marks.length;
        }

        private static String result(char grade) {
            if (grade == 'F') {
                return "Fail";
            }
            else{
                return "Pass";
            }
        }
    }

