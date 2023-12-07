package tn.esprit.sptingproject2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sptingproject2.Entities.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    public List<Universite> findUniversitesByAdresse(String adresse);
}
