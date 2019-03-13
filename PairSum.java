import java.io.*;
import java.util.HashSet;

class PairSum
{
    static void printpairs(int arr[],int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
         List<Pair<Integer,Integer>> li = new ArrayList<Pair<Integer,Integer>>();
         Pair pair = new Pair(1,2);
         li.add(pair);
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];

            // checking for condition
            if (temp>=0 && s.contains(temp))
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            s.add(arr[i]);
        }
    }

    // Main to test the above function
    public static void main (String[] args)
    {
        int A[] = {1, 5, 7, -1, 5};
        int n = 6;
        printpairs(A,  n);
    }
}
