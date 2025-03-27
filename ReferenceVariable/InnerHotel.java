 class Hotel {
    public static void main(String[] args) {
        HotelRoom h1 = new HotelRoom();
        Customer.userCustomer(h1);
    }
}

class Customer {
    static void userCustomer(HotelRoom h) {
        h.room();
    }
}

class HotelRoom {
    void room() {
        System.out.println("Room Booked");
    }
}
