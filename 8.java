
class Box{
    double height;
    double width;
    double depth;

    Box(double height,double width,double depth){
    this.height=height;
    this.width=width;
    this.depth=depth;
    }
    double getVolume(){
        return width*height*depth;
    }
}
class BoxDemo3{
    public static void main(String args[]){
        Box myBox=new Box(10,11,12);
        Box myBox1=new Box(5,6,7);
        double vol;
        vol=myBox.getVolume();
        System.out.println("The volume is : "+ vol);
        vol=myBox1.getVolume();
        System.out.println("The Volume is : "+ vol);
    }
}
