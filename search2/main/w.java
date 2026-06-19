package com.bilibili.search2.main;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/w.class */
public abstract class w extends BaseAppCompatActivity implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SavedStateHandleHolder f86936B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile ActivityComponentManager f86937C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f86938D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f86939E = false;

    public w() {
        addOnContextAvailableListener(new v(this));
    }

    /* JADX INFO: renamed from: P6, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f86937C == null) {
            synchronized (this.f86938D) {
                if (this.f86937C == null) {
                    this.f86937C = new ActivityComponentManager(this);
                }
            }
        }
        return this.f86937C;
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    @CallSuper
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
        this.f86936B = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.f86936B.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f86936B;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
