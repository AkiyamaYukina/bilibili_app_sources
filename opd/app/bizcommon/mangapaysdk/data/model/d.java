package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import ES0.w;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.blconfig.ConfigManager;
import java.util.List;
import java.util.Timer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/d.class */
public final class d extends ViewModel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public PaySDKComicView f74050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Timer f74052f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public JSONObject f74054i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f74047a = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f74048b = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<h> f74049c = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f74053g = LazyKt.lazy(new Ba.e(8));

    @NotNull
    public final Lazy h = LazyKt.lazy(new w(this, 2));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f74055j = LazyKt.lazy(new Ba0.b(9));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/d$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f74057b;

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
                iArr[ComicShowUiStatus.OnlyVolumePurchase.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[ComicShowUiStatus.VolumePurchaseWithSingleStory.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[ComicShowUiStatus.BulkPurchase.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            f74056a = iArr;
            int[] iArr2 = new int[ChapterFinishStatus.values().length];
            try {
                iArr2[ChapterFinishStatus.Unopened.ordinal()] = 1;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[ChapterFinishStatus.Serialization.ordinal()] = 2;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[ChapterFinishStatus.Finish.ordinal()] = 3;
            } catch (NoSuchFieldError e15) {
            }
            f74057b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01ba: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:61:0x01ba */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object I0(com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d r7, java.lang.String r8, java.lang.String r9, com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1.a r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.I0(com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d, java.lang.String, java.lang.String, com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float J0(com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d r3, com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus r4, int r5, com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.BatchBuy r6, int r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.J0(com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d, com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus, int, com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.BatchBuy, int):float");
    }

    public static /* synthetic */ Object T0(d dVar, ConsumeBusinessType consumeBusinessType, int i7, int i8, String str, String str2, ContinuationImpl continuationImpl, int i9) {
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return dVar.S0(consumeBusinessType, i7, i8, false, str, str2, continuationImpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:8))(0)|9|(2:11|(1:13)(2:14|15))(2:16|(8:18|(1:20)(1:21)|22|(1:24)(1:25)|26|(4:30|(1:32)|33|(4:35|(1:39)|40|(2:42|43))(0))|67|68)(2:69|70))|44|71|45|(5:47|(1:55)(1:52)|56|57|58)(7:59|60|61|(1:64)|65|67|68)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e1, code lost:
    
        q4.M.b("jump out error, can not install ... message: ", r8.getMessage(), "JumpOutAppUseCase");
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K0(@org.jetbrains.annotations.Nullable android.content.Context r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.K0(android.content.Context, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object L0(@Nullable Context context) {
        boolean zA = false;
        if (context == null) {
            return Boxing.boxBoolean(false);
        }
        try {
            zA = ((Ym0.a) this.f74053g.getValue()).a(context);
        } catch (Exception e7) {
            BLog.e("PayViewStoreViewModel", "check install error, e: " + e7.getMessage() + ", cause: " + e7.getCause());
        }
        return Boxing.boxBoolean(zA);
    }

    @Nullable
    public final BatchBuy M0() {
        List<BatchBuy> batchBuy;
        PaySDKComicView paySDKComicView = this.f74050d;
        if (paySDKComicView == null || (batchBuy = paySDKComicView.getBatchBuy()) == null) {
            return null;
        }
        for (BatchBuy batchBuy2 : batchBuy) {
            if (batchBuy2 != null && batchBuy2.isDefaultSelect()) {
                return batchBuy2;
            }
        }
        return null;
    }

    @Nullable
    public final BatchBuy N0(int i7) {
        List<BatchBuy> batchBuy;
        List<BatchBuy> batchBuy2;
        if (i7 >= 0) {
            PaySDKComicView paySDKComicView = this.f74050d;
            if (i7 < ((paySDKComicView == null || (batchBuy2 = paySDKComicView.getBatchBuy()) == null) ? 0 : batchBuy2.size())) {
                PaySDKComicView paySDKComicView2 = this.f74050d;
                return (paySDKComicView2 == null || (batchBuy = paySDKComicView2.getBatchBuy()) == null) ? null : batchBuy.get(i7);
            }
        }
        return M0();
    }

    @NotNull
    public final String O0() {
        PaySDKComicView paySDKComicView = this.f74050d;
        if ((paySDKComicView != null ? paySDKComicView.getEpChapterId() : 0) > 0) {
            PaySDKComicView paySDKComicView2 = this.f74050d;
            String strValueOf = "";
            if (paySDKComicView2 != null) {
                strValueOf = String.valueOf(paySDKComicView2.getEpChapterId());
                if (strValueOf == null) {
                    strValueOf = "";
                }
            }
            return strValueOf;
        }
        PaySDKComicView paySDKComicView3 = this.f74050d;
        String strValueOf2 = "";
        if (paySDKComicView3 != null) {
            ComicChapterInfo chapterInfo = paySDKComicView3.getChapterInfo();
            strValueOf2 = "";
            if (chapterInfo != null) {
                strValueOf2 = String.valueOf(chapterInfo.getId());
                if (strValueOf2 == null) {
                    strValueOf2 = "";
                }
            }
        }
        return strValueOf2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus P0() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.PaySDKComicView r0 = r0.f74050d
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus r0 = r0.getSDKViewPayMode()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L18
        L14:
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus r0 = com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus.OnlySingleStoryPurchase
            r3 = r0
        L18:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.P0():com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus");
    }

    @NotNull
    public final String Q0() {
        String str;
        String squareCover;
        String horizontalCover;
        PaySDKComicView paySDKComicView = this.f74050d;
        if (paySDKComicView == null || (horizontalCover = paySDKComicView.getHorizontalCover()) == null || horizontalCover.length() <= 0) {
            PaySDKComicView paySDKComicView2 = this.f74050d;
            if (paySDKComicView2 == null || (squareCover = paySDKComicView2.getSquareCover()) == null || squareCover.length() <= 0) {
                PaySDKComicView paySDKComicView3 = this.f74050d;
                str = "";
                if (paySDKComicView3 != null) {
                    String verticalCover = paySDKComicView3.getVerticalCover();
                    str = "";
                    if (verticalCover != null) {
                        str = "";
                        if (verticalCover.length() > 0) {
                            PaySDKComicView paySDKComicView4 = this.f74050d;
                            str = "";
                            if (paySDKComicView4 != null) {
                                String verticalCover2 = paySDKComicView4.getVerticalCover();
                                str = verticalCover2;
                                if (verticalCover2 == null) {
                                    str = "";
                                }
                            }
                        }
                    }
                }
            } else {
                PaySDKComicView paySDKComicView5 = this.f74050d;
                str = "";
                if (paySDKComicView5 != null) {
                    String squareCover2 = paySDKComicView5.getSquareCover();
                    str = squareCover2;
                    if (squareCover2 == null) {
                        str = "";
                    }
                }
            }
        } else {
            PaySDKComicView paySDKComicView6 = this.f74050d;
            str = "";
            if (paySDKComicView6 != null) {
                String horizontalCover2 = paySDKComicView6.getHorizontalCover();
                str = horizontalCover2;
                if (horizontalCover2 == null) {
                    str = "";
                }
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R0(android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, kotlin.coroutines.jvm.internal.ContinuationImpl r16) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.R0(android.content.Context, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S0(@org.jetbrains.annotations.NotNull com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ConsumeBusinessType r16, int r17, int r18, boolean r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.S0(com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ConsumeBusinessType, int, int, boolean, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object U0(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        Long longOrNull;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuationImpl));
        Timer timer = this.f74052f;
        if (timer != null) {
            timer.cancel();
        }
        if (StringsKt.isBlank(str)) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.constructor-impl(new f(false, new Throwable("order id is blank...."), 1)));
        } else {
            String str3 = (String) ConfigManager.Companion.config().get("mangasdk.rotation_schedule_interval_ms", "500");
            long jLongValue = (str3 == null || (longOrNull = StringsKt.toLongOrNull(str3)) == null) ? 500L : longOrNull.longValue();
            Timer timer2 = new Timer("PayViewStoreViewModel-Consume-Timer");
            this.f74052f = timer2;
            timer2.schedule(new PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1(this, safeContinuation, str, str2), 0L, jLongValue);
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return orThrow;
    }

    @Nullable
    public final Object V0(@NotNull b bVar, @NotNull ContinuationImpl continuationImpl) {
        Object objEmit = this.f74048b.emit(bVar, continuationImpl);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Nullable
    public final Object X0(@NotNull h hVar, @NotNull SuspendLambda suspendLambda) {
        Object objEmit = this.f74049c.emit(hVar, suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Nullable
    public final Object Y0(@NotNull c cVar, @NotNull ContinuationImpl continuationImpl) {
        Object objEmit = this.f74047a.emit(cVar, continuationImpl);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z0(@org.jetbrains.annotations.Nullable android.content.Context r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.Z0(android.content.Context, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b A[Catch: Exception -> 0x0057, TRY_ENTER, TryCatch #0 {Exception -> 0x0057, blocks: (B:12:0x004c, B:27:0x00b8, B:31:0x00e2, B:33:0x00ef, B:37:0x0104, B:39:0x0114, B:43:0x012f, B:45:0x013f, B:50:0x0153, B:60:0x0194, B:54:0x017c, B:57:0x018b, B:22:0x008d), top: B:65:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a1(float r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.a1(float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d8  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b1(int r10, int r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.b1(int, int, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
