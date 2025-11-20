package introduction.generics;

import java.util.Arrays;

public class CustomArrayList {
    private  int[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as an index

    public CustomArrayList() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()) resize();

        arr[size++] = num;
    }

    private boolean isFull(){
        return size==arr.length;
    }

    private void resize(){
        int[] temp = new int[arr.length*2];

        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }



    public void remove(){
        --size;
    }


    public int get(int index){
        return arr[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int val){
        arr[index] = val;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }





    public static void main(String[] args) {
        CustomArrayList c = new CustomArrayList();
        for(int i=0; i<500;i++){
            c.add(i*2);
        }

//        System.out.println(c);
        for(int i=0; i< c.size(); i++){
            System.out.print(c.get(i) + " ");
        }
        c.remove();
        System.out.println();
        System.out.println(
                "size = " + c.size()
        );
    }
}
