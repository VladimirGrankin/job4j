package ru.job4j.condition;

/**
 * @author Petr Arsentev (parsentev@ya.ru)
 * @version $Id%
 * @since 0.1
 */
public class DummyBot {
    /**
     * DummyBot - глупый бот, отвечающий на вопросы
     * @param question вопрос от клиента
     * @return один из трех готовых ответов
     */
    public String answer(String question) {
        String result = "Это ставит меня в тупик! Спросите другой вопрос.";
        if ("Привет, бот".equals(question)) {
            result = "Привет, умник!";
        } else if ("Пока".equals(question)) {
            result = "До скорой встречи!";
        }
        return result;
    }

}
