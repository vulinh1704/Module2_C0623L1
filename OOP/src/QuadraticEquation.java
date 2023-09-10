public class QuadraticEquation {
    public int a;
    public int b;
    public int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {// ax^2 + bx + c = 0
        return "Phương trình có dạng: " + this.a + "x^2 + " + this.b + "x + " + this.c + " = 0";
    }

    double getDelta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    double getRoot1() {
        double delta = getDelta();
        double root1;
        if (delta == 0) {
            root1 = -this.b / (2 * this.a);
        } else {
            root1 = (-b + Math.sqrt(delta)) / (this.a * 2);
        }
        return root1;
    }

    double getRoot2() {
        double delta = getDelta();
        double root2;
        if (delta == 0) {
            root2 = -this.b / (2 * this.a);
        } else {
            root2 = (-b - Math.sqrt(delta)) / (this.a * 2);
        }
        return root2;
    }

    boolean checkDelta() {
        double delta = getDelta();
        if (delta < 0) {
            return false;
        } else {
            return true;
        }
    }
}

class Test {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(5, 9, 2);
        System.out.println(quadraticEquation);
        if (!quadraticEquation.checkDelta()) {
            System.out.println("Vô nghiệm bạn ơi!!");
        } else {
            System.out.println("Nghiệm 1 là : " + Math.floor(quadraticEquation.getRoot2() * 100) / 100);
            System.out.println("Nghiệm 2 là : " + (double) Math.round(quadraticEquation.getRoot2()));
        }
    }
}

