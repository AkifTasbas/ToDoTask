#---------------------------------------------TEST4 Hinzugefügte Aufgabe löschen----------------------------------
#TEST4 Hinzugefügte Aufgabe löschen
#Schritt   Aktion                          Erwartetes Ergebnis
#1         Plus Button klicken            "Lets add mew Task!" Dialog öffnet sich
#2         "Test" in Textfeld schreiben
#3         done klicken                    Neuer Task "Test" wurde erstellt und ist in der Liste sichtbar
#4         Mülltonnen Icon klicken         "Deleted successfully" erscheint Aufgabe wurde aus der Liste entfernt
@wip
Feature: Aufgabe 4 Features

  Scenario Outline:delete an added task
    Given As a user I click plus button
    Then The Dialog have to be oppened
    And user writes "<Text>" in Text field
    Then user clicks done button
    Then new Task have to be created and "<Text>" task can be seen on the list
    And user clicks trash icon
    Then DELETED SUCCESFULLY text should be seen on the screen
    Then new Task have to be deleted and "<Text>" task can not be seen on the list

    Examples:
      | Text |
      | Test |