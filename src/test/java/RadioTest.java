import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldBeOutOfRangeMinusOneRadioStation() {//Граничное значение номера станции: -1.
        Radio range = new Radio();

        range.setRadioStationRange(-1);

        int expected = 0;
        int actual = range.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetZeroRadioStation() {//Граничное значение номера станции: 0
        Radio range = new Radio();

        range.setRadioStationRange(0);

        int expected = 0;
        int actual = range.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNineRadioStation() {//Граничное значение номера станции: 9
        Radio range = new Radio();

        range.setRadioStationRange(9);

        int expected = 9;
        int actual = range.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBeOutOfRangeTenRadioStation() {//Граничное значение номера станции: 10.
        Radio range = new Radio();

        range.setRadioStationRange(10);

        int expected = 0;
        int actual = range.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeRadioStationForwardIfStationIsNine() {//Тест метода переключения станции на следующую. Номер станции = 9
        Radio nextStation = new Radio();
        nextStation.setRadioStationRange(9);

        nextStation.nextRadioStation();

        int expected = 0;
        int actual = nextStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationForwardBeforeNineAndStartsFromZero() {//Тест метода переключения станции на следующую. Номер станции < 9
        Radio nextStation = new Radio();
        nextStation.setRadioStationRange(0);

        nextStation.nextRadioStation();

        int expected = 1;
        int actual = nextStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationBackIfStationIsZero() {//Тест метода переключения станции на предыдущую. Номер станции = 0, переключить на 9.
        Radio prevStation = new Radio();
        prevStation.setRadioStationRange(0);

        prevStation.prevRadioStation();

        int expected = 9;
        int actual = prevStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeRadioStationToZero() {//Тест метода переключения станции на предыдущую. Номер станции = 1, переключить на 0.
        Radio prevStation = new Radio();
        prevStation.setRadioStationRange(1);

        prevStation.prevRadioStation();

        int expected = 0;
        int actual = prevStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeRadioStationBackIfStationIsNine() {//Тест метода переключения станции на предыдущую. Номер станции = 9
        Radio prevStation = new Radio();
        prevStation.setRadioStationRange(9);

        prevStation.prevRadioStation();
        int expected = 8;
        int actual = prevStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }
//

    @Test
    public void shouldBeOutOfVolumeMinusOne() {//Граничное значение уровня звука: -1.
        Radio volume = new Radio();

        volume.setRadioVolumeRange(-1);

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetZeroVolume() {//Граничное значение уровня звука: 0
        Radio volume = new Radio();

        volume.setRadioVolumeRange(0);

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAHundredVolume() {//Граничное значение уровня звука: 100
        Radio volume = new Radio();

        volume.setRadioVolumeRange(100);

        int expected = 100;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBeOutOfVolumeOneHundredOne() {//Граничное значение уровня звука: 101.
        Radio volume = new Radio();

        volume.setRadioVolumeRange(101);

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() { //Тест метода увеличения громкости.
        Radio volume = new Radio();
        volume.setRadioVolumeRange(97);

        volume.increaseVolume();

        int expected = 98;
        int actual = volume.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntIncreaseVolume() { //Тест метода, при котором громкость не увеличивается, если громкость 100.
        Radio volume = new Radio();
        volume.setRadioVolumeRange(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { //Тест метода уменьшения громкости.
        Radio volume = new Radio();
        volume.setRadioVolumeRange(97);

        volume.decreaseVolume();

        int expected = 96;
        int actual = volume.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() { //Тест метода, при котором громкость не уменьшается, если громкость 0.
        Radio volume = new Radio();
        volume.setRadioVolumeRange(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

}
