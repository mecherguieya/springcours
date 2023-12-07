package tn.esprit.sptingproject2.Services;

import tn.esprit.sptingproject2.Entities.Foyer;
import tn.esprit.sptingproject2.Entities.Universite;

import java.util.List;

public interface FoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Long id, Foyer foyer);
    List<Foyer> findAll();
    Foyer findById(long id);
    void deleteById(long id);
    void delete(Foyer foyer);
    public List<Foyer> getFoyerByCapaciteFoyer(Long capacitefoyer);

    public Universite getUniversiteByFoyer(Long idFoyer);

}
