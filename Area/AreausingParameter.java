class AreausingParameter{
 static final double pi = 3.142;

 static void triangle(int b, int  h){

int res = b* h;
System.out.println(res);
 }

  static void rectangle(int w,int  h ){

int res = w* h;
System.out.println(res);
 }

   static void square(int a ){

int res = a*a;
System.out.println(res);
 }



   static void parallelgram(int  b , int  h ){

int res = b* h;
System.out.println(res);
 }

   static void trapizoid(int  b,int  h, int a  ){

double res = 0.5*(a+b)* h;
System.out.println(res);
 }

    static void circle(int r){

double res = pi * r*r;
System.out.println(res);
 }
 
   static void ellipse(int  b,int  h ){


double res = pi * h * b;
System.out.println(res);
 }

    static void sector(int  b, double h){



double res = 0.5 * b * b *h;
System.out.println(res);
 }
 



public static void main(String[]  args){
  triangle(3,2);
  rectangle(4,2);
  square(4);
  parallelgram(3,4);
  trapizoid(2,4,6);
  circle(5);
  ellipse(3,5);
  sector(2,30.5);
}

}
