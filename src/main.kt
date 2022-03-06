fun main(){
 cars(arrayOf("BMW","Toyota","Ford motor"))
 capitalize(arrayOf())
 numbers(arrayOf(2, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62))
 friends(arrayOf("Akuot","Philip","Akuok"))


}
fun cars (brands:Array<String>){
 println(brands.contentToString())
}

 fun capitalize (city:Array<String>) {
  var cities = arrayOf("harare","mumbai","dodoma","jakarta")
  cities.forEach { city ->
   println(city.capitalize())
  }

 }
fun numbers(numbers:Array<Int>) {
 var add = numbers[1].plus(numbers[4])
 println(add)
 var index = numbers.indexOf(158)
 println(index)
 var sortArray = numbers
 sortArray.sort()
 println(sortArray.contentToString())

}
fun friends(name:Array<String>):Array<String> {
 var names =name
 println(name.contentToString())
 return names


}