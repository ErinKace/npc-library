package com.npclibrary.data;

import org.springframework.data.repository.CrudRepository;
import com.npclibrary.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);

}
