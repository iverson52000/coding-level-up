#include <iostream>

#include "./cat.h"

using animal::Cat;
using std::cout;
using std::endl;

int main() {
  Cat cat;
  cat.speak();

  cout << "Hello C++" << endl;

  return 0;
}
