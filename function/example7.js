// 함수를 인자로하여 함수를 호출 (콜백함수)
function hello(c){
    console.log('hello');
    c();
}

hello(function(){
    console.log('콜백');
})