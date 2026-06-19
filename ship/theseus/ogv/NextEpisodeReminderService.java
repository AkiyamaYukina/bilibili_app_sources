package com.bilibili.ship.theseus.ogv;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/NextEpisodeReminderService.class */
@StabilityInferred(parameters = 0)
public final class NextEpisodeReminderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Lu0.a f91231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Gu0.a f91232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.continuousplay.a f91233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f91234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IToastService f91235g;

    @NotNull
    public final C6151c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f91236i;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.NextEpisodeReminderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/NextEpisodeReminderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NextEpisodeReminderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NextEpisodeReminderService nextEpisodeReminderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = nextEpisodeReminderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 440
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.NextEpisodeReminderService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public NextEpisodeReminderService(@NotNull CoroutineScope coroutineScope, @NotNull OgvSeason ogvSeason, @Nullable Lu0.a aVar, @NotNull Gu0.a aVar2, @NotNull com.bilibili.ship.theseus.ogv.continuousplay.a aVar3, @NotNull Context context, @NotNull IToastService iToastService, @NotNull C6151c c6151c, @NotNull String str) {
        this.f91229a = coroutineScope;
        this.f91230b = ogvSeason;
        this.f91231c = aVar;
        this.f91232d = aVar2;
        this.f91233e = aVar3;
        this.f91234f = context;
        this.f91235g = iToastService;
        this.h = c6151c;
        this.f91236i = str;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
