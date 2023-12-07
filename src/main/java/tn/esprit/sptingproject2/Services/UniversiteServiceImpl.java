package tn.esprit.sptingproject2.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sptingproject2.Entities.Universite;
import tn.esprit.sptingproject2.Repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements UniversiteService{
    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Long id, Universite u) {
        if(universiteRepository.findById(id).isPresent()){
            Universite toUpdateUniversite = universiteRepository.findById(id).get();
            toUpdateUniversite.setNomUniversite(u.getNomUniversite());
            toUpdateUniversite.setAdresse(u.getAdresse());
            toUpdateUniversite.setFoyer(u.getFoyer());

            return universiteRepository.save(toUpdateUniversite);
        }
        return null;
    }

    @Override
    public List<Universite> findAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findById(long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public void delete(Universite u) {
        universiteRepository.delete(u);
    }

    @Override
    public List<Universite> findUniversiteByAdresse(String adresse) {
        return universiteRepository.findUniversitesByAdresse(adresse);

    }

}
