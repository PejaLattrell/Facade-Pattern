
public class Valet implements HotelService{

    public String plateNumber;

        @Override
        public String pickUpVehicle(String plateNumber){
            System.out.println("Vehicle with plate number " + plateNumber + " has been picked up.");
            return plateNumber;
        }
        
        @Override
        public String cleanRoom(String roomNumber){
            //
            return null;
        }

        @Override
        public int requestCart(int numberOfCarts){
            // Not implemented in Valet
            return 0;
        } 
        public String plateNumber(){
            return plateNumber;
        }

}


