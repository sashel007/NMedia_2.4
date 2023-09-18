package ru.netology.nmedia.recyclerview

import androidx.recyclerview.widget.RecyclerView
import ru.netology.nmedia.R
import ru.netology.nmedia.activity.formatAmount
import ru.netology.nmedia.databinding.PostCardBinding
import ru.netology.nmedia.dto.Post

class PostViewHolder(
    private val binding: PostCardBinding,
    private val onLikeListener: OnLikeListener,
    private val onShareListener: OnShareListener
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(post: Post) {
        binding.apply {
            author.text = post.author
            published.text = post.published
            content.text = post.content
            likeIcon.setImageResource(
                if (post.likedByMe) R.drawable.liked_icon else R.drawable.like_icon
            )
            likeIcon.setOnClickListener {
                onLikeListener(post)
            }
            likeNumber.text = formatAmount(post.likes)
            sharingsNumber.text = formatAmount(post.sharings)

        }
    }
}