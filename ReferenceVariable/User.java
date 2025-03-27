class Jobs{
    void job (){
        System.out.println("Frontend");
    }
}

class  Linkdin{
    static void apply( Jobs j2){
         j2.job();
    }
}

class User{
    public static void main(String[] args) {
        Jobs  j1 = new Jobs();
        
        Linkdin.apply(j1);
    }
}

