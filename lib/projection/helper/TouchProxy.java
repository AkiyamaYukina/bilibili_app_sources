package com.bilibili.lib.projection.helper;

import Le0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/helper/TouchProxy.class */
public final class TouchProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f62998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TouchState f63003f = TouchState.STATE_STOP;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/helper/TouchProxy$TouchState.class */
    public enum TouchState {
        STATE_MOVE,
        STATE_STOP
    }

    public TouchProxy(j jVar) {
        this.f62998a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.MotionEvent r7, android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.helper.TouchProxy.a(android.view.MotionEvent, android.view.View):void");
    }
}
