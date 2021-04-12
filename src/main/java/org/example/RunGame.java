package org.example;

import org.example.game.GameController;
import org.example.game.GameModel;
import org.example.game.GameView;
import org.example.timer.TimerBlock;

public class RunGame {
    public static void main(String[] args) {

        TimerBlock timer = new TimerBlock();

        GameModel model = new GameModel();
        GameController controller = new GameController(model,timer.getController());
        GameView view = new GameView(controller, timer.getView());
        model.addObserver(view);
    }
}
