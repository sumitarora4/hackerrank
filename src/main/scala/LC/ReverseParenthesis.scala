package LC

object ReverseParenthesis {

  def main(args: Array[String]) = {

    println(reverseParentheses("(abcd)"))
    println(reverseParentheses("(u(love)i)"))
    println(reverseParentheses("(ed(et(oc))el)"))

    def reverseParentheses(s: String) : String = {
      var st =  s
      var startIndex = st.lastIndexOf("(")

      while( startIndex != -1 ){
        val endIndex = st.indexOf(")", startIndex)
        println("endIndex="+endIndex)

        val stTake = st.take(startIndex)
        println("stTake="+stTake)

        val stSubstring = st.substring(startIndex + 1, endIndex).reverse
        println("stSubstring="+stSubstring)

        val stDrop = st.drop(endIndex + 1)
        println("stDrop="+stDrop)

        st = stTake + stSubstring + stDrop
        println("st="+st)

        startIndex = st.lastIndexOf("(")
      }
      st
    }
  }
}
