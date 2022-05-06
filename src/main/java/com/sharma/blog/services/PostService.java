package com.sharma.blog.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sharma.blog.entity.Post;

@Service
public class PostService {
static List<Post> posts = new ArrayList<>(
		Arrays.asList(
			new Post(1,"DataType","Sample text"),
			new Post(2,"Classes","Sample text"),
			new Post(3,"Object","Sample text"),
			new Post(4,"Access Specifiers","Sample text"),
			new Post(5,"OOPS overview","Sample text")
			));
	
	
	
	public List<Post> getPosts(){
		return posts;
	}

	public Post getPost(int id) {
		for(Post post : posts) {
			if(post.getPostId() == id) {
				return post;
			}
		}
		return null;
	}

	public void addPost(Post post) {
		posts.add(post);
	}
	
	public void updatePost(Post post, int id) {
		for(int i=0; i<posts.size();i++) {
			Post tempPost = posts.get(i);
			if(tempPost.getPostId() == id) {
				posts.set(i, post);
				return;
			}
		}
	}

	public void deletePost(int id) {
		for(int i=0; i<posts.size();i++) {
			Post tempPost = posts.get(i);
			if(tempPost.getPostId() == id) {
				posts.remove(i);
				return;
			}
		}
	}
}
