/*
    executor 의 reslove 함수를 실행할때 인자를 넣어 실행하면, then 의 callback 함수의 인자로 받을 수 있따.
    resolve('hello');
    then((message) => {...})
*/

function p(){
    return new Promise((reslove, reject) => {
        /*pending */
        setTimeout(() => {
            reslove('hello');
        }, 1000);
    });
} 

p().then((message) =>{
    console.log('1000ms 후에 fulfilled 됩니다.', message);
}).catch(()=>{
    console.log('1000ms 후에 rejected 됩니다.');
});