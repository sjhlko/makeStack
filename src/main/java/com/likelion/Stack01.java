package com.likelion;

import java.util.EmptyStackException;

public class Stack01 {
    private Integer[] arr;
    private Integer top =0;

    public Stack01(){
        this.arr = new Integer[100000];
    }
    public Stack01(int size){
        this.arr = new Integer[100000];
    }

    public void push(int value){
        this.arr[this.top]=value;
        this.top ++;
    }
    public int pop(){
        if(this.top==0){
            throw new RuntimeException("스택이 비었습니다");
        }
        this.top --;
        return this.arr[this.top];

    }

    public Integer[] getArr(){
        return arr;
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }
}
