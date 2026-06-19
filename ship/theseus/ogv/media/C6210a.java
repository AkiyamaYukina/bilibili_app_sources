package com.bilibili.ship.theseus.ogv.media;

import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/a.class */
public final /* synthetic */ class C6210a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AIEnhancedQualityReminderToastService f94005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f94006b;

    public /* synthetic */ C6210a(AIEnhancedQualityReminderToastService aIEnhancedQualityReminderToastService, CoroutineScope coroutineScope) {
        this.f94005a = aIEnhancedQualityReminderToastService;
        this.f94006b = coroutineScope;
    }

    public final Object invoke(Object obj) {
        return AIEnhancedQualityReminderToastService$run$2.invokeSuspend$lambda$0(this.f94005a, this.f94006b, (TextVo) obj);
    }
}
