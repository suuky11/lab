/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex1;
import java.util.Scanner;

/**
 *
 * @author Vignesha Masanan
 */
public class sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    Scanner in=new Scanner(System.in);
    System.out.println("Digits sum and product");
    System.out.print("enter number:");
    int number=in.nextInt();
    int remainder,temp,sum=0,product=1;
    temp=number;
    while(temp!=0){
        remainder=temp%10;
        sum=sum+remainder;
        product=product*remainder;
        temp=temp/10;
    }
    System.out.println("sum of digits of number"+number+":"+sum);
    System.out.println("product of digits of number"+number+":"+product);
    }
    
}
