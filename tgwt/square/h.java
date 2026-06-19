package com.bilibili.tgwt.square;

import HD0.C2052e;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f112132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f112133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f112134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f112135d;

    public h(@NotNull Context context, @NotNull String str, @Nullable String str2) {
        this.f112132a = context;
        this.f112133b = str;
        this.f112134c = str2;
    }

    public final C2052e a() {
        C2052e c2052e = new C2052e(0);
        c2052e.f8279a = this.f112133b;
        c2052e.f8280b = this.f112135d;
        c2052e.f8281c = this.f112134c;
        return c2052e;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0365  */
    /* JADX WARN: Type inference failed for: r0v462, types: [com.bilibili.tgwt.square.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v558, types: [com.bilibili.tgwt.square.c, java.lang.Object] */
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
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bilibili.app.gemini.ui.UIComponent<?>> b(@org.jetbrains.annotations.NotNull java.util.List<com.bilibili.tgwt.square.RecommendModule> r14) {
        /*
            Method dump skipped, instruction units count: 3460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.square.h.b(java.util.List):java.util.List");
    }
}
