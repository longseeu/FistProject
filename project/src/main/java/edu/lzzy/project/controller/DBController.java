package edu.lzzy.project.controller;

import edu.lzzy.project.config.DBconnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
    @Autowired
    private DBconnector dBconnector;
    @GetMapping("/showDB")
    public void showDB(){
        dBconnector.configgure();
    }
}
