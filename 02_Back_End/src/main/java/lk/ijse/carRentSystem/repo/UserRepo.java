package lk.ijse.carRentSystem.repo;

import lk.ijse.carRentSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
