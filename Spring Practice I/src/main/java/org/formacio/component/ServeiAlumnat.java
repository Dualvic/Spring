package org.formacio.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * Created by viC on 01/05/2017.
 */

@Component
public class ServeiAlumnat {

    @Autowired
    RepositoriAlumnes repositori;

    @PostConstruct
    private void insetarAlumnes() {

        repositori.altaAlumne(1, "Antonia");
        repositori.altaAlumne(2, "Joan");

    }

    public boolean matricula (int id, String alumne) {

        if (alumne != null) {
            repositori.altaAlumne(id, alumne);
            return true;
        } else {
            return false;
        }

    }

    public int alumnesRegistrats() {

        return repositori.llistaAlumnes().size();

    }

}

