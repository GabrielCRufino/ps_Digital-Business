package br.com.fiap.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.fiap.dao.VisitanteDao;
import br.com.fiap.model.Visitante;

public class VisitanteBean {
	
	private Visitante visi = new Visitante();
			
	private VisitanteDao dao;
	
	
	public String save() {
		dao.create(getVisitante());
		mostrarMensagem("O usuário foi cadastrado");
		return null;
	}
	
	private void mostrarMensagem(String msg) {
		FacesContext
			.getCurrentInstance()
			.getExternalContext()
			.getFlash()
			.setKeepMessages(true);
		FacesContext
			.getCurrentInstance()
			.addMessage(null, new FacesMessage(msg));
	}
	
	public List<Visitante> list(){
		return dao.listAll();
	}

	public Visitante getVisitante() {
		return visi;
	}

	public void setUser(Visitante visitante) {
		this.visi = visitante;
	}
}
