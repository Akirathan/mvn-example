package org.enso.lib;

public class Lib {
    private final Service provider;

    public Lib(Service provider) {
        this.provider = provider;
    }

    public int combine(int x, int y) {
        return provider.combine(x, y);
    }

    static int packagePrivateCombine(int x, int y) {
        return x * y;
    }
}
