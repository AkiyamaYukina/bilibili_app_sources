package com.bilibili.ship.theseus.united.page.danmaku;

import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.ui.layout.Placeable;
import com.bilibili.bililive.uam.view.UAMView;
import com.bilibili.lib.laya.telemetry.d;
import com.bilibili.live.streaming.source.TextSource;
import com.mall.common.utils.CodeReinfoceReportUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.dislikefeedback.c;
import tv.danmaku.bili.ui.garb.api.CardLockStatus;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import vm0.d;
import z.AbstractC9148v;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/v.class */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f99556b;

    public /* synthetic */ v(Object obj, int i7) {
        this.f99555a = i7;
        this.f99556b = obj;
    }

    public final Object invoke(Object obj) {
        String str;
        switch (this.f99555a) {
            case 0:
                ((HalfScreenDanmakuInputService) this.f99556b).f99455e.report(new NeuronsEvents.NormalEvent("player.player.dm-send.preview-show.player", new String[]{TextSource.CFG_CONTENT, (String) obj}));
                break;
            case 1:
                Exception exc = (Exception) obj;
                d.a aVar = (d.a) this.f99556b;
                if (aVar != null) {
                    aVar.a(vm0.h.a(-1));
                }
                try {
                    str = "saveFileToSystemWithOpenDir error: " + exc.getMessage();
                    FQ0.c cVar = com.mall.ui.page.base.download.g.a;
                    com.mall.ui.page.base.download.g.a(CodeReinfoceReportUtils.b(-1, com.mall.ui.page.base.download.m.class.getSimpleName(), "saveFileToSystemWithOpenDir", "saveFileToSystemWithOpenDir", exc), str, "kfc.download.jsbsavefile.error");
                } catch (Exception e7) {
                    BLog.e("mall", "getLogMessage", e7);
                    str = null;
                }
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                BLog.e("MallDownloadWebHelper", str2, exc);
                break;
            case 2:
                try {
                    com.bilibili.lib.laya.telemetry.f.c.b((kb0.g) this.f99556b, (d.a) obj);
                } catch (Throwable th) {
                    Log.w("TelemetryService", "sink dispatch failed: " + th);
                }
                break;
            case 3:
                c.a.a aVar2 = (c.a.a) this.f99556b;
                aVar2.b.setImageDrawable((Drawable) obj);
                aVar2.b.setBackgroundResource(0);
                break;
            case 4:
                ((rf1.b) this.f99556b).w = (CardLockStatus) obj;
                break;
            case 5:
                UAMView uAMView = (UAMView) this.f99556b;
                uAMView.setVisibility(0);
                uAMView.post(new e10.b(1, uAMView, (String) obj));
                break;
            default:
                AbstractC9148v.c cVar2 = FlowLayoutKt.f33988a;
                ((Ref.ObjectRef) this.f99556b).element = (Placeable) obj;
                break;
        }
        return Unit.INSTANCE;
    }
}
