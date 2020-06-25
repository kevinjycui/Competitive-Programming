#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main() {

    int t; cin >> t;
    for (int i=0; i<t; i++) {
        string s; cin >> s;
        vector<char> v(s.begin(), s.end());
        int cnt = 0;
        int j = 0;
        while (j+1 < v.size()) {
            if (v.at(j) != v.at(j+1)) {
                v.erase(v.begin()+j, v.begin()+j+2);
                cnt++;
                j = max(0, j-1);
            }
            else j++;
        }
        cout << (cnt%2 ? "DA":"NET") << endl;
    }

}
