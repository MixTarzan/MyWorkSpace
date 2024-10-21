package org.ks.myworkspace.service;

import org.ks.myworkspace.model.cvcreator.CV;
import org.ks.myworkspace.model.cvcreator.ContactInformation;
import org.ks.myworkspace.repositry.CVRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CVService {

    private CVRepository cvRepository;

    public CVService(CVRepository cvRepository) {
        this.cvRepository = cvRepository;
    }

    public CV createCV(CV cv) {
        return cvRepository.save(cv);
    }

    public List<CV> getAllCVs() {
        return cvRepository.findAll();
    }

    public Optional<CV> getCVById(Long id) {
        return cvRepository.findById(id);
    }

    public CV updateCV(Long id, CV cvDetails) {
        return cvRepository.findById(id).map(cv -> {
            cv.setContactInformation(cvDetails.getContactInformation());
            //cv.setOtherFields(cvDetails.getOtherFields()); // Update other fields
            return cvRepository.save(cv);
        }).orElseThrow(() -> new RuntimeException("CV not found with id " + id));
    }

    public void deleteCV(Long id) {
        cvRepository.deleteById(id);
    }
}
