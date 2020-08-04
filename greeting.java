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
public class greeting {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the mark");
        int a=obj.nextInt();
        switch(a)
        {
            case 10:
                System.out.println("excellent");
                break;
            case 9:
            case 8:
                System.out.println("very good");
                break;
            case 7:
            case 6:
                System.out.println("good");
                break;
            case 5:
            case 4:
            case 3:
                System.out.println("very poor");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println(" poor");
                break;
            default:
                System.out.println(" incorrect option(ENTER THE MARK OUT OF 10)");
             
        }
    }
    
}
