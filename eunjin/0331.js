// 1번
var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ').map(v=>+v);
var [a,b] = input;

if(a<b) {
    console.log('<')
} else if (a>b) {
    console.log('>')
} else {
    console.log('==')
}

// 2번 

var fs = require('fs');
var input = fs.readFileSync('/dev/stdin');
var a = input;

if(100 >= a && a >= 90) {
    console.log('A')
} else if(89 >= a && a >= 80) {
    console.log('B')
} else if (79 >= a && a >= 70) {
    console.log('C')
} else if (69 >= a && a >= 60) {
    console.log('D')
} else 
 console.log('F')

 // 3번 
var fs = require('fs');
var input = fs.readFileSync('/dev/stdin');
var year = input;

if(year % 4 == 0 && year % 100 != 0) {
    console.log(1)
} else if(year % 4 == 0 && year % 400 == 0){
    console.log(1)
} else 
    console.log(0)

// 4번 
// 런타임 오류? 'readline' ? or 'fs' 읽어오는 방식에 대한 차이점 확실하게 알아두기
// 'readline'을 사용하지 않아도 -> fs.readFileSync(0) 으로 처리해줘도 된다. 

var fs = require('fs');
var [x, y] = fs.readFileSync(0).toString().trim().split('\n').map(Number);

if(x > 0){
    y > 0 ? console.log(1) : console.log(4)
}
if(x < 0){
    y > 0 ? console.log(2) : console.log(3)
}

// 5번 

var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

var H = input[0];
var M = input[1];

M -= 45;

if(M < 0) {
    M += 60;
    H --;

    if (H === -1) {
        H = 23
    }
}
console.log(H + ' ' + M);

// 6번
var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

var clock = input[0].split(' ').map(Number);

var clockHour = clock[0];
var clockMinute = clock[1];
var cookTime = Number(input[1]);

var  a = parseInt((clockHour*60 + clockMinute + cookTime)/ 60) ; 
var b = parseInt((clockHour*60 + clockMinute + cookTime)% 60); 

console.log(a >= 24 ? a - 24 : a, b);

// 7번
var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

var dice = input[0].split(' ').map(Number);

var a = dice[0];
var b = dice[1];
var c = dice[2];

result(a, b, c)

function result(a, b, c) {
  let result = 0;
  if (a === b && b === c) {
    result = 10000 + a * 1000;
  } else if (a === b) {
    result = 1000 + a * 100;
  } else if (b === c) {
    result = 1000 + b * 100;
  } else if (c === a) {
    result = 1000 + c * 100;
  } else {
    if (a > b && a > c) {
      result = a * 100;
    } else if (b > a && b > c) {
      result = b * 100;
    } else {
      result = c * 100;
    }
  }
  console.log(result);
}