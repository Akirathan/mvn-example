package org.enso.runner;

import java.util.ServiceLoader;
import org.enso.lib.Lib;
import org.enso.lib.Service;

public class Runner {
    public static void main(String[] args) {
        ServiceLoader<Service> serviceLoader = ServiceLoader.load(Service.class);
        serviceLoader.stream().forEach(loader -> {
            var serviceProvider = loader.get();
            var lib = new Lib(serviceProvider);
            var res = lib.combine(1, 2);
            System.out.println("Lib with provider '" + serviceProvider.getClass().getName() + "' returned " + res);
        });
    }
}
