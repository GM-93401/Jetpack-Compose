package com.263-MC1000.android.jetreddit.data.repository

import androidx.lifecycle.LiveData
import com.263-MC1000.android.jetreddit.domain.model.PostModel

interface Repository {

  fun getAllPosts(): LiveData<List<PostModel>>

  fun getAllOwnedPosts(): LiveData<List<PostModel>>

  fun insert(post: PostModel)

  fun deleteAll()
}