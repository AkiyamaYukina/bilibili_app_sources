package com.bilibili.lib.ui;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/u.class */
public abstract class u extends BaseAppCompatActivity implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SavedStateHandleHolder f64938B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile ActivityComponentManager f64939C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f64940D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f64941E = false;

    public u() {
        addOnContextAvailableListener(new t(this));
    }

    /* JADX INFO: renamed from: P6, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f64939C == null) {
            synchronized (this.f64940D) {
                if (this.f64939C == null) {
                    this.f64939C = new ActivityComponentManager(this);
                }
            }
        }
        return this.f64939C;
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
        this.f64938B = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.f64938B.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f64938B;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
