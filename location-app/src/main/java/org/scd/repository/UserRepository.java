package org.scd.repository;

import org.scd.model.Location;
import org.scd.model.User;
import org.scd.model.security.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * User Repository
 */
public interface UserRepository extends CrudRepository<User, Long> {
    /**
     * Find user by email
     * @param email - unique email address
     * @return
     */
    User findByEmail(final String email);

    /**
     * Save user
     * @param user
     * @return
     */
    User save(User user);


}