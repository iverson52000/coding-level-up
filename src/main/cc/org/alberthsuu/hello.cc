#include <iostream>

#include "./cat.h"
#include "absl/strings/str_join.h"

using animal::Cat;
using std::cout;
using std::endl;
using std::string;

class Test {
  int id{3};
  string name{"Mike"};

 public:
  Test() = default;
  // Delete copy constructor
  Test(const Test& other) = delete;
  // Delete assignment operator
  Test& operator=(const Test& other) = delete;

  explicit Test(int id) : id(id) {}

  void print() { cout << id << ": " << name << endl; }
};

int main() {
  Cat cat;
  cat.speak();

  cout << "Hello C++" << endl;

  int value1 = 8;
  int& value2 = value1;
  value1 = 20;
  std::cout << value2 << std::endl;

  // test abseil
  std::vector<std::string> vector = {"foo", "bar", "baz"};
  std::string string = absl::StrJoin(vector, "-");

  cout << "Joined string: " << string << "\n";

  return 0;
}
