console.log(true && 'hello'); // 'hello'
console.log(false && 'hello'); // false
console.log('hello' && 'bye'); // 'hello'
console.log(null && 'hello'); // null
console.log(undefined && 'hello'); //undefined
console.log('' && 'hello'); //''
console.log(0 && 'hello'); // 0
console.log(1 && 'hello'); // 1
console.log(1 && 1); // 1

console.log(false || 'hello'); //hello
console.log('' || '이름없다'); //이름없다
console.log(null || '널이다~'); //널이다
console.log(undefined || 'defined 되지 않았다'); //defined 되지 않았다
console.log(0 || '제로다'); //제로다

console.log(1 || '음'); //1
console.log(true || '음'); //true
console.log('와아' || '음'); //와아
console.log([] || '노노'); //[]

//기본값이 없는 함수를 사용할때.
const calculateCircleArea = (r = 1) => Math.PI * r * r;
const area = calculateCircleArea();
console.log(area);
