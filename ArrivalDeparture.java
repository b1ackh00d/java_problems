import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ArrivalDeparture {

    public static void main(String[] args) {

        int a, b;
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        int dep[] = new int[n];

        for(int i = 0; i < n; i++){
            String[] s = sc.next().split(":");
            int minutes = Integer.parseInt(s[1]);
            arr[i] = Integer.parseInt(s[0])*100 + minutes;
            //System.out.println(arr[i]+" ");
        }

        for(int i = 0; i < n; i++){
            String[] s = sc.next().split(":");
            int minutes = Integer.parseInt(s[1]);
            dep[i] = Integer.parseInt(s[0])*100 + minutes;
            //System.out.println(dep[i]+" ");
        }

        TreeMap<Integer, Integer> tree_map = new TreeMap<>();
       /* 6
        1:00 1:40 1:50 2:00 2:15 4:00
1:10 3:00 2:20 2:30 3:15 6:00*/
        for(int i =0; i < n; i++)
            tree_map.put(arr[i], dep[i]);
        Arrays.sort(arr);
        int ind=1;
//        System.out.println(tree_map);

        int platforms = (n == 0)?0:1;

        for(Map.Entry e : tree_map.entrySet()){
           int val=(int) e.getValue();
           int key=arr[ind++];
           if(key<val)
               platforms++;
           if(ind==n)
               break;
        }
        System.out.println(platforms);


    }
}
