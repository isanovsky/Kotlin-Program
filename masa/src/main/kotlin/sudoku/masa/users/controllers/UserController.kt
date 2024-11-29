package sudoku.masa.users.controllers

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import sudoku.masa.users.entities.User
import sudoku.masa.users.services.UserService

@RestController
class UserController(
    var userService: UserService
) {

    @PostMapping("/users")
    fun createUser(@RequestBody user: User): String{
        userService.create(user)
        return "User berhasil dibuat"
    }

    @GetMapping("/users")
    fun getUsers() : List<User>{
        return userService.findAll()
    }

    @PutMapping("/users/{id}")
    fun updateUser(@PathVariable id : Long, @RequestBody user: User): String{
        userService.update(id, user)
        return "User berhasil dibuat"
    }

    @DeleteMapping("/users/{id}")
    fun deleteUser(@PathVariable id : Long): String{
        userService.delete(id)
        return "User berhasil dihapus"
    }
}
