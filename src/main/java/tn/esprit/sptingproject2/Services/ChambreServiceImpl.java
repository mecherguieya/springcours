package tn.esprit.sptingproject2.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sptingproject2.Entities.Chambre;
import tn.esprit.sptingproject2.Entities.TypeChambre;
import tn.esprit.sptingproject2.Repositories.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements ChambreService{
    @Autowired
    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {return chambreRepository.save(chambre);}

    @Override
    public Chambre updateChambre(Long id, Chambre c) {
        if(chambreRepository.findById(id).isPresent()){
            Chambre toUpdateChambre = chambreRepository.findById(id).get();
            toUpdateChambre.setNumeroChambre(c.getNumeroChambre());
            toUpdateChambre.setTypeChambre(c.getTypeChambre());
            toUpdateChambre.setBloc(c.getBloc());
            toUpdateChambre.setReservations(c.getReservations());
            return chambreRepository.save(toUpdateChambre);
        }
        return null;
    }

    @Override
    public List<Chambre> findAll() {return chambreRepository.findAll();}

    @Override
    public Chambre findById(long id) {
        return chambreRepository.findById(id).isPresent() ? chambreRepository.findById(id).get() : null;
    }
    @Override
    public void deleteById(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public void delete(Chambre chambre) {chambreRepository.delete(chambre);}

    @Override
    public List<Chambre> getChambreByBlocId(Long idBloc) {
        return chambreRepository.findByBlocIdBloc(idBloc);
    }


    @Override
    public List<Chambre> getChambresByTypeAndFoyer(TypeChambre typeC, Long idFoyer) {
        return chambreRepository.findChambresByTypeAndFoyer(typeC,idFoyer);
    }

}
