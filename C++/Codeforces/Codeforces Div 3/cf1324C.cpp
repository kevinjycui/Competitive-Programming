#include <bits/stdc++.h>
#define int long long

using namespace std;

signed main() {

    int t;
    cin >> t;

    for (int i=0; i<t; i++) {

        string s;
        cin >> s;

        int maximum = 0;
        int r = 0;

        for (int j=0; j<s.size(); j++)
            if (s.at(j) == 'R') {
                maximum = max(maximum, j-r+1);
                r = j+1;
            }
        maximum = max(maximum, (int)(s.size())-r+1);

        cout << maximum << endl;

    }

}
