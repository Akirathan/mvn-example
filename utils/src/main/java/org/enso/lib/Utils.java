package org.enso.lib;


public class Utils {
    public static int callPackagePrivateMethodFromLib(int x, int y) {
        return Lib.packagePrivateCombine(x, y);
    }
}
