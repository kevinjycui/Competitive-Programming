#include <iostream>
#include <list>
#include <climits>
#include <cmath>
using namespace std;

int main() {
	int n;
	cin >> n;
	
	char graph [n+1][n+1];
	
	for (int i=1; i<=n; i++) {
		string s;
		cin >> s;
		for (int j=1; j<=n; j++) {
			graph[i][j] = s.at(j-1);
		}
	}
	
	int step [n+1][n+1];
	
	for (int i=1; i<=n; i++) {
		for (int j=1; j<=n; j++) {
			step[i][j] = INT_MAX;
		}
	}
	step[1][1] = 0;
	
	list<int> xq = {};
	list<int> yq = {};
	
	xq.push_back(1);
	yq.push_back(1);
	
	while (!xq.empty()) {
		int x = xq.front();
		int y = yq.front();
		
		xq.pop_front();
		yq.pop_front();
		
		if (x+1<=n && graph[x+1][y] == '.' && step[x+1][y]>step[x][y]+1) {
			step[x+1][y] = step[x][y]+1;
			xq.push_back(x+1);
			yq.push_back(y);
		}
		if (y+1<=n && graph[x][y+1] == '.' && step[x][y+1]>step[x][y]+1) {
			step[x][y+1] = step[x][y]+1;
			xq.push_back(x);
			yq.push_back(y+1);
		}
		if (y-1>0 && graph[x][y-1] == '.' && step[x][y-1]>step[x][y]+1) {
			step[x][y-1] = step[x][y]+1;
			xq.push_back(x);
			yq.push_back(y-1);
		}
	
	}
	
	if (step[n][n] != INT_MAX) {
		long d = n-1;
		long r = step[n][n]/2 - (n-1);
		long l = n-1+r;
		cout << long(pow(d, 2) + pow(l, 2) + pow(r, 2));
	} else {
		cout << -1;
	}
	return 0;
}