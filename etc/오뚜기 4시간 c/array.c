#include <stdio.h>
int main(){
//배열 크기 설정
int myNumbers[4];//크기를 제한하는 배열
myNumbers[0] = 25;
myNumbers[1] = 50;
myNumbers[2] = 75;
myNumbers[3] = 100;

int q;
for (q=0; q<4; q++){
    printf("%d\n", myNumbers[q]);
}
printf("%d\n", myNumbers[0]);

int Array[] ={26,26,88,10};

//다차원 배열
int matrix[2][3] = {{1,2,3},{4,5,6}};
matrix[0][2] = 9;//배열 변경
printf("%d\n" , matrix[0][2]);

//다차원 루프
int b, j;
for(b=0; b < 2; b++){
    for(j=0; j<3; j++){
        printf("%d\n", matrix[b][j]);
    }
}

return 0;
}

