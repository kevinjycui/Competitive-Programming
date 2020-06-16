#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main() {

    string s; cin >> s;

    int i = 1;
    int mx = 1;

    for (int j=1; j<s.length(); j++) {
        if (s.at(j) == s.at(j-1)) i++;
        else {
            mx = max(mx, i);
            i = 1;
        }
    }

    cout << max(mx, i) << endl;

}
