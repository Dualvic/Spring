package org.formacio.controller;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by viC on 01/05/2017.
 */

@Controller
public class ControllerAlumnat {

    @Autowired
    ServeiAlumnat alumnatService;

    @RequestMapping(path="/alumnes")
    @ResponseBody
    public String mostrarAlumnes() {
        return String.valueOf(alumnatService.alumnesRegistrats());
    }

}