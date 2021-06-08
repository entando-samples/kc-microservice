package com.entando.samples.springbootkc.rest;

import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class ApiController {

    //@RolesAllowed("codemotion-bff-admin")
    @PreAuthorize("hasAuthority('ROLE_codemotion-bff-admin')")
    @CrossOrigin
    @GetMapping("/mymetric")
    public Response api() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return new Response(350);
    }

    @Data
    public static class Response {
        @NonNull
        private final long metric;
    }

}
