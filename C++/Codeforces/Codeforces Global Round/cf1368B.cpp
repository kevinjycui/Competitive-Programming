#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main() {

    ll k; cin >> k;
    string sub = "codeforces";

    ll letters[10], number = 0;
    fill(letters, letters+10, 0);

    int i = 0;
    while (number < k) {
        letters[i++]++;
        i %= 10;

        number = 1;
        for (int j=0; j<10; j++) number *= letters[j];
    }


    for (int i=0; i<10; i++)
        for (int j=0; j<letters[i]; j++)
            cout << sub.at(i);
    cout << endl;

}
