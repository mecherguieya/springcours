package tn.esprit.sptingproject2.Services;

import tn.esprit.sptingproject2.Entities.Universite;

import java.util.List;

public interface UniversiteService {
    Universite addUniversite(Universite u);

    Universite updateUniversite(Long id, Universite u);
    List<Universite> findAll();
    Universite findById(long id);
    void deleteById(long id);
    void delete(Universite u);
    List<Universite> findUniversiteByAdresse(String adresse);


}
