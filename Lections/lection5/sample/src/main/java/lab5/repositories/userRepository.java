package lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import lab5.entity.User;

//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface userRepository extends JpaRepository<User, Integer> {

//  List<User> findByLastName(@Param("name") String name);

}