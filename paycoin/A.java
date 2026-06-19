package com.bilibili.paycoin;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.paycoin.PayCoinRequestResult;
import dq0.d;
import java.lang.ref.WeakReference;
import javax.inject.Named;
import javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/A.class */
@Singleton
@Named("video_coin")
public final class A implements dq0.d {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/A$a.class */
    public static final class a extends BiliApiDataCallback<PayCoinRequestResult> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d.a f74702b;

        public a(d.a aVar) {
            this.f74702b = aVar;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            return this.f74702b.isCancel();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(PayCoinRequestResult payCoinRequestResult) {
            PayCoinRequestResult payCoinRequestResult2 = payCoinRequestResult;
            d.a aVar = this.f74702b;
            if (payCoinRequestResult2 == null) {
                aVar.onResponseIllegal();
                return;
            }
            boolean z6 = payCoinRequestResult2.prompt;
            boolean z7 = payCoinRequestResult2.like;
            PayCoinRequestResult.Guide guide = payCoinRequestResult2.guide;
            String str = null;
            String str2 = guide != null ? guide.type : null;
            if (guide != null) {
                str = guide.title;
            }
            aVar.a(str2, str, payCoinRequestResult2.voucher, z6, z7);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            this.f74702b.onRequestFailed(th);
        }
    }

    @Override // dq0.d
    public final void a(@NotNull d.b bVar, @NotNull d.a aVar) {
        String strA = w8.y.a();
        l lVar = (l) ServiceGenerator.createService(l.class);
        Long l7 = bVar.f116614f;
        long jLongValue = l7 != null ? l7.longValue() : 0L;
        String str = bVar.f116612d;
        if (str == null) {
            str = "";
        }
        Integer num = bVar.f116613e;
        int iIntValue = num != null ? num.intValue() : 0;
        String str2 = bVar.f116615g;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = bVar.h;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = bVar.f116616i;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = bVar.f116617j;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = bVar.f116618k;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = bVar.f116619l;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = bVar.f116620m;
        if (str8 == null) {
            str8 = "";
        }
        lVar.payCoin(strA, bVar.f116609a, jLongValue, bVar.f116610b, bVar.f116611c, str, iIntValue, str2, str3, str4, str5, str6, str7, str8).enqueue(new a(aVar));
    }

    @Override // dq0.d
    public final void b(@NotNull WeakReference weakReference, @NotNull d.b bVar, @NotNull com.bilibili.playerbizcommonv2.widget.coin.c cVar) {
        a(bVar, new B(cVar, weakReference, this, bVar));
    }
}
