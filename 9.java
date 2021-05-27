class OverLoadDemo{
    void test(){
        System.out.println("No Parameters");
    }
    void test(int a){
        System.out.println("The void test of single parameter is : "+a);
    }
    void test (int a,int b){
        System.out.println("The void test of two parameter is : "+a+" "+b);
    }
    double test (double a){
        System.out.println("The double test parameter is : "+a);
        return a/a;
    }

}
class Overload{
    public static void main(String args[])
    {
        OverLoadDemo ob = new OverLoadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(225.25);
        System.out.println("Result of ob.test(225.25) is : "+result);
    }
}