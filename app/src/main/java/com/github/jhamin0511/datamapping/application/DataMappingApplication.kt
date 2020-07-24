package com.github.jhamin0511.datamapping.application

import android.app.Application
import com.github.jhamin0511.datamapping.BuildConfig
import com.github.jhamin0511.datamapping.di.appModule
import com.github.jhamin0511.datamapping.di.repositoryModule
import com.github.jhamin0511.datamapping.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import timber.log.Timber

class DataMappingApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initTimber()
        initKoin()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initKoin() {
        val modules: List<Module> = listOf(
            appModule,
            viewModelModule,
            repositoryModule
        )
        startKoin {
            androidLogger()
            androidContext(this@DataMappingApplication)
            androidFileProperties()
            modules(modules)
        }
    }
}
