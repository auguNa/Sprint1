package S1_08.N1Ejercicio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );


        months.forEach(month -> System.out.println(month));
    }
}