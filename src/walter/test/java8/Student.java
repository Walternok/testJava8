package walter.test.java8;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String stuName;
	private String stuID;

	public Student(String stuName, String stuID) {
		this.stuName = stuName;
		this.stuID = stuID;
	}

	@Override
	public int hashCode() {
		
		int prime = 11;
		
		int result = 7;
		result = prime * result + Objects.hashCode(this.stuName);
//		System.out.println("Debug[stuName]: " + result);
		
		result = prime * result + Objects.hashCode(this.stuID);
//		System.out.println("Debug[stuID]: " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		final Student other = (Student) obj;
		
		if (!Objects.equals(this.stuName, other.stuName)){
			
			return false;
		}
		
		if (!Objects.equals(this.stuID, other.stuID)){
			
			return false;
		}
		return true;
	}
	
	

	@Override
	public String toString() {
		return 	String.format("(%s, %s)", stuName, stuID);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int diff = 0;
		int countLoop = 0;
		
		if(this.stuName.length() <= o.stuName.length()){
			countLoop = this.stuName.length(); 
		}else{
			countLoop = o.stuName.length();
		}
		
		for(int i = 0; i < countLoop; i++){
			diff = this.stuName.toCharArray()[i] - o.stuName.toCharArray()[i];
			if(diff != 0){
				System.out.println("Break [" + this.stuName + "][" + o.stuName + "]");
				break;
			}
		}
		return diff;
	}
		
}
