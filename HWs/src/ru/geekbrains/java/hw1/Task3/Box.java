package ru.geekbrains.java.hw1.Task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 15.08.2017.
 */
public class Box<T extends Fruit> {

    private static int counter = 0;
    private int boxNumber;
    private T fruit;

    public Box() {
        boxNumber = ++counter;
        System.out.println("Box №" + boxNumber + " is created");
    }

    public void putFruitToBox(T fruit)  {

        this.fruit = fruit;
        System.out.println("Box №" + this.getBoxNumber() + " is filled with " + fruit.getQuantity() + " " + fruit.getType().getSimpleName() + "s");
    }

    public Float getBoxWeight(){
        return fruit.getWeight() * fruit.getQuantity();
    }


    public void compare(Box box) {
        System.out.print("Boxes №" + this.getBoxNumber() + " and "+ box.getBoxNumber() + " are equal: ");
        System.out.println((this.getBoxWeight() - box.getBoxWeight()) == 0.0f);
    }

    public void emptyBox(Box<T> box){

        int increment = this.getFruitsOutOfBox().getQuantity();

        if(box.getFruitsOutOfBox() == null){
            T copyFruit = null;
            try {
                copyFruit = (T) fruit.getClass().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            box.putFruitToBox(copyFruit);
            box.getFruitsOutOfBox().setQuantity(increment);
        }
        else{
            increment += box.getFruitsOutOfBox().getQuantity();
            box.getFruitsOutOfBox().setQuantity(increment);
        }

        this.getFruitsOutOfBox().setQuantity(0);

        System.out.println("Box №" + this.getBoxNumber() + " now has: " + this.getFruitsOutOfBox().getQuantity() + " " + fruit.getType().getSimpleName() + "s" );
        System.out.println("Box №" + box.getBoxNumber() + " now has: " + box.getFruitsOutOfBox().getQuantity() + " " + box.getFruitsOutOfBox().getType().getSimpleName() + "s" );
    }

    public int getBoxNumber(){
        return boxNumber;
    }

    private T getFruitsOutOfBox(){
        return fruit;
    }
}
