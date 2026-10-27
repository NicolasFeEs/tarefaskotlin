fun main(){
    var n = readLine()?.toIntOrNull()
    if(n == null || n <= 0){}
    else{
        while (n >= 1){
            print("$n")
            n--
        }
    }
}