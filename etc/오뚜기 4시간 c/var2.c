#include <stdio.h>
int main(){
    //빈변수에 값을 복사
int myNum = 15;
int myOtherNum;//선언만 하고 값이 없는 동수
//동수에 myNum을 대입
myOtherNum = myNum;

printf("%d\n", myOtherNum);

//연산
int x =5; int y=6; int sum = x + y; printf("%d\n", sum);

//여러변수 선언
int q, w, z;
q = w = z = 50;
printf("%d\n", q+w+z);

//직사각형의 면적 계산
int length = 4;
int width = 6;
int area;

area = length * width;
printf("면적은 :%d\n", area);

float sum1 = (float) 5 / 2;
printf("%.1f", sum1);

return 0;
}
/*
기본데이터 유형 
int(2or4바이트),float(4바이트),double(8바이트),char(1바이트)

기본 형식 지정자
%d or %i => int
%f or %F => float
%c char
%s string

유형변환
암묵적 변환(자동)
명시적 변환(수동)
 */