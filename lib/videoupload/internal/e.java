package com.bilibili.lib.videoupload.internal;

import android.text.TextUtils;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.videoupload.bean.UploadClientTimeoutConfig;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.Nullable;
import ug0.C8730c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/e.class */
public abstract class e extends a {
    public static long F(int i7) {
        UploadClientTimeoutConfig uploadClientTimeoutConfigF = C8730c.b(FoundationAlias.getFapp()).f();
        if (i7 == 1) {
            int i8 = uploadClientTimeoutConfigF.reqRetryDelayFirst;
        }
        return RangesKt.coerceAtLeast(uploadClientTimeoutConfigF.reqRetryDelayMax, ((i7 - 1) * uploadClientTimeoutConfigF.reqRetryDelayIncreasing) + uploadClientTimeoutConfigF.reqRetryDelayFirst);
    }

    public abstract boolean D(int i7);

    public final void E(int i7, @Nullable String str) {
        String strC = com.bilibili.mall.kmm.order.combine.api.c.c(i7);
        String strB = com.bilibili.mall.kmm.order.combine.api.c.b(i7);
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = strB;
        }
        StringBuilder sbA = G0.b.a("[BiliUpload] Do common ,net waiting!!: ", strC, ", uploadErrorMsg=", str2, ",errorDesc=");
        sbA.append(strB);
        l(sbA.toString());
        n(17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
    
        r19 = new com.bilibili.lib.videoupload.internal.m(1, 0);
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07f7  */
    @Override // com.bilibili.lib.videoupload.internal.a
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.lib.videoupload.internal.m h() {
        /*
            Method dump skipped, instruction units count: 2134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.internal.e.h():com.bilibili.lib.videoupload.internal.m");
    }
}
