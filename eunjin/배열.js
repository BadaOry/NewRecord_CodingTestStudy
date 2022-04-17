// 1번
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let count = input[0];
let nums = input[1].split(' ').map(Number);

let max = nums[0];
let min = nums[0];

for (let i = 0; i < count; i++) {
    if(max<nums[i]) max = nums[i];
    if(min>nums[i]) min = nums[i];
}
console.log(min,max);

// 2번
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

const numbers = input.map((num) => Number(num));

const max = Math.max(...numbers);

const index = numbers.indexOf(max);

console.log(max);
console.log(index + 1);

// 3번 
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let nums = String(input[0] * input[1] * input[2]);
let count 

for(let i = 0; i <= 9; i++) {
    count = 0;
    for(let j = 0; j < nums.length; j++){
        if(nums[j] == i) {
            count++;
        }
    }
    console.log(count);
}


// 4번

let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const count = new Set(input.map(x => x % 42)).size;

console.log(count);


// 5번

let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const n = input[0];
const score = input[1].split(' ').map(Number);

score.sort((a, b) => b - a);

const m = score[0]; 
const newScore = score.map(score => score/m*100);

let sum = 0;
for(let i=0; i<n; i++){
    sum += newScore[i];
}
console.log(sum/n);

// 6번

let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');


const n = Number(input[0]);

for(let i=1; i<=n; i++){
    let count = 1;
    let sum = 0;
    
    for(let j=0; j<input[i].length; j++){
        if(input[i][j]==="O"){
            sum+=count;
            count++;
        }else{
            count = 1;
        }
    }
    console.log(sum);
}

// 7번 
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const c = Number(input[0]);


for(let i=1; i<=c; i++){
    let sum = 0;
    let count = 0;
    
    scores = input[i].split(' ').map(Number);
    const n = scores[0];
    
    for(let j=1; j<=n; j++){
        sum += scores[j];
    }
    const avg = sum/n;
    for(let k=1; k<=n; k++){
        if(scores[k]>avg){
            count++;
    }
}
    console.log(((count/n)*100).toFixed(3)+"%");
}

