public class Radio {
    public int RadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return RadioStationNumber;
    }

    public void setRadioStationRange(int radioStationRange){ //Определили диапозон станций 1 и 4
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
        }
        else {
            return firstStation;
        }
    }

    public int prev(int currentRadioStation) { //Метод для переключения станции на следующую
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

    


}
