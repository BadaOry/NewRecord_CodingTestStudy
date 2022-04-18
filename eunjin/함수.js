// 1번 java로만 풀어야해서 약간 어렵나 싶었지만 
// 생각보다 쉬웠다 오랜만에 java 언어를 쓰니까 머리가 안돌아가긴했는데
// 문제 자체가 굉장히 쉬웠다 ! 문제만 잘 읽으면 금방 풀이 가능 
class Test {
    long sum(int[] a) {
		long sum = 0;
        
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}


// 2번
// 어렵다... 함수 ;; for문을 사용하여 인덱스에 값을 넣는 것을 어떻게 풀어나가야하는지
// 굉장히 고민이 많았다 반복문으로 하나씩 넣어줘야하나? 그러면 오류가 발생.. (런타임.. )
// 결국에는 false인 것에만 넣어주는 것으로 착안.. 구글 선생님들의 도움을 받았다..

let arr = [];
let answer = [];

for (let i = 1; i <= 10000; i++) {
  let N = 0;
  let stringNumber = String(i);
  for (let j = 0; j < stringNumber.length; j++) {
    N += Number(stringNumber[j]);
  }
  let nNum = i + N;
  arr.push(nNum);
}

for (let i = 1; i <= 10000; i++) {
  if (arr.indexOf(i) === -1) {
    answer += i + "\n";
  }
}

console.log(answer);


// 3번 
// 알고리즘.. 한수를 이해하는게 너무 어려웠다 ..
// 한수가 어떤 숫자를 포함하는지만 이해했더라면 더 빨리 풀 수 있었을 것 같다
// 문제가 진짜 점점 어렵다 ㅠㅠ 

let fs = require('fs');
let input = +require('fs').readFileSync('/dev/stdin').toString().trim();

const n = +input;

const arr = new Array(n + 1).fill(true);

for (let i = 0; i < n + 1; i++) {
  const numList = String(i).split('');
  if (numList.length < 3) {
    continue;
  } else {
    const d = numList[1] - numList[0];
    for (let j = 1; j < numList.length - 1; j++) {
      if (d !== numList[j + 1] - numList[j]) {
        arr[i] = false;
        break;
      }
    }
  }
}
console.log(arr.filter((is) => is).length - 1);
