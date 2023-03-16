fun main(){
    numbers()

    myNames(arrayOf("joel","Victor","Elizabeth","Grace","Shadrack","David"))

    drinks(56)
    drinks(5)
    drinks(15)

    multiples()

}
fun numbers(){
    var numb = 1..100
    for (n in numb){
        if (n%2 == 1){
            println(n)
        }
    }

}
fun myNames (name:Array<String>){
    for (n in name){
        if (n.length >5  ){
            println(n)
        }
    }

}
fun drinks(age:Int){
    if (age <= 6){
        println("A glass of milk")
    }
    else if(age in 7..15){
        println("a bottle of Fanta orange")
    }
    else{
        println("a bottle of coca cola")
    }



}
fun multiples(){
    var multiple = 1..100
    for (m in multiple){
        if (m%3 ==0 && m%3 ==0){
            println("FizzBuzz")
        }
        else if (m%3 ==0 ){
            println("Fizz")
        }
        else if(m%5 ==0){
                println("Buzz")
            }


        }



}



