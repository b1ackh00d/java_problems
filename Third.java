import java.util.Scanner;

public class Third {


    public static void main(String[] args) {

        int C, H, O;
        Scanner sc  = new Scanner(System.in);

        C = sc.nextInt(); H = sc.nextInt(); O = sc.nextInt();

        //45, 11, 100

        int rem, temp;
        if(H < O) {
           rem = H/2;//5
            O -= rem; //95
            H -= rem * 2; //1
            System.out.println("Water Molecules: " + rem);
            System.out.println(C + " " + H + " " + O);
        }
        else{
            temp = H;
            rem = O; //11
            if (H >= O*2) {H -= rem * 2; O = 0;}
            else {
                O -= H/2; H=0;
            }
            System.out.println("Water Molecules: " + temp/2);
            System.out.println(C + " " + H + " " + O);


        }

        //-------------------------
        if(O < C) {
            rem = O/2;//5
            C -= rem; //95
            O -= rem * 2; //1
            System.out.println("Carbon di Oxide Molecules: " + rem);
            System.out.println(C + " " + H + " " + O);
        }
        else{
            rem = C; //11
            if (O >= C*2) {O -= C * 2; C = 0;}
            else {
                O /= 2; C -= O;
            }
            System.out.println("Carbon di oxide Molecules: " + rem);
            System.out.println(C + " " + H + " " + O);


        }

        //----------------------

        if(H < C) {
            rem = H/4;//5
            C -= rem; //95
            H -= rem * 4; //1
            System.out.println("Methane Molecules: " + rem);
            System.out.println(C + " " + H + " " + O);
        }
        else{
            rem = C; //11
            if (H >= C*4) {H -= C * 4; C = 0;}
            else {
                H /= 4; C -= H;
            }
            System.out.println("Methane Molecules: " + rem);
            System.out.println(C + " " + H + " " + O);


        }

    }
}
