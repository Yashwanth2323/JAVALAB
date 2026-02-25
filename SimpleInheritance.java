class A {

int i;
int j;

void showij() {
System.out.println("i and j: " + i + " " + j);
}
}

class B extends A {

int k;

void showk() {
System.out.println("k: " + k);
}

void sum() {
System.out.println("Sum of i, j and k: " + (i + j + k));
}
}

class SimpleInheritance {

public static void main(String[] args) {

A superOb = new A();

superOb.i = 10;
superOb.j = 20;

System.out.println("Contents of superOb:");
superOb.showij();

B subOb = new B();

subOb.i = 7;
subOb.j = 8;
subOb.k = 9;

System.out.println("\nContents of subOb:");
subOb.showij();
subOb.showk();
subOb.sum();

}
}
