public class Main {
    public static void main(String[] args) {
        //1
        double n = 14.4;
        if (100 > n && n > 50) {
            System.out.println("Число " + n + " міститься в проміжку (50; 100)");
        } else {
            System.out.println("Число" + n + "не міститься в проміжку (50; 100)");
        }
        //2
        int n2 = 385;
        int k1 = n2 / 100;
        int k2 = (n2 / 10) % 10;
        int k3 = n2 % 10;
        if (k1 > k2 && k1 > k3) {
            System.out.println(k1);
        } else if (k2 > k1 && k2 > k3) {
            System.out.println(k2);
        } else {
            System.out.println(k3);
        }
        //3
        String d = "До низу";
        int f = 6;
        if (d =="До гори") {
            if(f==1) {
                System.out.println("Ви піднялись на 1 поверх");
            }else if(f==2||f==3) {
                System.out.println("Ви піднялись на 3 поверх");
            }
            else if(f==4) {
                System.out.println("Ви піднялись на 4 поверх");
            }
            else if(f==5) {
                System.out.println("Ви піднялись на 5 поверх");
            }
            else if(f==6) {
                System.out.println("Ви піднялись на 6 поверх");
            }
            else if(f==7) {
                System.out.println("Ви піднялись на 7 поверх");
            }
            else if(f==8) {
                System.out.println("Ви піднялись на 8 поверх");
            }
            else if(f==9) {
                System.out.println("Ви піднялись на 9 поверх");
            }
            else{
                System.out.println("Ви вказали неіснуючий поверх!");
            }
        }
        else if(d=="До низу"){
            if(f==9) {
                System.out.println("Ви спустились на 9 поверх");
            }
            else if(f==8) {
                System.out.println("Ви спустились на 8 поверх");
            }
            else if(f==7) {
                System.out.println("Ви спустились на 7 поверх");
            }
            else if(f==6) {
                System.out.println("Ви спустились на 8 поверх");
            }
            else if(f==5) {
                System.out.println("Ви спустились на 7 поверх");
            }
            else if(f==4) {
                System.out.println("Ви спустились на 8 поверх");
            }
            else if(f==3) {
                System.out.println("Ви спустились на 7 поверх");
            }
            else if(f==2&&f==1) {
                System.out.println("Ви спустились на 1 поверх");
            }
            else{
                System.out.println("Ви вказали неіснуючий поверх!");
            }
        }

//4
        String ff = "+";
        switch (ff){
            case "+":
            case "OK":
            case "Так":
            case "Yes":
            case "Y":
            case "Ok":
                System.out.println("«Я погоджуюсь!»");
                break;
            case "-":
            case "N":
            case "Ні":
            case "NO":
            case "No":
                System.out.println("«Я відмовляють!»");
                break;
        }


    }
}