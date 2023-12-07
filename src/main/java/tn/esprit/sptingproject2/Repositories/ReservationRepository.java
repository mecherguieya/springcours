package tn.esprit.sptingproject2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.sptingproject2.Entities.Reservation;
import tn.esprit.sptingproject2.Entities.Universite;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {


    //requete dans la classe
    @Query("SELECT r FROM Reservation r JOIN r.etudiants e WHERE e.idEtudiant = :idEtudiant")
    List<Reservation> findReservationsByEtudiant(@Param("idEtudiant") Long idEtudiant);

}
