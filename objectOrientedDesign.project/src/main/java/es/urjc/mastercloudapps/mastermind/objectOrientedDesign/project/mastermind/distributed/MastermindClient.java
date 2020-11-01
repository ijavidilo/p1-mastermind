package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.Mastermind;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;

public class MastermindClient extends Mastermind {

    private LogicProxy logicProxy;

    @Override
    protected Logic createLogic() {
        this.logicProxy = new LogicProxy();
        return this.logicProxy;
    }

    @Override
    protected void play() {
        super.play();
        this.logicProxy.close();
    }

    public static void main(String[] args) {
        new MastermindClient().play();
    }

}
