public class Radio {
    private int radioStationNumber;
    private int radioVolume;

    public int getCurrentRadioStationNumber() {
        return radioStationNumber;
    }

    public int getCurrentRadioVolume() {
        return radioVolume;
    }

    public void setRadioStationRange(int radioStationRange) { //Определили диапозон станций
        if (radioStationRange < 0) {
            return;
        }
        if (radioStationRange > 9) {
            return;
        }
        radioStationNumber = radioStationRange;
    }


    public void nextRadioStation() { //Метод для переключения станции на следующую
        int minRadioStation = 0;
        if (radioStationNumber >= 0) {
            radioStationNumber = radioStationNumber + 1;
        }
        if (radioStationNumber > 9) {
            radioStationNumber = minRadioStation;
        }

    }


    public void prevRadioStation() { //Метод для переключения станции а предыдущую
        int maxRadioStation = 9;
        if (radioStationNumber <= 9) {
            radioStationNumber = radioStationNumber - 1;
        }
        if (radioStationNumber < 0) {
            radioStationNumber = maxRadioStation;
        }
    }


    public void setRadioVolumeRange(int radioVolumeRange) { //Определили диапозон звука
        if (radioVolumeRange < 0) {
            return;
        }
        if (radioVolumeRange > 100) {
            return;
        }
        radioVolume = radioVolumeRange;
    }


    public void increaseVolume() { //Метод для увеличения громкости
        if (radioVolume < 100) {
            int newRadioVolume = radioVolume + 1;
            setRadioVolumeRange(newRadioVolume);
        }
    }

    public void decreaseVolume() { //Метод для увеличения громкости
        if (radioVolume > 0) {
            int newRadioVolume = radioVolume - 1;
            setRadioVolumeRange(newRadioVolume);
        }
    }
}