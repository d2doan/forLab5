//main idea: pretend you're staring at a large 4x4 square with four quadrants, labled A, B, C, D, respectively from left to right, top to bottom:
//
//     0 _____________2_____________4
//     |              |             |
//     |              |             | 
//     |      A       |      B      |
//     |              |             |
//     |              |             |
//    2 -----------------------------
//     |              |             |
//     |              |             |
//     |      C       |      D      |
//     |              |             |
//     |              |             |
//    4 -----------------------------


// let (x, y) be the values corresponding to the number lines seen above
//
// the point of this locationer program is to tell the user where they are in the square, pretty simple
// (prepare for a bunch of if statements


class Locationer {
	
	public static String whereYouAre(int x, int y){
		
		//for boundaries
		if( (x == 0) && (x == 4) || (y == 0) || (y == 4)){
			return "You're on a border!";
		}

		//for center 
		if( (x == 2) && (y == 2)){
			return "You're everywhere, all at once...";
		}

		//for shared inner borders
		if( x == 2 ){
			if( y > 0 && y <2 ){
				return "You're between A & B";
			}
			else if( y > 2 && y < 4 ){
				return "You're between C & D";
			}
		}
		
		if( y == 2){
			if( (x > 0 && x < 2) ){
				return "You're between A & C";
			}
			else if(( x >2 && x < 4) ){
				return "You're between B & D";
			}
		}

		//inside squares
		if( (x > 0 && x < 2)){
			if( (y > 0 && y < 2)){
				return "You're in A (pickle)!";
			}
			else if( (y > 2 && y < 4)){
				return "You're in C!";
			}
		}
		if( (x > 2 && x < 4)){
			if( (y > 0 && y < 2) ){
				return "You're in B!";
			}
			else if( (y > 2 && y < 4)) {
				return "You're in D!";
			}
		}



		// for oob
		return "You seem to be lost, out of bounds...";
	}

}






