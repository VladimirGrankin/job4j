package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petr Arsentev (parsentev@ya.ru)
 * @version $Id%
 * @since 0.1
 */
public class DummyBotTest {
    @Test
    public void whenHelloBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Привет, бот"),
                is("Привет, умник!")
        );
    }

    @Test
    public void whenBuyBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Пока"),
                is("До скорой встречи!")
        );
    }

    @Test
    public void whenUnknowQuestionBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Сложи 2 + 2"),
                is("Это ставит меня в тупик! Спросите другой вопрос.")
        );
    }
}
