/*
프로미스 객체 여러개를 생성하여,
배열로 만들어 인자로 넣고 Promise.race 실행하면
배열의 모든 프로미스 객체들 중 가장 먼저 fulfilled 되었을때, then 함수가 실행됩니다.
then 의 함수의 인자로 가장 먼저 fulfilled 된 프로미스 객체의 reslove 인자 값을 돌려줍니다.
*/

// Promise.race([프로미스 객체들]);

function p(ms){
    return new Promise((resolve, reject) =>{
        setTimeout(() =>{
            resolve(ms);
        }, ms);
    });
}

Promise.race([p(1000), p(2000), p(3000)]).then((message)=>{
    console.log('가장 빠른 하나가 fulfilled 된 이후에 실행됩니다.', message);
});