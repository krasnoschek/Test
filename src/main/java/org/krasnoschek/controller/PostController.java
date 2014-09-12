package org.krasnoschek.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.krasnoschek.model.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {



    @RequestMapping(method = RequestMethod.GET)
    public List<Post> getMany(){

        List<Post> posts = new ArrayList<>();

        posts.add(new Post());
        posts.add(new Post());
        posts.add(new Post());
        posts.add(new Post());

        throw new NullPointerException();

//        return posts;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post getOne(@PathVariable("id") Integer id){




        return new Post();
    }



}
