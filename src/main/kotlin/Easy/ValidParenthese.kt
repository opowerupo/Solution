package main.kotlin.Easy

import java.util.Stack

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */

class ValidParenthese {

    private val hm: HashMap<Char, Char> = hashMapOf<Char, Char>()
    private val stack: Stack<Char> = Stack<Char>()

    init {
        hm['('] = ')'
        hm['['] = ']'
        hm['{'] = '}'
    }

    fun isValid(s: String): Boolean {
        var c: Char = '1';
        for (i: Int in s.indices) {
            c = s.get(i)
            if (hm.containsKey(c)) {
                stack.push(c)
            } else {
                if (stack.isEmpty() || hm.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true
        }
        return false
    }

}


fun main() {
    val vp = ValidParenthese();
    val res: Boolean = vp.isValid("(")
    print(res)
}