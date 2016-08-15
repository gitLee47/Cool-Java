
public class BulbArray {
	static Bulb[] bulbs = { new Bulb(0, true), 
							new Bulb(1, false), 
							new Bulb(2,true) };
	
	public static void main(String[] args) {
		int index = 1;
		
		System.out.println(getBulbState(index));

		toggleState(1, 2);
		
		System.out.println(getBulbState(index));
	}
	
	public static boolean getBulbState(int Index){
		return bulbs[Index].getState();
	}
	
	public static void toggleState(int strt, int stop){
			if(strt > bulbs.length || stop > bulbs.length)
				System.out.println("Enter correct indexes within limits!");
			else
				for(int i=strt; i <= stop; i++){
					bulbs[i].toggleState();
				}
	}
	
	public static class Bulb{
		int index;
		boolean state;
		
		Bulb(int index, boolean state){
			this.index = index;
			this.state = state;
		}
		
		public boolean getState(){
			return state;
		}
		
		public void toggleState(){
				state = !state;
		}
	}

}
