/*
Memory Address=> &를 사용하여 메모리 값을 얻음

 */
#include <stdio.h>
int main(){
int myAge = 43;
printf("%p", &myAge);
    return 0;
}