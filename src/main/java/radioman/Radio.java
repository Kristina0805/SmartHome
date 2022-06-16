package radioman;

public class Radio {
    private int RadioStationNumber;
    private int soundVolume;

    public void setRadioStationNumber(int RadioStationNumber) {
        if (RadioStationNumber < 0) {
            return;
        }
        if (RadioStationNumber > 9) {
            return;
        }
        this.RadioStationNumber = RadioStationNumber;
    }

    public int getRadioStationNumber() {

        return RadioStationNumber;
    }

    public void NextStation() {
        if (RadioStationNumber < 9) {
            RadioStationNumber = RadioStationNumber + 1;
        } else if (RadioStationNumber >= 9) {
            RadioStationNumber = 0;
        }
    }

    public void prevStation() {
        if (RadioStationNumber == 0) {
            RadioStationNumber = 9;
        } else if (RadioStationNumber > 0) {
            RadioStationNumber = RadioStationNumber - 1;
        }
        setRadioStationNumber(RadioStationNumber);
    }


    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }
        this.soundVolume = newSoundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void maxVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        } else if (soundVolume == 10) {
            soundVolume = 0;
        }
        setSoundVolume(soundVolume);
    }
    public void minVolume(){
        if (soundVolume == 0){
            soundVolume = 0;
        }else if (soundVolume < 10){
            soundVolume = soundVolume - 1;
        }
        setSoundVolume(soundVolume);
    }

}


