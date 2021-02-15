public class Square implements Drawable {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public Square() {
        a = 5;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void draw() {
        for(int i=0; i<a; i++) {
            for(int g=0; g<a; g++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
