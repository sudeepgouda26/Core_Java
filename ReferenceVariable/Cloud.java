public class Cloud {
    public static void main(String[] args) {
        Cloudstorage c1 = new Cloudstorage();
        Mobile.userMobile(c1);
    }
}

class Mobile{
    static void userMobile(Cloudstorage c2){
       c2.storege();
    }
}

class Cloudstorage{
    void storege(){
        System.out.println("Drive");
    }
}
