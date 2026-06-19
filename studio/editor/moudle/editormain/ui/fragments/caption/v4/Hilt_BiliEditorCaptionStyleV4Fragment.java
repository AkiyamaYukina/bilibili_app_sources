package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/Hilt_BiliEditorCaptionStyleV4Fragment.class */
public abstract class Hilt_BiliEditorCaptionStyleV4Fragment extends BiliEditorCaptionBaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContextWrapper f106583c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile FragmentComponentManager f106585e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106584d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f106586f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f106587g = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m9980componentManager() {
        if (this.f106585e == null) {
            synchronized (this.f106586f) {
                if (this.f106585e == null) {
                    this.f106585e = new FragmentComponentManager(this);
                }
            }
        }
        return this.f106585e;
    }

    public final Object generatedComponent() {
        return m9980componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f106584d) {
            return null;
        }
        qf();
        return this.f106583c;
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
        ContextWrapper contextWrapper = this.f106583c;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        qf();
        if (this.f106587g) {
            return;
        }
        this.f106587g = true;
        O o7 = (O) generatedComponent();
        o7.getClass();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        qf();
        if (this.f106587g) {
            return;
        }
        this.f106587g = true;
        O o7 = (O) generatedComponent();
        o7.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void qf() {
        if (this.f106583c == null) {
            this.f106583c = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f106584d = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }
}
