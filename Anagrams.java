
/**
 * can be used to test if the words are anagrams.
 * @author Omar Habib ID:3742418
 */
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Anagrams extends Application {

    private TextField firstword;
    private TextField secondword;
    private Button anagrams;
    private Text greetings;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Anagram Tester");

        Label firsttext = new Label("1st Word: ");
        firstword = new TextField();
        firstword.setPrefWidth(100);
        Label secondtext = new Label("2nd Word: ");
        secondword = new TextField();
        secondword.setPrefWidth(100);

        anagrams = new Button("Are These anagrams?");
        greetings = new Text("Let's test some possible anagrams!");

        anagrams.setOnAction(this::processButton);

        HBox box1 = new HBox(firsttext, firstword);
        HBox box2 = new HBox(secondtext, secondword);
        VBox box3 = new VBox(box1, box2, anagrams, greetings);

        FlowPane pane = new FlowPane(box3);
        box1.setSpacing(15);
        box2.setSpacing(15);
        box3.setSpacing(15);
        pane.setHgap(30);
        pane.setVgap(50);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processButton(ActionEvent event) {
        String fwOrg = firstword.getText();
        String swOrg = secondword.getText();
        String fw = firstword.getText().toLowerCase();
        String sw = secondword.getText().toLowerCase();
        char[] letters1 = new char[fw.length()];
        char[] letters2 = new char[sw.length()];

        int[] counts1 = new int[fw.length()];
        int[] counts2 = new int[sw.length()];

        boolean anagram = true;
        int sameCounter = 0;

        int firstOccurance = 0;
        int secondOccurance = 0;
        int finalOccurance = 0;

        if (fw.length() == sw.length()) {

            for (int i = 0; i < fw.length(); i++) {
                letters1[i] = fw.charAt(i);
            }

            for (int j = 0; j < sw.length(); j++) {
                letters2[j] = sw.charAt(j);
            }

            // count the occurence of each charachter in the first word
            for (int i = 0; i < letters1.length; i++) {
                char ch = letters1[i];
                for (int j = 0; j < letters1.length; j++) {
                    if (letters1[j] == ch) {
                        counts1[i]++;
                    }
                }
            }

            System.out.println();
            for (int i = 0; i < letters2.length; i++) {
                char ch = letters2[i];
                for (int j = 0; j < letters2.length; j++) {
                    if (letters2[j] == ch) {
                        counts2[i]++;
                    }
                }
            }

            for (int i = 0; i < letters1.length; i++) {
                for (int j = 0; j < letters2.length; j++) {
                    if (letters1[i] == letters2[j]) {
                        if (counts1[i] != counts2[j]) {
                            anagram = false;
                        }
                        sameCounter++;
                    }
                }
            }

            // Add total occurances in the counts1[]
            for (int i = 0; i < counts1.length; i++) {
                firstOccurance += counts1[i];
            }

            // Add total occurances in the counts2[]
            for (int i = 0; i < counts2.length; i++) {
                secondOccurance += counts2[i];
            }

            // Check if the occurances are the same in both
            if (firstOccurance == secondOccurance) {
                finalOccurance = firstOccurance;
            }

            // And 2 occurances need to be the same as it was calculated in the nested for
            // loops
            if (sameCounter != finalOccurance) {
                anagram = false;
            }

            if (anagram) {
                greetings.setText(swOrg + " is an anagram of " + fwOrg);
            } else {
                greetings.setText(swOrg + " is not an anagram of " + fwOrg);
            }

        }

        else {
            greetings.setText(swOrg + " is not an anagram of " + fwOrg);
        }

    }
}