package sudoku.masa.users.repositories

import org.springframework.data.jpa.repository.JpaRepository
import sudoku.masa.users.entities.User

interface UserRepository : JpaRepository<User, Long> {
}