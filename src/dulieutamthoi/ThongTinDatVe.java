package dulieutamthoi;

public class ThongTinDatVe {
    private static String selectedDate;
    private static String selectedTime;
    private static String maPhim; // Mã phim
    private static String tongTienDoAn; // Tổng tiền đồ ăn

    // Getter và setter cho selectedDate
    public static String getSelectedDate() {
        return selectedDate;
    }

    public static void setSelectedDate(String date) {
        selectedDate = date;
    }

    // Getter và setter cho selectedTime
    public static String getSelectedTime() {
        return selectedTime;
    }

    public static void setSelectedTime(String time) {
        selectedTime = time;
    }

    // Getter và setter cho maPhim
    public static String getMaPhim() {
        return maPhim;
    }

    public static void setMaPhim(String maPhim) {
        ThongTinDatVe.maPhim = maPhim;
    }

    // Getter và setter cho tongTienDoAn
    public static String getTongTienDoAn() {
        return tongTienDoAn;
    }

    public static void setTongTienDoAn(String tongTien) {
        tongTienDoAn = tongTien;
    }
}
