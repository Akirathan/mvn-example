package org.enso.runner;

import java.util.ServiceLoader;
import org.enso.lib.Lib;
import org.enso.lib.Service;
import org.enso.lib.Utils;

public class Runner {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int resFromUtils = Utils.callPackagePrivateMethodFromLib(x, y);
        System.out.printf("Utils.callPackagePrivateMethodFromLib(%d, %d) returned %d %n", x, y, resFromUtils);
        System.out.println("Running lib with different service providers:");
        ServiceLoader<Service> serviceLoader = ServiceLoader.load(Service.class);
        serviceLoader.forEach(serviceProvider -> {
            var lib = new Lib(serviceProvider);
            var res = lib.combine(x, y);
            System.out.printf("  lib.combine(provider=%s, x=%d, y=%d) returned %d %n",
                serviceProvider.getClass().getName(), x, y, res);
        });
    }
}
