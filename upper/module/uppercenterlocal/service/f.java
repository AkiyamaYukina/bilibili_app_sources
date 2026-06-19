package com.bilibili.upper.module.uppercenterlocal.service;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/f.class */
public final class f implements Function1<String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<String> f114295a;

    public f(Ref.ObjectRef<String> objectRef) {
        this.f114295a = objectRef;
    }

    public final Object invoke(Object obj) {
        this.f114295a.element = (String) obj;
        return Unit.INSTANCE;
    }
}
