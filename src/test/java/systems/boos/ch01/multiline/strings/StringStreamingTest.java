package systems.boos.ch01.multiline.strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class StringStreamingTest {

  @Test
  void someTest() {
    var result = Stream
      .of(
        "UPDATE \"public\".\"office\"",
        "SET (\"address_first\", \"address_second\", \"phone\") =",
        "  (SELECT \"public\".\"employee\".\"first_name\",",
        "          \"public\".\"employee\".\"last_name\", ?",
        "   FROM \"public\".\"employee\"",
        "   WHERE \"public\".\"employee\".\"job_title\" = ?"
      )
      .collect(Collectors.joining(String.valueOf(System.lineSeparator())));

    assertEquals(StringConstants.SQL, result);
  }
}
