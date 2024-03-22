package com.infinityy.taskworkmanager.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.infinityy.taskworkmanager.db.WorkListDao
import com.infinityy.taskworkmanager.repository.WorkRepoImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WishListModule {




    @Provides
    @Singleton
    fun provideWishListRepository(
        wishListDao: WorkListDao
    ): WorkListRepository = WorkRepoImpl(wishListDao)

}
