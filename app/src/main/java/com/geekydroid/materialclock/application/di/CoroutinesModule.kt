package com.geekydroid.materialclock.application.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import javax.inject.Qualifier
import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object CoroutinesModule {
//
//    @Provides
//    @Singleton
//    @ApplicationScope
//    fun provideApplicationScope(): CoroutineScope = CoroutineScope(SupervisorJob())
//
//    @Provides
//    @Singleton
//    @IoDispatcher
//    fun providesExternalDispatcher(): CoroutineDispatcher = Dispatchers.IO
//
//}
//
//@Retention(AnnotationRetention.RUNTIME)
//@Qualifier
//annotation class ApplicationScope {}
//
//@Retention(AnnotationRetention.RUNTIME)
//@Qualifier
//annotation class IoDispatcher {}