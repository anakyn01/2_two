#include <stdio.h>
int main(){
//포인터는 다른 변수의 메모리주소를 자신의 값으로 저장하는 변수입니다
//int * ptr = &myAge
int myAge=46;
printf("%p\n", &myAge);//16진수로 메모리 주소가 나온다
//변수가 생성되면 메모리 주소가 변수에 할당된다 변수에 값을 할당하면 이 메모리 주소에 저장됩니다 
// 이에 대한 엑세스를 사용하려면 참조연산자 
int * ptr = &myAge; 
printf("%p\n", ptr);
return 0;
}