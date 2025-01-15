package systems.boos.ch01.multiline.strings;

public class StringConstants {
    public static final String SQL = """
        UPDATE "public"."office"
        SET ("address_first", "address_second", "phone") =
          (SELECT "public"."employee"."first_name",
                  "public"."employee"."last_name", ?
           FROM "public"."employee"
           WHERE "public"."employee"."job_title" = ?""";
}
