package com.example.projectdummy.controller;
import com.example.projectdummy.exception.ResourceNotFoundException;
import com.example.projectdummy.model.Dummy;
import com.example.projectdummy.model.ExtraDummy;
import com.example.projectdummy.repository.DummyRepository;
import com.example.projectdummy.repository.ExtraDummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api")
public class DummyController {

    @Autowired
    DummyRepository dummyRepository;

    @Autowired
    ExtraDummyRepository extraDummyRepository;
    @GetMapping("/dummy")
    public List<Dummy> getAllDummy() {
        return dummyRepository.findAll();
    }
    @PostMapping("/dummy")
    public Dummy createDummy(@Valid @RequestBody Dummy dummy) {
        return dummyRepository.save(dummy);
    }
    @GetMapping("/dummy/{id}")
    public Dummy getDummyById(@PathVariable(value = "id") Long dummyId) {
        return dummyRepository.findById(dummyId)
                .orElseThrow(() -> new ResourceNotFoundException("Dummy", "id", dummyId));
    }
    @PutMapping("/dummy/{id}")
    public Dummy updateDummy(@PathVariable(value = "id") Long dummyId,
                            @Valid @RequestBody Dummy dummy) {
        Dummy newDummy = dummyRepository.findById(dummyId)
                .orElseThrow(() -> new ResourceNotFoundException("Dummy", "id", dummyId));

        newDummy.setName(dummy.getName());

        Dummy updatedDummy = dummyRepository.save(newDummy);
        return updatedDummy;
    }
    @DeleteMapping("/dummy/{id}")
    public ResponseEntity<?> deleteDummy(@PathVariable(value = "id") Long dummyId) {
        Dummy dummy = dummyRepository.findById(dummyId)
                .orElseThrow(() -> new ResourceNotFoundException("Dummy", "id", dummyId));

        dummyRepository.delete(dummy);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/extradummy")
    public List<ExtraDummy> getAllExtraDummy() {
        return extraDummyRepository.findAll();
    }
    @PostMapping("/extradummy")
    public ExtraDummy createExtraDummy(@Valid @RequestBody ExtraDummy extraDummy) {
        return extraDummyRepository.save(extraDummy);
    }
    @GetMapping("/extradummy/{id}")
    public ExtraDummy getExtraDummyById(@PathVariable(value = "id") Long extraDummyId) {
        return extraDummyRepository.findById(extraDummyId)
                .orElseThrow(() -> new ResourceNotFoundException("ExtraDummy", "id", extraDummyId));
    }
    @PutMapping("/extradummy/{id}")
    public ExtraDummy updateExtraDummy(@PathVariable(value = "id") Long extraDummyId,
                             @Valid @RequestBody ExtraDummy extraDummy) {
        ExtraDummy newExtraDummy = extraDummyRepository.findById(extraDummyId)
                .orElseThrow(() -> new ResourceNotFoundException("ExtraDummy", "id", extraDummyId));

        newExtraDummy.setName(extraDummy.getName());

        ExtraDummy updatedExtraDummy = extraDummyRepository.save(newExtraDummy);
        return updatedExtraDummy;
    }
    @DeleteMapping("/extradummy/{id}")
    public ResponseEntity<?> deleteExtraDummy(@PathVariable(value = "id") Long extraDummyId) {
        ExtraDummy extraDummy = extraDummyRepository.findById(extraDummyId)
                .orElseThrow(() -> new ResourceNotFoundException("ExtraDummy", "id", extraDummyId));

        extraDummyRepository.delete(extraDummy);
        return ResponseEntity.ok().build();
    }
}
