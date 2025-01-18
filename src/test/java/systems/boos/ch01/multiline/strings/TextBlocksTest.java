package systems.boos.ch01.multiline.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TextBlocksTest {

  @Test
  void useTripleQuotes() {
    var result =
      """
      UPDATE "public"."office"
      SET ("address_first", "address_second", "phone") =
        (SELECT "public"."employee"."first_name",
                "public"."employee"."last_name", ?
         FROM "public"."employee"
         WHERE "public"."employee"."job_title" = ?\
      """;

    assertEquals(StringConstants.SQL, result);
  }
}
