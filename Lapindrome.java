import java.util.Scanner;

public class Lapindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 26;
        String inp = sc.next();

        int n = inp.length();

        int[] counter1 = new int[max];
        int[] counter2 = new int[max];

        for(int i = 0, j = n - 1; i < j; i++, j--){ //babab
            counter1[inp.charAt(i) - 'a']++;
            counter2[inp.charAt(j) - 'a']++;
        }

        for(int i = 0; i < max; i++){
            if(counter1[i] != counter2[i]) {
                System.out.println("No it is not a lapindrome.");
                break;
            }
        }

        System.out.println(inp + " is a lapindrome");
    }

}

