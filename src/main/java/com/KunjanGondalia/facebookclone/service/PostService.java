package com.KunjanGondalia.facebookclone.service;

import com.KunjanGondalia.facebookclone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
