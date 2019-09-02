import java.util.Scanner;

public class wc151s2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] vowel_cards = new int [2];
		int [] const_cards = new int [6];

		const_cards[0] = sc.nextInt();
		vowel_cards[0] = sc.nextInt();
		for (int i=1; i<4; i++) {
			const_cards[i] = sc.nextInt();
		}
		vowel_cards[1] = sc.nextInt();
		for (int i=4; i<6; i++) {
			const_cards[i] = sc.nextInt();
		}
		//WILDCATS

		int wild_v = sc.nextInt();
		int wild_c = sc.nextInt();
		int wild_a = sc.nextInt();

		int bar_v = binary(vowel_cards, wild_v);
		
		int used_v = 0;

		for (int i=0; i<vowel_cards.length; i++) {
			if (vowel_cards[i]<bar_v) {
				used_v += bar_v-vowel_cards[i];
				vowel_cards[i] = bar_v;
			}
		}

		int vowIndex = 0;
		
		if (wild_v-used_v>0) {
			for (int i=0; i<wild_v-used_v; i++) {
				vowel_cards[vowIndex]++;
				vowIndex++;
				if (vowIndex>=vowel_cards.length) {
					vowIndex = 0;
				}
			}
		}
		
		int used_c = 0;

		int bar_c = binary(const_cards, wild_c);

		for (int i=0; i<const_cards.length; i++) {
			if (const_cards[i]<bar_c) {
				used_c += bar_c-const_cards[i];
				const_cards[i] = bar_c;
			}
		}
		
		int conIndex = 0;
		
		if (wild_c-used_c>0) {
			for (int i=0; i<wild_c-used_c; i++) {
				const_cards[conIndex]++;
				conIndex++;
				if (conIndex>=const_cards.length) {
					conIndex = 0;
				}
			}
		}

		int cards [] = new int [8];

		for (int i=0; i<2; i++) {
			cards[i] = vowel_cards[i];
		}
		for (int i=0; i<6; i++) {
			cards[i+2] = const_cards[i];
		}

		System.out.println(binary(cards, wild_a));

	}

	public static int diff(int [] a, int min) {
		int d = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i]<min) {
				d += min-a[i];
			}
		}
		return d;
	}

	public static int binary(int [] a, int wild) {
		int left = 0;
		int right = 200000000;

		while (left!=right) {
			int med = (left+right)/2;
			int d = diff(a, med);
			if (d>wild) {
				right = med;
			}
			else if (d<=wild){
				left = med+1;
			}
		}

		return left-1;
	}

}