package org.example.timer;

import org.example.game.Observer;

import javax.swing.*;

public class TimerView implements Observer {
    private final JLabel timerLabel;
    private final TimerController controller;

    public TimerView(TimerController controller) {
        this.controller = controller;
        this.timerLabel = new JLabel("Time: " + 0);

    }


    public JLabel getTimerLabel() {
        return timerLabel;
    }

    @Override
    public void startTimer() {
        controller.startTimer();
    }

    @Override
    public void stopTimer() {
        controller.stopTimer();
    }

    @Override
    public void updateTimePassed(int timePassedSeconds) {
        timerLabel.setText("Time: " + timePassedSeconds);
    }
}
