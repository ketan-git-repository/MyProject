package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class ScoreCalculator {
	
	
		Map<Character,Integer> map  = new HashMap<>();
	
	
	public String winnerFinder(String player1, String player2){
		map.put('H', 7);
		map.put('M', 5);
		map.put('S', 3);
		

		
		int total1= 0;
		int total2=0;

		for(int i = 0;i <3; i++){
			char ch1[] = player1.toCharArray();
			total1 = total1+map.get(ch1[i]);
		}
		
		for(int j = 0; j<3; j++){
			char ch1[] = player2.toCharArray();
			total2 = total2+map.get(ch1[j]);
		}
		
		if(total1 > total2){
			return "player 1 winner";
		}
		else if(total1 < total2){
			return "player 2 winner";
		}
		else
			return "both player winner";
		
	}

}
