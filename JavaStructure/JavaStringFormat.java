
public class JavaStringFormat {
    public static void main(String[] args) throws Exception {

        System.out.println("------------------------------");
        System.out.printf("    %s%n","Java's Primitive Types");
        System.out.printf("    %s%n","(printf table example)");
        System.out.println("------------------------------");
        System.out.printf("| %-10S| %-8S| %4S |%n", "category", "name", "bits");
        System.out.printf("| %-10s| %-8s| %04d |%n","Floating", "double", 64);
        System.out.printf("| %-10s| %-8s| %04d |%n","Floating", "float", 32);
        System.out.printf("| %-10s| %-8s| %04d |%n","Integral", "long", 64);
        System.out.printf("| %-10s| %-8s| %04d |%n","Integral", "int", 32);
        System.out.printf("| %-10s| %-8s| %04d |%n","Integral", "char", 16);
        System.out.printf("| %-10s| %-8s| %04d |%n","Integral", "small", 16);
        System.out.printf("| %-10s| %-8s| %04d |%n","Integral", "byte", 8);
        System.out.printf("| %-10s| %-8s| %04d |%n","Boolean", "boolean", 1);
        System.out.println("------------------------------");
    }

}

