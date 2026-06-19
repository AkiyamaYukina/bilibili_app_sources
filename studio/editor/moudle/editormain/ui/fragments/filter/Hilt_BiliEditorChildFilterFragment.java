package com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/Hilt_BiliEditorChildFilterFragment.class */
public abstract class Hilt_BiliEditorChildFilterFragment extends BiliEditorMainBaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextWrapper f106794b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FragmentComponentManager f106796d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f106795c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f106797e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f106798f = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m10012componentManager() {
        if (this.f106796d == null) {
            synchronized (this.f106797e) {
                if (this.f106796d == null) {
                    this.f106796d = new FragmentComponentManager(this);
                }
            }
        }
        return this.f106796d;
    }

    public final Object generatedComponent() {
        return m10012componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f106795c) {
            return null;
        }
        jf();
        return this.f106794b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void jf() {
        if (this.f106794b == null) {
            this.f106794b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f106795c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f106794b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jf();
        if (this.f106798f) {
            return;
        }
        this.f106798f = true;
        j jVar = (j) generatedComponent();
        jVar.getClass();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        jf();
        if (this.f106798f) {
            return;
        }
        this.f106798f = true;
        j jVar = (j) generatedComponent();
        jVar.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
