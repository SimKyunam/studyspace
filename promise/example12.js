/*
프로미스 객체 여러개를 생성하여,
배열로 만들어 인자로 넣고 Promise.all을 실행하면
배열의 모든 프로미스 객체들이 fulfilled 되었을때, then 함수가 실행됩니다.
then 의 함수의 인자로 프로미스 객체들의 reslove 인자값을 배열로 돌려줍니다.
*/

// Promise.all([프로미스 객체들]);

function p(ms){
    return new Promise((resolve, reject) =>{
        setTimeout(() =>{
            resolve(ms);
        }, ms);
    });
}

Promise.all([p(1000), p(2000), p(3000)]).then((message)=>{
    console.log('모두 fulfilled 된 이후에 실행됩니다.', message);
});