package sn.ucad.m2sir.vote.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.ucad.m2sir.vote.entite.Candidat;
import sn.ucad.m2sir.vote.entite.Poste;
import sn.ucad.m2sir.vote.repository.PosteRepository;

@RequiredArgsConstructor
@Service
public class PosteService {
    private final PosteRepository posteRepository;
    public Poste save(Poste poste) {
        return  posteRepository.save(poste);
    }
}
