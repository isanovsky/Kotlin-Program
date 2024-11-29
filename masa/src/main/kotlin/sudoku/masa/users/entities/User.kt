package sudoku.masa.users.entities

import jakarta.annotation.Nullable
import jakarta.persistence.*

@Entity
@Table(name = "users")
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false)
    var email: String,
    @Nullable
    var name : String?,
    @Suppress("unused")
    var age: Int?
)