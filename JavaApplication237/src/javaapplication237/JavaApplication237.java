/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication237;

import java.util.Stack;

/**
 *
 * @author hp
 */
public class JavaApplication237 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x="[{)]";
        Stack<Character>st=new Stack<>();
        st.push('a');
        System.out.print(st.peek());
    }
    public static String isValidParantheses(String s) {
           Stack<Character>st=new Stack<>();
           for(int i=0;i<s.length();i++)
           {
               if(!st.isEmpty())
               {
               if(s.charAt(i)==']'&&st.peek()=='['||s.charAt(i)==')'&&st.peek()=='('||s.charAt(i)=='}'&&st.peek()=='{')
                   st.pop();
               }
               else
                   st.push(s.charAt(i));
           }
           if(st.isEmpty())
           {
               return "true";
           }
           else{
               return "false";
           }
                 
	}
    
}
