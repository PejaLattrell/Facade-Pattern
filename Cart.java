public class Cart implements HotelService{

    public int numberOfCarts;
    
        @Override
        public int requestCart(int numberOfCarts){
            System.out.println(numberOfCarts + " cart(s) have been requested.");
            return numberOfCarts;
        }

        @Override
        public String cleanRoom(String roomNumber){
            // Not implemented in Cart
            return null;
        }

        @Override
        public String pickUpVehicle(String plateNumber){   
            // Not implemented in Cart
            return null;
        }     


        public int numberOfCarts(){
            return numberOfCarts;
        }

        
    
}