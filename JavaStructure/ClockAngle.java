import java.util.Scanner;

// Clock and Angles
// PrepBuddy has an analog clock which consists of two hands one for hour and another for minute. She wants to calculate the shorter angle formed between hour and minute hand at any given time.
// Input format
// The first line contains the number of test cases TT. Each test case contains two integers hh and mm representing the time in hour and minute format.
// Output format
// For each test case on a new line, print the required shorter angle.
// Constraints
// 1<=T<=5 All valid times
// Time Limit
// 11 ​secon
// Example
// Input
// 2 
// 5 30 
// 6 00
// Output
// 15 
// 180



public class ClockAngle {

    public static double angleClock(int hour, int minutes) {
        if(hour == 12){
            hour = 0;
        }

        double minuteAngle = 6.0*(minutes);
        double hourAngle = 30.0*(hour)+ 0.5*minutes;

        double alphaAngle = Math.abs(minuteAngle-hourAngle);
        double betaAngle = 360-alphaAngle;

        return (Math.min(alphaAngle, betaAngle));
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>=0){
            double result = angleClock(sc.nextInt(), sc.nextInt());
            System.out.printf("%.0f\n", result);
            t--;
        }
    }
    
}
