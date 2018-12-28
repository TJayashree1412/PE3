package com.stackroute;
//Write a program that will generate exceptions of type NegativeArraySizeException, IndexOutOfBoundsException, NullPointerException.
  //      Record the catching of each exception by displaying the message stored in the exception object.
public class ExceptionCheck {
    public String checkNegativeArraySizeException(){
        int arrSize=-4;
        try{
            int arr[]=new int[arrSize];
        }
        catch(Exception e){
            return "NegativeArraySizeException";
        }
        return null;
    }
    public String checkIndexOutOfBoundsException(){
        try{
            int arr[]=new int[15];
            System.out.println(arr[15]);
        }
        catch(Exception e){
           // System.out.println(e.getClass().toString());
            return e.getClass().toString();
        }
        return null;
    }
    public String checkNullPointerException(){
        try{
            String object=null;
            if(object.equals("hello"))
                return "hello";
        }
        catch(Exception e){
            return "NullPointerException";
        }
        return null;
    }
}
