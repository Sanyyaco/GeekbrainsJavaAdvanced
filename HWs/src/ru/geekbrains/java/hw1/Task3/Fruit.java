package ru.geekbrains.java.hw1.Task3;

/**
 * Created by Administrator on 15.08.2017.
 */
public class Fruit {
    private Float weight;
    private int quantity;

    public Fruit() {
    }

    public int getQuantity() {
        return quantity;
    }

    private Class<? extends Fruit> type = this.getClass();

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Class<? extends Fruit> getType(){
        return type;
    }


    public Float getWeight(){
        return weight;
    }
}
