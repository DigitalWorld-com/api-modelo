package com.digitalworlds.api.base.repositories;

import com.digitalworlds.api.base.entities.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingEntity, Long> {
}
