package seedu.stocker;

import seedu.stocker.commands.Ui;



public class Stocker {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        Ui interactor = new Ui();
        interactor.uiBegin();
    }
}