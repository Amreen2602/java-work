

class Box{
    double width;
    double height;
    double depth;
    // Box(double height,double width, double depth){                           //this is a construction method
    //     this.width=width;
    //     this.depth=depth;
    //     this.height=height;
    //}
    // Box(){
    //     height=10;
    //     width=20;
    //     depth=30;
    // }
    
    // double getVolume(){
    //     return width*height*depth;
    // }
    // void getVolume(){                                                                //this is a instance method
    //     System.out.println(width*depth*height);
    // }

}
class BoxDemo{
    public static void main(String args[])
    {
        Box mybox= new Box();
        double vol;
        mybox.depth=10;
        mybox.width=20;
        mybox.height=30;
        // vol=mybox.getVolume();
        // vol=mybox.width*mybox.depth*mybox.height;
        System.out.println("the volume is : "+vol);
    }
}

// class OverLoadDemo{
//     void test(){
//         System.out.println("there is no parameter");
//     }
//     void test(int a){
//         System.out.println("there is only one parameter :"+a);
//     }
//     void test(int a, int b){
//         System.out.println("There are two parameters :"+a+" "+b);
//     }
//     double test(double a){
//         System.out.println("It's defined object is double");
//         return a+a;
//     }
// }
// class OverLoad{
//     public static void main(String args[]){
//         OverLoadDemo ab=new OverLoadDemo();
//         ab.test();
//         ab.test(10);
//         ab.test(20,30);
//         double volume;
//         volume=ab.test(15.25);
//         System.out.println("The double object value is : "+volume);

//     }
// }