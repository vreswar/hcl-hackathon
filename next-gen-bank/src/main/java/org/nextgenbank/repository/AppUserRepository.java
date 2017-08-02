package org.nextgenbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.nextgenbank.domain.AppUser;

/**
 * @author Samraj Timmapuram
 *
 */
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);
}
