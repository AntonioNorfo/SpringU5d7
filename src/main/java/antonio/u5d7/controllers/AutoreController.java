package antonio.u5d7.controllers;

import antonio.u5d7.Payloads.AutorePayload;
import antonio.u5d7.Service.AutoreService;
import antonio.u5d7.entities.Autore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @GetMapping
    public List<Autore> getAllAutori() {
        return autoreService.getAllAutori();
    }

    @GetMapping("/{id}")
    public Optional<Autore> getAutoreById(@PathVariable UUID id) {
        return autoreService.getAutoreById(id);
    }

    @PostMapping
    public Autore createAutore(@RequestBody AutorePayload autore) {
        return autoreService.addAutore(autore);
    }

    @PutMapping("/{id}")
    public Autore updateAutore(@PathVariable UUID id, @RequestBody Autore updatedAutore) {
        return autoreService.updateAutore(id, updatedAutore);
    }

    @DeleteMapping("/{id}")
    public void deleteAutore(@PathVariable UUID id) {
        autoreService.deleteAutore(id);
    }
}
