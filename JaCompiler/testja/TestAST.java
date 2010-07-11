
public class TestAST extends TestArray {

    public A field1;
    public B field2, field3;
    private int[] arrayField[];

    public TestAST() {
        super(1, 2);
        field1 = new A();
        a = 3 + 2;
        metodoProlisso(new B());
    }

    public TestAST(int[] constFparm) {
    }

    public int[][] metodoArray(int[][] arrayFparam[]) {
        int[] arrayLocal[][];
    }

    public A metodoProlisso(B b) {
        int x, y;
        a.f().g(1).b.z(3);
        a += 3;
        {
            x++;
            y = 2 + 3;
        }
        if (A instanceof B) {
            A++;
        } else {
            A--;
        }
        for (int i = 0; i < 5; i++) {
            A++;
        }
        while (a != b) {
            int g = 3 * 9;
            if (c == "Iliana") {
                do {
                    System.out.println("Hello World!");
                } while (3 <= 4);
            } else {
                return a[].class;
            }
        }
    }
}
