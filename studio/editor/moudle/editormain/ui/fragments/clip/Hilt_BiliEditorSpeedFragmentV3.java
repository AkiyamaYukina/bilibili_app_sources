package com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/Hilt_BiliEditorSpeedFragmentV3.class */
public abstract class Hilt_BiliEditorSpeedFragmentV3 extends BiliEditorMainBaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextWrapper f106767b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FragmentComponentManager f106769d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f106768c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f106770e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f106771f = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m9995componentManager() {
        if (this.f106769d == null) {
            synchronized (this.f106770e) {
                if (this.f106769d == null) {
                    this.f106769d = new FragmentComponentManager(this);
                }
            }
        }
        return this.f106769d;
    }

    public final Object generatedComponent() {
        return m9995componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f106768c) {
            return null;
        }
        jf();
        return this.f106767b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void jf() {
        if (this.f106767b == null) {
            this.f106767b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f106768c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f106767b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jf();
        if (this.f106771f) {
            return;
        }
        this.f106771f = true;
        g gVar = (g) generatedComponent();
        gVar.getClass();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        jf();
        if (this.f106771f) {
            return;
        }
        this.f106771f = true;
        g gVar = (g) generatedComponent();
        gVar.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
