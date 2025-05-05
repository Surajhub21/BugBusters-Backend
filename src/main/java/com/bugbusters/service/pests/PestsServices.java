package com.bugbusters.service.pests;

import com.bugbusters.models.Pests;
import com.bugbusters.repository.SavePestsMongoRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PestsServices {

    private SavePestsMongoRepository savePestsMongoRepository;

    public PestsServices(SavePestsMongoRepository savePestsMongoRepository) {
        this.savePestsMongoRepository = savePestsMongoRepository;
    }

    public Pests savePests(Pests pest){
        return savePestsMongoRepository.save(pest);
    }

    public Pests getPestsById(ObjectId id){
        return savePestsMongoRepository.findById(id).orElse(null);
    }

    public List<Pests> getAll(){
        return savePestsMongoRepository.findAll();
    }
}
