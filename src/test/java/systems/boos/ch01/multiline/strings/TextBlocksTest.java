package systems.boos.ch01.multiline.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TextBlocksTest {

  @Test
  void simpleTextBlock() {
    var actual =
      """
      UPDATE "public"."office"
      SET ("address_first", "address_second", "phone") =
        (SELECT "public"."employee"."first_name",
                "public"."employee"."last_name", ?
         FROM "public"."employee"
         WHERE "public"."employee"."job_title" = ?\
      """;

    assertEquals(StringConstants.SQL, actual);
  }

  @Test
  void indentTextBlock() {
    String expected = StringConstants.SQL.indent(4).stripTrailing();

    String actual =
      """
          UPDATE "public"."office"
          SET ("address_first", "address_second", "phone") =
            (SELECT "public"."employee"."first_name",
                    "public"."employee"."last_name", ?
             FROM "public"."employee"
             WHERE "public"."employee"."job_title" = ?\
      """;

    assertEquals(expected, actual);
  }

  @Test
  void suppressLinebreaksInTextBlock() {
    String expected = "SELECT * FROM table WHERE first_name = ?";

    String actual =
      """
      SELECT * \
      FROM table \
      WHERE first_name = ?\
      """;

    assertEquals(expected, actual);
  }
}
