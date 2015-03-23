/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import javaapplication1.Calculator;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
       Calculator calc = new Calculator();
       BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
       

    while(true){

       System.out.println("Введите a");
       double num_1 = Double.parseDouble(read.readLine());
       System.out.println("Введите знак");
       char znak = read.readLine().charAt(0);
       System.out.println("Введите b");
       double num_2 = Double.parseDouble(read.readLine());
       calc.set_a(num_1);
       calc.set_b(num_2);

       if (num_2 == 0 && znak == '/')
           {
               System.out.println("Деление на ноль не возможно!!!");
              continue;
           }
               
       switch (znak)
       {
case '+': 
    System.out.println("Результат " + calc.plus()); break;
case '-':
    System.out.println("Результат " + calc.minus()); break;
case '*':
    System.out.println("Результат " + calc.multiply()); break;
case '/':
    System.out.println("Результат " + calc.divison()); break;
       }
    }
    }
}
