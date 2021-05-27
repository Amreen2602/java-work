public class second{
    public static int isEven(int a){
        return a%2;
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("isEven"+" "+x+" "+ isEven(x));
        x=6;
        System.out.println("isEven"+" "+x+" "+ isEven(x));
        System.out.println(""+ ++x);
    }
}