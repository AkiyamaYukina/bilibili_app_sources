package com.bilibili.ship.theseus.united.page.danmaku;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.mall.ui.page.ip.view.n0;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/s.class */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99543a;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final Object invoke(Object obj) {
        switch (this.f99543a) {
            case 0:
                androidx.compose.ui.semantics.y.h((SemanticsPropertyReceiver) obj, "弹幕输入框");
                break;
            case 1:
                HttpClientConfig httpClientConfig = (HttpClientConfig) obj;
                httpClientConfig.install(HttpTimeoutKt.b, new n0(2));
                httpClientConfig.install(ContentNegotiationKt.c, (Function1) new Object());
                break;
            default:
                break;
        }
        return Unit.INSTANCE;
    }
}
