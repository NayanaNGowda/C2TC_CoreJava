package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
	
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		GSPrimeAcc gsprime=new GSPrimeAcc(accNo,accNm,charges,isPrime);//lazy initialization
		return null;
	}


@Override
public NormalAcc getNewNormalAccount(int accNo,String accNm,float charges,float deliveryCharge) {
	// TODO Auto-generated method stub
GSNormalAcc gsnormal=new GSNormalAcc(accNo,accNm,deliveryCharge,deliveryCharge);	
	return null;
}
}