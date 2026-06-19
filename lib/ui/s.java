package com.bilibili.lib.ui;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/s.class */
public abstract class s extends AbstractActivityC5342c implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SavedStateHandleHolder f64917B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile ActivityComponentManager f64918C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f64919D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f64920E = false;

    public s() {
        addOnContextAvailableListener(new r(this));
    }

    /* JADX INFO: renamed from: X6, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f64918C == null) {
            synchronized (this.f64919D) {
                if (this.f64918C == null) {
                    this.f64918C = new ActivityComponentManager(this);
                }
            }
        }
        return this.f64918C;
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // com.bilibili.lib.ui.AbstractActivityC5342c, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    @CallSuper
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
        this.f64917B = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.f64917B.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    @Override // com.bilibili.lib.ui.AbstractActivityC5342c, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f64917B;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
