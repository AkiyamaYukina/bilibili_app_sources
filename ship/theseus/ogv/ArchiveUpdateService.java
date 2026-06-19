package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.page.tab.CommentTabGuideService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ArchiveUpdateService.class */
@StabilityInferred(parameters = 0)
public final class ArchiveUpdateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RelationRepository f91202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f91203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.online.a f91204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.kingposition.a f91205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f91206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CommentTabGuideService f91207g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ArchiveUpdateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ArchiveUpdateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ArchiveUpdateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArchiveUpdateService archiveUpdateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = archiveUpdateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ArchiveUpdateService archiveUpdateService = this.this$0;
                long jA = archiveUpdateService.f91206f.a();
                String str = this.this$0.f91206f.f93576w;
                this.label = 1;
                if (ArchiveUpdateService.a(archiveUpdateService, jA, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public ArchiveUpdateService(@NotNull CoroutineScope coroutineScope, @NotNull RelationRepository relationRepository, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull com.bilibili.ship.theseus.united.page.online.a aVar2, @NotNull com.bilibili.ship.theseus.ogv.intro.kingposition.a aVar3, @NotNull OgvEpisode ogvEpisode, @NotNull CommentTabGuideService commentTabGuideService) {
        this.f91201a = coroutineScope;
        this.f91202b = relationRepository;
        this.f91203c = aVar;
        this.f91204d = aVar2;
        this.f91205e = aVar3;
        this.f91206f = ogvEpisode;
        this.f91207g = commentTabGuideService;
        aVar.f104037b.setValue(Long.valueOf(ogvEpisode.a()));
        aVar.f104041f.setValue(Long.valueOf(ogvEpisode.f93561g));
        aVar.f104050p = ogvEpisode.h();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.ArchiveUpdateService r7, long r8, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.ArchiveUpdateService.a(com.bilibili.ship.theseus.ogv.ArchiveUpdateService, long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
