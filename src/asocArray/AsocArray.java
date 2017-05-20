package asocArray;

public class AsocArray {
	private final int MAX=20;
	private int tam;
	private String[][] map;
	
	
	public AsocArray (){
		tam=0;
		map = new String[MAX][2];
	}

	public int size() {
		return tam;
	}

	public void put(String key, String value) {
		map[tam][0]=key;
		map[tam][1]=value;
		tam++;
		
	}

	public String get(String key) {
		for(int i=0;i<tam;i++){
			if(key==map[i][0]){
				return map[i][1];
			}
		}
		throw new UndefinedKeyException("No se ha encontrado el key");
	}
}
