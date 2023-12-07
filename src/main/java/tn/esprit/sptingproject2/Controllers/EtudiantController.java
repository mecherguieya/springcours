package tn.esprit.sptingproject2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sptingproject2.Entities.Etudiant;
import tn.esprit.sptingproject2.Services.EtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("etudiant")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;

    @GetMapping("/findAll")
    List<Etudiant> findAll(){
        return  etudiantService.findAll();
    }

    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @PutMapping("update/{id}")
    Etudiant updateEtudiant(@PathVariable("id") Long id, @RequestBody Etudiant e){
        return etudiantService.updateEtudiant(id, e);
    }

    @DeleteMapping("/delete/{id}")
    void deleteEtudiant(@PathVariable("id") Long id){
        etudiantService.deleteById(id);
    }

    @GetMapping("/{id}")
    Etudiant findById(@PathVariable("id") Long id){
        return etudiantService.findById(id);
    }
}
