public class TestAST {
    public TestAST() {
        this(7, 9*3+2);
    }

    public TestAST(int a, int b) {
        super(1, 2);
        metodo("M7");
        metodo(1+3, a, new B(new C()));
    }

    public ciao() {
        ciao1(new A(), "Iliana");
        ciao2(getInt());
    }
}