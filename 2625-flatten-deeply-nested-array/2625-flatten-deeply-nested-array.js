/**
 * @param {any[]} arr
 * @param {number} depth
 * @return {any[]}
 */
var flat = function (arr, n) {
    if(n==0) return arr;
    while(n>0 ){
        let q = [];
        for(let i=0; i<arr.length; i++){
            if(Array.isArray(arr[i])){
                q.push(...arr[i]);
                
            }else{
                q.push(arr[i]);
            }
        }
        arr= [...q];
        n--
    }
    return arr;
};


