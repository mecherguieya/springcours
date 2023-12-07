package tn.esprit.sptingproject2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sptingproject2.Entities.Bloc;
import tn.esprit.sptingproject2.Entities.Foyer;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    List<Bloc> findBlocByFoyer(Foyer foyer);

    public List<Bloc> findByCapaciteBloc(Long capaciteBloc);// signature de la methode requette
    // find=select requette selecte from entite Bloc  car List<Bloc> by = were

}
