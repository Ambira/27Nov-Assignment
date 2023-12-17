import java.util.Arrays;
public class Students {
        String name;
        int age;
        int[] marks;
        char grade;

        public Students(String name, int age, int[] marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
            calculateGrade();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int[] getMarks() {
            return marks;
        }

        public void setMarks(int[] marks) {
            this.marks = marks;
        }

        public char getGrade() {
            return grade;
        }

        public void setGrade(char grade) {
            this.grade = grade;
        }

        private void calculateGrade() {
            int totalMarks = Arrays.stream(marks).sum();
            int percentage = totalMarks / marks.length;

            if (percentage >= 80) {
                grade = 'A';
            } else if (percentage >= 70) {
                grade = 'B';
            } else if (percentage >= 60) {
                grade = 'C';
            } else if (percentage >= 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        }

    }

