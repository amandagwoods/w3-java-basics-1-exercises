import java.util.Scanner;
public class basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// 1
        System.out.println("Hello");
        System.out.println("Amanda Woods");

// 2
        int myNumber = 74+36;
        System.out.println(myNumber);

// 3
        System.out.println(50/3);

// 4
//        a
        System.out.println(-5 + 8 * 6);
//        b
        System.out.println((55+9) % 9);
//        c
        System.out.println(20 + -3*5 / 8);
//        d
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

// 5
        int x = 25;
        int y = 5;
        System.out.println((x*y));

// 6
        int a = 125;
        int b = 24;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b );
        System.out.println(a % b );

// 7
        System.out.println("input a number");
        int num1 = sc.nextInt();

        for(int i=0; i<10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
        }
// 8
        System.out.println("   J    a   v     v  a   ");
        System.out.println("   J   a a   v   v  a a   ");
        System.out.println("J  J  aaaaa   V V  aaaaa   ");
        System.out.println(" JJ  a     a   V  a     a");

// 9
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

// 10
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        );

    }
}
