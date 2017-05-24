package org.formacio.repositori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepo;

    public long size() {
        return grupoRepo.count();
    }

    public void deleteAll() {
        grupoRepo.deleteAll();
    }

}
