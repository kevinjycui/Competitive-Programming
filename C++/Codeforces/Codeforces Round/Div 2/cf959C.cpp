#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main() {

    int n; cin >> n;

    if (n <= 5) cout << -1 << endl;
    else {
        cout << "1 2" << endl;
        cout << "1 3" << endl;
        cout << "1 4" << endl;
        for (int i=5; i<=n; i++) cout << "4 " << i << endl;
    }
    for (int i=1; i<n; i++) cout << i << " " << i+1 << endl;

}
