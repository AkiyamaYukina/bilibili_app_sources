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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/Hilt_BasePegasusFragment.class */
public abstract class Hilt_BasePegasusFragment extends BaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextWrapper f78290b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FragmentComponentManager f78292d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78291c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f78293e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78294f = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8172componentManager() {
        if (this.f78292d == null) {
            synchronized (this.f78293e) {
                if (this.f78292d == null) {
                    this.f78292d = new FragmentComponentManager(this);
                }
            }
        }
        return this.f78292d;
    }

    public final Object generatedComponent() {
        return m8172componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f78291c) {
            return null;
        }
        jf();
        return this.f78290b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void jf() {
        if (this.f78290b == null) {
            this.f78290b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f78291c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    public void kf() {
        if (this.f78294f) {
            return;
        }
        this.f78294f = true;
        ((InterfaceC5713b) generatedComponent()).o((BasePegasusFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f78290b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jf();
        kf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        super.onAttach(context);
        jf();
        kf();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
