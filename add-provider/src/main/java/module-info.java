import org.enso.provider.add.AddProvider;

module org.enso.provider.add {
    requires org.enso.lib;
    provides org.enso.lib.Service with AddProvider;
}
