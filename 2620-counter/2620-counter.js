/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    // Closure in javascript function ke bahar wale value lete haii
    let count = n
    return function() {
        return count++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */