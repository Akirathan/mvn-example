package org.enso.provider.add;

import org.enso.lib.Service;

public class AddProvider implements Service {
    @Override
    public String loadConfig() {
        return "Config from AddProvider";
    }
}
