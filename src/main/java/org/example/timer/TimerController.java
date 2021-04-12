package org.example.timer;


public class TimerController {
    private final TimerModel model;

    public TimerController(TimerModel model) {
        this.model = model;
    }

    public void startTimer() {
        model.startTimer();
    }

    public void stopTimer() {
        model.stopTimer();
    }


}
