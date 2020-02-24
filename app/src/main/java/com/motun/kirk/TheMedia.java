package com.motun.kirk;

import com.motun.kirk.GeneralUsers.MessagingActivity;

public interface TheMedia{
    void take(MessagingActivity.TakeMyMedia takeMyMedia);

    void requestPermission();
}
