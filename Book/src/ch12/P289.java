package ch12;



public class P289 {
	public static void main(String[] args) {
		
		Hash v1 = new Hash(20);
		Hash v2 = new Hash(20);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println("v1 real hash : "+
							System.identityHashCode(v1));
		
		System.out.println("v2 real hash : "+
				System.identityHashCode(v2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Hash{
	int value;
	Hash(int value){
		this.value = value;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Hash) {
			Hash v = (Hash)obj;
			return value == v.value;
			
		}else {
			return false;
		}
	}
	public int hashCode() {
		return value;
	}
}
