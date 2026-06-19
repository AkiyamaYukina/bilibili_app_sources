package com.bilibili.playset.playlist.search2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.lib.ui.BaseFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/Hilt_CollectionSearchFragment.class */
public abstract class Hilt_CollectionSearchFragment extends BaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextWrapper f85430b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FragmentComponentManager f85432d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85431c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f85433e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85434f = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8571componentManager() {
        if (this.f85432d == null) {
            synchronized (this.f85433e) {
                if (this.f85432d == null) {
                    this.f85432d = new FragmentComponentManager(this);
                }
            }
        }
        return this.f85432d;
    }

    public final Object generatedComponent() {
        return m8571componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f85431c) {
            return null;
        }
        jf();
        return this.f85430b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void jf() {
        if (this.f85430b == null) {
            this.f85430b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f85431c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f85430b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jf();
        if (this.f85434f) {
            return;
        }
        this.f85434f = true;
        c cVar = (c) generatedComponent();
        cVar.getClass();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        jf();
        if (this.f85434f) {
            return;
        }
        this.f85434f = true;
        c cVar = (c) generatedComponent();
        cVar.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
