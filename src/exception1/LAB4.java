/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Dell
 */
public class LAB4 {
    public static void main(String[] args) {
         try {
            System.out.println("statement 1");
             System.out.println(1/0);
            System.out.println("statement 2");
            System.out.println("statement 3");
            
    }
    catch (ArrayIndexOutOfBoundsException e) {
        
    }
    catch (ArithmeticException e) {
        throw new StringIndexOutOfBoundsException();
    }
    
    
    finally {
            System.out.println("statement 4");
}
        System.out.println("statement 5");
}
    
}
    
   
