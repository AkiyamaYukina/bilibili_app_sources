package com.bilibili.pegasus.components.interest.ui.v31.page;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/Hilt_InterestChooseV31Dialog.class */
public abstract class Hilt_InterestChooseV31Dialog extends BaseInterestChooseDialog implements GeneratedComponentManagerHolder {
    public ContextWrapper h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile FragmentComponentManager f76596j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f76595i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f76597k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f76598l = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8049componentManager() {
        if (this.f76596j == null) {
            synchronized (this.f76597k) {
                if (this.f76596j == null) {
                    this.f76596j = new FragmentComponentManager(this);
                }
            }
        }
        return this.f76596j;
    }

    public final Object generatedComponent() {
        return m8049componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f76595i) {
            return null;
        }
        jf();
        return this.h;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void jf() {
        if (this.h == null) {
            this.h = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f76595i = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.h;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jf();
        if (this.f76598l) {
            return;
        }
        this.f76598l = true;
        b bVar = (b) generatedComponent();
        bVar.getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        jf();
        if (this.f76598l) {
            return;
        }
        this.f76598l = true;
        b bVar = (b) generatedComponent();
        bVar.getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
