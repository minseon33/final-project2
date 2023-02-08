package com.project.sparta.communityComment.service;

import static com.project.sparta.admin.entity.StatusEnum.USER_REGISTERED;
import static org.assertj.core.api.Assertions.assertThat;

import com.project.sparta.communityBoard.dto.CommunityBoardRequestDto;
import com.project.sparta.communityBoard.repository.BoardRepository;
import com.project.sparta.communityBoard.service.CommunityBoardService;
import com.project.sparta.communityComment.dto.CommunityRequestDto;
import com.project.sparta.communityComment.entity.CommunityComment;
import com.project.sparta.communityComment.repository.CommentRepository;
import com.project.sparta.security.UserDetailImpl;
import com.project.sparta.user.entity.User;
import com.project.sparta.user.entity.UserRoleEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class CommentServiceTest {
  @Autowired
  CommunityCommentService commentService;
  @Autowired
  CommentRepository commentRepository; // 방금추가

  @Autowired
  CommunityBoardService communityBoardService;
  @Autowired
  BoardRepository boardRepository; // 방금추가
  @Test
  public void createCommunityComment() {

    Long userId = 1L;
    Long boardId = 1L;
    User user1 = new User("1234", "이재원", 10, "010-1234-1234", "user1@naver.com", UserRoleEnum.USER, "user1.jpg",USER_REGISTERED);
    User user2 = new User("1234", "한세인", 20, "010-1234-1235", "user2@naver.com", UserRoleEnum.USER, "user2.jpg",USER_REGISTERED);

    CommunityBoardRequestDto communityBoardRequestDto = new CommunityBoardRequestDto("보드 하이", "첫번쨰 보드");

    assertThat(communityComment.getNickName()).isEqualTo("이재원");
    System.out.println(communityComment);
  }


  @Test
  public void createCommunityComment() {

    Long userId = 1L;
    Long boardId = 1L;
    User user1 = new User("1234", "이재원", 10, "010-1234-1234", "user1@naver.com", UserRoleEnum.USER, "user1.jpg",USER_REGISTERED);
    User user2 = new User("1234", "한세인", 20, "010-1234-1235", "user2@naver.com", UserRoleEnum.USER, "user2.jpg",USER_REGISTERED);

    CommunityRequestDto communityRequestDto = new CommunityRequestDto("하이");
    UserDetailImpl userDetail = new UserDetailImpl(user1);
    CommunityComment communityComment = commentService.createCommunityComments(boardId, communityRequestDto,
        userDetail.getUsername());
    assertThat(communityComment.getNickName()).isEqualTo("이재원");
    System.out.println(communityComment);
  }

}
