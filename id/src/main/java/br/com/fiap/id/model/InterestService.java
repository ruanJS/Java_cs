package br.com.fiap.id.model;

import br.com.fiap.id.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterestService {

    private final InterestRepository interestRepository;

    @Autowired
    public InterestService(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }

    public void saveInterest(Interest interest) {
        interestRepository.save(interest);
    }

    public Interest findInterestById(Long id) {
        Optional<Interest> interestOptional = interestRepository.findById(id);
        return interestOptional.orElse(null);
    }

    public List<Interest> getAllInterests() {
        return interestRepository.findAll();
    }

    public void deleteInterestById(Long id) {
        interestRepository.deleteById(id);
    }
}
