package com.bilibili.search2.result;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/Hilt_BiliMainSearchResultFragment.class */
public abstract class Hilt_BiliMainSearchResultFragment extends BaseMainSearchChildFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContextWrapper f87114c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile FragmentComponentManager f87116e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f87115d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f87117f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87118g = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8715componentManager() {
        if (this.f87116e == null) {
            synchronized (this.f87117f) {
                if (this.f87116e == null) {
                    this.f87116e = new FragmentComponentManager(this);
                }
            }
        }
        return this.f87116e;
    }

    public final Object generatedComponent() {
        return m8715componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f87115d) {
            return null;
        }
        mf();
        return this.f87114c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void mf() {
        if (this.f87114c == null) {
            this.f87114c = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f87115d = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f87114c;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mf();
        if (this.f87118g) {
            return;
        }
        this.f87118g = true;
        ((i) generatedComponent()).r((BiliMainSearchResultFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        super.onAttach(context);
        mf();
        if (this.f87118g) {
            return;
        }
        this.f87118g = true;
        ((i) generatedComponent()).r((BiliMainSearchResultFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
