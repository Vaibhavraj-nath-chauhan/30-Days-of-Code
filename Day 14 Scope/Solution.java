import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
class Difference {
  	private int[] elements;
      public int maximumDifference;
    Difference(int [] b){
        this.elements = b;
    }

	// Add your code here
    void computeDifference(){
        int data;
        int a = this.elements.length;
        this.maximumDifference =0;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                data = Math.abs(this.elements[i] - this.elements[j]);
                if(data>this.maximumDifference){
                    this.maximumDifference = data;
                }
            }
        }
        
    }
} // End of Difference class

