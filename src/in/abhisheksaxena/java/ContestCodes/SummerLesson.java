package in.abhisheksaxena.java.ContestCodes;
import java.util.*;

/*
Among all students planning to enroll to summer school at a university, each student wants to take exactly one out of all the available classes. To help the university in planning, your task is to find out how many students are taking each class.

        Complete the function howManyStudents which takes in an integer denoting the number of available classes, and an integer array denoting index of each class as input. The function must return an integer array where each element in the array represents the number of students that want to take each class.

        Input Format

        The first line contains two space-separated integers , denoting the total number of students and , denoting the number of available classes.

        The second line contains  space-separated integers , where  represents the index of the class that student  wants to take.

        Note: We index the students  to  and we index the classes  to .

        Constraints

        Output Format

        Print a single line containing  space-separated integers ,where  represents the number of students that want to take class .

        Sample Input 0

        4 3
        2 2 0 2
        Sample Output 0

        1 0 3
        Explanation 0

        There are  students and  classes. We have , which means that:

        Student  wants to take class .
        Student  wants to take class .
        Student  wants to take class .
        Student  wants to take class .
        This means that:

        student wants to take class .
        students want to take class .
        students want to take class .
*/

public class SummerLesson {


    /*
     * Complete the howManyStudents function below.
     */
    private static int[] howManyStudents(int availableClasses, int[] c) {
        // Return an array denoting the number of students taking each class.
        //n = number of students and n = c.length

        int[] classes = new int[availableClasses];

        for(int j = 0; j < availableClasses; j++) {
            for (int i = 0; i < c.length; i++) {
                //System.out.println("c: " + c[i] + " i: " + i);

                if (c[i] == j)
                    classes[j]++;
            }
        }
        return classes;

    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] c = new int[n];

        String[] cItems = scan.nextLine().split(" ");

        for (int cItr = 0; cItr < n; cItr++) {
            int cItem = Integer.parseInt(cItems[cItr].trim());
            c[cItr] = cItem;
        }

        int[] result = howManyStudents(m, c);

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}