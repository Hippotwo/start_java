package shildt10.chapter_6;

public class Box {
    double width;
    double height;
    double depth;

//    void volume(){
//        System.out.println("Volume is " + width * height * depth);
//    }

    double volume(){
        return width * height * depth;
    };

    void setDim(double w,double h,double d){
        width = w;
        depth = d;
        height = h;

    }

}
