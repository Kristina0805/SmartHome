package radioman;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // тест для кол-ва радиостанций
    @Test
    void radioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);
        int actual = radio.getRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void incorrectRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);
        int actual = radio.getRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void truthRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(7);
        int actual = radio.getRadioStationNumber();
        int expected = 7;

        assertEquals(expected, actual);
    }
    // тест для кнопки следующая
    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(7);
        radio.NextStation();
        int actual = radio.getRadioStationNumber();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void incorrectNextStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);
        radio.NextStation();
        int actual = radio.getRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }
// тест для предыдущей
    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);
        radio.prevStation();
        int actual = radio.getRadioStationNumber();
        int expected = 9;

        assertEquals(expected, actual);
    }
}

