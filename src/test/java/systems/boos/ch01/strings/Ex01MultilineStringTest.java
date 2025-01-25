package systems.boos.ch01.strings;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import org.junit.jupiter.api.Test;

class Ex01MultilineStringTest {

  @Test
  void sql() {
    String actual =
      """
      SELECT *
      FROM someTable
      """;
    assertThat(actual, startsWith("SELECT"));
  }

  @Test
  void json() {
    String actual =
      """
      {
        "someTable": [{
          "name": "Mustermann",
          "age": 42
        }]
      }""";
    assertThat(actual, startsWith("{"));
  }

  @Test
  void html() {
    String actual =
      """
      <html>
        <body>
          <h1>Mustermann</h1>
          <p>Die Person namens Mustermann ist 42 Jahre alt.</p>
        </body>
      </html>""";
    assertThat(actual, startsWith("<html"));
  }
}
