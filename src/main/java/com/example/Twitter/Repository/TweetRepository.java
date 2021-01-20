package com.example.Twitter.Repository;

import com.example.Twitter.Entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TweetRepository extends JpaRepository<Tweet,UUID> {

Iterable<Tweet> findByUserId(UUID userid);


}
