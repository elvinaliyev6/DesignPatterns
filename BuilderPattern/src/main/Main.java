package main;

import test.User;

public class Main {

    public static void main(String[] args) {

        User u = new User.UserBuilder("Elvin", "Aliyev")
                .age(20)
                .phone("+9940000000000")
                .address("Baku Azerbaijan")
                .build();
        System.out.println(u);
    }

}
