public class GCDemo {

    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GCDemo obj1 = new GCDemo();
        GCDemo obj2 = new GCDemo();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}