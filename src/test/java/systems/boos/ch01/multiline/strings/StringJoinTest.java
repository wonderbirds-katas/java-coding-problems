package systems.boos.ch01.multiline.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringJoinTest {

    @Test
    void useLineSeparator() {
        var result = String.join(System.lineSeparator()
            , "UPDATE \"public\".\"office\""
            , "SET (\"address_first\", \"address_second\", \"phone\") ="
            , "  (SELECT \"public\".\"employee\".\"first_name\","
            , "          \"public\".\"employee\".\"last_name\", ?"
            , "   FROM \"public\".\"employee\""
            , "   WHERE \"public\".\"employee\".\"job_title\" = ?"
        );

        assertEquals(StringConstants.SQL, result);
    }
}
