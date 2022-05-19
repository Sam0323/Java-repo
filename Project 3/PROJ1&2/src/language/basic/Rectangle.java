package language.basic;

class Rectangle {
    // declaring variables length and width
    private static int length;
    private static int width;


    Rectangle(){
        length = 0;
        width = 0;
    }


    Rectangle(int l, int w){
        length = l;
        width= w;
    }


    public static void setLength(int l){
        length = l;
    }


    public static void setWidth(int w){
        width = w;
    }


    public static int getLength(){
        return length;
    }


    public static int getWidth(){
        return width;
    }


    public static int getPerimeter(){
        return 2 * (length+width);
    }


    public static int getArea(){
        return length*width;
    }
}
