package com.bilibili.pegasus.page;

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
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/Hilt_TimeMachinePegasusFragment.class */
public abstract class Hilt_TimeMachinePegasusFragment extends BaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextWrapper f78295b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FragmentComponentManager f78297d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78296c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f78298e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78299f = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8173componentManager() {
        if (this.f78297d == null) {
            synchronized (this.f78298e) {
                if (this.f78297d == null) {
                    this.f78297d = new FragmentComponentManager(this);
                }
            }
        }
        return this.f78297d;
    }

    public final Object generatedComponent() {
        return m8173componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f78296c) {
            return null;
        }
        jf();
        return this.f78295b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void jf() {
        if (this.f78295b == null) {
            this.f78295b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f78296c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f78295b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jf();
        if (this.f78299f) {
            return;
        }
        this.f78299f = true;
        ((K) generatedComponent()).f((TimeMachinePegasusFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        jf();
        if (this.f78299f) {
            return;
        }
        this.f78299f = true;
        ((K) generatedComponent()).f((TimeMachinePegasusFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
