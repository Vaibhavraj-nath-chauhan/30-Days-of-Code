import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String text = sc.nextLine();
            String a ="";
            String b = "";
            for(int j =0;j<text.length();j++){
                if(j%2==0){
                    a += text.charAt(j);
                }else{
                    b += text.charAt(j);
                }
            }
            System.out.println(a+" "+b);

        }
        
    }
}