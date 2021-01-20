package com.example.Twitter.Service;

import com.example.Twitter.Entity.Tweet;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
@Service
public interface TweetService {

    Tweet save (Tweet tweet);

    Tweet update(Tweet tweet);

    void delete(Tweet tweet);

      Optional<Tweet> findByOne(UUID id);
   Iterable<Tweet> findAllFromUserId(UUID userid);
    Iterable<Tweet> findAll();









}
