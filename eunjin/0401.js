// 1번
// 자바스크립트는..구구단 출력이 쉽지않다.. 
// 아마 백준은 입력값을 직접 입력해줘야해서 그런거 같다 ! 
// 2번은 틀린 답(console에는 제대로 출력됨), 1번은 형식오류 
// 결국은 구글링 .. https://velog.io/@dragoocho/%EB%B0%B1%EC%A4%80-2739%EB%B2%88-JavaScript-%EB%AC%B8%EC%A0%9C 참고하였다
// Input을 정수형태로 변환하여 넣어줘야한다 ! 주의하자 
var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString();

var num = parseInt(input);

for (let i = 1; i <= 9; i++) {
    console.log(`${num} * ${i} = ${num * i}`);
}

// 2번
var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

for (var i = 1; i <= input[0]; i++) {
    var numbers = input[i].split(' ');
    
    console.log(Number(numbers[0]) + Number(numbers[1]));
}

// 3번
var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

var num = parseInt(input);
let answer = 0;
for (let i = 1; i <= num; i++) {
    answer = answer + i;
}
console.log(answer);

// 4번 
var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

var max = Number(input[0]);
var answer = '';

for (let i = 1; i <= max; i++) {
    let num = input[i].split(' ');
    answer += Number(num[0]) + Number(num[1]) + "\n";
}
console.log(answer);

// 5번 
var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString();

var answer = '';
for (let i = 1; i <= input; i++) {
    answer += i + "\n";
}

console.log(answer);

// 6번
var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString();

var num = Number(input);
var answer = '';

for(let i = num; i >= 1; i--) {
    answer += i + "\n";
}
console.log(answer);

// 7번
// 백틱 사용법을 잘 익혀보자 ~~ 

var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

for (let i = 1; i <= input[0]; i++) {
    let num = input[i].split(' ').map(Number);

    console.log(`Case #${i}: ${(num[0] + num[1])}`);
}

// 8번 
var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

for (let i = 1; i <= input[0]; i++) {
    let num = input[i].split(' ').map(Number);

    let num1 = Number(num[0]);
    let num2 = Number(num[1]);

    console.log(`Case #${i}: ${num1} + ${num2} = ${num1+num2}`);
}

// 9번 
// var는 사용ㅎㅏ지말자~ 
var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString();

let num = "";

for(let i=0; i< input; i++){
    num += "*"
    console.log(num);
}

// 10번
// var 사용을 지양하자.. 
var fs = require('fs');
var input = require('fs').readFileSync('/dev/stdin').toString();

let num = Number(input);

for(let i = 0; i < num; i++){
    let star = '';
    
    for(let j = num - 1; j >= 0; i--){
        star += j <= i ? '*' : ' ';
    }
    console.log(star);
}

// 11번 
const fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

let N = parseInt(input[0].split(' ')[0]);
let X = parseInt(input[0].split(' ')[1]);
let A = input[1].split(' ');

let result = [];

for (let i = 0; i < N; i++) {
    if (A[i] < X) {
        result.push(A[i]);
}
}
console.log(result.join(' '));

// 12번 
const fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

let i = 0;
while(true) {
    let num = input[i].split(' ');

    a = Number(num[0]);
    b = Number(num[1]);

    if(a == 0 && b == 0){
        break;
    }
    console.log(a+b);
    i++;
}

//13번
const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

let i = 0;
while(i<input.length-1){
    let nums = input[i].split(' ').map(x => Number(x));
    
    a = nums[0];
    b = nums[1];

    console.log(a+b);
    i++;
}
//14번
const input = require('fs').readFileSync('/dev/stdin').toString();

let num = input;
let sum;
let answer = 0;

while(true) {
    answer++;

    sum = Math.floor(num / 10) + (num % 10);
    num = (num % 10) * 10 + (sum % 10);

    if (num == input) 
        break;
}
    console.log(answer);