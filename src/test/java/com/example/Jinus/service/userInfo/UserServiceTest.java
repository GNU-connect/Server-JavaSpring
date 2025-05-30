package com.example.Jinus.service.userInfo;

import com.example.Jinus.repository.userInfo.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userServiceV2;
    @Mock
    private UserRepository userRepositoryV2;

    @Test
    @DisplayName("등록된 사용자 campusId 확인")
    public void checkExistsUserCampusId() {
        // given
        String kakaoId = "test_user_1234";
        int campusId = 1;

        // when
        Mockito.when(userRepositoryV2.findCampusIdById(kakaoId)).thenReturn(Optional.of(campusId)); // Mocking
        int result = userServiceV2.getUserCampusId(kakaoId);

        // then - 존재하면 campusId 반환
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("등록되지 않은 사용자 확인")
    public void checkUserNotExists() {
        // given
        String kakaoId = "not_exist_user_1234";

        // when
        Mockito.when(userRepositoryV2.findCampusIdById(kakaoId)).thenReturn(Optional.empty()); // Mocking
        int result = userServiceV2.getUserCampusId(kakaoId);

        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("존재하는 사용자 학과id 찾기")
    public void checkExistsUserDepartmentId() {
        // given
        String kakaoId = "test_user_1234";
        int departmentId = 1;

        // when
        Mockito.when(userRepositoryV2.findDepartmentIdById(kakaoId)).thenReturn(Optional.of(departmentId));
        int result = userServiceV2.getUserDepartmentId(kakaoId);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("존재하지 않는 사용자 학과id 찾기")
    public void checkDoesNotExistUserDepartmentId() {
        // given
        String kakaoId = "not_exist_user_1234";

        // when
        Mockito.when(userRepositoryV2.findDepartmentIdById(kakaoId)).thenReturn(Optional.empty());
        int result = userServiceV2.getUserDepartmentId(kakaoId);

        // then
        assertThat(result).isEqualTo(-1);
    }
}
