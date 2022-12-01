package org.tnsindia.finalkeyworddemo;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		FinalMethodWithChild f=new FinalMethodWithChild();
		f.aadhar_no =74589852256L;
		f.PAN_no="RPJ72187275";
		//f.print();
		f.print(f.PAN_no);
	}

}
