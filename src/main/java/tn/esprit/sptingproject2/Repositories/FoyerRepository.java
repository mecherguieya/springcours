package tn.esprit.sptingproject2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.sptingproject2.Entities.Foyer;
import tn.esprit.sptingproject2.Entities.Universite;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    public List<Foyer> findByCapaciteFoyer(Long capacitefoyer);

    @Query("SELECT u FROM Foyer f JOIN f.universite u WHERE f.idFoyer = :idFoyer")
    Universite findUniversiteByFoyer(@Param("idFoyer") Long idFoyer);
}
