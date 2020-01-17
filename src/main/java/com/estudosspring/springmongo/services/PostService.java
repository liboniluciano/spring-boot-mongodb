package com.estudosspring.springmongo.services;

import com.estudosspring.springmongo.domain.Post;
import com.estudosspring.springmongo.domain.User;
import com.estudosspring.springmongo.dto.UserDTO;
import com.estudosspring.springmongo.repository.PostRepository;
import com.estudosspring.springmongo.repository.UserRepository;
import com.estudosspring.springmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll(){
        return postRepository.findAll();
    }

    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}
