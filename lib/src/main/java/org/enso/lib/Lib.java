package org.enso.lib;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Stream;

public final class Lib {

    private final Service provider;

    private Lib(Service provider) {
        this.provider = provider;
    }

    public int combine(int x, int y) {
        return provider.combine(x, y);
    }

    public static List<Lib> all() {
        ServiceLoader<Service> discover = ServiceLoader.load(Service.class);
        Stream<Lib> wrap = discover.stream().map(service -> new Lib(service.get()));
        return wrap.toList();
    }

    public String getName() {
        return provider.getClass().getSimpleName();
    }

    static int packagePrivateCombine(int x, int y) {
        return x * y;
    }
}
