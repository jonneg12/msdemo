package org.example.game;

public interface Observer {
    void startTimer();

    void stopTimer();

    void updateTimePassed(int secondsPassed);
}
