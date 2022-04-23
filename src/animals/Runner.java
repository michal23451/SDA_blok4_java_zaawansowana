package animals;

public interface Runner {

    void run();

    default void count() {
        showPrivateCounting();
        run();
    }

    static void staticCount() {
        showPrivateStaticCounting();
        // run();
    }

    private void showPrivateCounting() {
        System.out.println("3, 2, 1...");
    }

    private static void showPrivateStaticCounting() {
        System.out.println("3, 2, 1...");
    }
}
