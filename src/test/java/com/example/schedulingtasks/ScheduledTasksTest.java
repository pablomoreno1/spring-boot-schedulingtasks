package com.example.schedulingtasks;

import org.awaitility.Duration;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
class ScheduledTasksTest {
    
    @SpyBean
    ScheduledTasks tasks;

    @Test
    void reportCurrentTime() {
        await().atMost(Duration.TEN_SECONDS).untilAsserted(() -> {verify(tasks, atLeast(2)).reportCurrentTime();});
    }
}
