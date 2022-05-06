package com.sharma.blog.controller;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sharma.blog.entity.Post;
import com.sharma.blog.services.PostService;

@RestController
public class PostController {
	
	@RequestMapping("/posts")
	public List<Post> getPosts(){
		return new PostService().getPosts();
	}
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable("id") int id) {
		
		return new PostService().getPost(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	public void addPost(@RequestBody Post post) {
		new PostService().addPost(post);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
	public void updatePost(@RequestBody Post post, @PathVariable int id) {
		new PostService().updatePost(post, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
	public void deletePost(@PathVariable int id) {
		new PostService().deletePost(id);
	}
}
