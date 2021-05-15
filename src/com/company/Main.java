package com.company;

public class Main {

    public static void main(String[] args) {
        Oscelograph.printStaticNumberOfObj();

        Oscelograph first_osc = new Oscelograph();

        Oscelograph second_osc = new Oscelograph("Siglent", "USA", "AT-5", 1500);

        Oscelograph third_osc = new Oscelograph("FSD", "Germany", "MK-4", 1800, "Titan", 10, 20,"super energysaving", 60);

        System.out.println(first_osc);

        System.out.println(second_osc);

        System.out.println(third_osc);

        first_osc.printNumberOfObj();

        first_osc.resetValues("Siglent", "Italy", "GB-5783", 1600, "Aluminum", 15, 25, "ordinary", 50);

        System.out.println(first_osc);
    }
}
