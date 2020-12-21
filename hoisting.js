//var과 function으로 호출된 것들은 자바스크립트 엔진이 맨 위로 올려서 발생
/*
var number;
function func() {
    console.log('hoisting');
}
*/

//함수 hoisting 방지하는 방법
const myFunction = function myFunction() {
    console.log('hello world');
};

myFunction();
