package lib;

public class TaxFunction {
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus
	 * dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan
	 * bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan)
	 * dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena
	 * pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah
	 * sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya
	 * ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	public static int calculateTax(TaxInfo taxInfo) {
		int numberOfChildren = taxInfo.getNumberOfChildren();
		int tax = 0;

		checkNumberOfMonthWorking(taxInfo);
		numberOfChildren = calculateNumberOfChildren(taxInfo, numberOfChildren);
		tax = calculateTaxWhenIsMarried(taxInfo, tax, numberOfChildren);
		if (tax < 0) {
			return 0;
		} else {
			return tax;
		}

	}

	public static void checkNumberOfMonthWorking(TaxInfo taxInfo) {
		if (taxInfo.getNumberOfMonthWorking() > 12) {
			System.err.println("More than 12 month working per year");
		}
	}

	public static int calculateNumberOfChildren(TaxInfo taxInfo, int numberOfChildren) {
		if (taxInfo.getNumberOfChildren() > 3) {
			numberOfChildren = 3;
		}
		return numberOfChildren;
	}

	public static int calculateTaxWhenIsMarried(TaxInfo taxInfo, int tax, int numberOfChildren) {
		if (taxInfo.getIsMarried()) {
			tax = (int) Math.round(0.05 * (((taxInfo.getMonthlySalary() + taxInfo.getOtherMonthlyIncome())
					* taxInfo.getNumberOfMonthWorking()) - taxInfo.getAnnualDeductible()
					- (54000000 + 4500000 + (numberOfChildren * 1500000))));
		} else {
			tax = (int) Math.round(
					0.05 * (((taxInfo.getMonthlySalary() + taxInfo.getOtherMonthlyIncome())
							* taxInfo.getNumberOfMonthWorking()) - taxInfo.getAnnualDeductible() - 54000000));
		}
		return tax;
	}
}
