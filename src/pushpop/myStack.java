/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushpop;

import java.util.ArrayList;

/**
 *
 * @author agonzalez
 */
public class myStack<T>{
    private ArrayList<T> stack;
    
    public myStack() {
        stack = new ArrayList<>();
    }
    
    public void push(T num) {
        
        stack.add(num);
    }
    
    public int pop()
    {
        if(stack.size() > 0)
        {
            System.out.println(stack.get(stack.size()-1));
        
            stack.remove(stack.size()-1);
            return 0;
        }
        else
        {
            System.out.println("No more things in the stack");
            return 0;
        }
    }
}
