package tn.esprit.sptingproject2.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sptingproject2.Entities.Foyer;
import tn.esprit.sptingproject2.Entities.Universite;
import tn.esprit.sptingproject2.Repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements FoyerService{
    @Autowired
    private FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Long id, Foyer foyer) {
        if(foyerRepository.findById(id).isPresent()){
            Foyer toUpdateFoyer = foyerRepository.findById(id).get();
            toUpdateFoyer.setNomFoyer(foyer.getNomFoyer());
            toUpdateFoyer.setCapaciteFoyer(foyer.getCapaciteFoyer());
            toUpdateFoyer.setBlocs(foyer.getBlocs());
            toUpdateFoyer.setUniversite(foyer.getUniversite());

            return foyerRepository.save(toUpdateFoyer);
        }
        return null;
    }


    @Override
    public List<Foyer> findAll() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public void delete(Foyer foyer) {
        foyerRepository.delete(foyer);
    }
    @Override
    public List<Foyer> getFoyerByCapaciteFoyer(Long capacitefoyer) {
        return foyerRepository.findByCapaciteFoyer(capacitefoyer);//capacite en miniscule
    }


    public Universite getUniversiteByFoyer(Long idFoyer) {
        return foyerRepository.findUniversiteByFoyer(idFoyer);
    }
}
