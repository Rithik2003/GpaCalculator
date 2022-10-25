//trying to convert this code using figma and into a website

import java.util.Scanner;
public class GPA {

    // "A+" --> 4.0, "A" --> 4.0, "A-" --> 3.7, ... so on.
    static double letterToPoints(String grade) {
        if (grade.equals("A+") || grade.equals("A"))
            return 4;
        if (grade.equals("A-"))
            return 3.7;
        if (grade.equals("B+"))
            return 3.3;
        if (grade.equals("B"))
            return 3;
        if (grade.equals("B-"))
            return 2.7;
        if (grade.equals("C+"))
            return 2.3;
        if (grade.equals("C"))
            return 2;
        if (grade.equals("C-"))
            return 1.7;
        if (grade.equals("D+"))
            return 1.3;
        if (grade.equals("D"))
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //CODE HERE
        int coreHours = 0;
        double coreGp =0;
        double totalGp = 0;
        int totalHours = 0;


        while(true){
            int creditHours = input.nextInt();
            if(creditHours == 0){
                break;
            }

            String letterGrade = input.next();
            String coreCourse = input.next();

            totalHours += creditHours;
            totalGp += creditHours * letterToPoints(letterGrade);



            if(coreCourse.equals("Y")){
                coreHours += creditHours;
                coreGp += creditHours * letterToPoints(letterGrade);

            }




        }

        double CumulativeGp = (totalGp/totalHours);
        System.out.printf("Cumulative GPA: " +String.format("%.2f", CumulativeGp));

        if(coreHours == 0){
            System.out.println("Core GPA: NA");
        }

        else{
            double CoreGp = (coreGp/coreHours);
            System.out.println("Core GPA: " +String.format("%.2f", CoreGp));
        }



        //use following formatted print mechanism to get exactly 2 decimal digits in the output:
        //System.out.printf("Cumulative GPA: %.2f", ...);

    }

}