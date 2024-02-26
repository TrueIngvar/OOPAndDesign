
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    @Test
    public void shouldSetOneOfRange() {//Протестировали опредлённый диапозон станций 1 и 4
        Radio range = new Radio ();

        range.setRadioStationRange(5);

        int expected = 5;
        int actual = range.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldChangeRadiostarionForwordIfStationIsNine() {//Тест метода переключения станции на следующую. Номер станции = 9
        Radio nextStation = new Radio ();
        nextStation.next(9);

        int expected = 0;
        int actual = nextStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldChangeRadiostarionForwordBeforeNineAndStartsFromZero() {//Тест метода переключения станции на следующую. Номер станции < 9
        Radio nextStation = new Radio ();
        nextStation.next(0);

        int expected = 1;
        int actual = nextStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldChangeRadiostationBackIfStatuinIsZero() {//Тест метода переключения станции на предыдущую. Номер станции = 0
        Radio prevStation = new Radio ();
        prevStation.prev(0);

        int expected = 9;
        int actual = prevStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldChangeRadiostationBackIfStatuinIsNine() {//Тест метода переключения станции на предыдущую. Номер станции = 9
        Radio prevStation = new Radio ();
        prevStation.prev(9);

        int expected = 8;
        int actual = prevStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected,actual);

    }






}
