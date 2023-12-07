package tn.esprit.sptingproject2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sptingproject2.Entities.Bloc;
import tn.esprit.sptingproject2.Entities.Foyer;
import tn.esprit.sptingproject2.Services.BlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("bloc")
public class BlocController {
    @Autowired
    BlocService blocService;

    @GetMapping("/findAll")
    List<Bloc> findAll() {
        return blocService.findAll();
    }

    @PostMapping("/add")
    Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @PutMapping("update/{id}")
    Bloc updateBloc(@PathVariable("id") Long id, @RequestBody Bloc b) {
        return blocService.updateBloc(id, b);
    }

    @DeleteMapping("/delete/{id}")
    void deleteBloc(@PathVariable("id") Long id) {
        blocService.deleteById(id);
    }


    @GetMapping("/{id}")
    Bloc findById(@PathVariable("id") Long id) {
        return blocService.findById(id);
    }

    @GetMapping("/findByCapacite/{capaciteBloc}")
    public List<Bloc> getBlocByCapacite(@PathVariable("capaciteBloc") Long capaciteBloc) {
        return blocService.getBlocByCapacite(capaciteBloc);
    }

}
