package com.bilibili.playset.playlist.search2;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/m.class */
public abstract class m extends BaseAppCompatActivity implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SavedStateHandleHolder f85465B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile ActivityComponentManager f85466C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f85467D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f85468E = false;

    public m() {
        addOnContextAvailableListener(new l(this));
    }

    /* JADX INFO: renamed from: P6, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f85466C == null) {
            synchronized (this.f85467D) {
                if (this.f85466C == null) {
                    this.f85466C = new ActivityComponentManager(this);
                }
            }
        }
        return this.f85466C;
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
        this.f85465B = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.f85465B.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f85465B;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
