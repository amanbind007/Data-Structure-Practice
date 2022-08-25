public class Pattern {

    public static void leftTrianle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void rightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = i; j <= height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void pyramid(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = i; j <= height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void oppRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {

            for (int j = i; j <= height; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void oppLeftTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= height; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }


    public static void main(String[] args) {
        System.out.println("==========================================");
        leftTrianle(10);

        System.out.println("==========================================");
        rightTriangle(10);

        System.out.println("==========================================");
        pyramid(10);

        System.out.println("==========================================");
        oppRightTriangle(10);

        System.out.println("==========================================");
        oppLeftTriangle(10);

        System.out.println("==========================================");

    }
}
