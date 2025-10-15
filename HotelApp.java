import java.util.Scanner;

public class HotelApp{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        Valet valet = new Valet();
        HouseKeeping houseKeeping = new HouseKeeping();
        Cart cartService = new Cart();
        FrontDesk frontDesk = new FrontDesk(houseKeeping, valet, cartService);


        System.out.println("Welcome to Hotel Management App!");
        System.out.println("Service Option: \n 1. Valet Service \n 2. Cart Service \n 3. HouseKeeping Service");
        System.out.print("Enter Option(1-3): ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch(choice){
            case 1://Valet Service
                System.out.print("Enter the plate number of your vehicle: ");
                String plateNumber = scan.nextLine();
                frontDesk.valet(plateNumber);
                break;

             case 2://Cart Service
                System.out.print("Enter the number of carts you want to request: ");
                int numberOfCarts = scan.nextInt();
                frontDesk.cartService(numberOfCarts);
                break;

             case 3://HouseKeeping Service
                System.out.print("Enter your room number: ");
                String roomNumber = scan.nextLine();    
                frontDesk.housKeeping(roomNumber); 
                break;
                
            default:
                System.out.println("Invalid Option.");
                break;
        }

        scan.close();   
    }
}