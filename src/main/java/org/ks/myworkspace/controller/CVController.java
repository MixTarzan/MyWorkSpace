package org.ks.myworkspace.controller;

import org.ks.myworkspace.model.cvcreator.CV;
import org.ks.myworkspace.repositry.CVRepository;
import org.ks.myworkspace.service.CVService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")
public class CVController {

    private CVService cvService;

    public CVController(CVService cvService) {
        this.cvService = cvService;
    }

    // Create a new CV
    @PostMapping
    public CV createCV(@RequestBody CV cv) {
        return cvService.createCV(cv);
    }

    @GetMapping
    public List<CV> getAllCVs() {
        return cvService.getAllCVs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CV> getCVById(@PathVariable Long id) {
        return cvService.getCVById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update CV
    @PutMapping("/{id}")
    public ResponseEntity<CV> updateCV(@PathVariable Long id, @RequestBody CV cvDetails) {
        return cvService.getCVById(id).map(cv -> {
            cv.setContactInformation(cvDetails.getContactInformation());
            //cv.setOtherFields(cvDetails.getOtherFields()); // Update other fields of CV
            CV updatedCV = cvService.updateCV(id, cv);
            return ResponseEntity.ok(updatedCV);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCV(@PathVariable Long id) {
        return cvService.getCVById(id).map(cv -> {
            cvService.deleteCV(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
