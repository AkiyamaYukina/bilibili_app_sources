package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import com.bilibili.opd.app.bizcommon.mangapaysdk.adapter.MangaCommonAdapter;
import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ButtonState;
import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus;
import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.PayBCoinLevel;
import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.PayBCoinLevelResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$3.class */
public final class MangaPayFragment$initFlow$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MangaPayFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initFlow$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c, Continuation<? super Unit>, Object> {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        final MangaPayFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initFlow$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$3$1$1.class */
        public static final class C04691 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            int label;
            final MangaPayFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04691(MangaPayFragment mangaPayFragment, Continuation<? super C04691> continuation) {
                super(1, continuation);
                this.this$0 = mangaPayFragment;
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C04691(this.this$0, continuation);
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return create(continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MangaPayFragment mangaPayFragment = this.this$0;
                    com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar = mangaPayFragment.f74087L;
                    if (dVar != null) {
                        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h hVar = new com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h(mangaPayFragment.f74088M, mangaPayFragment.getResources().getString(2131838483), ButtonState.GotoCharging);
                        this.label = 1;
                        if (dVar.X0(hVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initFlow$3$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$3$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final PayBCoinLevelResponse $balanceAndLevel;
            final float $consumeValue;
            int label;
            final MangaPayFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PayBCoinLevelResponse payBCoinLevelResponse, float f7, MangaPayFragment mangaPayFragment, Continuation<? super AnonymousClass2> continuation) {
                super(1, continuation);
                this.$balanceAndLevel = payBCoinLevelResponse;
                this.$consumeValue = f7;
                this.this$0 = mangaPayFragment;
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass2(this.$balanceAndLevel, this.$consumeValue, this.this$0, continuation);
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return create(continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PayBCoinLevelResponse payBCoinLevelResponse = this.$balanceAndLevel;
                    if ((payBCoinLevelResponse != null ? payBCoinLevelResponse.getUserCoin() : 0.0f) < this.$consumeValue) {
                        MangaCommonAdapter mangaCommonAdapter = this.this$0.f74122y;
                        Float fBoxFloat = null;
                        Object objN = mangaCommonAdapter != null ? mangaCommonAdapter.N() : null;
                        PayBCoinLevel payBCoinLevel = objN instanceof PayBCoinLevel ? (PayBCoinLevel) objN : null;
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(this.this$0.getResources().getString(2131838476));
                        stringBuffer.append(" ");
                        MangaPayFragment mangaPayFragment = this.this$0;
                        if (payBCoinLevel != null) {
                            fBoxFloat = Boxing.boxFloat(payBCoinLevel.getRmb());
                        }
                        stringBuffer.append(mangaPayFragment.uf(fBoxFloat, false));
                        stringBuffer.append(" ");
                        stringBuffer.append(this.this$0.getResources().getString(2131838463));
                        MangaPayFragment mangaPayFragment2 = this.this$0;
                        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar = mangaPayFragment2.f74087L;
                        if (dVar != null) {
                            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h hVar = new com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h(mangaPayFragment2.f74088M, stringBuffer.toString(), ButtonState.ChargingAndSureToBuy);
                            this.label = 1;
                            if (dVar.X0(hVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        MangaPayFragment mangaPayFragment3 = this.this$0;
                        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar2 = mangaPayFragment3.f74087L;
                        if (dVar2 != null) {
                            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h hVar2 = new com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h(mangaPayFragment3.f74088M, mangaPayFragment3.getResources().getString(2131838502), ButtonState.SureToBuy);
                            this.label = 2;
                            if (dVar2.X0(hVar2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initFlow$3$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$3$1$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f74126a;

            static {
                int[] iArr = new int[ComicShowUiStatus.values().length];
                try {
                    iArr[ComicShowUiStatus.OnlySingleStoryPurchase.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[ComicShowUiStatus.SingleStoryPurchaseWithBulk.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[ComicShowUiStatus.SingleStoryPurchaseWithVolume.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[ComicShowUiStatus.BulkPurchase.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[ComicShowUiStatus.OnlyVolumePurchase.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[ComicShowUiStatus.VolumePurchaseWithSingleStory.ordinal()] = 6;
                } catch (NoSuchFieldError e12) {
                }
                f74126a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MangaPayFragment mangaPayFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mangaPayFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:106:0x032a  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0388  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x03d2  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0405  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x044e  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x045a  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x04b8  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x04bf  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x04c7  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x04ee  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0534  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x053a  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x0542  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0591  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x05ab  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x05ec  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 1592
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initFlow$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$initFlow$3(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$initFlow$3> continuation) {
        super(2, continuation);
        this.this$0 = mangaPayFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MangaPayFragment$initFlow$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        StateFlow stateFlowAsStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar = this.this$0.f74087L;
            if (dVar != null && (stateFlowAsStateFlow = FlowKt.asStateFlow(dVar.f74047a)) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAsStateFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
