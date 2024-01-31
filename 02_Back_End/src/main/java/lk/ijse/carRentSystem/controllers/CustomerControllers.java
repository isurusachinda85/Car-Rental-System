package lk.ijse.carRentSystem.controllers;

import lk.ijse.carRentSystem.dto.CustomerDTO;
import lk.ijse.carRentSystem.service.CustomerService;
import lk.ijse.carRentSystem.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
@Transactional
public class CustomerControllers {

    @Autowired
    private CustomerService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil saveCustomer(CustomerDTO dto) {
        service.saveCustomer(dto);
        return new ResponseUtil("Ok", "Save Customer", dto);
    }
}
