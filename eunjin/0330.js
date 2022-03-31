// 4번 
console.log(`|\\_/|
|q p|   /}
( 0 )"""\\
|"^"\`    |
||_/=\\\\__|`);

// 5번 
var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
console.log(a+b);

// 6번

var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
console.log(a-b);


// 10번

var fs = require('fs'); 
var input = fs.readFileSync("/dev/stdin").toString().trim(); 
console.log(`${input}??!`);


// 11번

var fs = require('fs'); 
var input = fs.readFileSync("/dev/stdin").toString().trim(); 
console.log(input - 543);


// 12번

var fs = require('fs'); 
var input = fs.readFileSync("/dev/stdin").toString().split(' ');

var A = parseInt(input[0]);
var B = parseInt(input[1]);
var C = parseInt(input[2]);

console.log((A+B)%C);
console.log(((A%C)+(B%C))%C);
console.log((A*B)%C);
console.log(((A%C)*(B%C))%C);


// 13번 

var fs = require('fs'); 
var input = fs.readFileSync("/dev/stdin").toString().split('\n');

var a = Number(input[0]);
var b = Number(input[1]);

var one = b%10;
var two = Math.floor((b % 100)/10);
var three = Math.floor(b/ 100);

console.log(a*one);
console.log(a*two);
console.log(a*three);
console.log(a*b);


