package org.enso.provider.sub;

import org.enso.lib.Service;

public class SubProvider implements Service {
    @Override
    public String loadConfig() {
        return "Config from SubProvider";
    }
}
