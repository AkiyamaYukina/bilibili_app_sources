package com.bilibili.ogv.story;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/i.class */
public final class i implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Job f73089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2<CoroutineScope, Continuation<? super Unit>, Object> f73090b;

    public i(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f73090b = function2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        this.f73089a = (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) ? null : BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, this.f73090b, 3, (Object) null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Job job = this.f73089a;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
