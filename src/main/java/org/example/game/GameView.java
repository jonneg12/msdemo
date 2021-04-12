package org.example.game;

import org.example.timer.TimerView;

import javax.swing.*;
import java.awt.*;

public class GameView implements Observer {

    private JFrame frame;
    private GameController controller;
    private TimerView timer;
    private JLabel timerLabel;

    //test
    private JButton startButton;
    private JButton stopButton;

    public GameView(GameController gameController, TimerView timer) {
        frame = new JFrame();
        this.controller = gameController;
        this.timer = timer;
        initFrame();


    }

    private void initFrame() {
        frame.setTitle("Minesweeper");
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        initPanel();
    }

    private void initPanel() {
        timerLabel = timer.getTimerLabel();

        startButton = new JButton(Smile.SMILE.getIcon());
        startButton.addActionListener(e -> controller.startTimer());

        stopButton = new JButton("stop ");
        stopButton.addActionListener(e -> controller.stopTimer());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 5));
        panel.add(stopButton);
        panel.add(startButton);
        panel.add(timerLabel);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.pack();
    }

    @Override
    public void startTimer() {

    }

    @Override
    public void stopTimer() {

    }

    @Override
    public void updateTimePassed(int secondsPassed) {

    }
}
