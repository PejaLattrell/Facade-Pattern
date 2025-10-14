import java.util.Scanner;

public class HotelApp{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        Valet valet = new Valet();


        System.out.println("Welcome to Hotel Management App!");
        System.out.println("Service Option: \n 1. Valet Service \n 2. Cart Service \n 3. HouseKeeping Service");
        System.out.print("Enter Option(1-3): ");
        int choice = scan.nextInt();

        switch(choice){
            case 1://Valet Service
                System.out.println("Vehicle with plate number: " + valet.plateNumber() + " has been picked-up");
                break;

             case 2://Cart Service
                System.out.println("Cart Service is currently unavailable");
                break;

             case 3://HouseKeeping Service
                System.out.println("HouseKeeping Service is currently unavailable"); 
                break;  
        }

        scan.close();   
    }
}