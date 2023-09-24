// class Solution {
//     public int calculate(String s) {
//         int sum =0 ;
//         int sign = 1;
//         Stack<Integer>stck = new Stack<>();
//         for(int i=0; i<s.length(); i++){
//             if((int)s.charAt(i) >= '0' && (int)s.charAt(i)  <= '9'){
//                 int num = 0;
//                 while( (int)s.charAt(i) >= '0' && (int)s.charAt(i)  <= '9'){
//                     num = (10 * num) + (int)s.charAt(i) -  '0';
//                     i++;
//                 }
//                 sum += sign * num;
//                  i--;
//             }else if(s.charAt(i) == '+'){
//                 sign = 1;
//             }else if(s.charAt(i) == '-'){
//                 sign = -1;
//             }else if(s.charAt(i) == '('){
//                 stck.push(sum);
//                 stck.push(sign);
                
//             }else if(s.charAt(i) == ')'){
//                 sum *= stck.pop();
//                 sum+=stck.pop();
//             }
//         }
//         return sum;
//     }
// }

public class Solution{
    
public static int calculate(String s) {
	int len = s.length(), sign = 1, result = 0;
	Stack<Integer> stack = new Stack<Integer>();
	for (int i = 0; i < len; i++) {
		if (Character.isDigit(s.charAt(i))) {
			int sum = s.charAt(i) - '0';
			while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
				sum = sum * 10 + s.charAt(i + 1) - '0';
				i++;
			}
			result += sum * sign;
		} else if (s.charAt(i) == '+')
			sign = 1;
		else if (s.charAt(i) == '-')
			sign = -1;
		else if (s.charAt(i) == '(') {
			stack.push(result);
			stack.push(sign);
			result = 0;
			sign = 1;
		} else if (s.charAt(i) == ')') {
			result = result * stack.pop() + stack.pop();
		}

	}
	return result;
}
}