class Box {
    double width;
    double height;
    double bredth;
    void getVolume(){                                     // instance method
        System.out.println("The volume is");
        System.out.println(width*height*bredth);
    }
}
class BoxDemo{
    public static void main(String args[]){
        Box mybox = new Box();
        Box mybox1 = new Box();
        double vol;
        mybox.width=10;
        mybox.bredth=20;
        mybox.height=30;
        mybox1.width=12;
        mybox1.bredth=24;
        mybox1.height=36;
        vol = mybox.width*mybox.bredth*mybox.height;

        System.out.println("the vol is  " + vol);

        vol = mybox1.bredth*mybox1.width*mybox1.height;

        System.out.println("the vol is "+ vol);

        mybox.getVolume();
        mybox1.getVolume();
    }
}
