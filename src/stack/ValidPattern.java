//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
//
package stack;

import java.util.Stack;

public class ValidPattern {
    public boolean isValid(String s) {
        if(s == "" || s == " "){
            return true;
        }
        char[] chars = s.toCharArray();
        Stack<String> stack = new Stack();
        String temp = "";
        String pop = "";
        for(char c : chars){
            temp = String.valueOf(c);
            if(stack.isEmpty()){
                stack.push(temp);
            }else {
                pop = stack.pop();
                if(pop .equals("{") && temp.equals("}")){
                    continue;
                }
                if(pop .equals("[") && temp.equals("]")){
                    continue;
                }
                if(pop .equals("(") && temp.equals(")"))  {
                    continue;
                }
                stack.push(pop);
                stack.push(temp);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

}
