package org.springCore;

import java.util.Random;

public class Performance {

    public void perform(){
        if(new Random().nextBoolean()){
            System.out.println("Performing is well..");
        }else{
            throw new RuntimeException("Performed bad");
        }
    }
}
