public class Main {
    public static void main(String[] args) {
//1


        System.out.println("1 завдання");
        for (int n1 = 500; n1 <= 650; n1 += 10) {
            System.out.println(n1);
        }
        int n1 = 500;
        int n2 = 650;
        while (n1 <= n2) {
            System.out.println(n1);
            n1 += 10;
        }
        n1 = 500;
        do {
            System.out.println(n1);
            n1 += 10;
        } while (n1 <= n2);
        System.out.println("2 завдання");
        //2
        int a = 2;
        while (a < 5000) {
            System.out.println(a);
            a = 2 * a - 1;
        }
        System.out.println("3 завдання");
        //3
        a = 10;
        for (int i = 10; i > 0; i--) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("4 завдання");
        //4
        a = 1;
        for (int i = 1; i <= 10; i++) {
            a *= i;
        }
        System.out.println(a);
        a = 1;
        n1 = 1;
        while (n1 <= 10) {
            a *= n1;
            n1++;
        }
        System.out.println(a);
        System.out.println("5 завдання");
        //5
        int s=0;
        for (int t = 0; t < 24; t++) {
            for (int t1 = 0; t1 < 60; t1++) {
                if (t % 10 == t1 / 10 && t / 10 == t1 % 10) {
                    s++;
                }
            }
        }
        System.out.println(s);
        System.out.println("6 завдання");
        //6
        s = 0;
        for (int t = 1; t < 999999; t++) {
            int k = t / 100000 + (t / 10000) % 10 + (t / 1000) % 10;
            int k1 = t % 10 + (t / 10) % 10 + (t / 100) % 10;
            if (k1 == k) {
                s++;
            }
        }
        System.out.println(s);
    }
}


