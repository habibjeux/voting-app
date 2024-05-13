package sn.ucad.m2sir.vote.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.ucad.m2sir.vote.entite.Candidat;
import sn.ucad.m2sir.vote.repository.CandidatRepository;

@RequiredArgsConstructor
@Service
public class CandidatService {
    private final CandidatRepository candidatRepository;

    public Candidat save(Candidat candidat) {
        return  candidatRepository.save(candidat);
    }
}
