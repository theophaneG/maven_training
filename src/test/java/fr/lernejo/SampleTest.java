package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {

    private final Sample sample = new Sample();

    @Test
    void multi_2_and_2() {
        int result = sample.op(Sample.Operation.MULT, 2 ,2);
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void add_1_and_1() {
        int result = sample.op(Sample.Operation.ADD, 1,1);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void facto_7() {
        int result = sample.fact(7);
        Assertions.assertThat(result).isEqualTo(5040);
    }
}
