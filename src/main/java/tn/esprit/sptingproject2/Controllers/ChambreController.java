package tn.esprit.sptingproject2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sptingproject2.Entities.Chambre;
import tn.esprit.sptingproject2.Repositories.ChambreRepository;
import tn.esprit.sptingproject2.Services.ChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambre")
public class ChambreController {
    @Autowired
    ChambreService chambreService;

    @Autowired
    ChambreRepository chambreRepository;

    @GetMapping("/findAll")
    List<Chambre> findAll(){
        return  chambreService.findAll();
    }

    @PostMapping("/add")
    Chambre addChambre(@RequestBody Chambre b) {
        return chambreService.addChambre(b);
    }

    @PutMapping("update/{id}")
    Chambre updateChambre(@PathVariable("id") Long id, @RequestBody Chambre b){
        return chambreService.updateChambre(id, b);
    }

    @DeleteMapping("/delete/{id}")
    void deleteChambre(@PathVariable("id") Long id){
        chambreService.deleteById(id);
    }

    @GetMapping("/{id}")
    Chambre findById(@PathVariable("id") Long id){
        return chambreService.findById(id);
    }

}
