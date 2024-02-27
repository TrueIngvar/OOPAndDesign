public class Radio {
    public int RadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return RadioStationNumber;
    }

    public void setRadioStationRange(int radioStationRange) { //Определили диапозон станций
        if (radioStationRange < 0) {
            return;
        }
        if (radioStationRange > 9) {
            return;
        }
        RadioStationNumber = radioStationRange;
    }

    public int next(int currentRadioStation) { //Метод для переключения станции на следующую
        int firstStation = 0;
        if (currentRadioStation < 9) {
            RadioStationNumber = currentRadioStation + 1;
            return currentRadioStation;
        } else {
            return firstStation;
        }
    }

    public int prev(int currentRadioStation) { //Метод для переключения станции а предыдущую
        int lastStation = 9;
        if (currentRadioStation > 1) {
            RadioStationNumber = currentRadioStation - 1;
            return currentRadioStation;
            //} else {
            //return lastStation;
        }
        if (currentRadioStation < 1) {
            RadioStationNumber = lastStation;
        }
        return lastStation;
    }


    public int radioVolume;

    public int getCurrentRadioVolume() {
        return radioVolume;
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

    public int increaseVolume(int currentVolume) { //Метод для увеличения громкости
        int maxVolume = 100;
        if (currentVolume < 100) {
            radioVolume = currentVolume + 1;
        } else {
                    currentVolume = maxVolume;
                   radioVolume = currentVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) { //Метод для уменьшения громкости
        int minVolume = 0;
        if (currentVolume > 0) {
            radioVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
            radioVolume = currentVolume;
        }
        return currentVolume;
    }
//    public int increaseAndMaxVolume(int currentVolume) {//Метод, при котором громкость не увеличивается, если громкость 100
//        int maxVolume = 100;
//        if (currentVolume >= 100) {
//            currentVolume = maxVolume;
//            radioVolume = currentVolume;
//        }
//        return maxVolume; //Попробоваться соединить метод increaseVolume и increaseAndMaxVolume
//    }
}