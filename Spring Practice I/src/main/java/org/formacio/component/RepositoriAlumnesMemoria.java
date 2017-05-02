package org.formacio.component;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viC on 01/05/2017.
 */
@Component
public class RepositoriAlumnesMemoria implements RepositoriAlumnes{


    private Map<Integer, String> repositori = new HashMap<>();

    @Override
    public String obteAlumne(int id) {
        return repositori.get(id);
    }

    @Override
    public void altaAlumne(int id, String nom) {
        repositori.put(id,  nom);
    }

    @Override
    public Collection<String> llistaAlumnes() {
        return repositori.values();
    }

}
