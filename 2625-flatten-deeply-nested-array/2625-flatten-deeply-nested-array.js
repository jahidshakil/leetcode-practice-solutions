/**
 * @param {any[]} arr
 * @param {number} depth
 * @return {any[]}
 */
var flat = function (arr, n) {
    if(n==0) return arr;
    let q;
    let curDepth=0
    let flag = true;
    while(curDepth<n && flag){
         q = [];
        flag=false;
        for(let i=0; i<arr.length; i++){
            if(Array.isArray(arr[i])){
                q.push(...arr[i]);
                flag=true;
            }else{
                q.push(arr[i]);
            }
        }
        arr= [...q];
        curDepth++
    }
    return arr;
};

