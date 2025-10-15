// 
public class HouseKeeping implements HotelService{

    public String roomNumber;

        @Override
        public String cleanRoom (String roomNumber){
            System.out.println("Room " + roomNumber + " has been cleaned.");
            return roomNumber;
        }

        @Override
        public String pickUpVehicle(String plateNumber){    
            // Not implemented in HouseKeeping
            return null;
        }

        @Override
        public int requestCart(int numberOfCarts){
            // Not implemented in HouseKeeping
            return 0;
        }   


        public String roomNumber(){
            return roomNumber;
        }



}