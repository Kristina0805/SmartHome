package radioman;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // тест для кол-ва радиостанций
    @Test
    void radioStation() {
        Radio radio = new Radio(9);
        radio.setRadioStationNumber(-1);

        assertEquals(0,radio.getRadioStationNumber() );
    }


    @Test
    void truthRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(7);

        assertEquals(7, radio.getRadioStationNumber());
    }

    // тест для кнопки следующая
    @Test
    void moreNextStation() {
        Radio radio = new Radio(9);
        radio.setRadioStationNumber(11);
        radio.nextStation();

        assertEquals(0, radio.getRadioStationNumber());
    }

    @Test
    void equalsNextStation() {
        Radio radio = new Radio(9);
        radio.setRadioStationNumber(9);
        radio.nextStation();

        assertEquals(0, radio.getRadioStationNumber());
    }

    @Test
    void eNextStation() {
        Radio radio = new Radio(9);
        radio.setRadioStationNumber(7);
        radio.nextStation();

        assertEquals(8, radio.getRadioStationNumber());
    }

    // тест для предыдущей
    @Test
    void truthPrevStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        radio.prevStation();

        assertEquals(9, radio.getRadioStationNumber());
    }

    @Test
    void tPrevStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);
        radio.prevStation();

        assertEquals(9, radio.getRadioStationNumber());
    }

    @Test
    void sPrevStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.prevStation();

        assertEquals(8, radio.getRadioStationNumber());
    }

    // Тест для звука
    @Test
    void soundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(9);

        assertEquals(9, radio.getSoundVolume());
    }

    @Test
    void incorrectSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);

        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    void moreSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);

        assertEquals(0, radio.getSoundVolume());
    }

    // Тест для макисмума

    @Test
    void maxVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.maxVolume();

        assertEquals(0,radio.getMinSoundVolume());
    }

    @Test
    void incorrectMaxVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);
        radio.maxVolume();

        assertEquals(0, radio.getMinSoundVolume());
    }


    // Тест для минимума
    @Test
    void minVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.minVolume();

        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    void incorrectMinVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        radio.minVolume();

        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    void inMinVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.minVolume();

        assertEquals(0, radio.getMinSoundVolume());
    }
}


