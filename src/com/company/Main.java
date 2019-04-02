package com.company;

public class Main {



    public static void main(String[] args) {


        // задание 1
        System.out.println( "исходный массив " );
        int [] arr = {1,0,1,0,0,0,1,1,0};

          for (int i=0; i < arr.length; i++)
            {System.out.print( arr [i] + " ");};

        System.out.println();


        for (int i=0; i < arr.length; i++){
            if (arr[i]== 0) {arr[i] = 1;}
            else {arr[i] = 0;};
            System.out.print (arr[i]+ " ");
        }
        System.out.println();
        System.out.println("инвертированыый массив из " + arr.length + " элементов" );

System.out.println();





    }
}
