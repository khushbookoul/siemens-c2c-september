package exceptionhandling;
/*
 * 
 *  try  : Any part of code that MAY cause an exception goes in a try block
 *  catch : Any logic to handle excepion raised IN THE NEAREST try goes here
 *  throws : Used to inform user of the method(method call) that SOME EXCEPTION is possible from a method
 *  throw : To manually trigger an exception of given type
 *  finally : use it to write a logic which needs to executed in both case - exception or no exception
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Operations {


        public int  division(int n1, int n2) throws Exception{
            
            return n1/n2;

        }


        public int factorial(int number) throws NegativeNumberException{
            if (number < 0) {
               throw new NegativeNumberException("Invalid number");  
            }

            else{
                int ans=1;

                for(int counter = 2;counter <= number ; counter++){
                    ans = ans * counter;
                }

                return ans;
            }
        }

        


        public static void main(String[] args){

            Operations obj = new Operations();

            try{
                obj.division(10,0);
            }catch (Exception ex){
                
            }
            
        }


}
