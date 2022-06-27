package shildt10.chapter_7;

public class Box {
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double length, width, height;

        Box (Box box){
            this.width = box.width;
            this.height = box.height;
            this.length = box.length;
        }
    Box(double length, double height, double width){
        this.width = width;
        this.length = length;
        this.height = height;

    }
    Box (double len){
        height = length = width = len;

    }

    Box (){
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    double volume(){
        return length * height * width;
    }
}
