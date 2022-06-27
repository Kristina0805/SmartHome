package radioman;

public class Radio {
    private int radioStationNumber;
    private int amountStation ;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int soundVolume = minSoundVolume;

    public Radio() {
        amountStation = 9;
    }

    public Radio(int stationCount) {
        amountStation = stationCount - 1;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > amountStation) {
            this.radioStationNumber = amountStation;
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void nextStation() {
        if (radioStationNumber == amountStation) {
            radioStationNumber = 0;
        }  else {
            radioStationNumber++;
        }
        setRadioStationNumber(radioStationNumber);
    }

    public void prevStation() {
        if (radioStationNumber == 0) {
            radioStationNumber = amountStation;
        } else {
            radioStationNumber--;
        }
        setRadioStationNumber(radioStationNumber);
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            return;
        }
        if (newSoundVolume > maxSoundVolume) {
            return;
        }
        this.soundVolume = newSoundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void maxVolume() {
        if (soundVolume >= maxSoundVolume) {
            soundVolume = minSoundVolume;
        }
        setSoundVolume(soundVolume);
    }

    public void minVolume() {
        if (soundVolume <= minSoundVolume) {
            soundVolume = minSoundVolume;
        }
        setSoundVolume(soundVolume);
    }

}


