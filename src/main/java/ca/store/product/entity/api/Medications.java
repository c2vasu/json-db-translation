package ca.store.product.entity.api;

public class Medications {

private MedicationsDetails medicationsDetails;

private MedicationsList medicationsList;

public MedicationsDetails getMedicationsDetails ()
{
return medicationsDetails;
}

public void setMedicationsDetails (MedicationsDetails medicationsDetails)
{
this.medicationsDetails = medicationsDetails;
}

public MedicationsList getMedicationsList ()
{
return medicationsList;
}

public void setMedicationsList (MedicationsList medicationsList)
{
this.medicationsList = medicationsList;
}

@Override
public String toString()
{
return "ClassPojo [medicationsDetails = "+medicationsDetails+", medicationsList = "+medicationsList+"]";
}
}
	
	

