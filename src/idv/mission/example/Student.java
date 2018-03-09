package idv.mission.example;

public class Student {
    private String name;
    private String message;

    public void setName(String name) {
        this.name = name;
    }
    
	public void setMessage(String message) {
		this.message = message;
	}

    public void say() {
        System.out.println(message + name);
    }
}
