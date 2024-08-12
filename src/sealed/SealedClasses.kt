package sealed

import java.lang.Exception


sealed class Results
data class Success(val data: String) : Results()
data class Error(val error: String) : Results()
data class Loading(val loading: String) : Results()

fun getData(results: Results) {
    when (results) {
        is Error -> println(results.error)
        is Loading -> println(results.loading)
        is Success -> println(results.data)
    }
}

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val exception: Exception):Result<Nothing>()
    object InProgress:Result<Nothing>()
 }
sealed class Response<T>(){
    data class Success<T> (val data: T) : Response<T>()
    data class Error(val exception: Exception):Response<Nothing>()
    object InProgress:Response<Nothing>()
}
fun main() {
    val results = Success("Data load success!!")
    getData(results)
}