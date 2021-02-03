package combat.data;

import org.springframework.data.repository.CrudRepository;

import combat.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
