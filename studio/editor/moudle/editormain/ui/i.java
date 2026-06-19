package com.bilibili.studio.editor.moudle.editormain.ui;

import Yv0.c;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/i.class */
public abstract class i<VM extends Yv0.c, D extends ViewBinding> extends Yv0.b<VM, D> implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SavedStateHandleHolder f107063E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile ActivityComponentManager f107064F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Object f107065G = new Object();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f107066H = false;

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        addOnContextAvailableListener(new h(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V6, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f107064F == null) {
            synchronized (this.f107065G) {
                if (this.f107064F == null) {
                    this.f107064F = new ActivityComponentManager(this);
                }
            }
        }
        return this.f107064F;
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
        this.f107063E = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.f107063E.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f107063E;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
