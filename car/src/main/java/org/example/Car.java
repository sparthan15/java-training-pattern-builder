package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Getter
@Setter
@NoArgsConstructor
public class Car {

    protected int speed=0;
    protected int shifts;
    private  int WHEELS = 4;
    protected int wheels;


    public void start(){
        System.out.println(this.WHEELS);
    }


}
