#include <bits/stdc++.h>
#define int long long

using namespace std;

signed main() {

    int t;
    cin >> t;

    map<char, int> handToIndex = {
        { 'R', 0 },
        { 'P', 1 },
        { 'S', 2 }
    };

    char indexToHand [3] = {'R', 'P', 'S'};

    for (int i=0; i<t; i++) {
        int n, hands[3];
        cin >> n;
        cin >> hands[0] >> hands[1] >> hands[2];

        string seq;
        cin >> seq;

        string ans = "";
        int wins = 0;

        for (char c:seq) {
            int k = handToIndex[c];
            if (hands[(k+1)%3] > 0) {
                hands[(k+1)%3]--;
                wins++;
                ans += indexToHand[(k+1)%3];
            }
            else ans += " ";
        }

        if (wins >= ceil(n/2.0)) {

            cout << "YES" << endl;

            string fin = "";

            for (char c:ans) {
                if (c != ' ') fin += c;
                else for (int i=0; i<3; i++) {
                    if (hands[i] > 0) {
                        fin += indexToHand[i];
                        hands[i]--;
                        break;
                    }
                }
            }

            cout << fin << endl;

        }
        else
            cout << "NO" << endl;

    }

}
