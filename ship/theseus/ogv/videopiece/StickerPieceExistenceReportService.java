package com.bilibili.ship.theseus.ogv.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/StickerPieceExistenceReportService.class */
@StabilityInferred(parameters = 0)
public final class StickerPieceExistenceReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f94797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Hr0.b> f94798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f94799c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.StickerPieceExistenceReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/StickerPieceExistenceReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StickerPieceExistenceReportService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StickerPieceExistenceReportService stickerPieceExistenceReportService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = stickerPieceExistenceReportService;
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
            StickerPieceExistenceReportService stickerPieceExistenceReportService = this.this$0;
            if (stickerPieceExistenceReportService.f94798b.size() > 1) {
                a aVar = stickerPieceExistenceReportService.f94797a;
                if (!aVar.f94800a) {
                    aVar.f94800a = true;
                    Hr0.b bVar = (Hr0.b) CollectionsKt.first(stickerPieceExistenceReportService.f94798b);
                    boolean z6 = bVar.f8750e < bVar.f8751f;
                    Hr0.b bVar2 = (Hr0.b) CollectionsKt.last(stickerPieceExistenceReportService.f94798b);
                    boolean z7 = bVar2.f8750e > bVar2.f8751f;
                    JsonArray jsonArray = new JsonArray();
                    List<Hr0.b> list = stickerPieceExistenceReportService.f94798b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        Hr0.b bVar3 = (Hr0.b) obj2;
                        if (bVar3.f8750e < bVar3.f8751f) {
                            arrayList.add(obj2);
                        }
                    }
                    int i8 = 0;
                    for (Object obj3 : arrayList) {
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        jsonArray.add(StickerPieceExistenceReportService.a((Hr0.b) obj3, i8, 1));
                        i8++;
                    }
                    List<Hr0.b> list2 = stickerPieceExistenceReportService.f94798b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        Hr0.b bVar4 = (Hr0.b) obj4;
                        if (bVar4.f8750e > bVar4.f8751f) {
                            arrayList2.add(obj4);
                        }
                    }
                    int i9 = 0;
                    for (Object obj5 : arrayList2) {
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        jsonArray.add(StickerPieceExistenceReportService.a((Hr0.b) obj5, i9, 3));
                        i9++;
                    }
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    mapCreateMapBuilder.put("fragment_type", (z6 && z7) ? "3" : z6 ? "1" : z7 ? "2" : "0");
                    mapCreateMapBuilder.put("fragment_detail", jsonArray.toString());
                    PageReportService.i(stickerPieceExistenceReportService.f94799c, "united.player-video-detail.fragment.0.show", MapsKt.build(mapCreateMapBuilder), 4);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/StickerPieceExistenceReportService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f94800a;

        @Inject
        public a() {
        }
    }

    @Inject
    public StickerPieceExistenceReportService(@NotNull CoroutineScope coroutineScope, @NotNull a aVar, @NotNull List<Hr0.b> list, @NotNull PageReportService pageReportService) {
        this.f94797a = aVar;
        this.f94798b = list;
        this.f94799c = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final JsonObject a(Hr0.b bVar, int i7, int i8) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fragment_avid", Long.valueOf(bVar.f8746a));
        jsonObject.addProperty("fragment_order", Integer.valueOf(i7 + 1));
        jsonObject.addProperty("fragment_position", Integer.valueOf(i8));
        jsonObject.addProperty("fragment_length", Long.valueOf(bVar.f8749d / ((long) 1000)));
        jsonObject.addProperty("fragment_source", String.valueOf(bVar.f8752g));
        return jsonObject;
    }
}
