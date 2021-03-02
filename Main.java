import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Array Size: ");
        n = sc.nextInt();
        System.out.print("Enter Array Elements: ");
        for(int i =0; i < n; i++){
            array[i] = sc.nextInt();
        }


        System.out.print("Enter Sum: ");
        int tot = sc.nextInt();

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            int remainder = tot - array[i];

            if(mp.containsKey(remainder)){
                int cnt = mp.get(remainder);

                for(int j = 0; j < cnt; j++)
                    System.out.println(remainder + ", " + array[i]);
            }

            if(mp.containsKey(array[i]))
                mp.put(array[i], mp.get(array[i]) + 1);
            else
                mp.put(array[i], 1);

        }



    }



}
