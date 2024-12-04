package com.anurag.cleanindiabackend.services;

import com.anurag.cleanindiabackend.exceptions.NotFoundException;
import com.anurag.cleanindiabackend.models.User;

public interface UserProfileService {
    
    User updateUserProfile(User user) throws NotFoundException, IllegalArgumentException;
}
