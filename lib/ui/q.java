package com.bilibili.lib.ui;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/q.class */
public abstract class q extends com.bilibili.lib.spy.generated.a implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SavedStateHandleHolder f64913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile ActivityComponentManager f64914y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f64915z = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f64912A = false;

    public q() {
        addOnContextAvailableListener(new C5355p(this));
    }

    /* JADX INFO: renamed from: P6, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f64914y == null) {
            synchronized (this.f64915z) {
                if (this.f64914y == null) {
                    this.f64914y = new ActivityComponentManager(this);
                }
            }
        }
        return this.f64914y;
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
        this.f64913x = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.f64913x.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f64913x;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
