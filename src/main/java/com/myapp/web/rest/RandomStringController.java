package com.myapp.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.myapp.web.rest.vm.ManagedUserVM;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by inntec on 12/20/2016.
 */
@RestController
@RequestMapping("/api")
public class RandomStringController {

    @PostMapping(path = "/string",
        produces={MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    @Timed
    public String printRadomText() {
        return "123";
    }

}
