#include <stdio.h>
int main(){

int time = 20;
if(time < 18) {
    printf("good day");
}else{
     printf("good day");
}
//삼항 연산자
(time < 18) ? printf("good day") : printf("good day");

//스위치
int day=4;
switch (day) {
    case 1:
    printf("Monday");
    break;
    default:
    printf("end");
}

int i =0;
while (i < 5){
    printf("%d\n", i);
    i++;
}

do{
    printf("%d\n", i);
    i++;
}
while(i < 5);

//for
int z;
for(z=0; z<5; z++){
    printf("%d\n", z);
}
//중첩 for
int n, m;
for(n=1; n <=2; ++n){
    printf("Outer: %d\n", n);//outer1, outer2
    for (m=1; m <=3; ++m){
        printf(" inner : %d\n", m);//inner1,inner2,inner3
    }
}
//중단/계속
int u;
for(u=0; u<10; u++){
    if(u == 4){
        break;
    }
    printf("%d\n", u);//0123
}

int g;
for(g=0; g<10; g++){
    if(g == 4){
        continue;
    }
    printf("%d\n", g);//012356789 while도 똑같이 사용할수 있다
}

return 0;
}