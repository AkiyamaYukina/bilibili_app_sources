package com.bilibili.playerbizcommonv2.widget.share;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/share/a.class */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f83398a;

    public /* synthetic */ a(CoroutineScope coroutineScope) {
        this.f83398a = coroutineScope;
    }

    public final Object invoke() {
        return ShareLoadingDialog$showWithBlocking$2.invokeSuspend$lambda$0(this.f83398a);
    }
}
