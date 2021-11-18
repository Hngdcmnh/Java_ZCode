import javax.print.attribute.standard.QueuedJobCount;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0)
        {
            int n = scn.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arrayList.add(scn.nextInt());
            }
            int  a[]= new int[100000];

            Stack<Integer> stack = new Stack<>();
            for(int i=n-1;i>=0;i--)
            {
                while(!stack.isEmpty() && arrayList.get(i)>=stack.peek()) stack.pop();
                if(stack.isEmpty()) a[i]=-1;
                else a[i] =stack.peek();
                stack.push(arrayList.get(i));
            }

            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }



    }
}
