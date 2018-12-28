package com.stackroute;

public class Series {
    public String testCheckConsecutive(String array){
        String result="";
        String arrStr[]=array.split(" ");
        int arrInt[]=new int[arrStr.length];
        for(int i=0;i<arrStr.length;i++){
            arrInt[i]=Integer.parseInt(arrStr[i]);
        }
        int check,flag=0;

        if(arrInt[0]<arrInt[1]){
            for(int i=0;i<arrInt.length;i++){
                check=arrInt[i]+1;
                flag=0;
                if(i==arrInt.length-1){
                    flag=1;
                    break;
                }
                else if(check==arrInt[i+1]){
                    flag=1;
                }
                else
                {
                    System.out.println("non consecutive integer");
                    return "non consecutive number";
                }
            }
            if(flag==1){
                System.out.println("consecutive integer");
                return "consecutive number";
            }
        }
        else if(arrInt[0]>arrInt[1]){
            for(int i=0;i<arrInt.length;i++){
                check=arrInt[i]-1;
                flag=0;
                if(i==arrInt.length-1){
                    flag=1;
                    break;
                }
                else if(check==arrInt[i+1]){
                    flag=1;
                }
                else
                {
                    System.out.println("non consecutive integer");
                    return "non consecutive number";
                }
            }
            if(flag==1){
                System.out.println("consecutive integer");
                return "consecutive number";
            }
        }
        else
        {
            return "non consecutive number";
        }
        return result;
    }
}
