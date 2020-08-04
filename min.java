/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex1;
import java.util.*;


/**
 *
 * @author Vignesha Masanan
 */
public class min {
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if(a<b && a<c)
            System.out.printf("%d is smallest", a);
        else if(b<c)
            System.out.printf("%d is smallest", b);
        else
            System.out.printf("%d is smallest", c);
    }
    
}
