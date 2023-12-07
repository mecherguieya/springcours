package tn.esprit.sptingproject2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sptingproject2.Entities.Universite;
import tn.esprit.sptingproject2.Services.UniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("universite")
public class UniversiteController {
    @Autowired
    UniversiteService universiteService;

    @GetMapping("/findAll")
    List<Universite> findAll(){
        return  universiteService.findAll();
    }

    @PostMapping("/add")
    Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @PutMapping("update/{id}")
    Universite updateUniversite(@PathVariable("id") Long id, @RequestBody Universite u){
        return universiteService.updateUniversite(id, u);
    }

    @DeleteMapping("/delete/{id}")
    void deleteUniversite(@PathVariable("id") Long id){
        universiteService.deleteById(id);
    }

    @GetMapping("/{id}")
    Universite findById(@PathVariable("id") Long id){
        return universiteService.findById(id);
    }


}
