function p(ms){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            //resolve(ms);
            reject(new Error('reason'));
        }, ms);
    });
}

async function asyncP(){
    return 'Mark';
}

(async function main(){
    try{
        const name = await asyncP();
        console.log(name);
    }catch (error){
        console.log(error);
    }
})();