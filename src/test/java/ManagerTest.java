import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ManagerTest {
    private final String[] newFilms = {
            "Бладшот",
            "Вперед",
            "Отель \"Белград\"",
            "Джентельмены",
            "Человек-невидимка",
            "Тролли. Мировой тур",
            "Номер один"
    };
    private String[] noFilms;

    @Test
    public void findLastNoLimit() {
        Manager manager = new Manager();
        manager.addFilms(newFilms);

        String expected = "[Номер один, Тролли. Мировой тур, Человек-невидимка," +
                " Джентельмены, Отель \"Белград\", Вперед, Бладшот]";
        String actual = Arrays.toString(manager.findLast());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findLastWithLimit() {
        Manager manager = new Manager(5);
        manager.addFilms(newFilms);

        String expected = "[Номер один, Тролли. Мировой тур, " +
                "Человек-невидимка, Джентельмены, Отель \"Белград\"]";
        String actual = Arrays.toString(manager.findLast());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAll() {
        Manager manager = new Manager();
        manager.addFilms(newFilms);

        String expected = "[Бладшот, Вперед, Отель \"Белград\", Джентельмены," +
                " Человек-невидимка, Тролли. Мировой тур, Номер один]";
        String actual = Arrays.toString(manager.findAll());
        Assertions.assertEquals(expected, actual);
    }
    //utryterytetretrrtd

    @Test
    public void findAllWithoutFilms() {
        Manager manager = new Manager();
        manager.addFilms(noFilms);

        String expected = "Фильмов нет!";
        String actual = manager.findAll()[0];
        Assertions.assertEquals(expected, actual);
    }
}
