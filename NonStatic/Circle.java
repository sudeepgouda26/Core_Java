class Circle{
    void area(){
          int r =5;
          double pi = 3.142;
          System.out.println(r*r*pi);
    }
  
}
class Main{
    public static void main(String[] args){
      Circle C = new Circle();
      C.area();
    }
}
