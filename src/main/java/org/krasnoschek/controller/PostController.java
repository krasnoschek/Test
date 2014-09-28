package org.krasnoschek.controller;

import org.krasnoschek.model.Post;
import org.krasnoschek.model.User;
import org.krasnoschek.repository.PostRepository;
import org.krasnoschek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Post> getMany(){
        return postRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post getOne(@PathVariable("id") String id){
        return postRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Post add(Post post){
        return postRepository.save(post);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Post update(@PathVariable("id") String id,Post post){
        post.setId(id);
        return postRepository.save(post);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void update(@PathVariable("id") String id){
        postRepository.delete(id);
    }



}
