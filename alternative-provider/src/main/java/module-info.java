import org.enso.provider.AlternativeProvider;

module org.enso.provider {
    requires org.enso.lib;
    provides org.enso.lib.Service with AlternativeProvider;
}
