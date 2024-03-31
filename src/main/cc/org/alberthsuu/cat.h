#ifndef SRC_MAIN_CC_ORG_ALBERTHSUU_CAT_H_
#define SRC_MAIN_CC_ORG_ALBERTHSUU_CAT_H_

namespace animal {
class Cat {
 public:
  Cat() = default;
  Cat(const Cat &) = delete;
  Cat(Cat &&) = delete;
  Cat &operator=(const Cat &) = delete;
  Cat &operator=(Cat &&) = delete;

  void speak();
  void jump();

 private:
  bool happy = true;
};
}  // namespace animal

#endif  // SRC_MAIN_CC_ORG_ALBERTHSUU_CAT_H_
