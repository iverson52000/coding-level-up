#include "src/main/cc/org/alberthsuu/cat.h"

#include <iostream>

using std::cout;
using std::endl;

namespace animal {
void Cat::speak() { cout << "Meouwww!!!" << endl; }
void Cat::jump() { cout << "Jumping to top of bookcase" << endl; }
}  // namespace animal
