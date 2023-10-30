import java.util.Scanner;
public class IPAddress{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first octet:");
        int oct1 = scan.nextInt();
        System.out.println("Please enter the second octet:");
        int oct2 = scan.nextInt();
        System.out.println("Please enter the third octet:");
        int oct3 = scan.nextInt();
        System.out.println("Please enter the fourth octet:");
        int oct4 = scan.nextInt();
        boolean correct = true;
        if(oct1 <= 0 || oct1 >= 255){
            System.out.println("Octet 1 is incorrect");
            correct = false;
        }
        if(oct2 <= 0 || oct2 >= 255){
            System.out.println("Octet 2 is incorrect");
            correct = false;
        }
        if(oct3 <= 0 || oct3 >= 255){
            System.out.println("Octet 3 is incorrect");
            correct = false;
        }
        if(oct4 <= 0 || oct4 >= 255){
            System.out.println("Octet 4 is incorrect");
            correct = false;
        }
        if(correct){
            System.out.println("IP Address: "+oct1+"."+oct2+"."+oct3+"."+oct4);
        }
    }
}