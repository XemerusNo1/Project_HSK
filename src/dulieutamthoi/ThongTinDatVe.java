package dulieutamthoi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ThongTinDatVe {
    private static String selectedDate;
    private static String selectedTime;
    private static String maPhim; // Mã phim
    private static BigDecimal tongTienDoAn = BigDecimal.ZERO; // Tổng tiền đồ ăn (changed to BigDecimal)
    private static List<String> selectedSeats = new ArrayList<>(); // Danh sách ghế đã chọn

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
    public static BigDecimal getTongTienDoAn() {
        return tongTienDoAn;
    }

    public static void setTongTienDoAn(BigDecimal tongTien) {
        tongTienDoAn = tongTien;
    }

    // Thêm ghế vào danh sách
    public static void addSelectedSeat(String seat) {
        selectedSeats.add(seat);
    }

    // Lấy danh sách ghế đã chọn
    public static List<String> getSelectedSeats() {
        return selectedSeats;
    }
}
