import static org.junit.jupiter.api.Assertions.*;

class FindNextDayTest {

    @org.junit.jupiter.api.Test
    void nextDay() {
        int day = 2;
        int month = 3;
        int sum  = day+month;
        int actual = FindNextDay.NextDay(1,3);
        assertEquals(sum,actual);
    }
}