public interface UserIFC {
	Name getName();
	void setName(Name name);
	int getID();
	void setID(int id);
	DOB getDOB();
	void setDOB(DOB birthdate);
	CurrencyType getCurrencyType();
	void setCurrencyType(CurrencyType type);
	double getIncome();
	void setIncome(double income);
	Frequency getPayrollFrequency();
	void setPayrollFrequency(Frequency payFrequency);
	float getTaxRate();
	void setTaxRate(float taxRate);
}