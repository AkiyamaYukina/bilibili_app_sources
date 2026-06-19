package com.bilibili.playerbizcommonv2.danmaku.feedback;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.K0;
import java.util.ArrayList;
import kntr.app.ad.uikit.modifiers.TouchCapture;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/q.class */
public final /* synthetic */ class q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f80926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f80927c;

    public /* synthetic */ q(int i7, Object obj, Object obj2) {
        this.f80925a = i7;
        this.f80926b = obj;
        this.f80927c = obj2;
    }

    public final Object invoke() {
        switch (this.f80925a) {
            case 0:
                break;
            case 1:
                ((Function0) this.f80926b).invoke();
                ((K0) this.f80927c).f101025e.setValue(Boolean.TRUE);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f80927c;
                com.bilibili.tgwt.service.o oVar = ((com.bilibili.tgwt.service.u) this.f80926b).f112008b;
                hu.a[] aVarArr = (hu.a[]) arrayList.toArray(new hu.a[0]);
                oVar.getClass();
                if (aVarArr != null && aVarArr.length != 0) {
                    oVar.f111992a.f111942l.tryEmit(aVarArr);
                    defpackage.a.b("[together-watch-ChatVoiceRtcService$openRtcBizCallback$1-onRemoteUserAudioVolumeIndication] ", C4496a.a("voice room onRemoteUserAudioVolumeIndication ", ArraysKt.F(aVarArr, "\n", (CharSequence) null, (CharSequence) null, (Function1) null, 62)), "ChatVoiceRtcService$openRtcBizCallback$1-onRemoteUserAudioVolumeIndication");
                }
                break;
            default:
                TouchCapture touchCapture = (TouchCapture) ((MutableState) this.f80927c).getValue();
                ((Function1) this.f80926b).invoke(touchCapture != null ? new kntr.app.ad.biz.comment.notice.j(touchCapture) : null);
                break;
        }
        return Unit.INSTANCE;
    }
}
