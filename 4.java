class Box {
    double height;
    double width;
    double depth;
    double getVolume(){
        return width*height*depth;
    }
}
class BoxDemo{
    public static void main(String args[])
    {
        Box mybox = new Box();
        Box mybox1 = new Box();    // my box is trhe reference varible and where as new box makes the object
        double vol;
        mybox.width = 10;
        mybox.depth = 20;
        mybox.height = 30;
        mybox1.width = 12;
        mybox1.depth = 24;
        mybox1.height = 36;
        vol=mybox.getVolume();
        System.out.println("The volume is "+ vol);
        vol=mybox1.getVolume();
        System.out.println("The volume is  "+ vol);
    }
}