package com.bilibili.ship.theseus.united.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/m.class */
public final class m implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle.State f104866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.BooleanRef f104867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lifecycle f104868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CancellableContinuationImpl f104869d;

    public m(Lifecycle.State state, Ref.BooleanRef booleanRef, Lifecycle lifecycle, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f104866a = state;
        this.f104867b = booleanRef;
        this.f104868c = lifecycle;
        this.f104869d = cancellableContinuationImpl;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event.getTargetState() != this.f104866a) {
            return;
        }
        Ref.BooleanRef booleanRef = this.f104867b;
        if (booleanRef.element) {
            booleanRef.element = false;
            return;
        }
        this.f104868c.removeObserver(this);
        Result.Companion companion = Result.Companion;
        this.f104869d.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}
