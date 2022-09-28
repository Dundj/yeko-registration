package com.nidservices.yekoregistration.registry;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.nidservices.yekoregistration.model.User;

public interface AdapterService<T> {

  public User addUserByType(User user);

  public List<User> findAllUser();
  public Optional <User> selectUserById(UUID id);
  public int updateUserById(UUID id, User user);
  public int deleteUserById(UUID id);
}
