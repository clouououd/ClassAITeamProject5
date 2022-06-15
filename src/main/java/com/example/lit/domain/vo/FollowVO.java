package com.example.lit.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class FollowVO {
    private Long followingNumber;
    private Long followerNumber;
}
