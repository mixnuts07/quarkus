import java.util.Date

data class Todo(
    val id: Id,
    val title: Title,
    val completed: Boolean,
    val description: String,
    val dueDate: Date,
)

class Id(val id: Int) {
    init {
        require(id > 0) {"Id Must be Greeter than 0"}
    }
}

class Title(val title: String) {
}