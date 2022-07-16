
Feature: Aufgabe 1 Features

#  ---------------------------------------TEST1 Hinzufügen einer Aufgabe ------------------------------------------------
#  Plus Button klicken      Add here control of "Lets add mew Task!" Dialog is oppened or not!!!!!!!!
#
#  TEST1 Hinzufügen einer Aufgabe
#  Schritt   Aktion                          Erwartetes Ergebnis
#  1         Plus Button klicken            "Lets add mew Task!" Dialog öffnet sich
#  2         "Test" in Textfeld schreiben
#  3         done klicken                    Neuer Task "Test" wurde erstellt und ist in der Liste sichtbar

  Scenario Outline:Adding new Task
    Given As a user I click plus button
    Then The Dialog have to be oppened
    And user writes "<Text>" in Text field
    Then user clicks done button
    Then new Task have to be created and "<Text>" task can be seen on the list

    Examples:
      | Text |
      | Test |