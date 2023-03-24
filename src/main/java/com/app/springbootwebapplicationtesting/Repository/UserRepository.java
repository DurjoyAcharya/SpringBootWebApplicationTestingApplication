package com.app.springbootwebapplicationtesting.Repository;

import com.app.springbootwebapplicationtesting.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
