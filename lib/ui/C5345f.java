package com.bilibili.lib.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.gripper.GripperExecute;
import com.bilibili.lib.performance.EntryAwait;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bilibili.lib.ui.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/f.class */
public final class C5345f extends FragmentManager.FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f64840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntryAwait f64841b;

    public C5345f(Class<?> cls, EntryAwait entryAwait) {
        this.f64840a = cls;
        this.f64841b = entryAwait;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        if (Intrinsics.areEqual(fragment.getClass(), this.f64840a)) {
            GripperExecute.Companion.of().await(ArraysKt.toList(this.f64841b.create()));
        }
    }
}
