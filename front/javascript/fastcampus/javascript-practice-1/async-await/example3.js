function p(ms){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            //resolve(ms);
            reject(new Error('reason'));
        }, ms);
    });
}

(async function main(){
    try{
        const ms = await p(1000);
    }catch (error){
        console.log(error);
    }
})();