import java.util.Scanner;

public class AreaCoveredbyPlanes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int area1 = (x2-x1)*(y2-y1);
        int area2 = (x4-x3)*(y4-y3);
        if(x3 > x2 || y3 > y2){
            System.out.println(area1+area2);
        }else{
            int intersectingArea = (y2-y3)*(x2-x3);
            System.out.println(area1+area2-intersectingArea);
        }
        sc.close();

    }
}