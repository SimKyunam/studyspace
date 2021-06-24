function sum(...rest) {
    return rest.reduce((acc, current) => acc + current, 0);
    // let result = 0;
    // if (a) result += a;
    // if (b) result += b;
    // if (c) result += c;
    // if (d) result += d;
    // if (e) result += e;
    // if (f) result += f;
    // if (g) result += g;
    // return result

    // return a + b + c + d + e + f + g; //값이 하나라도 없으면 NaN
}

// console.log(sum(1, 2, 3, 4, 5, 6, 7, 8));
const numbers = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(sum(...numbers));

function subtract(x, y) {
    //subtract(x, y) x와 y는 prameter
    return x - y;
}

const result = subtract(1, 2); //subtract(1,2) 1와 2는 인자
console.log(result);
