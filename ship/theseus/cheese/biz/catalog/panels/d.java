package com.bilibili.ship.theseus.cheese.biz.catalog.panels;

import GP.F;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import fu0.C7187i;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/d.class */
@StabilityInferred(parameters = 0)
public final class d extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<C7187i> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<com.bilibili.ship.theseus.cheese.biz.catalog.c> f89201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<com.bilibili.ship.theseus.cheese.biz.catalog.a> f89202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f89203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f89204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final F f89205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f89206q;

    public d(@NotNull StateFlow stateFlow, @NotNull MutableSharedFlow mutableSharedFlow, @NotNull StateFlow stateFlow2, @NotNull StateFlow stateFlow3, @NotNull F f7) {
        this.f89201l = stateFlow;
        this.f89202m = mutableSharedFlow;
        this.f89203n = stateFlow2;
        this.f89204o = stateFlow3;
        this.f89205p = f7;
        l(0.0f);
        this.f89206q = true;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C7187i.inflate(layoutInflater, viewGroup, false);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return this.f89206q;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull fu0.C7187i r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.panels.d.d(fu0.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
