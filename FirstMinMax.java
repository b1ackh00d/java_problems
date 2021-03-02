import java.util.Scanner;

public class FirstMinMax {


    static void func(String[] a){
        if(a.length < 1 || a == null)
            System.out.println("");

        String small = a[0], large=a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i].length() < small.length()) small = a[i];

            if(a[i].length() > large.length()) large= a[i];
        }

        System.out.println(small);
        System.out.println(large);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i = 0; i < n;i++) a[i] = sc.next();
        func(a);
    }
}
