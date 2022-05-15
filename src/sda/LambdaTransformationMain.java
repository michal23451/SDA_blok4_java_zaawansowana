package sda;

import java.math.BigDecimal;
import java.util.function.Function;

public class LambdaTransformationMain {

    public static void main(String[] args) {
        // wykonanie operacji 10% rabatu przy użyciu dedykowanej klasy implementującej interfejs funkcyjny
        Function<Integer, BigDecimal> rabatOperation1 = new RabatOperation(0.1);

        BigDecimal result1 = rabatOperation1.apply(300);
        System.out.println("result 1: " + result1);

        // wykonanie operacji 10% rabatu przy użyciu klasy anonimowej
        Function<Integer, BigDecimal> rabatOperation2 = new Function<Integer, BigDecimal>() {
            @Override
            public BigDecimal apply(Integer integer) {
                return BigDecimal.valueOf(integer).multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(0.1)));
            }
        };

        BigDecimal result2 = rabatOperation2.apply(300);
        System.out.println("result 2: " + result2);

        // wykonanie operacji 10% rabatu przy użyciu lambdy
        Function<Integer, BigDecimal> rabatOperation3 = integer -> BigDecimal.valueOf(integer).multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(0.1)));

        BigDecimal result3 = rabatOperation3.apply(300);
        System.out.println("result 3: " + result3);
    }

    public static class RabatOperation implements Function<Integer, BigDecimal> {

        private BigDecimal rabat;

        public RabatOperation(double rabat) {
            this.rabat = BigDecimal.valueOf(rabat);
        }

        @Override
        public BigDecimal apply(Integer integer) {
            return BigDecimal.valueOf(integer).multiply(BigDecimal.ONE.subtract(rabat));
        }
    }
}
