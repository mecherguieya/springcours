package tn.esprit.sptingproject2.Services;

import tn.esprit.sptingproject2.Entities.Etudiant;
import tn.esprit.sptingproject2.Entities.Reservation;

import java.util.List;

public interface EtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Long id, Etudiant etudiant);
    List<Etudiant> findAll();
    Etudiant findById(long id);
    void deleteById(long id);
    void delete(Etudiant etudiant);

    public List<Etudiant> getEtudiantByNomEt(String nomet);
    List<Reservation> getReservationsByEtudiant(Long idEtudiant);
}
