
package test;

public class User {
    
    private User(){
        
    }
    //singleton pattern
    private static User u=null;
    
    public static User instance(){
        if(u==null){
            u=new User();
        }
        return u;
    }
}
