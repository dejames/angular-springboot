package com.lets.veglife.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * gets all the properties of the application
     *
     * @return String : which contains all the properties of the application.
     */
    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo() {
        logger.info("echoing the system settings");
        StringBuilder sb = new StringBuilder();
        sb.append("<b>Server Info :</b>")
                .append("<br /> Available processors=")
                .append(Runtime.getRuntime().availableProcessors())
                .append("<br /> CPU=")
                .append(System.getProperty("os.arch"))
                .append("<br /> OS Version=")
                .append(System.getProperty("os.name"))
                .append(System.getProperty("os.version"))
                .append("<br /> Java Runtime version=")
                .append(System.getProperty("java.runtime.version"));
        return sb.toString();
    }

}
