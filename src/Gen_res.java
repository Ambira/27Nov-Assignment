public class Gen_res {
        public static void main(String[] args) {
            // Creating three student objects
            int[] marks1 = {95, 70, 80, 90};
            int[] marks2 = {67, 22, 89, 45};
            int[] marks3 = {14, 76, 33, 91};
            Students student1 = new Students("Mbira", 16, marks1);
            Students student2 = new Students("Ash", 19, marks2);
            Students student3 = new Students("Maomao", 17, marks3);

            // Displaying results for each student
            Result.displayResults(student1);
            Result.displayResults(student2);
            Result.displayResults(student3);
        }
    }

