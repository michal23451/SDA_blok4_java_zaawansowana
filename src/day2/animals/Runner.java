package day2.animals;

public interface Runner {

    void run();

    default void count() {                      // metoda default wymaga implementacji w interfejsie, jest dziedziczona przez klasy implementujące interfejs Runnable i może być przesłonięta
        showPrivateCounting();
        run();                                  // wywołanie metody run() z klasy implementującej interfejs Runner
    }

    static void staticCount() {                 // metoda static wymaga implementacji w interfejsie, nie można jej przesłonić, można ją wywołać bez obiektu -> Runner.staticCount()
        showPrivateStaticCounting();
    }

    private void showPrivateCounting() {        // metoda private wymaga implementacji w interfejsie
        System.out.println("3, 2, 1...");
    }

    private static void showPrivateStaticCounting() {   // metoda private static wymaga implementacji w interfejsie
        System.out.println("3, 2, 1...");
    }
}
