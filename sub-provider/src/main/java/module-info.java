import org.enso.provider.sub.SubProvider;

module org.enso.provider.sub {
    requires org.enso.lib;
    provides org.enso.lib.Service with SubProvider;
}
