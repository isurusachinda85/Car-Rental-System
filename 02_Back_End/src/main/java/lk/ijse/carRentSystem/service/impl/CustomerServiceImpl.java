package lk.ijse.carRentSystem.service.impl;

import lk.ijse.carRentSystem.dto.CustomerDTO;
import lk.ijse.carRentSystem.entity.Customer;
import lk.ijse.carRentSystem.repo.CustomerRepo;
import lk.ijse.carRentSystem.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveCustomer(CustomerDTO dto) {
        if (repo.existsById(dto.getCusNic())) {
            throw new RuntimeException("Wrong Id ! all ready save customer");
        }

        Customer customer =mapper.map(dto,Customer.class);
        repo.save(customer);
    }
}
