package com.example.Twitter.Controller;

import com.example.Twitter.Entity.Tweet;
import com.example.Twitter.Service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
private TweetService tweetService;


@PostMapping
public Tweet create( @RequestBody Tweet tweet){
    return  tweetService.save(tweet);
}
@GetMapping("/{id}")
    public Optional<Tweet> findTweet(@PathVariable("id")UUID id){
       return tweetService.findByOne(id);
}






}
