#include <bits/stdc++.h>
#define int long long

using namespace std;

signed main() {

    string s;
    cin >> s;

    stack<char> side;
    int cnt = 0;

    for (char c:s) {
        if (!side.empty() && side.top() == c) {
            side.pop();
            cnt++;
        }
        else side.push(c);
    }

    cout << (cnt%2==0 ? "No":"Yes") << endl;

}
