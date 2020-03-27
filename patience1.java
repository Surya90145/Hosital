import java.util.Scanner.*;
class patient
{
	String patient_name;
	int age;
	String contact_number;
	patient(String patient_name,int age,String contact_number)
	{
		this.patient_name=patient_name;
		this.age=age;
		this.contact_number=contact_number;
	}
	void display()
	{
		System.out.println("patinet name="+patient_name);
		System.out.println("patient_age="+age);
		System.out.println("Patient contact number="+contact_number);
	}
}
class patience1
{
	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		ArrayList<patient> al=new ArrayList<patient>();
		System.out.println("Enterr total no:of records:=");
		int n=sc.nextInt();
        patient [] obj=new patient[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Patient name");
			String na=sc.next();
			System.out.println("Enter patient age");
			int ag=sc.nextInt();
			System.out.println("Enter the patient contact number");
			String cn=sc.nextLong();
		   obj[i]=new patient(na,ag,no);
		}
		System.out.println("DIAPLAY RECORDS OF THE PATIENT");
		for(int i=0;i<n;i++)
		{
			obj[i].display();
			a1.add(obj[i]);
		}
	}
}
