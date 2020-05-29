#include <bits/stdc++.h>
#define int long long
#define MAXN 101

using namespace std;

signed main() {

    int n, m;
    cin >> n >> m;

    string words [MAXN];
    string reversed [MAXN];

    for (int i=0; i<n; i++) {
        string w;
        cin >> w;
        words[i] = w;
        reversed[i] = w;
        reverse(reversed[i].begin(), reversed[i].end());
    }

    vector<string> a;
    vector<string> b;

    for (int i=0; i<n; i++) {

        if (!words[i].compare("0")) continue;

        for (int j=i+1; j<n; j++) {
            if (!words[i].compare(reversed[j])) {
                a.push_back(words[i]);
                b.push_back(words[j]);
                words[j] = "0";
            }
        }

    }

    string middle = "";
    int mcount = 0;

    for (int i=0; i<n; i++) {
        if (words[i].compare("0") && !words[i].compare(reversed[i])) {
            middle = words[i];
            mcount = 1;
            break;
        }
    }

    cout << ((a.size() + b.size() + mcount) * m) << endl;

    for (string word:a)
        cout << word;
    cout << middle;
    for (int i=(int)b.size()-1; i>=0; i--)
        cout << b[i];
    cout << endl;


}
