package transport;

public enum CapacityPassengers {C1(0, 10),
                                C2(11, 25),
                                C3(26, 50),
                                C4(51, 80),
                                C5(81, 120);
    private int minCap;
    private int maxCap;

    CapacityPassengers(int minCap, int maxCap) {
        this.minCap = minCap;
        this.maxCap = maxCap;
    }
}
