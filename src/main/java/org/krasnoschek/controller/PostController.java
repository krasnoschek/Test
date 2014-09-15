package org.krasnoschek.controller;

import org.krasnoschek.model.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {



    @RequestMapping(method = RequestMethod.GET)
    public List<Post> getMany(){

        List<Post> posts = new ArrayList<>();

        posts.add(new Post("san", "text"));
        posts.add(new Post("san", "text"));
        posts.add(new Post("san", "text"));
        posts.add(new Post("san", "text"));

//        throw new NullPointerException();

        return posts;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post getOne(@PathVariable("id") Integer id){




        return new Post();
    }



}
