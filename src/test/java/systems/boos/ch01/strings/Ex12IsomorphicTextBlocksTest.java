package systems.boos.ch01.strings;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Ex12IsomorphicTextBlocksTest {

  @Test
  void emptyStringsAreIsomorphic() {
    String first = "";
    String second = "";
    assertThat(IsomorphicTexts.areIsomorphic(first, second), is(true));
  }

  @Test
  void singleCharacterStringsAreIsomorphic() {
    String first = "a";
    String second = "b";
    assertThat(IsomorphicTexts.areIsomorphic(first, second), is(true));
  }

  @Test
  void twoCharacterStringsAreIsomorphic() {
    String first = "ab";
    String second = "cd";
    assertThat(IsomorphicTexts.areIsomorphic(first, second), is(true));
  }

  @Test
  void twoCharacterStringsAreNotIsomorphic() {
    String first = "ab";
    String second = "aa";
    assertThat(IsomorphicTexts.areIsomorphic(first, second), is(false));
  }

  @Test
  void stringsWithDifferentLengthsAreNotIsomorphic() {
    String first = "ab";
    String second = "abc";
    assertThat(IsomorphicTexts.areIsomorphic(first, second), is(false));
  }

  @Test
  void repeatedCharacterMismatchNotIsomorphic() {
    String first = "esse";
    String second = "esst";
    assertThat(IsomorphicTexts.areIsomorphic(first, second), is(false));
  }

  @Test
  void malenAndBadenAreIsomorphic() {
    String first = "malen";
    String second = "baden";
    assertThat(IsomorphicTexts.areIsomorphic(first, second), is(true));
  }
}
