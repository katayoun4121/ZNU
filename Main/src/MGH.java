import java.util.Scanner;
public class MGH {
     private static final double g=9.8;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter M:");
        double M= scanner.nextDouble();
        System.out.println("please enter the amount og H:");
        double H=scanner.nextDouble();
        double MGH= M * g * H;
        System.out.println("the amount of mgh equals to:" +MGH);
        scanner.close();
    }
}
