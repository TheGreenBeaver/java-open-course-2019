package ru.mail.polis.open.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//todo
class PowerTest {

    @Test
    void test() {
        assertEquals(
                81,
                new Power(
                        new Const(3),
                        new Const(4)
                ).evaluate()
        );
    }

}