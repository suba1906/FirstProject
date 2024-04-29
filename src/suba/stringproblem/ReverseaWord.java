package suba.stringproblem;

public class ReverseaWord {

	public static void main(String[] args) {

		String a = "i.like.this.program.very.much";
		String[] words = a.split("\\.");
		String ans = "";

		for (int i = words.length - 1; i >= 0; i--) {
			if (i == words.length - 1)
				ans = ans + words[i];
			else
				ans = ans + " " + words[i];
		}
		System.out.println(ans);
	}

}
