function max(...param) {
    return param.reduce((acc, current) => {
        if (current > acc) {
            acc = current;
        }
        return acc;
    }, 0);
}

const result = max(1, 2, 3, 4, 10, 5, 6, 7, 13);
console.log(result);
