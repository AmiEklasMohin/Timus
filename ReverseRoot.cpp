#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double reverseRoot[256 * 1000];
    int arraySize = 0;
    long long num;
    while (cin >> num) {
        reverseRoot[arraySize++] = sqrt(num);
    }
    for (int i = (arraySize - 1); i >= 0; i--) {
        cout << fixed << reverseRoot[i] << endl;
    }
    return 0;
}
