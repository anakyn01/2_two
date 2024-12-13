#include <stdio.h>
int sum(int k);

int main(){
    int result = sum(10);
    printf("%d\n", result);
    return 0;
}
int sum(int k){
    if (k>0){
        return k + sum(k-1);
    }else{
        return 0;
    }
}
/*
<string.h> : 문자열에 대한 작업을 수행할수 있는 함수
<math.h> : 수학 라이브러리

열거형 
enum Level{ 특별히 나열된것 대문자
LOW,
Medium,
High
}
 */