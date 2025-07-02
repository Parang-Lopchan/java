public class GarbageDemo {
    String objName;

    GarbageDemo(String name) {
        objName = name;
    }

    protected void finalize() {
        System.out.println(objName + " is being garbage collected");
    }

    public static void main(String[] args) {
        GarbageDemo g1 = new GarbageDemo("Object1");
        GarbageDemo g2 = new GarbageDemo("Object2");

        g1 = null;
        g2 = null;

        System.gc();
    }
}
