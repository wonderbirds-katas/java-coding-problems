package systems.boos.ch01.strings;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;

import org.junit.jupiter.api.Test;

class Ex03IndentationTest {

  @Test
  void indentTextBlockInsideDelimiters() {
    String actual =
      """
          SELECT *
          FROM someTable
      """;
    assertThat(actual, startsWith("    "));
  }

  @Test
  void indentUsingIndentFunction() {
    String actual =
      """
      SELECT *
      FROM someTable
      """.indent(4);
    assertThat(actual, startsWith("    "));
  }

  @Test
  void indentWithoutTrailingNewLine() {
    String actual =
      """
      SELECT *
      FROM someTable
      """.indent(4).stripTrailing();
    assertThat(actual, endsWith("Table"));
  }
}
