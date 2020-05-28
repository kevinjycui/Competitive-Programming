#include <bits/stdc++.h>
#define int long long

using namespace std;

signed main() {

    int t;
    cin >> t;

    for (int i=0; i<t; i++) {

        int n;
        cin >> n;

        int digit = pow(10, (int)log10(n));

        vector<int> values;

        while (digit > 0) {
            int rounded = (n/digit)*digit;
            if (rounded > 0) values.push_back(rounded);
            n %= digit;
            digit /= 10;
        }

        cout << values.size() << endl;

        for (int val:values)
            cout << val << " ";

        cout << endl;

    }

}
