package tn.esprit.sptingproject2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sptingproject2.Entities.Foyer;
import tn.esprit.sptingproject2.Entities.Reservation;
import tn.esprit.sptingproject2.Services.FoyerService;
import tn.esprit.sptingproject2.Services.ReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping("/findAll")
    List<Reservation> findAll(){
        return  reservationService.findAll();
    }

    @PostMapping("/add")
    Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    @PutMapping("update/{id}")
    Reservation updateReservation(@PathVariable("id") String id, @RequestBody Reservation r){
        return reservationService.updateReservation(id, r);
    }

    @DeleteMapping("/delete/{id}")
    void deleteReservation(@PathVariable("id") String id){
        reservationService.deleteById(id);
    }

    @GetMapping("/{id}")
    Reservation findById(@PathVariable("id") String id){
        return reservationService.findById(id);
    }
}
