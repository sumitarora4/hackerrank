package Java;


import java.util.Scanner;

class Arithmetic{

    int add(int a, int b){

         return a + b;
    }
}

class Adder extends Arithmetic{

}
public class JavaInheritance2 {

    public static  void main (String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();


        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(10,32) + " " + adder.add(10,3) + " " + adder.add(10,10) + "\n");
    }
}
