package co.edu.uniquindio.java;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartamento implements Departamento {

	private Integer id;
	private String name;
	private List<Departamento> childDepartments;
    
	public HeadDepartamento(Integer id, String name) {
        
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}

	public void printNombreDepartamento() {
		childDepartments.forEach(Departamento :: printNombreDepartamento);
	}

	public void addDepartamento(Departamento departamento) {
		childDepartments.add(departamento);
	}

	public void removeDepartamento(Departamento departamento) {
		childDepartments.remove(departamento);
	}
}
    

