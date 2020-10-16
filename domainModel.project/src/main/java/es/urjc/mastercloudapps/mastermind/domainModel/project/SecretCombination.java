package es.urjc.mastercloudapps.mastermind.domainModel.project;

class SecretCombination {

	private String secretCombination;

	SecretCombination() {
		createRandomSecretCombination();
	}

	private String createRandomSecretCombination() {
		this.secretCombination = Util.createRandomCombination();
		return this.secretCombination;
	}

	public String getCombination() {
		return this.secretCombination;
	}

}
