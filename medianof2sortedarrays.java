import java.util.*;
import java.io.*;

public class medianof2sortedarrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums1,nums2;
        System.out.println("Enter the size of array 1:");
        int size1 = scan.nextInt();
        nums1 = new int[size1];
        System.out.println("Enter the size of array 2:");
        int size2 = scan.nextInt();
        nums2 = new int[size2];
        System.out.println("enter the elements of the first array");
        for(int i=0;i<nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("\nenter the elements of the second array");
        for(int i=0;i<nums2.length;i++){
            nums2[i] = scan.nextInt();
        }

        int lo=0;
        int hi= nums1.length;
        int combinedLength = nums1.length + nums2.length;

        while(lo<=hi){
            int partX = (lo+hi)/2;
            int partY = (combinedLength + 1)/2 - partX;

            int leftX = getMax(nums1, partX);
            int rightX = getMin(nums1, partY);

            int leftY = getMax(nums2, partY);
            int rightY = getMin(nums2, partY);

        }

        scan.close();

    }
}