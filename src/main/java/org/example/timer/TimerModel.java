package org.example.timer;

import org.example.game.Observed;
import org.example.game.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TimerModel implements Observed {
    private Timer timer;
    private int timePassedSeconds;
    private List<Observer> observers;

    public TimerModel() {
        this.timer = new Timer();
        observers = new ArrayList<>();
    }

    public void startTimer() {
        timer = new Timer();
        long startTimeMs = System.currentTimeMillis();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                long currentTimeMs = System.currentTimeMillis();
                timePassedSeconds = (int) (currentTimeMs - startTimeMs) / 1000;
                updateTimePassedSeconds(timePassedSeconds);
                notifyTimePassedUpdated();
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    private void notifyTimePassedUpdated() {
        for (Observer observer : observers) {
            observer.updateTimePassed(timePassedSeconds);
        }
    }

    public void stopTimer() {
        timer.cancel();
    }


    public void updateTimePassedSeconds(int timePassedSeconds) {
        this.timePassedSeconds = timePassedSeconds;
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}
