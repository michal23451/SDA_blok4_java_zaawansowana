package mojetesty;

public class ExceptionsTestMain {
    public static void main(String[] args) {

        System.out.println("przed");

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        method2();



        try {
            throw new Exception("XXX");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int a[] = {1,2,3};
            System.out.println(a[4]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("getCanonicalName" + e.getClass().getCanonicalName());
        }

        System.out.println("po");


    }


    public static void method1() throws Exception {
        throw new Exception("BUM! BUM! BUM!");
    }

    public static void method2() {
        try {
            throw new Exception("BUM! BUM! BUM!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
