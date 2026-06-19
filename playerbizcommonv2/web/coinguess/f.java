package com.bilibili.playerbizcommonv2.web.coinguess;

import androidx.compose.runtime.snapshots.z;
import androidx.fragment.app.C;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.app.producers.ability.l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.sender.ChronosDanmakuSender;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/coinguess/f.class */
public final class f {
    @NotNull
    public static final String a(@NotNull d dVar) {
        long j7 = dVar.f82209a;
        int length = dVar.f82215g.length();
        int length2 = dVar.h.length();
        int length3 = dVar.f82216i.length();
        StringBuilder sbA = z.a(j7, "id=", " idStr=");
        sbA.append(dVar.f82210b);
        sbA.append(" mid=");
        sbA.append(dVar.f82211c);
        sbA.append(" oid=");
        sbA.append(dVar.f82212d);
        sbA.append(" progress=");
        sbA.append(dVar.f82213e);
        sbA.append(" type=");
        C4690e.a(dVar.f82214f, length, " commandLength=", " contentLength=", sbA);
        return C.a(length2, length3, " extraLength=", sbA);
    }

    @NotNull
    public static final String b(@NotNull e eVar) {
        StringBuilder sbA = l0.a("quizId=", eVar.f82217a, " myOption=");
        sbA.append(eVar.f82218b);
        sbA.append(" coinCount=");
        sbA.append(eVar.f82219c);
        return sbA.toString();
    }

    @NotNull
    public static final ChronosDanmakuSender.CommandDanmakuSendResponse c(@NotNull d dVar) {
        String str;
        Long longOrNull;
        Long lValueOf = Long.valueOf(dVar.f82209a);
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        String strValueOf = lValueOf != null ? String.valueOf(lValueOf.longValue()) : null;
        String str2 = dVar.f82210b;
        String str3 = str2;
        if (StringsKt.isBlank(str2)) {
            str3 = strValueOf == null ? "" : strValueOf;
        }
        String str4 = !StringsKt.isBlank(str3) ? str3 : null;
        String strValueOf2 = strValueOf;
        if (strValueOf != null) {
            str = strValueOf2;
        } else if (str4 == null || (longOrNull = StringsKt.toLongOrNull(str4)) == null) {
            str = null;
        } else {
            strValueOf2 = String.valueOf(longOrNull.longValue());
            str = strValueOf2;
        }
        Integer numValueOf = Integer.valueOf(dVar.f82214f);
        Integer num = null;
        if (numValueOf.intValue() > 0) {
            num = numValueOf;
        }
        int iIntValue = num != null ? num.intValue() : 23;
        String str5 = dVar.f82215g;
        String str6 = str5;
        if (StringsKt.isBlank(str5)) {
            str6 = "#QUIZ#";
        }
        return new ChronosDanmakuSender.CommandDanmakuSendResponse(str, Long.valueOf(dVar.f82212d), Long.valueOf(dVar.f82211c), Integer.valueOf(iIntValue), str6, dVar.h, Long.valueOf(dVar.f82213e), (Integer) null, dVar.f82216i, str4, 128, (DefaultConstructorMarker) null);
    }
}
