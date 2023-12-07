package tn.esprit.sptingproject2.Services;

import tn.esprit.sptingproject2.Entities.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationService {
    Reservation addReservation(Reservation r);
    Reservation updateReservation(String id, Reservation r);
    List<Reservation> findAll();
    public Reservation findById(String id);
    String deleteReservationById(String id);
    public void delete(Reservation r);
    void deleteById(String id);

    //JPQL
    List<Reservation> getReservationsByEtudiant(Long idEtudiant);
}
