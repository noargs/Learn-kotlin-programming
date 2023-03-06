fun main(args: Array<String>) {
  val user = User("Ibn", "Asgh", 22)
  val friend = User("Alpha", "Beta", 50)

  println("Name ${friend.name}")
}

class User(name: String, var lastName: String, var age: Int) {

  var name: String

  init {
    if (name.lowercase().startsWith("a")) {
      this.name = name
    } else {
      this.name = "User"
      println("The name does't start with the letter 'a' or 'A'")
    }
  }
}

