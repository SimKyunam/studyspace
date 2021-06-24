/*
then 함수에서 다시 프로미스 객체를 리턴하는 방법을 통해 체이닝하면, 비동기 작업을 순차적으로 아래로 표현할 수 있다.
 */

function p(){
    return new Promise((reslove, reject) => {
        /*pending */
        setTimeout(() => {
            reslove();
        }, 1000);
    });
} 

p()
.then(() => {
    return p();
})
.then(() => p())
.then(p)
.then(() =>{
    console.log('4000ms 후에 fulfilled 됩니다.');
})