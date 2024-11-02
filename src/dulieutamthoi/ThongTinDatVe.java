package dulieutamthoi;

public class ThongTinDatVe {
    private static String selectedDate;
    private static String selectedTime;
    private static String maPhim; // Variable to store the movie code

    // Getter and setter for selectedDate
    public static String getSelectedDate() {
        return selectedDate;
    }

    public static void setSelectedDate(String date) {
        selectedDate = date;
    }

    // Getter and setter for selectedTime
    public static String getSelectedTime() {
        return selectedTime;
    }

    public static void setSelectedTime(String time) {
        selectedTime = time;
    }

    // Getter and setter for maPhim
    public static String getMaPhim() {
        return maPhim;
    }

    public static void setMaPhim(String maPhim) {
        ThongTinDatVe.maPhim = maPhim;
    }
}
