package org.example.java.generic;


public class ComparableBox<T extends Comparable<T>> {

    private T item;

    public  void setItem(T item){ this.item = item;}

    public T getItem(){return item;}

    public boolean isGreaterThan(T other){
        return item.compareTo(other) > 0;
    }


}
