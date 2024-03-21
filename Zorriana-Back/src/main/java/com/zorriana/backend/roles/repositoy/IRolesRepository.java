package com.zorriana.backend.roles.repositoy;

import com.zorriana.backend.roles.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, Long> {
}
