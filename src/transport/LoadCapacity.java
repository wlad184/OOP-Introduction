package transport;

public enum LoadCapacity {
    N1(0, 3.5),
    N2(3.6, 12),
    N3(13, 100);
    private double min;
    private double max;

    LoadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }
}
