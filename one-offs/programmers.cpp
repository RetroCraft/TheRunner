#include <iostream>
using namespace std;

struct Person {
   Person( bool k, string n ) : canCode(k), name(n) {}
   string better( Person other );
   bool canCode;
   string name;
};

string Person::better( Person other ) {
    if (canCode && other.canCode) {
        return "They're both good";
    } else if (canCode) {
        return name;
    } else if (other.canCode) {
        return other.name;
    }
}

int main() {
    Person alex = Person(true, "Alex");
    Person james = Person(true, "James");
    Person runner = Person(false, "Runner");
    cout << alex.better(james) << endl;
    cout << alex.better(runner) << endl;
}