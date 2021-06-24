/*
p 라는 프로미스 객체는 1000ms 후에 fulfiled 됩니다.
 */

 const p = new Promise((reslove, reject) => {
    /*pending */
    setTimeout(() => {
        reslove();
    }, 1000);
 });

 p.then(/*callback*/() => {
    console.log('1000ms 후에 fulfilled 됩니다.');
 });