package com.bilibili.playset.playlist.search2;

import androidx.lifecycle.ViewModelKt;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.api.TranslateInfo;
import com.bilibili.playset.playlist.search2.n;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import rs0.C8550a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchViewModel$handleAction$1.class */
final class CollectionSearchViewModel$handleAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final n $action;
    int label;
    final CollectionSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSearchViewModel$handleAction$1(CollectionSearchViewModel collectionSearchViewModel, n nVar, Continuation<? super CollectionSearchViewModel$handleAction$1> continuation) {
        super(2, continuation);
        this.this$0 = collectionSearchViewModel;
        this.$action = nVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionSearchViewModel$handleAction$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        MutableStateFlow<h> mutableStateFlow;
        Object value;
        h hVar;
        Unit unit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CollectionSearchViewModel collectionSearchViewModel = this.this$0;
            final i iVar = collectionSearchViewModel.f85420b;
            n nVar = this.$action;
            final CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(collectionSearchViewModel);
            this.label = 1;
            iVar.getClass();
            if (!(nVar instanceof n.a)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                mutableStateFlow = iVar.f85460b;
                value = mutableStateFlow.getValue();
                hVar = (h) value;
            } while (!mutableStateFlow.compareAndSet(value, h.a(hVar, null, null, false, false, 0, 0, 0, 0L, 0, 0, null, true, 8191)));
            if (hVar.f85458n) {
                BLog.i("[Favorites]CollectionSearchStateHolder", "curr state is searching");
                unit = Unit.INSTANCE;
            } else {
                h hVar2 = (h) mutableStateFlow.getValue();
                String str = hVar2.f85446a;
                Long l7 = iVar.f85459a;
                ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).searchFavorites(str, hVar2.f85454j, hVar2.f85455k, hVar2.f85452g, hVar2.f85453i, hVar2.f85456l, Long.valueOf(l7 != null ? l7.longValue() : 0L)).setParser(C8550a.f127013a).enqueue(new BiliApiDataCallback<rs0.b>(iVar, viewModelScope) { // from class: com.bilibili.playset.playlist.search2.CollectionSearchStateHolder$handleAction$2

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final i f85417b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final CoroutineScope f85418c;

                    {
                        this.f85417b = iVar;
                        this.f85418c = viewModelScope;
                    }

                    @Override // com.bilibili.okretro.BiliApiDataCallback
                    public final void onDataSuccess(rs0.b bVar) {
                        Object value2;
                        Object value3;
                        MutableStateFlow<h> mutableStateFlow2;
                        Object value4;
                        h hVar3;
                        boolean zA;
                        boolean zB;
                        long jG;
                        int iF;
                        int iE;
                        String strC;
                        int i8;
                        int i9;
                        MutableStateFlow<h> mutableStateFlow3;
                        Object value5;
                        h hVar4;
                        boolean zA2;
                        boolean zB2;
                        long jG2;
                        int iF2;
                        int iE2;
                        String strC2;
                        int i10;
                        int i11;
                        List<com.bilibili.playset.api.c> listD;
                        rs0.b bVar2 = bVar;
                        i iVar2 = this.f85417b;
                        if (bVar2 == null) {
                            int i12 = ((h) iVar2.f85460b.getValue()).f85452g;
                            MutableStateFlow<h> mutableStateFlow4 = iVar2.f85460b;
                            if (i12 == 0) {
                                do {
                                    value3 = mutableStateFlow4.getValue();
                                } while (!mutableStateFlow4.compareAndSet(value3, h.a((h) value3, PageStatus.NET_ERROR, null, false, false, 0, 0, 0, 0L, 0, 0, null, false, 8189)));
                                return;
                            } else {
                                do {
                                    value2 = mutableStateFlow4.getValue();
                                } while (!mutableStateFlow4.compareAndSet(value2, h.a((h) value2, null, null, false, false, 0, 0, 0, 0L, 0, 0, null, false, 8191)));
                                BuildersKt.launch$default(this.f85418c, (CoroutineContext) null, (CoroutineStart) null, new CollectionSearchStateHolder$handleAction$2$onDataSuccess$2$3(iVar2, null), 3, (Object) null);
                                return;
                            }
                        }
                        List<com.bilibili.playset.api.c> listD2 = bVar2.d();
                        List<com.bilibili.playset.api.c> list = null;
                        if (listD2 != null) {
                            list = null;
                            if (!listD2.isEmpty()) {
                                list = listD2;
                            }
                        }
                        if (list == null) {
                            PageStatus pageStatus = ((h) iVar2.f85460b.getValue()).f85452g == 0 ? bVar2.b() ? PageStatus.NO_DATA_THIS_PAGE : PageStatus.NO_DATA_AT_ALL : bVar2.b() ? PageStatus.SUCCESS_AND_HAS_MORE : PageStatus.SUCCESS_OVER;
                            do {
                                mutableStateFlow2 = iVar2.f85460b;
                                value4 = mutableStateFlow2.getValue();
                                hVar3 = (h) value4;
                                zA = bVar2.a();
                                zB = bVar2.b();
                                jG = bVar2.g();
                                iF = bVar2.f();
                                iE = bVar2.e();
                                strC = bVar2.c();
                                i8 = hVar3.h;
                                boolean zA3 = bVar2.a();
                                i9 = hVar3.f85453i;
                                if (!zA3) {
                                    i9++;
                                }
                            } while (!mutableStateFlow2.compareAndSet(value4, h.a(hVar3, pageStatus, null, zA, zB, 0, i8 + 1, i9, jG, iF, iE, strC, false, 77)));
                            return;
                        }
                        List<com.bilibili.playset.api.c> list2 = list;
                        for (com.bilibili.playset.api.c cVar : list2) {
                            TranslateInfo translateInfoU = cVar.u();
                            cVar.f84064y = (translateInfoU != null ? translateInfoU.getTranslateState() : 0) != 0;
                            cVar.f84065z = false;
                        }
                        List listPlus = CollectionsKt.plus(((h) iVar2.f85460b.getValue()).f85448c, list2);
                        PageStatus pageStatus2 = bVar2.a() ? PageStatus.HAS_MORE_AND_FOOT_GONE : bVar2.b() ? PageStatus.SUCCESS_AND_HAS_MORE : PageStatus.SUCCESS_OVER;
                        do {
                            mutableStateFlow3 = iVar2.f85460b;
                            value5 = mutableStateFlow3.getValue();
                            hVar4 = (h) value5;
                            zA2 = bVar2.a();
                            zB2 = bVar2.b();
                            jG2 = bVar2.g();
                            iF2 = bVar2.f();
                            iE2 = bVar2.e();
                            strC2 = bVar2.c();
                            i10 = hVar4.h;
                            boolean zA4 = bVar2.a();
                            i11 = hVar4.f85453i;
                            if (!zA4) {
                                i11++;
                            }
                            listD = bVar2.d();
                        } while (!mutableStateFlow3.compareAndSet(value5, h.a(hVar4, pageStatus2, listPlus, zA2, zB2, hVar4.f85452g + (listD != null ? listD.size() : 0), i10 + 1, i11, jG2, iF2, iE2, strC2, false, 9)));
                    }

                    @Override // com.bilibili.okretro.BiliApiCallback
                    public final void onError(Throwable th) {
                        Object value2;
                        Object value3;
                        i iVar2 = this.f85417b;
                        int i8 = ((h) iVar2.f85460b.getValue()).h;
                        MutableStateFlow<h> mutableStateFlow2 = iVar2.f85460b;
                        if (i8 == 0) {
                            do {
                                value3 = mutableStateFlow2.getValue();
                            } while (!mutableStateFlow2.compareAndSet(value3, h.a((h) value3, PageStatus.NET_ERROR, null, false, false, 0, 0, 0, 0L, 0, 0, null, false, 8189)));
                        } else {
                            do {
                                value2 = mutableStateFlow2.getValue();
                            } while (!mutableStateFlow2.compareAndSet(value2, h.a((h) value2, null, null, false, false, 0, 0, 0, 0L, 0, 0, null, false, 8191)));
                            BuildersKt.launch$default(this.f85418c, (CoroutineContext) null, (CoroutineStart) null, new CollectionSearchStateHolder$handleAction$2$onError$3(iVar2, null), 3, (Object) null);
                        }
                    }
                });
                unit = Unit.INSTANCE;
            }
            if (unit == coroutine_suspended) {
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
