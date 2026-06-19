package com.bilibili.opd.app.bizcommon.hybridruntime.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bilibili.ad.adview.videodetail.merchandise.v;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tm0.C8671b;
import tm0.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/api/ForResultFragment.class */
public final class ForResultFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PublishSubject<C8671b> f73564b = PublishSubject.create();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PublishSubject<i> f73565c = PublishSubject.create();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Boolean> f73566d = io.reactivex.rxjava3.subjects.a.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public v f73567e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/api/ForResultFragment$a.class */
    public static final class a<T> implements Predicate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f73568a = (a<T>) new Object();

        public final boolean test(Object obj) {
            return ((Boolean) obj).booleanValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/api/ForResultFragment$b.class */
    public static final class b<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ForResultFragment f73569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Intent f73570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f73572d;

        public b(ForResultFragment forResultFragment, Intent intent, int i7, Bundle bundle) {
            this.f73569a = forResultFragment;
            this.f73570b = intent;
            this.f73571c = i7;
            this.f73572d = bundle;
        }

        public final void accept(Object obj) {
            Intent intent = this.f73570b;
            Bundle bundle = this.f73572d;
            ForResultFragment forResultFragment = this.f73569a;
            int i7 = this.f73571c;
            ForResultFragment.super.startActivityForResult(intent, i7, bundle);
            v vVar = forResultFragment.f73567e;
            if (vVar != null) {
                vVar.invoke(this.f73570b, Integer.valueOf(i7), this.f73572d);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/api/ForResultFragment$c.class */
    public static final class c<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f73573a = (c<T>) new Object();

        public final void accept(Object obj) {
            ((Throwable) obj).printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        this.f73564b.onNext(new C8671b(i7, i8, intent));
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.f73566d.onNext(Boolean.TRUE);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f73566d.onNext(Boolean.FALSE);
        this.f73566d.onComplete();
        if (this.f73564b.hasObservers()) {
            this.f73564b.onError(new IllegalStateException("listener result, but host has finished"));
        } else {
            this.f73564b.onComplete();
        }
        this.f73565c.onComplete();
        this.f73567e = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        this.f73565c.onNext(new i(i7, ArraysKt.sum(iArr) == 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void startActivityForResult(@NotNull Intent intent, int i7, @Nullable Bundle bundle) {
        if (!Intrinsics.areEqual(this.f73566d.e(), Boolean.TRUE)) {
            this.f73566d.takeUntil(a.f73568a).subscribe(new b(this, intent, i7, bundle), c.f73573a);
            return;
        }
        super.startActivityForResult(intent, i7, bundle);
        v vVar = this.f73567e;
        if (vVar != null) {
            vVar.invoke(intent, Integer.valueOf(i7), bundle);
        }
    }
}
