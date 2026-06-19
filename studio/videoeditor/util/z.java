package com.bilibili.studio.videoeditor.util;

import android.view.View;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/z.class */
public final class z implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6651y f110260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpperLiveWindowExt f110261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f110263d;

    public z(C6651y c6651y, UpperLiveWindowExt upperLiveWindowExt, int i7, int i8) {
        this.f110260a = c6651y;
        this.f110261b = upperLiveWindowExt;
        this.f110262c = i7;
        this.f110263d = i8;
    }

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
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view.getWindowToken() != null) {
            try {
                this.f110260a.showAsDropDown(this.f110261b, this.f110262c, this.f110263d);
            } catch (Exception e7) {
                BLog.efmt("EditorGuideUtil", "showCaptionGuideDialog...onViewAttachedToWindow...e = %s", new Object[]{e7.fillInStackTrace()});
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
