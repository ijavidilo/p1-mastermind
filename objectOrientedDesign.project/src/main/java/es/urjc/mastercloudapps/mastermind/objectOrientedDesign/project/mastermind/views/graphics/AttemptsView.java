package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics;

import javax.swing.JLabel;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.MessageView;

@SuppressWarnings("serial")
class AttemptsView extends JLabel {

	AttemptsView(int attempts) {
		this.setText(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" + (attempts)));
	}

}
