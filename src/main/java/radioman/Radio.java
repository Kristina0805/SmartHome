package radioman;

public class Radio {
    private int radioStationNumber;
    private int soundVolume;

    public void setRadioStationNumber(int RadioStationNumber) {
        if (RadioStationNumber < 0) {
            return;
        }
        if (RadioStationNumber > 9) {
            this.radioStationNumber = 9;

            return;

        }
        this.radioStationNumber = RadioStationNumber;
    }

    public int getRadioStationNumber() {

        return radioStationNumber;
    }

    public void NextStation() {
        if (radioStationNumber < 9) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = 0;
        }
        setRadioStationNumber(radioStationNumber);
    }

    public void prevStation() {
        if (radioStationNumber == 0) {
            radioStationNumber = 9;
        } else  {
            radioStationNumber = radioStationNumber - 1;
        }
        setRadioStationNumber(radioStationNumber);
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
        } else  {
            soundVolume = 0;
        }
        setSoundVolume(soundVolume);
    }
    public void minVolume(){
        if (soundVolume == 0){
            soundVolume = 0;
        }else {
            soundVolume = soundVolume - 1;
        }
        setSoundVolume(soundVolume);
    }

}


