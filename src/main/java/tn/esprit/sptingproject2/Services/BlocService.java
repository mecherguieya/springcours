package tn.esprit.sptingproject2.Services;

import tn.esprit.sptingproject2.Entities.Bloc;
import tn.esprit.sptingproject2.Entities.Foyer;

import java.util.List;

public interface BlocService {
    Bloc addBloc(Bloc b);
    Bloc updateBloc(Long id, Bloc b);
    List<Bloc> findAll();
    Bloc findById(long id);
    String deleteById(long id);
    void delete(Bloc b);
    List<Bloc> findBlocByFoyer(Foyer foyer);


    public List<Bloc> getBlocByCapacite(Long capaciteBloc);// signature de la methode getBlocByCapacite
    void afficherListeBlocs();

}
