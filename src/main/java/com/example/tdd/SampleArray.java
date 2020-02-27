package com.example.tdd;

public class SampleArray {

    private int size = 0;
    private String [] arr = new String[5];

    public int size(){
        return size;
    }

    public void add(String name) {
        arr [size] = name;
        size++;
    }

    public String get(int index) {
        return arr[index];
    }

    public void remove(int index) {
        for(int i=index; i<4; i++){
            arr[i]=arr[i+1];
        }

        arr[4] = null;

        size--;
    }
}
