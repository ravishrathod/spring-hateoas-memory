package com.ravish.springhateoasmemory;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
@Component
public class UserController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") String id) {
        User user = new User();
        user.setId(id);

        Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(UserController.class).getUser(id)).withSelfRel();
        user.add(link);
        return user;
    }

}
