package com.rp.dp.facade;

import com.rp.dp.sis01.FolhaPagamento;
import com.rp.dp.sis01.RecursosHumanos;

public class SistemaSemFacade {

	public static void main(String[] args) {
		FolhaPagamento fp = new FolhaPagamento();
		fp.pagarFuncionario();
		RecursosHumanos rh = new RecursosHumanos();
		rh.reterTalentos();
	}
}
