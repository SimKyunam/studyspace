//선언 함수는 hoisting으로 인해 최상단으로 이동
//var 변수 = 익명함수는 var는 hoisting으로 최상단 이동 (단, var 변수만 이동)
//const 변수 = 익명함수는 hoisting이 적용 안됨으로 없다고 나옴
var hello2;
console.log(hello2);

hello1();
//hello2();
hello3();

function hello1(){
    console.log('hello1');
}

hello2 = function(){
    console.log('hello2');
}

const hello3 = function(){
    console.log('hello3');
}