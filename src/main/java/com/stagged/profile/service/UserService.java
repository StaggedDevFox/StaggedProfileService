package com.stagged.profile.service;

import com.stagged.profile.model.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"profiles"})
public class UserService {

    // TODO: 10/13/2020 : Add a logic to query dynamo here 
    @Cacheable(key = "#email")
    public User getUserDetails(String email) {
        return new User(email, "aryan", "10");
    }
}
