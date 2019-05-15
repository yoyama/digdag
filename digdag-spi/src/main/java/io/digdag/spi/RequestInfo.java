package io.digdag.spi;

import org.immutables.value.Value;

@Value.Immutable
public interface RequestInfo
{
    String getIpAddress();
    String getMethod();
    String getPathInfo();
}
