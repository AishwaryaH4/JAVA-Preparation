class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show");
    }

    void show(int x) { // overloading
        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();        // overriding
        c.show(10);      // overloading
    }
}