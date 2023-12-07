package tn.esprit.sptingproject2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.sptingproject2.Entities.Chambre;
import tn.esprit.sptingproject2.Entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    public List<Chambre> findByBlocIdBloc(Long idBloc);

    //Sélectionner toutes les chambres d'un type donné dans un foyer donné en utilisant des jointures :
    @Query("SELECT c FROM Chambre c JOIN c.bloc b JOIN b.foyer f WHERE c.typeChambre = :typeChambre AND f.idFoyer = :idFoyer")
    List<Chambre> findChambresByTypeAndFoyer(@Param("typeChambre") TypeChambre typeC, @Param("idFoyer") Long idFoyer);
}
