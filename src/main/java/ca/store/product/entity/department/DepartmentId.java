package ca.store.product.entity.department;

public class DepartmentId {

private String pharmacy;

private String dietitian;

private String naturalFoods;

private String optician;

private String medicalClinics;

public String getPharmacy ()
{
    return pharmacy;
}

public void setPharmacy (String pharmacy)
{
    this.pharmacy = pharmacy;
}

public String getDietitian ()
{
    return dietitian;
}

public void setDietitian (String dietitian)
{
    this.dietitian = dietitian;
}

public String getNaturalFoods ()
{
    return naturalFoods;
}

public void setNaturalFoods (String naturalFoods)
{
    this.naturalFoods = naturalFoods;
}

public String getOptician ()
{
    return optician;
}

public void setOptician (String optician)
{
    this.optician = optician;
}

public String getMedicalClinics ()
{
    return medicalClinics;
}

public void setMedicalClinics (String medicalClinics)
{
    this.medicalClinics = medicalClinics;
}

@Override
public String toString()
{
    return "ClassPojo [pharmacy = "+pharmacy+", dietitian = "+dietitian+", naturalFoods = "+naturalFoods+", optician = "+optician+", medicalClinics = "+medicalClinics+"]";
}
}
		
		

