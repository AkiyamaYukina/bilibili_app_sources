package com.bilibili.pegasus.components.interest.ui.v32.page;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/Hilt_InterestChooseV32Dialog.class */
public abstract class Hilt_InterestChooseV32Dialog extends BottomSheetDialogFragment implements GeneratedComponentManagerHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextWrapper f76653b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FragmentComponentManager f76655d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f76654c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f76656e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76657f = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager m8055componentManager() {
        if (this.f76655d == null) {
            synchronized (this.f76656e) {
                if (this.f76655d == null) {
                    this.f76655d = new FragmentComponentManager(this);
                }
            }
        }
        return this.f76655d;
    }

    public final Object generatedComponent() {
        return m8055componentManager().generatedComponent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.f76654c) {
            return null;
        }
        hf();
        return this.f76653b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hf() {
        if (this.f76653b == null) {
            this.f76653b = FragmentComponentManager.createContextWrapper(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.f76654c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    @MainThread
    public final void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.f76653b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        hf();
        if (this.f76657f) {
            return;
        }
        this.f76657f = true;
        e eVar = (e) generatedComponent();
        eVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public final void onAttach(Context context) {
        super/*androidx.fragment.app.DialogFragment*/.onAttach(context);
        hf();
        if (this.f76657f) {
            return;
        }
        this.f76657f = true;
        e eVar = (e) generatedComponent();
        eVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.DialogFragment*/.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }
}
