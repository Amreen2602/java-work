class Box{
    double width;
    double height;
    double depth;
    Box(){
        System.out.println("Constructing Box");                    // constructor method
        width=10;
        height=20;
        depth=30;
    }
    double getVolume(){
        return width*depth*height;
    }
}
    class BoxDemo2{
        public static void main(String args[]){
            Box mybox = new Box();
            Box mybox1 = new Box();
            double vol;
            vol =  mybox.getVolume();
            System.out.println("The Volume is "+ vol);
            vol = mybox1.getVolume();
            System.out.println("The Volume is "+ vol);
        }
    }

