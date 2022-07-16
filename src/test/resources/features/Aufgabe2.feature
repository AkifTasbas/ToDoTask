#-------------------------------------------------TEST 2 Hinzufügen einer Aufgabe abbrechen----------------------
#2. Hinzufügen einer Aufgabe abbrechen
#Schritt   Aktion                          Erwartetes Ergebnis
#1         Plus Button klicken            "Lets add mew Task!" Dialog öffnet sich
#2         "Test" in Textfeld schreiben
#3         cancel klicken                 Es wurde kein neuer Task hinzugefügt, oben steht noch immer "What do you want to do today?"

Feature: Aufgabe 2 Features

  Scenario Outline:Adding new Task and cancel
    Given As a user I click plus button
    Then The Dialog have to be oppened
    And user writes "<Text>" in Text field
    Then user clicks cancel button
    Then No new task was added, users see What do you want to do today text at the top.

    Examples:
      | Text |
      | Test |