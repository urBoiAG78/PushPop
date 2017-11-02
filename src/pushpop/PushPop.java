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

public class PushPop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(11111);
        stack.push("erer");
        stack.push(1.1);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
    
}
