import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] marks;
        int singleMark;
        String[] names;
        String singleName;
    }

    public static void missingAssignments (int[] marks, String[] names){
        for (int i = 0; i< marks.length - 1; i++){
            if (marks[i] == 0) {
                System.out.println(names[i] + " is missing the assignment.");
            }
        }
    }

}
