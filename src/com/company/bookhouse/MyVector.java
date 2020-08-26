package com.company.bookhouse;

public class MyVector<T> {

    private Object[] myLibrary;
    private int size = 0;
    private int standard = 8;

    public MyVector() {
        this.myLibrary = new Object[standard];
    }

    public void addValue(T value){
        if (size >= standard){
            standard *=standard;
            Object[] buf = new Object[standard];
            for (int i = 0; i < myLibrary.length ; i++) {
                buf[i] = myLibrary[i];
            }
            myLibrary = buf;
        }
        myLibrary[size]= value;
        size++;
    }


    public T get(int index){
        return (T) myLibrary[index];
    }
    public int size(){
        return this.size;
    }
}
