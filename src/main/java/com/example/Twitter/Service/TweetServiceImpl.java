package com.example.Twitter.Service;

import com.example.Twitter.Entity.Tweet;
import com.example.Twitter.Repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
@Service
public class TweetServiceImpl implements TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    public void setTweetRepository(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }


    @Override
    public Tweet save(Tweet tweet) {
        return tweetRepository.save(tweet);
    }

    @Override
    public Tweet update(Tweet tweet) {
        return tweetRepository.save(tweet);

    }

    @Override
    public void delete(Tweet tweet) {
        tweetRepository.delete(tweet);
    }

    @Override
    public Optional<Tweet> findByOne(UUID id) {
        return tweetRepository.findById(id);
    }

    public Iterable<Tweet> findAll() {
        return tweetRepository.findAll();
    }


    public Iterable<Tweet> findAllFromUserId(UUID userid) {
        return tweetRepository.findByUserId(userid);
    }
}
