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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/Hilt_BiliEditorCaptionFontV4Fragment.class */
public abstract class Hilt_BiliEditorCaptionFontV4Fragment extends BiliEditorCaptionBaseFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContextWrapper f106573c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile FragmentComponentManager f106575e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106574d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f106576f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f106577g = false;

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m9978componentManager() {
        if (this.f106575e == null) {
            synchronized (this.f106576f) {
                if (this.f106575e == null) {
                    this.f106575e = new FragmentComponentManager(this);
                }
            }
        }
        return this.f106575e;
    }

    public final Object generatedComponent() {
        return m9978componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f106574d) {
            return null;
        }
        qf();
        return this.f106573c;
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
        ContextWrapper contextWrapper = this.f106573c;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        qf();
        if (this.f106577g) {
            return;
        }
        this.f106577g = true;
        InterfaceC6544v interfaceC6544v = (InterfaceC6544v) generatedComponent();
        interfaceC6544v.getClass();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onAttach(Context context) {
        super.onAttach(context);
        qf();
        if (this.f106577g) {
            return;
        }
        this.f106577g = true;
        InterfaceC6544v interfaceC6544v = (InterfaceC6544v) generatedComponent();
        interfaceC6544v.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void qf() {
        if (this.f106573c == null) {
            this.f106573c = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f106574d = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }
}
