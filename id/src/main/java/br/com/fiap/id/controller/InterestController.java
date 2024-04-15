package br.com.fiap.id.controller;

import br.com.fiap.id.model.Interest;
import br.com.fiap.id.model.InterestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interests")
public class InterestController {

    public final InterestService interestService;

    public InterestController(InterestService interestService) {
        this.interestService = interestService;
    }

    @PostMapping
    public void createInterest(@RequestBody Interest interest) {
        interestService.saveInterest(interest);
    }

    @GetMapping("/{id}")
    public Interest getInterestById(@PathVariable Long id) {
        return interestService.findInterestById(id);
    }

    @GetMapping
    public List<Interest> getAllInterests() {
        return interestService.getAllInterests();
    }

    @PutMapping("/{id}")
    public void updateInterest(@PathVariable Long id, @RequestBody Interest interest) {
        interest.setId(id);
        interestService.saveInterest(interest);
    }

    @DeleteMapping("/{id}")
    public void deleteInterest(@PathVariable Long id) {
        interestService.deleteInterestById(id);
    }
}
