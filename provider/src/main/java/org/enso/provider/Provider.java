package org.enso.provider;

import org.enso.lib.Service;

public class Provider implements Service {
    @Override
    public String loadConfig() {
        return "Config from Provider";
    }
}
