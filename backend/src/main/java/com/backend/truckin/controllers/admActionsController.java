package com.backend.truckin.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class TelaAdmController {
    @RequestMapping("admActions")
    public String admActions()
    {
        return "admActions";
    }
}
