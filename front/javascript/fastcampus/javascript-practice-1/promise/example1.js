/*
    ES6 부터 JavaSript의 표준 내장 객체로 추가
    Es6를 지원하는 브라우저나 Node.js에서 전역에 있는 Promise 확인 가능
*/

console.log(Promise);

/*
    executor 함수는 reslove 와 reject를 인자로 가진다.
    (resolve, reject) => {...}
    resolve와 reject는 함수
    resolve(), reject()
 */

 /*
    생성자를 통해서 프로미스 객체를 만드는 순간 pending(대기) 상태라고 한다.
    executor 함수 인자 중 하나인 reslove 함수를 실행하면, fulfilled(이행) 상태가 된다.
    executor 함수 인자 중 하나인 reject 함수를 실행하면, rejected(거부) 상태가 된다.
  */
new Promise((reslove, reject) => {
    //pending상태
    //..
    reslove(); // fulfilled
    reject(); //rejected
});