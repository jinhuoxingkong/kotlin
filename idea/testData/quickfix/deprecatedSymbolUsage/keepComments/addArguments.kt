// "Replace with 'newFun(p1, -1, p2, p3, -2)'" "true"

@deprecated("", ReplaceWith("newFun(p1, -1, p2, p3, -2)"))
fun oldFun(p1: Int, p2: Int, p3: Int){}

fun newFun(p1: Int, a: Int, p2: Int, p3: Int, b: Int){}


fun foo() {
    <caret>oldFun(0, // 0
                  1, // 1
                  2 // 2
    )
