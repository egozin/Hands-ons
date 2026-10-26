import java.util.*;
public class att02 {
    public static void main(String[] args) {
        int x [] = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
        int y [] = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};

        int z [] = new int[20];
        
        for (int i = 0; i < 10; i++){
            z [i * 2] = x[i];
            z[i * 2 + 1]  = y[i];
        }

        for(int i = 0; i < 20; i++){
            System.out.println(z[i] + ""); 
        }
        
    }
}
