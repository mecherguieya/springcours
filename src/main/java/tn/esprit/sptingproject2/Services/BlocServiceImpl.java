package tn.esprit.sptingproject2.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.sptingproject2.Entities.Bloc;
import tn.esprit.sptingproject2.Entities.Foyer;
import tn.esprit.sptingproject2.Repositories.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements BlocService {
    @Autowired
    private BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }



    @Override
    public Bloc updateBloc(Long id, Bloc b) {
        if (blocRepository.findById(id).isPresent()) {
            Bloc toUpdateBloc = blocRepository.findById(id).get();
            toUpdateBloc.setNomBloc(b.getNomBloc());
            toUpdateBloc.setCapaciteBloc(b.getCapaciteBloc());
            toUpdateBloc.setFoyer(b.getFoyer());
            toUpdateBloc.setChambres(b.getChambres());
            return blocRepository.save(toUpdateBloc);
        }
        return null;
    }

    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long id) {
        return blocRepository.findById(id).get();
    }

    @Override
    public String deleteById(long id) {
        if (blocRepository.findById(id).isPresent()) {
            blocRepository.delete(blocRepository.findById(id).get());
            return "has been successfully deleted";
        } else {
            return "Doesn't exist";
        }
    }

    @Override
    public void delete(Bloc b) {
        blocRepository.delete(b);
    }
    @Override
    public List<Bloc> findBlocByFoyer(Foyer foyer) {
        return blocRepository.findBlocByFoyer(foyer);
    }



    @Override
    public List<Bloc> getBlocByCapacite(Long capaciteBloc) {
        return blocRepository.findByCapaciteBloc(capaciteBloc);//capacite en miniscule
    }

    @Override
    public void afficherListeBlocs() {

    }
    /*
    @Override
    @Scheduled(fixedRate = 30000)
    public void afficherListeBlocs() {
        // Récupère la liste des blocs
        List<Bloc> listeBlocs = blocRepository.findAll();
        // Affiche la liste des blocs
        System.out.println("Liste des blocs chaque 30 secondes :");
        for (Bloc bloc : listeBlocs) {
            //System.out.println(bloc);
            System.out.println("ID: " + bloc.getIdBloc() + ", Nom: " + bloc.getNomBloc() + ", Capacité: " + bloc.getCapaciteBloc());

        }
    }*/

}