import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] marks;
        int singleMark;
        String[] names;
        String singleName;
        int numberOfStudents;

        System.out.println("How many students are in the class? ");
        numberOfStudents = in.nextInt();
        marks = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            
        }

    }

    public static void missingAssignments (int[] marks, String[] names){
        for (int i = 0; i< marks.length - 1; i++){
            if (marks[i] == 0) {
                System.out.println(names[i] + " is missing the assignment.");
            }
        }
    }

}
