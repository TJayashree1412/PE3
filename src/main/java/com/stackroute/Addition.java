package com.stackroute;

public class Addition {
    public int[][] addMatrix(int [][]first,int[][]second,int x,int y){
        int[][]result=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                result[i][j]=first[i][j]+second[i][j];
            }
        }


        return result;
    }
}
