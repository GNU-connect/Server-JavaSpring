package com.example.Jinus.service.userInfo;

import com.example.Jinus.entity.userInfo.UserEntity;
import com.example.Jinus.repository.userInfo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
//        logger.info("UserService 실행");
    }

    public int getDepartmentId(String userId) {
//        logger.info("getDepartmentId 실행");

        // userId를 사용해 UserRepository에서 UserEntity 조회
        UserEntity userEntity = userRepository.findById(userId).orElse(null);
//        logger.info("userEntity {}", userEntity);

        // 사용자가 존재하는 경우
        if (userEntity != null) {
            return userEntity.getDepartmentId(); // 학과 id
        } else { // 사용자 존재하지 않는 경우
            logger.warn("UserService: user를 찾을 수 없습니다.");
            return -1;
        }
    }

    public int getUserCampusId(String userId) {
        UserEntity userEntity = userRepository.findById(userId).orElse(null);
        if (userEntity != null) {
            return userEntity.getCampusId();
        } else {
            logger.warn("UserService: user를 찾을 수 없습니다.");
            return -1;
        }
    }
}
