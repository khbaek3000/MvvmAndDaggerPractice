package com.example.brianbaek.practicemvvm;

import com.example.brianbaek.practicemvvm.di.component.AppComponent;
import com.example.brianbaek.practicemvvm.di.component.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {

        return DaggerAppComponent.builder().application(this).build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }


}
