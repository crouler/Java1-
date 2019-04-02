package com.company;

public class Main {

    public static void printArrOneDim ( int[] mass){

        for (int i=0; i < mass.length; i++)        // вывод оригинала
        {System.out.print( mass [i] + " ");};






    }

   public static void printArrTwoDim ( int[][] mass){

        for (int i=0; i < mass.length; i++ ){
            for (int j = 0; j < mass.length; j++){
                System.out.print(mass[i][j] + "  ");
            }
            System.out.println();
        }


    }
    public static void massElemMult ( int[] anyarray){          // задание 3

        for (int i=0; i < anyarray.length; i++ ){
            if (anyarray[i] < 6)  anyarray[i] *= 3;
        }

        for (int i=0; i < anyarray.length; i++){
            System.out.print (anyarray[i]+ " ");
        }


    }

    public static void arreyInvert( int [] anyarray){           // задание 1
        for (int i=0; i < anyarray.length; i++){
            if (anyarray[i]== 0) {anyarray[i] = 1;}
            else {anyarray[i] = 0;};
        }
        printArrOneDim(anyarray);
    }

    public static void arreyVolumeMult( int [] anyarray){           // задание 2
        for (int i=0; i < anyarray.length; i++){
            anyarray[i] = (i * 3);
            System.out.print (anyarray[i]+ " ");
        };

    }

    public static void diagonal( int [][] anyarray){
        for (int i=0; i < anyarray.length; i++){
            anyarray[i][i] = 1;
//            switch(i!=-1){
//                case
//            }
//            anyarray[i][i] = 1; //anyarray[i][anyarray.length-i-1];
        }

    }




        public static void main(String[] args) {


        // задание 1
        int [] arr = {1,0,1,0,0,0,1,1,0};
        System.out.println("    Задание 1");

        printArrOneDim(arr);
        System.out.println( "исходный массив" );
        System.out.println();
        arreyInvert(arr);
        System.out.println("инвертированыый массив из " + arr.length + " элементов" );
        System.out.println();

        // задание 2
        System.out.println("    Задание 2");
        int[] arr2 = new int[8];
        arreyVolumeMult(arr2);
        System.out.println();
        System.out.println();

        // задание 3
       System.out.println("    Задание 3");
       int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0; i < arr3.length; i++){
            if (arr3[i]<6 && arr3[i]>3)
                {System.out.print (arr3[i]+ "  ");}
            else {System.out.print (arr3[i]+ " ");}
        }
        System.out.println(" Исходный массив ");
        massElemMult(arr3);
        System.out.println(" Обработанный по условию массив ");
        System.out.println();


        // Задание 4

        System.out.println("    Задание 4");
        int matrixRate = 5;
        int[] [] arr4 = new int [matrixRate][matrixRate];
        diagonal(arr4);
        printArrTwoDim(arr4);







    }
}
