package com.github.jtam2000.support.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyHttpRequest {
    private final static String NAME_OF_RESPONSE_VIEW = "myhttprequest";

    @GetMapping("myHttpRequest")
    public String getResponseToMyHttpRequest(
            @RequestParam(name="name", required=false, defaultValue="my default value") String functParamName,
                                             Model model) {

        model.addAttribute("name", functParamName);
        return NAME_OF_RESPONSE_VIEW; // LEARNING: return name of the [view] that will render the response
                                        //   This view should be a html file with the same name
    }


}
