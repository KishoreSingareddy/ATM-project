package atm;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class AtmOperationImpl implements  AtmInterface {

	Atm atm=new Atm();
	Map<Double,String> ministmt=new HashMap<>();

	




	@Override
	public void viewBalanace() {
		System.out.println(" Available Balance:"+atm.getBalance());
		
	}

public void withdrawAmount(double withdrawAmount) {
	if(withdrawAmount%500==0)
	{
		if(withdrawAmount<=atm.getBalance())
		{
			ministmt.put(withdrawAmount,"Amount withdrawn");
			System.out.println("collect the cash" +withdrawAmount);
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalanace();
		}
		else
		{
			System.out.println("Insufficient Balance!");
		}
	}
	else
	{
		System.out.println("please enter the amount in multipple of 500");
	}
	
}


public void depositAmount(double depositAmount) {
	
	ministmt.put(depositAmount,"Amount Deposited");
	System.out.println(depositAmount+ "Deposited Succesfully!");
	atm.setBalance(atm.getBalance()+depositAmount);
	viewBalanace();
}

public void viewMiniStatement() {

	Set<Double> set=ministmt.keySet();
	for(Double d:set)
	{
	
		System.out.println(d+"="+ministmt.get(d));
	}
}
}
