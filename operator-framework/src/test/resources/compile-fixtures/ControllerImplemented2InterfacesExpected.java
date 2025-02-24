package io;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.client.CustomResourceDoneable;
import java.lang.SuppressWarnings;

public class MyCustomResourceDoneable extends CustomResourceDoneable<ControllerImplemented2Interfaces.MyCustomResource> {
    @SuppressWarnings("unchecked")
    public MyCustomResourceDoneable(ControllerImplemented2Interfaces.MyCustomResource resource, Function function) {
        super(resource, function);
    }
}
