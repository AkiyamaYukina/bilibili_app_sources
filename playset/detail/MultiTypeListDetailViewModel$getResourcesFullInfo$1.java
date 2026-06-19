package com.bilibili.playset.detail;

import com.bilibili.playset.detail.data.f;
import com.bilibili.playset.detail.data.j;
import com.bilibili.playset.detail.data.q;
import com.bilibili.playset.playlist.adapters.FavFooterItem$Companion$LoadMoreType;
import fs0.InterfaceC7170a;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$getResourcesFullInfo$1.class */
final class MultiTypeListDetailViewModel$getResourcesFullInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $loadFirstPage;
    final long $playlistId;
    int label;
    final MultiTypeListDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailViewModel$getResourcesFullInfo$1(MultiTypeListDetailViewModel multiTypeListDetailViewModel, long j7, boolean z6, Continuation<? super MultiTypeListDetailViewModel$getResourcesFullInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailViewModel;
        this.$playlistId = j7;
        this.$loadFirstPage = z6;
    }

    private static final com.bilibili.playset.detail.data.h invokeSuspend$lambda$0(com.bilibili.playset.api.d dVar, com.bilibili.playset.detail.data.h hVar) {
        return com.bilibili.playset.detail.data.h.a(hVar, 0L, 0L, null, null, null, false, false, false, false, false, false, false, null, false, dVar.c(), false, false, 0, 0, 4128767);
    }

    private static final com.bilibili.playset.detail.data.h invokeSuspend$lambda$1(Ref.ObjectRef objectRef, List list, com.bilibili.playset.api.d dVar, com.bilibili.playset.detail.data.h hVar) {
        return com.bilibili.playset.detail.data.h.a(hVar, 0L, 0L, list, dVar, null, false, false, false, false, false, false, false, (com.bilibili.playset.detail.data.j) objectRef.element, false, false, false, false, 0, hVar.f84533v + 1, 2088947);
    }

    private static final com.bilibili.playset.detail.data.h invokeSuspend$lambda$2(com.bilibili.playset.detail.data.h hVar) {
        return com.bilibili.playset.detail.data.h.a(hVar, 0L, 0L, null, null, null, false, false, false, false, false, false, false, j.b.f84536a, false, false, false, false, 0, 0, 4180735);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailViewModel$getResourcesFullInfo$1(this.this$0, this.$playlistId, this.$loadFirstPage, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        com.bilibili.playset.api.d dVar;
        com.bilibili.playset.detail.data.j jVar;
        Object value2;
        Object value3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MultiTypeListDetailViewModel multiTypeListDetailViewModel = this.this$0;
                InterfaceC7170a interfaceC7170a = multiTypeListDetailViewModel.f84273c;
                long j7 = this.$playlistId;
                int i8 = multiTypeListDetailViewModel.f84275e;
                this.label = 1;
                Object objC = interfaceC7170a.c(i8, j7, this);
                obj = objC;
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            dVar = (com.bilibili.playset.api.d) obj;
            jVar = ((com.bilibili.playset.detail.data.h) this.this$0.getState().getValue()).f84525n;
        } catch (Throwable th) {
            MultiTypeListDetailViewModel multiTypeListDetailViewModel2 = this.this$0;
            if (multiTypeListDetailViewModel2.f84274d > 1) {
                multiTypeListDetailViewModel2.M0(new f.z(FavFooterItem$Companion$LoadMoreType.LOAD_MORE_STATUS_GONE));
            } else {
                MutableStateFlow<com.bilibili.playset.detail.data.h> mutableStateFlowP0 = multiTypeListDetailViewModel2.P0();
                do {
                    value = mutableStateFlowP0.getValue();
                } while (!mutableStateFlowP0.compareAndSet(value, invokeSuspend$lambda$2((com.bilibili.playset.detail.data.h) multiTypeListDetailViewModel2.P0().getValue())));
            }
            this.this$0.f84276f = false;
        }
        if (!(jVar instanceof j.d) && !(jVar instanceof j.e)) {
            MultiTypeListDetailViewModel multiTypeListDetailViewModel3 = this.this$0;
            multiTypeListDetailViewModel3.f84275e++;
            MutableStateFlow<com.bilibili.playset.detail.data.h> mutableStateFlowP02 = multiTypeListDetailViewModel3.P0();
            do {
                value2 = mutableStateFlowP02.getValue();
            } while (!mutableStateFlowP02.compareAndSet(value2, invokeSuspend$lambda$0(dVar, (com.bilibili.playset.detail.data.h) multiTypeListDetailViewModel3.P0().getValue())));
            boolean z6 = ((com.bilibili.playset.detail.data.h) this.this$0.getState().getValue()).f84528q;
            MultiTypeListDetailViewModel multiTypeListDetailViewModel4 = this.this$0;
            multiTypeListDetailViewModel4.f84277g = multiTypeListDetailViewModel4.f84277g || dVar.b();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = ((com.bilibili.playset.detail.data.h) this.this$0.getState().getValue()).f84525n;
            List<com.bilibili.playset.api.c> listD = dVar.d();
            if (listD == null || listD.isEmpty()) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel5 = this.this$0;
                if (multiTypeListDetailViewModel5.f84277g) {
                    if (multiTypeListDetailViewModel5.f84274d <= 1) {
                        objectRef.element = j.a.f84535a;
                    } else if (!z6) {
                        dVar.f84072g = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_CLEAN_INVALID;
                    }
                } else if (multiTypeListDetailViewModel5.f84274d > 1) {
                    dVar.f84072g = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_STATUS_GONE;
                } else {
                    objectRef.element = j.b.f84536a;
                }
            } else {
                objectRef.element = j.f.f84540a;
                MultiTypeListDetailViewModel multiTypeListDetailViewModel6 = this.this$0;
                multiTypeListDetailViewModel6.f84274d++;
                if (multiTypeListDetailViewModel6.f84277g && !z6) {
                    dVar.f84072g = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_CLEAN_INVALID;
                }
            }
            MultiTypeListDetailViewModel multiTypeListDetailViewModel7 = this.this$0;
            q qVar = multiTypeListDetailViewModel7.f84271a;
            List<com.bilibili.playset.api.a> list = ((com.bilibili.playset.detail.data.h) multiTypeListDetailViewModel7.getState().getValue()).f84515c;
            boolean z7 = this.$loadFirstPage;
            FavFooterItem$Companion$LoadMoreType favFooterItem$Companion$LoadMoreType = dVar.f84072g;
            qVar.getClass();
            List listD2 = q.d(list, dVar, z7, favFooterItem$Companion$LoadMoreType);
            MultiTypeListDetailViewModel multiTypeListDetailViewModel8 = this.this$0;
            MutableStateFlow<com.bilibili.playset.detail.data.h> mutableStateFlowP03 = multiTypeListDetailViewModel8.P0();
            do {
                value3 = mutableStateFlowP03.getValue();
            } while (!mutableStateFlowP03.compareAndSet(value3, invokeSuspend$lambda$1(objectRef, listD2, dVar, (com.bilibili.playset.detail.data.h) multiTypeListDetailViewModel8.P0().getValue())));
            this.this$0.f84276f = false;
            return Unit.INSTANCE;
        }
        this.this$0.f84276f = false;
        return Unit.INSTANCE;
    }
}
