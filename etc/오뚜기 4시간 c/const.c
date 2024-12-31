/*상수 참조만 할뿐 불변의 수 3.14
변경될 가능성이 없는 값이 있는 경우 항상 변수를 상수로 선언해야 한다
상수변수는 선언만 하면 안됩니다 (선언하고 값을 나중에 넣는것은 X)
*/
#include <stdio.h>
int main(){
    const int minutesPerhour = 60;
    const float PI = 3.14;
printf("%d\n", minutesPerhour);
printf("%f\n", PI);
return 0;


}