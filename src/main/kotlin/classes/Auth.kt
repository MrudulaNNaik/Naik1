package classes

object Auth{
    fun takeCredentials(name: String, password: String){
        println("loggin in with $name and $password ")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        Auth.takeCredentials("naik","2504naik")

    }
}