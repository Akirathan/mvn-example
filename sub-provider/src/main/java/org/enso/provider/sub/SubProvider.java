package org.enso.provider.sub;

import org.enso.lib.Service;

public class SubProvider implements Service {
    @Override
    public int combine(int x, int y) {
        return x - y;
    }
}
