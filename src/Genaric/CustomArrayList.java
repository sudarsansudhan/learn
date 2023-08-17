package Genaric;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=4;
    private int size=0;//size is working as index value
    public CustomArrayList() {
       this.data=new int[DEFAULT_SIZE];

    }
    public void add(int num){
        if(ifFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize(){
        int[] temp =new int[data.length*2];
        //copy of current item in the new array
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;

    }
    private boolean ifFull(){
        return size==data.length;
    }
    public int remove(){
        int removed =data[--size];
        return removed;
    }
    public int index(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       CustomArrayList list=new CustomArrayList();
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);

       for (int i=0;i<=14;i++){
           list.add(2*i);
       }

        System.out.println(list);
    }
}
