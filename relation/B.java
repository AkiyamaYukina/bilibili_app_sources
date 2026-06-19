package com.bilibili.relation;

import android.content.Context;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/B.class */
public final /* synthetic */ class B implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.BooleanRef f85877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f85878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6033z f85880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef f85881e;

    public /* synthetic */ B(Ref.BooleanRef booleanRef, Context context, long j7, C6033z c6033z, Ref.ObjectRef objectRef) {
        this.f85877a = booleanRef;
        this.f85878b = context;
        this.f85879c = j7;
        this.f85880d = c6033z;
        this.f85881e = objectRef;
    }

    public final Object invoke() {
        ScreenAdjustPopupDialog screenAdjustPopupDialog;
        Context context = this.f85878b;
        this.f85877a.element = true;
        C6033z c6033z = this.f85880d;
        FollowMenuContentKt.f(context, this.f85879c, c6033z.f86243b, c6033z.f86244c);
        Object obj = this.f85881e.element;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            screenAdjustPopupDialog = null;
        } else {
            screenAdjustPopupDialog = (ScreenAdjustPopupDialog) obj;
        }
        screenAdjustPopupDialog.dismiss();
        return Unit.INSTANCE;
    }
}
