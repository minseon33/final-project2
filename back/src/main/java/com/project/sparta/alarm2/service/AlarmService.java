package com.project.sparta.alarm2.service;


import com.project.sparta.alarm2.dto.AlarmRequetDto;
import com.project.sparta.alarm2.dto.AlarmResponseDto;
import com.project.sparta.common.dto.PageResponseDto;
import com.project.sparta.user.entity.User;
import java.util.List;

public interface AlarmService {


    void createAlarm(AlarmRequetDto alarmRequetDto, String nickName);

    PageResponseDto<List<AlarmResponseDto>> getMyAlarmList(User user, int page, int size);

    void updateAlarmStatus(Long userId,Long alarmId);
}
