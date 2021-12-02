pakage com.company;

class A{
int a;
int b;
public void method(int a, int b){
this.a = a;
this.b = b;
  System.out.println(a + b)
}
}
class B extends A{
  int c;
int d
public void method2(int a,int b){
c= a;
d=b;
  System.out.println(a + b); 
}
public class Main{
public static void main(String[] args){
B a = new B();
b.method(12,21);
  b.method2(12,21);
}
}
