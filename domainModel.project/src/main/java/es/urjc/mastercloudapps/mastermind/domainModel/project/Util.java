package es.urjc.mastercloudapps.mastermind.domainModel.project;

public class Util {

    public static String createRandomCombination() {
        String randomCombination = null;
        for (CodePegsColor color: CodePegsColor.values()) {
            randomCombination = randomCombination + color + Mastermind.NUM_SECRET_COMBINATION;
        }
        return randomCombination;
    }
}
