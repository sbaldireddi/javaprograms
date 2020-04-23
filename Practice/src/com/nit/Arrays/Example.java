package com.nit.Arrays;

public class Example {
   static  int[] a;
/*  //  static int[] arr=new int[-5];  NegativeArraySizeException:-5
    int[] i1=new int[5];
    Object obj=new int[]{1,2,3};
    int[] someArray =(int[])obj;
  //  for(int i: someArray)
 //   int[] i2= new short[5]; Error:(6, 15) java: incompatible types: short[] cannot be converted to int[]
  //  Object[] obj1=new short[5]; Error:(7, 17) java: incompatible types: short[] cannot be converted to java.lang.Object[]
    Object[] obj2= new Object[5];
    Example[] e1=new Example[5];
    Object[] obj3=new Example[5];
    Object obj4=new Example[5];
 //   Example e2=new Example[5]; Error:(12, 16) java: incompatible types: Arrays.Example[] cannot be converted to Arrays.Example
      //Example[] e4=new Sample[5];
   //   obj3[0]=new
   // e1[1]=new Sample();
    private static int[] arr=new int[5];
  */  public static void main(String[] args) {
     /*   arr[0]=6;
        arr[1]=5;
        arr[2]=63;
        arr[3]=5;
        arr[4]=9;
      //  arr[5]=10; ArrayIndexOutOfBoundsException
      //  arr[-2]=11; ArrayIndexOutOfBoundsException
      //  arr[11L]=11;  incompatible type
     //   arr['a']=6;  ArrayIndexOutOfBoundsException
     //   arr[true]=67; incompatible type
*/
        for(int i=0;i<10;i++){
            a[i]=i*i;
            System.out.println(a[i]);
        }
    }
}


