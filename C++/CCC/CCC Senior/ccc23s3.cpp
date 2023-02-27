#include <bits/stdc++.h>

using namespace std;

int n, m;
char poster[2001][2001];

void print_poster() {
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            printf("%c", poster[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int ryo, kita;

    scanf("%d %d %d %d", &n, &m, &ryo, &kita);

    if (n == 1 && m == 1 && (ryo == 0 || kita == 0)) {
        printf("IMPOSSIBLE\n");
        return 0;
    }

    if (ryo == 0 && kita == 0) {
        char nonrepeat[5] = "rock";
        int shift = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                poster[i][j] = nonrepeat[(i*n+j+shift)%4];
            }
            if (n%4 == 0) shift++;
        }
        print_poster();
        return 0;
    }

    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            poster[i][j] = 'b';
        }
    }

    if (ryo == n && kita == m) {
        print_poster();
        return 0;
    }

    for (int r=0; r<ryo; r++)
        for (int i=0; i<m; i++)
            poster[r][i] = 'o';
    
    for (int c=0; c<kita; c++)
        for (int j=0; j<n; j++)
            poster[j][c] = 'o';

    if (ryo == n) {
        int d = m - kita;

        if (d%2 != 0 && m%2 == 0) {
            printf("IMPOSSIBLE\n");
            return 0;
        }

        int edgediff = 0;
        for (; edgediff < d/2; edgediff++) {
            poster[0][edgediff] = 'c';
            poster[0][m - edgediff - 1] = 'c';
        }
        if (d == edgediff * 2 + 1) {
            poster[0][m/2] = 'c';
        }
    }

    else if (kita == m) {
        int d = n - ryo;

        if (d%2 != 0 && n%2 == 0) {
            printf("IMPOSSIBLE\n");
            return 0;
        }

        int edgediff = 0;
        for (; edgediff < d/2; edgediff++) {
            poster[edgediff][0] = 'c';
            poster[n - edgediff - 1][0] = 'c';
        }
        if (d == edgediff * 2 + 1) {
            poster[n/2][0] = 'c';
        }
    }

    else if (ryo == 0) {
        for (int i=kita; i<m; i++) {
            poster[0][i] = 'h';
        }
    }

    else if (kita == 0) {
        for (int j=ryo; j<n; j++) {
            poster[j][0] = 'i';
        }
    }

    print_poster();

}