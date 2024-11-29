package sudoku.masa.users.services

import org.springframework.stereotype.Service
import sudoku.masa.users.entities.User
import sudoku.masa.users.repositories.UserRepository

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun create(user: User): User {
        return userRepository.save(user)
    }

    fun findAll(): List<User> {
        return userRepository.findAll()
    }
    fun update(id: Long, user: User): User {
        val existingUser = userRepository.findById(id)
            .orElseThrow { RuntimeException("User dengan ID $id tidak ditemukan") }
        existingUser.name = user.name
        existingUser.email = user.email
        return userRepository.save(existingUser)
    }
    fun delete(id: Long) {
        userRepository.deleteById(id)
    }
}

