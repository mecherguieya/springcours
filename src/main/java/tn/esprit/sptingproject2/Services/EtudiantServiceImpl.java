package tn.esprit.sptingproject2.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sptingproject2.Entities.Etudiant;
import tn.esprit.sptingproject2.Entities.Reservation;
import tn.esprit.sptingproject2.Repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements EtudiantService{
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Long id, Etudiant etudiant) {
        if(etudiantRepository.findById(id).isPresent()){
            Etudiant toUpdateEtudiant = etudiantRepository.findById(id).get();
            toUpdateEtudiant.setNomEt(etudiant.getNomEt());
            toUpdateEtudiant.setPrenomEt(etudiant.getPrenomEt());
            toUpdateEtudiant.setCin(etudiant.getCin());
            toUpdateEtudiant.setEcole(etudiant.getEcole());
            toUpdateEtudiant.setDateNaissance(etudiant.getDateNaissance());
            toUpdateEtudiant.setReservations(etudiant.getReservations());

            return etudiantRepository.save(toUpdateEtudiant);
        }
        return null;
    }


    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public void delete(Etudiant etudiant) {
        etudiantRepository.delete(etudiant);
    }


    @Override
    public List<Etudiant> getEtudiantByNomEt(String nomet) {
        return etudiantRepository. findByNomEt(nomet);
    }

    @Override
    public List<Reservation> getReservationsByEtudiant(Long idEtudiant) {
        return etudiantRepository.findReservationsByEtudiant(idEtudiant);
    }
}
