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
        int minRadioStationNumber = 0;
        if (radioStationNumber == 9) {
            radioStationNumber = minRadioStationNumber;
            return;
        }
        radioStationNumber = radioStationNumber + 1;

    }

    public void prevRadioStation() { //Метод для переключения станции а предыдущую
        int maxRadioStationNumber = 9;
        if (radioStationNumber == 0) {
            radioStationNumber = maxRadioStationNumber;
            return;
        }
        radioStationNumber = radioStationNumber - 1;

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