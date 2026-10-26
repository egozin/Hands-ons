import java.util.*;
public class att01 {
    public static void main(String[] args) {
        int x [] = {15,7,3,37,9,10,4,56,1,81};
        int y = 2;
        int z = 4;
        //a
        System.out.println(x[y+1]);
        //b
        System.out.println(x[y*1]);
        //c
        System.out.println(x[y+z]);
        //d
        System.out.println(x[x[8]*x[6]]);
        //e
        System.out.println(x[y+2]);
        //f
        System.out.println(x[y*2]);
        //g
        System.out.println(x[8-x[6]]);
        //h
        System.out.println(x[x[1]]);
        //i
        System.out.println(x[x[y+z]]);


    }
}