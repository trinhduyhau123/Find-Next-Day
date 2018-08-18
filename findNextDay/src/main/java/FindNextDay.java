public class FindNextDay {
    public static int NextDay(int ngay, int thang) {
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            if (ngay < 31) {
                ngay++;
                return ngay + thang;

            } else if (ngay == 31) {
                ngay = 1;
                thang++;
                return ngay + thang;

            }
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            if (ngay < 30) {
                ngay++;
                return ngay + thang;
            } else if (ngay == 30) {
                ngay = 1;
                thang++;
                return ngay + thang;
            }
        } else if (thang == 2) {
            if (ngay == 28 || ngay == 29) {
                ngay = 1;
                thang++;
                return ngay + thang;
            }
        }
        return -1;
    }
}

