package com.bilibili.ship.theseus.cheese.biz.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.tencent.connect.common.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseStickerPieceExistenceReportService.class */
@StabilityInferred(parameters = 0)
public final class CheeseStickerPieceExistenceReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Hr0.b> f90461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f90462b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseStickerPieceExistenceReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseStickerPieceExistenceReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseStickerPieceExistenceReportService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseStickerPieceExistenceReportService cheeseStickerPieceExistenceReportService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStickerPieceExistenceReportService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CheeseStickerPieceExistenceReportService cheeseStickerPieceExistenceReportService = this.this$0;
            if (cheeseStickerPieceExistenceReportService.f90461a.size() > 1) {
                Iterator<T> it = cheeseStickerPieceExistenceReportService.f90461a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Hr0.b bVar = (Hr0.b) next;
                    if (bVar.f8750e > bVar.f8751f) {
                        break;
                    }
                }
                Hr0.b bVar2 = (Hr0.b) next;
                if (bVar2 != null) {
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    mapCreateMapBuilder.put("type", Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
                    mapCreateMapBuilder.put("fragment_avid", String.valueOf(bVar2.f8746a));
                    mapCreateMapBuilder.put("fragment_order", "1");
                    mapCreateMapBuilder.put("fragment_position", "3");
                    PageReportService.i(cheeseStickerPieceExistenceReportService.f90462b, "united.player-video-detail.fragment.0.show", MapsKt.build(mapCreateMapBuilder), 4);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public CheeseStickerPieceExistenceReportService(@NotNull CoroutineScope coroutineScope, @NotNull List<Hr0.b> list, @NotNull PageReportService pageReportService) {
        this.f90461a = list;
        this.f90462b = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
