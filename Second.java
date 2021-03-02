import java.util.ArrayList;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str);


//        char str_arr[] = str.toCharArray();
//        ArrayList<Character> array = new ArrayList<Character>();
//        array.add('a');array.add('A');
//        array.add('e');array.add('E');
//        array.add('i');array.add('I');
//        array.add('o');array.add('O');
//        array.add('u');array.add('U');
//
//        for(int i = 0; i < str.length(); i++){
//            if(array.contains(str_arr[i])){
//
//            }
//        }
    }
}
