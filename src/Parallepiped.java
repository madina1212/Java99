public class Parallepiped {
    private int lengh, height, width;
    public Parallepiped(int lengh,int height, int width){
        this.lengh = lengh;
        this.height = height;
        this.width = width;
    }

    public int getLengh() {
        return lengh;
    }

    public void setLengh(int lengh) {
        this.lengh = lengh;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void area(){
        System.out.println(2*((height * lengh) * (lengh * width) * (height * width) ));
    }
    public  void volume(){
        System.out.println(lengh*width*height);
    }
}
