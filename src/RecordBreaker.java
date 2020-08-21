// Round D question-1 Record Breaker
import java.util.Scanner;

public class RecordBreaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 1; i <= testCase; i++) {
            int noOfDays = sc.nextInt();
            int[] day = new int[noOfDays];
            for (int j = 0; j < noOfDays; j++)
                day[j] = sc.nextInt();
            int recordBreakDays = 0;
            int maxPeople = -1;
            for (int k = 0; k < noOfDays; k++) {
                if (k == noOfDays - 1 && day[k] > maxPeople)
                    recordBreakDays++;
                else if (k == 0 && day[0] > day[1])
                    recordBreakDays++;
                else if (day[k] > maxPeople && day[k] > day[k + 1])
                    recordBreakDays++;
                maxPeople = Math.max(day[k], maxPeople);
            }
            System.out.println("Case #" + i + ": " + recordBreakDays);
        }
    }
}