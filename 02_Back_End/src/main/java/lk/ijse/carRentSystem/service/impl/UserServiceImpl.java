package lk.ijse.carRentSystem.service.impl;

import lk.ijse.carRentSystem.repo.UserRepo;
import lk.ijse.carRentSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo repo;
}
