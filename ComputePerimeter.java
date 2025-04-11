public class ComputePerimeter {

    int a;
    int b;
    int c;

    public ComputePerimeter(int x, int y, int z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    public void TrianglePerimeter() {
        System.out.println(this.a + this.b + this.c);
    }

}