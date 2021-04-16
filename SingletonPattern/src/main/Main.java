package main;

import test.User;

public class Main {

    public static void main(String[] args) {
        
        User u=User.instance();
        
        User u2=User.instance();
        
        System.out.println(u==u2);
        //output true
    }
    
}
