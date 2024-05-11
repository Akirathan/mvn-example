package org.enso.provider;

import org.enso.lib.Service;

public class AlternativeProvider implements Service {
    @Override
    public String loadConfig() {
        return "Config from AlternativeProvider";
    }
}
