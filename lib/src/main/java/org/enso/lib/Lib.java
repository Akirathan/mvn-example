package org.enso.lib;

public class Lib {
    public static int add(int x, int y) {
        return x + y;
    }

    private static int privateAdd(int x, int y) {
        return x + y + 42;
    }
}
