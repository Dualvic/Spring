package org.formacio.component;

import java.util.Collection;

/**
 * Created by viC on 01/05/2017.
 */

public interface RepositoriAlumnes {

    String obteAlumne(int id);

    void altaAlumne(int id, String nom);

    Collection<String> llistaAlumnes();


}

