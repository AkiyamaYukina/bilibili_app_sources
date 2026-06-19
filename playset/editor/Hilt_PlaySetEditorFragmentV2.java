package com.bilibili.playset.editor;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/Hilt_PlaySetEditorFragmentV2.class */
public abstract class Hilt_PlaySetEditorFragmentV2 extends BaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextWrapper f84741b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FragmentComponentManager f84743d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84742c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f84744e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84745f = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8531componentManager() {
        if (this.f84743d == null) {
            synchronized (this.f84744e) {
                if (this.f84743d == null) {
                    this.f84743d = new FragmentComponentManager(this);
                }
            }
        }
        return this.f84743d;
    }

    public final Object generatedComponent() {
        return m8531componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f84742c) {
            return null;
        }
        jf();
        return this.f84741b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void jf() {
        if (this.f84741b == null) {
            this.f84741b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f84742c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f84741b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jf();
        if (this.f84745f) {
            return;
        }
        this.f84745f = true;
        InterfaceC5945l interfaceC5945l = (InterfaceC5945l) generatedComponent();
        interfaceC5945l.getClass();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        jf();
        if (this.f84745f) {
            return;
        }
        this.f84745f = true;
        InterfaceC5945l interfaceC5945l = (InterfaceC5945l) generatedComponent();
        interfaceC5945l.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
