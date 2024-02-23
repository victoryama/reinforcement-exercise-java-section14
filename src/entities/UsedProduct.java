package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	
	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
		super(name, price);
		this.manufactureDate = manufacturedDate;
	}

	public LocalDate getManufacturedDate() {
		return manufactureDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufactureDate = manufacturedDate;
	}

	
	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
}
