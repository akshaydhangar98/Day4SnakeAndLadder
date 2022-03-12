package day4snakeandladder;

public class UC3_snakeLadderNoPlay {

	public static void main(String[] args)
	{
			int position=0;
    		int randomCheck = (int) Math.floor(Math.random() * 10) % 6+1;
			int randomCheck2 = (int) (Math.random() * 10) % 3;
			switch(randomCheck2) {
			case 0:
				System.out.println("No play");
				position += 0;
				break;
			case 1:
				System.out.println("Ladder");
				position += randomCheck;
				break;
			case 2:
				System.out.println("Snake");
				position -= randomCheck;
				break;
				
			}
				
	}
}
	

