package net.wdc.testinglist;

public class Question {
	
	private Integer id;
	private String name;
	
	public Question(String name){
		this.name = name;
	}
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

}
