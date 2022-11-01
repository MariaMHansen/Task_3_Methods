import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MethodsPracticeTest {
    MethodsPracticeTest() {
    }

    @DisplayName("checks if sayHello method returns String hello world")
    @Test
    void Should_ReturnHelloWorld() {
        Assertions.assertEquals("hello world!", MethodsPractice.sayHello());
    }

    @DisplayName("countDogs no dogs in string")
    @Test
    void Should_ReturnZero_When_NoDogInString() {
        int count = MethodsPractice.countDogs("cat cat catcat");
        Assertions.assertEquals(0, count);
    }
}