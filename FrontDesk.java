public class FrontDesk{

    private HouseKeeping houseKeeping;
    private Valet valet;
    private Cart cart;


    public FrontDesk(HouseKeeping houseKeeping , Valet valet, Cart cart){
        this.houseKeeping = houseKeeping;
        this.valet = valet;
        this.cart = cart;
    }

    public String valet(String plateNumber){
        return valet.pickUpVehicle(plateNumber);
    }

    public String housKeeping(String roomNumber){
        return houseKeeping.cleanRoom(roomNumber);
    }

    public int cartService(int numberOfCarts){
        return cart.requestCart(numberOfCarts);
    }
    
}