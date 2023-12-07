package tn.esprit.sptingproject2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sptingproject2.Entities.Foyer;
import tn.esprit.sptingproject2.Services.FoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("foyer")
public class FoyerController {
    @Autowired
    FoyerService foyerService;

    @GetMapping("/findAll")
    List<Foyer> findAll(){
        return  foyerService.findAll();
    }

    @PostMapping("/add")
    Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @PutMapping("update/{id}")
    Foyer updateFoyer(@PathVariable("id") Long id, @RequestBody Foyer f){
        return foyerService.updateFoyer(id, f);
    }

    @DeleteMapping("/delete/{id}")
    void deleteFoyer(@PathVariable("id") Long id){
        foyerService.deleteById(id);
    }

    @GetMapping("/{id}")
    Foyer findById(@PathVariable("id") Long id){
        return foyerService.findById(id);
    }
}
