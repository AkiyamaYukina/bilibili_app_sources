package com.bilibili.pegasus.hot.tab;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.pegasus.hot.base.BaseHotFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/Hilt_IndexHotFragment.class */
public abstract class Hilt_IndexHotFragment extends BaseHotFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ContextWrapper f78155O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public volatile FragmentComponentManager f78157Q;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f78156P = false;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Object f78158R = new Object();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f78159S = false;

    public final void Pf() {
        if (this.f78155O == null) {
            this.f78155O = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f78156P = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8132componentManager() {
        if (this.f78157Q == null) {
            synchronized (this.f78158R) {
                if (this.f78157Q == null) {
                    this.f78157Q = new FragmentComponentManager(this);
                }
            }
        }
        return this.f78157Q;
    }

    public final Object generatedComponent() {
        return m8132componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f78156P) {
            return null;
        }
        Pf();
        return this.f78155O;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f78155O;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Pf();
        if (this.f78159S) {
            return;
        }
        this.f78159S = true;
        ((f) generatedComponent()).e((IndexHotFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        Pf();
        if (this.f78159S) {
            return;
        }
        this.f78159S = true;
        ((f) generatedComponent()).e((IndexHotFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
