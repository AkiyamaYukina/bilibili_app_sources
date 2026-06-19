package com.bilibili.pegasus.holders.oversea;

import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekWidgetV3;
import kntr.common.share.common.handler.sina.SinaShareActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tq0.C8681d;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.oversea.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/g.class */
public final /* synthetic */ class RunnableC5682g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78022b;

    public /* synthetic */ RunnableC5682g(Object obj, int i7) {
        this.f78021a = i7;
        this.f78022b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78021a) {
            case 0:
                C5683h c5683h = (C5683h) this.f78022b;
                InlineGestureSeekWidgetV3 inlineGestureSeekWidgetV3 = null;
                InlineAlphaAnim.startHideAnim$default(c5683h.f78036u, false, (Function0) null, 3, (Object) null);
                InlineAlphaAnim.startHideAnim$default(c5683h.f78037v, false, (Function0) null, 3, (Object) null);
                InlineGestureSeekWidgetV3 inlineGestureSeekWidgetV32 = c5683h.f78030o;
                if (inlineGestureSeekWidgetV32 != null) {
                    inlineGestureSeekWidgetV3 = inlineGestureSeekWidgetV32;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
                }
                inlineGestureSeekWidgetV3.hideInlineSeekBar();
                break;
            case 1:
                SinaShareActivity sinaShareActivity = (SinaShareActivity) this.f78022b;
                int i7 = SinaShareActivity.D;
                if (!((v71.a) sinaShareActivity).x && !sinaShareActivity.isFinishing()) {
                    sinaShareActivity.K6();
                    break;
                }
                break;
            default:
                C8681d c8681d = (C8681d) this.f78022b;
                c8681d.a(c8681d.f127631f);
                break;
        }
    }
}
