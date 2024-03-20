// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class day2{
    public static void main(String[] args) {
        int a=15,b=15,c=15,d=15;
        a=(++a)+(a++);
        System.out.println(a);
        //solution=32
        b=(b++)+(b++);
        System.out.println(b);
        //solution=31
        c=(++c)+(++c);
        System.out.println(c);
        //solution=33
        d=(d++)+(++d);
        System.out.println(d);
        //solution=32
    }
}
