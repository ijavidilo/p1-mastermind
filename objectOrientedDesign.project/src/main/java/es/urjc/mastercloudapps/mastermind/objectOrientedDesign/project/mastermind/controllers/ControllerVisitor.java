package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

public interface ControllerVisitor {

    void visit(StartController startController);

    void visit(ProposalController proposalController);

    void visit(ResumeController resumeController);

}