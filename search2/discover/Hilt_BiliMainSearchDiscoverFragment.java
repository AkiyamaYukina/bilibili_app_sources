package com.bilibili.search2.discover;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.search2.main.BaseMainSearchChildFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/Hilt_BiliMainSearchDiscoverFragment.class */
public abstract class Hilt_BiliMainSearchDiscoverFragment extends BaseMainSearchChildFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContextWrapper f86421c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile FragmentComponentManager f86423e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86422d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f86424f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86425g = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8665componentManager() {
        if (this.f86423e == null) {
            synchronized (this.f86424f) {
                if (this.f86423e == null) {
                    this.f86423e = new FragmentComponentManager(this);
                }
            }
        }
        return this.f86423e;
    }

    public final Object generatedComponent() {
        return m8665componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f86422d) {
            return null;
        }
        mf();
        return this.f86421c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void mf() {
        if (this.f86421c == null) {
            this.f86421c = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f86422d = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f86421c;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mf();
        if (this.f86425g) {
            return;
        }
        this.f86425g = true;
        ((g) generatedComponent()).k((BiliMainSearchDiscoverFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        mf();
        if (this.f86425g) {
            return;
        }
        this.f86425g = true;
        ((g) generatedComponent()).k((BiliMainSearchDiscoverFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
