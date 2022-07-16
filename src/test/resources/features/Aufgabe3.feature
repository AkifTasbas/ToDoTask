#------------------------------------------------Test3 Hinzufügen einer Aufgabe ohne Titel----------------------------
#3. Hinzufügen einer Aufgabe ohne Titel
#Schritt   Aktion                          Erwartetes Ergebnis
#1         Plus Button klicken            "Lets add mew Task!" Dialog öffnet sich
#2         done klicken                   Fehlermeldung "Oops, Cannot set an empty text" erscheint

Feature: Aufgabe 3 Features

  Scenario:Adding new Task without titel
    Given As a user I click plus button
    Then The Dialog have to be oppened
    Then user clicks done button
    Then error message should be seen on the screen