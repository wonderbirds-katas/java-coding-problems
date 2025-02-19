package systems.boos.ch01.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicTexts {

  public static boolean areIsomorphic(String first, String second) {
    // Schritt 0: Längenkontrolle
    if (first.length() != second.length()) {
      return false;
    }

    // Schritt 1: Map für die Zeichenabbildung initialisieren
    Map<Character, Character> firstToSecond = new HashMap<>();

    // Schritt 2: Über die Zeichen iterieren
    for (int i = 0; i < first.length(); i++) {
      char charFirst = first.charAt(i);
      char charSecond = second.charAt(i);

      // Schritt 3: Neue Abbildung erstellen und prüfen
      if (!firstToSecond.containsKey(charFirst)) {
        if (firstToSecond.containsValue(charSecond)) {
          return false;
        }
        firstToSecond.put(charFirst, charSecond);
      }
      // Schritt 4: Prüfen, ob das aktuelle Zeichen korrekt abgebildet ist
      else if (firstToSecond.get(charFirst) != charSecond) {
        return false;
      }
    }

    return true;
  }
}
