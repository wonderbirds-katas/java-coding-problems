package systems.boos.ch01.strings;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;

import org.junit.jupiter.api.Test;

class Ex02TextBlockDelimitersTest {

  @Test
  void indentByShiftingClosingDelimiterLeft() {
    // prettier-ignore-start
    String actual =
            """
            SELECT *
            FROM someTable
        """;
    // prettier-ignore-end

    assertThat(actual, startsWith("    "));
  }

  @Test
  void noEffectOfShiftingClosingDelimiterRight() {
    String actual =
      """
      SELECT *
      FROM someTable
          """;

    assertThat(actual, endsWith("\n"));
  }
}
