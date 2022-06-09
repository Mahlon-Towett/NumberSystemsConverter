/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumberSystemsConverter;


import java.util.Scanner;


/**
 *
 * @author mahlo
 */
public class NumberSystemsConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int a;
        Scanner c =new Scanner(System.in);
            System.out.println("1) Convert Binary to Decimal");
            System.out.println("2) Convert Decimal to Binary");
            a=c.nextInt();
            for(int i=0; i<5; i++){
               
            
            
            switch(a){
                case 1:
                     System.out.println("Enter Binary number to convert to decimal");
     String binaryString=c.nextLine();
     int dec=Integer.parseInt(binaryString,2);
        
            System.out.println(dec);
              break;      
           
            case 2:
            System.out.println("Enter Decimal number to convert toBinary");
            int m=c.nextInt();
                String Bin=Integer.toBinaryString(m);
                System.out.println(Bin);
            break;
            default:
               System.out.println("Invalid option");     
                return;
            }
        }
         c.close();
        
        }catch(NumberFormatException e){
            System.out.println("Error ocured");
        }
       
       
    }
   
}
