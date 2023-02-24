package ma.isga.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.isga.springbatch.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
