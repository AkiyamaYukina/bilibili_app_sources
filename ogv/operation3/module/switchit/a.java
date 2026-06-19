package com.bilibili.ogv.operation3.module.switchit;

import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/switchit/a.class */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f71424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreateSwitchableModel$invoke$1 f71425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f71427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef f71428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Toaster f71429f;

    public /* synthetic */ a(g gVar, CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1, KomponentScope komponentScope, b bVar, Ref.ObjectRef objectRef, Toaster toaster) {
        this.f71424a = gVar;
        this.f71425b = createSwitchableModel$invoke$1;
        this.f71426c = komponentScope;
        this.f71427d = bVar;
        this.f71428e = objectRef;
        this.f71429f = toaster;
    }

    public final Object invoke() {
        g gVar = this.f71424a;
        if (gVar != null) {
            Boolean bool = Boolean.TRUE;
            CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1 = this.f71425b;
            createSwitchableModel$invoke$1.f71423e.setValue(bool);
            int size = createSwitchableModel$invoke$1.f71421c.size();
            int size2 = gVar.getSize();
            Ref.ObjectRef objectRef = this.f71428e;
            KomponentScope komponentScope = this.f71426c;
            if (size <= size2) {
                KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CreateSwitchableModel$invoke$1$switchIt$1$1(this.f71427d, gVar, createSwitchableModel$invoke$1, objectRef, this.f71429f, null), 3, (Object) null);
            } else {
                KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CreateSwitchableModel$invoke$1$switchIt$1$2(createSwitchableModel$invoke$1, objectRef, null), 3, (Object) null);
                createSwitchableModel$invoke$1.f71423e.setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}
