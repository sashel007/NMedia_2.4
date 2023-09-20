package ru.netology.nmedia.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import ru.netology.nmedia.databinding.ActivityMainBinding
import ru.netology.nmedia.recyclerview.PostAdapter
import ru.netology.nmedia.viewmodel.PostViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel by viewModels<PostViewModel>()
        val adapter = PostAdapter(
            onLikeListener = { post ->
                viewModel.like(post.id)
            },
            onShareListener = { post ->
                viewModel.share(post.id)
            }
        )
        binding.postList?.layoutManager = LinearLayoutManager(this)
        binding.postList?.adapter = adapter
        viewModel.data.observe(this) { posts ->
            adapter.submitList(posts)
        }
    }

}