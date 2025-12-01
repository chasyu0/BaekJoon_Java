#include <iostream>
#include <string>
using namespace std;

int main() {
    std::string str;
    while (std::getline(std::cin, str)) {
        std::cout << str << '\n';
    }
    return 0;
}