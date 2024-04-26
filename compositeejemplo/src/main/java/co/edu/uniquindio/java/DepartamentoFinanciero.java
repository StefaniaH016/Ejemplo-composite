package co.edu.uniquindio.java;

public class DepartamentoFinanciero implements Departamento {
	
    private Integer id;
	private String name;

	public void printNombreDepartamento() {
		System.out.println(getClass().getSimpleName());
	}
	// standard constructor, getters, setters
    public DepartamentoFinanciero(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}




