package com.example.dedbot.repository;

import com.example.dedbot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Long> {

    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);


}
