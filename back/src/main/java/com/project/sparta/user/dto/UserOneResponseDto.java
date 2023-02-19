package com.project.sparta.user.dto;

import com.project.sparta.user.entity.UserRoleEnum;
import com.querydsl.core.annotations.QueryProjection;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserOneResponseDto {
    private Long id;

    private String nickName;

    private int age;

    private String email;

    private String phoneNumber;

    private UserRoleEnum userRoleEnum;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @QueryProjection
    @Builder
    public UserOneResponseDto(Long id, String nickName, int age, String email, String phoneNumber, UserRoleEnum userRoleEnum, LocalDateTime createdAt, LocalDateTime modifiedAt){
        this.id = id;
        this.nickName = nickName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userRoleEnum = userRoleEnum;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    @Builder
    public UserOneResponseDto(Long id, String nickName, int age, String email, String phoneNumber){
        this.id = id;
        this.nickName = nickName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}