package Pojo;  //Plain old java object

public class PojoData {
	
	private String name ;
	private String id ;
	private String date ;
	private String classMaster ;

	public PojoData(String name ,String id ,String date ,String classMaster) {
		
		this.name = name ;
		this.id = id;
		this.date = date;
		this.classMaster = classMaster;
		
	}
	
	
	public void data() {
		 
		System.out.println("Name" + " " + name + " " + "id No" +" " + id + " " + "Date" +" " + date +  " " + "Course" + " " + classMaster ); 
	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i<=3;i++) {
			
			PojoData data = new PojoData("Dinesh" +i,"9090 "+ i ,"09-09-09","javamaster");
			data.data();
		}
		
	}

}
