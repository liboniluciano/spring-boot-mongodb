package com.estudosspring.springmongo.repository;

import com.estudosspring.springmongo.domain.Post;
import com.estudosspring.springmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
