#include <bits/stdc++.h>
#define int long long

using namespace std;

bool finite(int a, int b) {

    if (b == 0)
        return a == 1;
    return finite(b, a%b);

}

signed main() {

    int t;
    cin >> t;

    for (int i=0; i<t; i++) {

        int a, b;
        cin >> a >> b;

        cout << (finite(min(a, b), max(a, b)) ? "Finite":"Infinite") << endl;

    }

}
