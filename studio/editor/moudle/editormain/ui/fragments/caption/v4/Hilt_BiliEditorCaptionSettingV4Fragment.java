package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/Hilt_BiliEditorCaptionSettingV4Fragment.class */
public abstract class Hilt_BiliEditorCaptionSettingV4Fragment extends BiliEditorMainBaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextWrapper f106578b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FragmentComponentManager f106580d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f106579c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f106581e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f106582f = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m9979componentManager() {
        if (this.f106580d == null) {
            synchronized (this.f106581e) {
                if (this.f106580d == null) {
                    this.f106580d = new FragmentComponentManager(this);
                }
            }
        }
        return this.f106580d;
    }

    public final Object generatedComponent() {
        return m9979componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f106579c) {
            return null;
        }
        jf();
        return this.f106578b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void jf() {
        if (this.f106578b == null) {
            this.f106578b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f106579c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f106578b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jf();
        if (this.f106582f) {
            return;
        }
        this.f106582f = true;
        F f7 = (F) generatedComponent();
        f7.getClass();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        jf();
        if (this.f106582f) {
            return;
        }
        this.f106582f = true;
        F f7 = (F) generatedComponent();
        f7.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
