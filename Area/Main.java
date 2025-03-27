class T {
 

 static void triangle(int b, int  h){

int res = b* h;
System.out.println(res);
 }
 }
class R{
  static void rectangle(int w,int  h ){

int res = w* h;
System.out.println(res);
 }
 }
 class S{
   static void square(int a ){

int res = a*a;
System.out.println(res);
 }
 }


class P{
   static void parallelgram(int  b , int  h ){

int res = b* h;
System.out.println(res);
 }
 }
 class Tra{
   static void trapizoid(int  b,int  h, int a  ){

double res = 0.5*(a+b)* h;
System.out.println(res);
 }
 }

 class C{

    static void circle(int r,double pi){

double res = pi * r*r;
System.out.println(res);
 }
 }

 class E{
 
   static void ellipse(int  b,int  h ,double pi){


double res = pi * h * b;
System.out.println(res);
 }
 }

 class Sec{

    static void sector(int  b, double h){



double res = 0.5 * b * b *h;
System.out.println(res);
 }
 }
 

class Main{
static final double pi = 3.142;
public static void main(String[]  args){
 T.triangle(3,2);
  R.rectangle(4,2);
  S.square(4);
  P.parallelgram(3,4);
  Tra.trapizoid(2,4,6);
  C.circle(5,pi);
  E.ellipse(3,5,pi);
  Sec.sector(2,30.5);
}

}
