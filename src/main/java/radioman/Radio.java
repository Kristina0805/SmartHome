package radioman;

public class Radio {
    public int RadioStationNumber;

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        this.RadioStationNumber = newRadioStationNumber;
    }

    public int getRadioStationNumber() {

        return RadioStationNumber;
    }

    public void NextStation() {
        if (RadioStationNumber < 9) {
            RadioStationNumber = RadioStationNumber + 1;
        }
        if (RadioStationNumber > 9) {
            RadioStationNumber = 0;
        }
    }





    public void prevStation() {
        if (RadioStationNumber < -1) {
            RadioStationNumber = 9;
        }
        if (RadioStationNumber > 0) {
            RadioStationNumber = RadioStationNumber -1;
        }
    }
}



