package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Config;
@Repository
public interface ConfigRepository extends JpaRepository<Config, Long>{

}
