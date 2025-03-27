public class UserBus {

    public static void main(String[] args) {
        UserBus u1 = new UserBus();
        Bus.userBus(u1);

    }

    void ticket() {
        System.out.println("Ticket Booked");
    }
}

class Bus {
    static void userBus(UserBus u2) {
        u2.ticket();
    }
}
    

