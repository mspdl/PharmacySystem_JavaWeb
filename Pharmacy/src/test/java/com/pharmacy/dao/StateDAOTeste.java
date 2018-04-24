package com.pharmacy.dao;

import org.junit.Test;

import com.pharmacy.domain.State;

public class StateDAOTeste {
	@Test
	public void save() {
		State state = new State();
		state.setName("Rio de Janeiro");
		state.setAbbreviation("RJ");
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.save(state);
		
	}

}
