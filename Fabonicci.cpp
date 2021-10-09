#include <iostream>

using namespace std;

int main () {
	int n;
	
	cout << "Enter the number of terms\n";
	cin >> n;
	int series[n];
	
	cout << "The Series are \n";
	
	for(int i = 0; i < n; i++){
		if(i == 0) {
			series[0] = 0;
		}
		if(i == 1) {
			series[1] = 1;
		}
		if(i > 1){
			series[i] = series[i-1] + series [i - 2];
		}
		cout << series[i] << " ";
	}
	return 0;
}
