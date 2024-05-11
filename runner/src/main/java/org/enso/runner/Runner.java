package org.enso.runner;

import java.util.ServiceLoader;
import org.enso.lib.Lib;
import org.enso.lib.Service;

public class Runner {
    public static void main(String[] args) throws Exception {
        var res = Lib.add(1, 2);
        System.out.println("Result from Lib.add(1,2) = " + res);
        loadServices();
        //accessPrivateLibStuff();
    }

    private static void loadServices() {
        ServiceLoader<Service> loader = ServiceLoader.load(Service.class);
        var providers = loader.stream().toList();
        if (providers.isEmpty()) {
            System.out.println("No service providers found");
        } else {
            System.out.println("Found " + providers.size() + " service providers:");
            for (var provider : providers) {
                System.out.println("  provider.getClass().getName() = " + provider.get().getClass().getName());
                System.out.println("  provider.loadConfig()         = " + provider.get().loadConfig());
            }
        }
    }

    private static void accessPrivateLibStuff() throws Exception {
        var method = Lib.class.getDeclaredMethod("privateAdd", int.class, int.class);
        method.setAccessible(true);
        Integer res = (Integer) method.invoke(null, 1, 2);
        System.out.println("Result from Lib.privateAdd(1,2) = " + res);
    }

    private static void playWithModuleLayer() throws Exception {
        var bootLayer = ModuleLayer.boot();
        for (var module : bootLayer.modules()) {
        }
    }
}
