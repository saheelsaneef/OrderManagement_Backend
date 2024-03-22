package com.example.backend.orderManagement.Controller;

import com.example.backend.orderManagement.Entity.Complain;
import com.example.backend.orderManagement.Service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complains")
public class ComplainController {

    private final ComplainService complainService;

    @Autowired
    public ComplainController(ComplainService complainService) {
        this.complainService = complainService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Complain>> getAllComplains() {
        List<Complain> complains = complainService.getAllComplains();
        return new ResponseEntity<>(complains, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Complain> createComplain(@RequestBody Complain complain) {
        Complain newComplain = complainService.saveComplain(complain);
        return new ResponseEntity<>(newComplain, HttpStatus.CREATED);
    }

    @PutMapping("/id")
    public ResponseEntity<Complain> updateComplain(@PathVariable String id, @RequestBody Complain complain) {
        Complain updatedComplain = complainService.updateComplain(id, complain);
        return new ResponseEntity<>(updatedComplain, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deleteComplain(@PathVariable String id) {
        complainService.deleteComplain(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/count")
    public long getTotalComplains() {
        return complainService.getTotalComplains();
    }

    @GetMapping("/pending")
    public long getTotalPendingComplains(){
        return complainService.getTotalPendingComplains();
    }

}
