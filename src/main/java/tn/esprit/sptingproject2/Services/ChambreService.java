package tn.esprit.sptingproject2.Services;

import tn.esprit.sptingproject2.Entities.Chambre;
import tn.esprit.sptingproject2.Entities.TypeChambre;

import java.util.List;

public interface ChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Long id, Chambre chambre);
    List<Chambre> findAll();
    Chambre findById(long id);
    void deleteById(long id);
    void delete(Chambre chambre);
    public List<Chambre > getChambreByBlocId(Long idBloc);
    List<Chambre> getChambresByTypeAndFoyer(TypeChambre typeC, Long idFoyer);

}
