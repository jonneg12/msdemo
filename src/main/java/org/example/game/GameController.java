package org.example.game;

import org.example.timer.TimerController;

public class GameController {
    private GameModel model;
    private TimerController timer;

    public GameController(GameModel model, TimerController timer) {
        this.model = model;
        this.timer = timer;

    }

    public void startTimer() {
        timer.startTimer();
    }

    public void stopTimer() {
        timer.stopTimer();
    }

}
