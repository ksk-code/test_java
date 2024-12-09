package test04;

import java.time.Instant;

public class cytech04 {

	public static void main(String[] args) {
		
		long epochSeconds = Instant.now().getEpochSecond() % 2 ;
		int seconds = (int)epochSeconds;
		
		switch(seconds) {
		case 1 :
			System.out.println("奇数です");
			break;
			
		default:
			System.out.println("偶数です");
		};

	}

}
