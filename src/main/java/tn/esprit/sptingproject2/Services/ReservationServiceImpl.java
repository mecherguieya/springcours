package tn.esprit.sptingproject2.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sptingproject2.Entities.Reservation;
import tn.esprit.sptingproject2.Repositories.ReservationRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService{
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }
    @Override
    public Reservation updateReservation(String id, Reservation r) {
        if(reservationRepository.findById(id).isPresent()){
            Reservation toUpdateReservation = reservationRepository.findById(id).get();
            toUpdateReservation.setAnneeUniversitaire(r.getAnneeUniversitaire());
            toUpdateReservation.setEstValide(r.isEstValide());
            toUpdateReservation.setEtudiants(r.getEtudiants());

            return reservationRepository.save(toUpdateReservation);
        }
        return null;
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(String id){
        return reservationRepository.findById(id).isPresent() ? reservationRepository.findById(id).get() : null;
    }

    @Override
    public String deleteReservationById(String id){
        if(reservationRepository.findById(id).isPresent()){
            reservationRepository.deleteById(id);
            return "Deleted"+reservationRepository.findById(id).get().toString();
        }else
            return "reservation with ID : "+id+" Doesn't exist";
    }

    @Override
    public void delete(Reservation r) {
        reservationRepository.delete(r);
    }

    @Override
    public void deleteById(String id) {reservationRepository.deleteById(id);

    }

    //JPQL
    @Override
    public List<Reservation> getReservationsByEtudiant(Long idEtudiant) {
        return reservationRepository.findReservationsByEtudiant(idEtudiant);
    }
}
