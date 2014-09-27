package com.rp.dp.facade;

import com.rp.dp.sis01.Facade;

public class Sistema {

	public static void main(String[] args) {

		Facade f = new Facade();
		f.cobrarImpostos();
		f.pagarFuncionario();
		
	}

}
