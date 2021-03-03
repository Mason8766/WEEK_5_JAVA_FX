package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import models.Card;
import models.DeckofCards;

public class Controller {

    @FXML
    private Label faceNameLbL;

    @FXML
    private Label suitsLbL;

    @FXML
    private Label valuesLbL;

    @FXML
    private Button dealTopCardBTN;

    private DeckofCards deck = new DeckofCards();
    @FXML
    void dealTopCard(ActionEvent event) {
        Card card = deck.dealTopCard();

        //Java FX
        faceNameLbL.setText(card.getFaceName());
        suitsLbL.setText(card.getSuit());
        valuesLbL.setText(Integer.toString(Card.getFaceValue));
    }

}
