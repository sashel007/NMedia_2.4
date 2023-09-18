package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.nmedia.dto.Post

class PostRepositoryInMemoryImpl : PostRepository {

    private var posts = listOf(
        Post(
            id = 10,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        ),
        Post(
            id = 9,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
    ),
        Post(
            id = 8,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        ),
        Post(
            id = 7,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        ),
        Post(
            id = 6,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        ),
        Post(
            id = 5,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        ),
        Post(
            id = 4,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        ),
        Post(
            id = 3,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен – http://netolo.gy/fyb",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        ),
        Post(
            id = 2,
            author = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        ),
        Post(
            id = 1,
            author = "Нетология: Университет интернет-профессий будущего",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен – http://netolo.gy/fyb",
            published = "21 мая в 18:36",
            likedByMe = false,
            likes = 10,
            sharings = 5
        )
    )

    val data = MutableLiveData(posts)
    override fun get(): LiveData<List<Post>> = data
    override fun like(id: Long) {
        posts = posts.map {
            if (it.id != id) it else it.copy(likedByMe = !it.likedByMe)
        }
        data.value = posts
    }

    override fun share(id: Long) {
        posts = posts.map { post ->
            if (post.id == id) {
                post.copy(sharings = post.sharings + 1)
            } else {
                post
            }
        }
        data.value = posts
    }
}