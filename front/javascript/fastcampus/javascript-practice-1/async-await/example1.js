//Promise 객체를 리턴하는 함수
function p(ms){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve(ms);
        }, ms);
    });
}

p(1000).then(ms=>{
    console.log(`${ms} ms 후에 실행된다.`);
})

const ms = await p(1000);
console.log(`${ms} ms 후에 실행된다.`);