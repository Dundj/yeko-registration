package com.nidservices.yekoregistration.registry;

public interface ServiceRegistry {
  public <T> AdapterService<T> getService(String serviceName);
}
