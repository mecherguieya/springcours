package tn.esprit.sptingproject2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.sptingproject2.Entities.Etudiant;
import tn.esprit.sptingproject2.Entities.Reservation;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findByNomEt(String nomet);
    @Query("SELECT e.reservations FROM Etudiant e WHERE e.idEtudiant = :idEtudiant")
    List<Reservation> findReservationsByEtudiant(@Param("idEtudiant") Long idEtudiant);
}
