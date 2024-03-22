package com.example.backend.orderManagement.Service;

import com.example.backend.orderManagement.Entity.Complain;
import com.example.backend.orderManagement.Repository.ComplainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ComplainService {

    private final ComplainRepository complainRepository;

    @Autowired
    public ComplainService(ComplainRepository complainRepository) {
        this.complainRepository = complainRepository;
    }
    public Complain saveComplain(Complain complain) {
        return null; // Placeholder
    }


    public List<Complain> getAllComplains() {
        return complainRepository.findAll();
    }


    public Complain getComplainById(String id, Complain getComplainById) {
        return null; // Placeholder
    }

    public Complain createComplain(Complain complain) {

        Complain newComplain = null;

        return complainRepository.save(complain);
    }


    public Complain updateComplain(String id, Complain updatedComplain) {

        Optional<Complain> optionalComplain = complainRepository.findById(id);

        if (optionalComplain.isPresent()){
            Complain existingComplain = optionalComplain.get();

            existingComplain.setComplainStatus(updatedComplain.getComplainStatus());

            return complainRepository.save(existingComplain);

        }else {

            return null;
        }

    }

    public void deleteComplain(String id) {

        Optional<Complain> optionalComplain = complainRepository.findById(id);
        optionalComplain.ifPresent(complainRepository::delete);

    }


}
