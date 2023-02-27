#include <bits/stdc++.h>

using namespace std;

int main() {
    int c;
    int tiles[2][200001];

    scanf("%d", &c);

    for (int bocchi=0; bocchi<c; bocchi++)
        scanf("%d", &tiles[0][bocchi]);
    for (int bocchi=0; bocchi<c; bocchi++)
        scanf("%d", &tiles[1][bocchi]);

    int length = 0;

    for (int bocchi=0; bocchi<c; bocchi++) {
        for (int row=0; row<2; row++) {

            if (tiles[row][bocchi] == 0) continue;

            length += 3;

            if (bocchi - 1 >= 0 && tiles[row][bocchi - 1] == 1) {
                length -= 2;
            }

            if (row == 1 && bocchi % 2 == 0 && tiles[0][bocchi] == 1) {
                length -= 2;
            }

        }
    }

    printf("%d\n", length);
    
}