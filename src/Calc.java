public class Calc {
    public double power(int num){
        num = num * num;
        System.out.println(num);
        return (double) num;
    }
    public double power(int a,int b){
        double y = a;
        for(int i = 1; i<b;i++){
            y=y*a;
        }
        System.out.println(y);
        return (double) y;
    }
    public double power(double num){
        num = num*num;
        System.out.println(num);
        return num;
    }
    public double power(double a,double b){
        b= b*10;
        int b3 = (int) (b % 100)/10;
        double b1 = (int) ((b % 100) %10);
        b1 = b1 /10;
        double a1 = b3 * a;
        double a2 = b1 *a;
        System.out.println(a1 + a2);
        return (double) a;
    }
    public double power(String num){
        int num1 = Integer.parseInt(num);
        System.out.println(num1*num1);
        return 0;
    }
}
