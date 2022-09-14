package com.nidservices.yekoregistration.registry;

public interface AdapterService<T> {
  public void process(T request);
}
