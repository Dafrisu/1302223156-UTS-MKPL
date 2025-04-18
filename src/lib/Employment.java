package lib;

import java.time.LocalDate;

public class Employment {
    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;

    public Employment(int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear) {
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = monthWorkingInYear;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public int getMonthJoined() {
        return monthJoined;
    }

    public int getDayJoined() {
        return dayJoined;
    }

    public int getMonthWorkingInYear() {
        return monthWorkingInYear;
    }

    public void setMonthWorkingInYear(int monthWorkingInYear) {
        this.monthWorkingInYear = monthWorkingInYear;
    }

    public void calculateMonthWorkingInYear() {

        // Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah
        // bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
        LocalDate date = LocalDate.now();

        if (date.getYear() == this.yearJoined) {
            this.monthWorkingInYear = date.getMonthValue() - this.monthJoined;
        } else {
            this.monthWorkingInYear = 12;
        }
    }
}
