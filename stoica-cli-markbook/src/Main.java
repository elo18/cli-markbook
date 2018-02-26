public class Main {
    public static void main(String[] args) {
        //Call my missingAssignments method in the main method
    }

    public static void missingAssignments (int[] marks, String[] names){
        for (int i = 0; i< marks.length - 1; i++){
            if (marks[i] == 0) {
                System.out.println(names[i] + " is missing the assignment.");
            }
        }
    }

}
