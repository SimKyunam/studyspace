/*
fulfilled 되거나 rejected 된 후 최종적으로 실행할 것이 있따면, .finally()를 설정하고, 함수를 인자로 넣습니다.
*/

function p(){
    return new Promise((reslove, reject) => {
        /*pending */
        setTimeout(() => {
            reject(new Error('bad'));
        }, 1000);
    });
} 

p()
.then(message => {
    console.log('1000ms 후에 fulfilled 됩니다.', message);
})
.catch(error => {
    console.log('1000ms 후에 rejected 됩니다.', reason);
})
.finally(() => {
    console.log('end');
});