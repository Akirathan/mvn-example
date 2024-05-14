package org.enso.provider.add;

import org.enso.lib.Service;

public class AddProvider implements Service {
    @Override
    public int combine(int x, int y) {
        return x + y;
    }
}
