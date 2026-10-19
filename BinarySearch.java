import java.util.Scanner;

public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int s = 0;
        int e = arr.length-1;
        
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid]==target)
            {
                System.out.println("The Index is "+ mid);
                break;
            }
            else if(arr[mid]<target)
            {
                s = mid+1;
            }
            else if(arr[mid]>target)
            {
                e = mid-1;
            }
        }

    }
}