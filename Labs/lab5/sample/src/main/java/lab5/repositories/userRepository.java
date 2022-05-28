package lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lab5.entity.User;

//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
public interface userRepository extends JpaRepository<User, Integer> {

//  List<User> findByLastName(@Param("name") String name);

}