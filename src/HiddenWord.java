public class HiddenWord{
	String answer = "";
	
	public HiddenWord(String word){
		answer = word;
		}
	
	public String getHint(String guess){
		String result = "";
		if(guess.toUpperCase().compareTo(answer.toUpperCase())==0){
			result = answer;
			}
		else{
			for(int count = 0; count<answer.length(); count++){
				for(int scount = 0; scount<answer.length(); scount++){
					if(guess.toUpperCase().charAt(count) == answer.toUpperCase().charAt(scount)&& count == scount){
						result += guess.charAt(scount);
						break;
						}
					if(guess.toUpperCase().charAt(count) != answer.toUpperCase().charAt(scount)&& count == scount){
							result+= '+';
							break;
							}
					if(guess.toUpperCase().charAt(count) == answer.toUpperCase().charAt(scount)&& count != scount){
						result+= '+';
						break;
						}
						if(guess.toUpperCase().charAt(count) != answer.toUpperCase().charAt(scount)&& count != scount){
								result+='*';
								break;
								}
					}
				}
			}
		return result;
		}
	
	public static void main(String[]args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		System.out.println(puzzle.getHint("AAAAA"));
		System.out.println(puzzle.getHint("HELLO"));
		System.out.println(puzzle.getHint("HARPS"));
	}
}
