package poc.jdk11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.NotNull;
import java.util.stream.Stream;

//Is does not seems useful
//to keep things uniform
class JEP323LocalVariableSyntaxForLambdaParameters {

    @Test
    void varInLambdaParametersWhenUseNotNull() {
        var der = Stream.of(1, 2, 3, 4, 5).filter((@NotNull var x) -> x < 3).count();
        Assertions.assertEquals(2, der);
    }

    @Test
    void varInLambdaParameter() {
        MyFunctionalOperation myFunctionalOperation = (var a, var b) -> a + b;

        var result = myFunctionalOperation.doSomething(7, 5);

        Assertions.assertEquals(12, result);
    }

}
