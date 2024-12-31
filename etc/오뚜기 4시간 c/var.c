/*
변수는 숫자, 문자와 같은 데이터값을 저장하기 위한 컨테이너
int
float
char
 */
#include <stdio.h>
int main(){
    int myNum = 15;
    float myFloat = 5.99;
    char myLetter ='D';
    
    printf("%d\n",myNum);
    printf("%f\n",myFloat);
    printf("%c\n",myLetter);
    printf("Nop o oo op: %d\n", myNum);
    /*
    형식지정자는 함수와 함께 사용되어 컴파일러 에게 변수가 저장 데이터 유형을 알려줍니다
    기본적으로 변수값의 플레이스홀더 입니다
     */
    //변수없이 값 인쇄
//변수 값을 변경
int myN = 15;
myN = 10;

    printf("%d\n", 15);
    printf("%d\n", myN);
    return 0;
}