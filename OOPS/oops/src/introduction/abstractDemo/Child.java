package introduction.abstractDemo;

import java.util.Scanner;

public class Child extends Parent{
    @Override
    void career(String name){
        System.out.println("i am going to be a "+ name);
    }
}
