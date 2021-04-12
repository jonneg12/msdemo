package org.example.timer;

public class TimerBlock {
    TimerModel model ;
    TimerController controller ;
    TimerView view ;

    public TimerBlock() {
        this.model = new TimerModel();
        this.controller = new TimerController(model);
        this.view = new TimerView(controller);
        model.addObserver(view);
    }

    public TimerController getController() {
        return controller;
    }

    public TimerView getView() {
        return view;
    }
}
