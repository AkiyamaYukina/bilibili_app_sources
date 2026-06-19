package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import E2.C1612a;
import ES0.y;
import Pb.F;
import Pb.G;
import Vm0.a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.bilipay.BiliPay;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.opd.app.bizcommon.mangapaysdk.adapter.MangaCommonAdapter;
import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ButtonState;
import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus;
import com.bilibili.opd.app.bizcommon.mangapaysdk.reporter.MangaBuriedReporter;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import jh0.C7684b;
import jh0.C7685c;
import kntr.base.router.Router;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment.class */
public final class MangaPayFragment extends DialogFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public Button f74076A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f74077B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public ImageView f74078C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public TextView f74079D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public TextView f74080E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public View f74081F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public MangaLoadingView f74082G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public View f74083H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public String f74084I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public String f74085J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public a.C0133a f74086K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d f74087L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f74088M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f74089N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f74090O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f74091P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public PopupWindow f74092Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public ComicShowUiStatus f74093R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f74094S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f74095T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f74096U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f74097V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @NotNull
    public String f74098W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public final Lazy f74099X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C7684b f74100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f74101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f74102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f74103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f74104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public View f74105g;

    @Nullable
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ImageView f74106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public BiliImageView f74107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public BiliImageView f74108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public LinearLayout f74109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TextView f74110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public TextView f74111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public TextView f74112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public RecyclerView f74113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public MangaCommonAdapter f74114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public ImageView f74115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f74116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public TextView f74117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public TextView f74118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public TextView f74119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public TextView f74120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public View f74121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public MangaCommonAdapter f74122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f74123z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f74125b;

        static {
            int[] iArr = new int[ButtonState.values().length];
            try {
                iArr[ButtonState.SureToBuy.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ButtonState.GotoCharging.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ButtonState.ChargingAndSureToBuy.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f74124a = iArr;
            int[] iArr2 = new int[ComicShowUiStatus.values().length];
            try {
                iArr2[ComicShowUiStatus.BulkPurchase.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[ComicShowUiStatus.OnlySingleStoryPurchase.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[ComicShowUiStatus.SingleStoryPurchaseWithBulk.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[ComicShowUiStatus.SingleStoryPurchaseWithVolume.ordinal()] = 4;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[ComicShowUiStatus.OnlyVolumePurchase.ordinal()] = 5;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[ComicShowUiStatus.VolumePurchaseWithSingleStory.ordinal()] = 6;
            } catch (NoSuchFieldError e15) {
            }
            f74125b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$onResume$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$onResume$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final MangaPayFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MangaPayFragment mangaPayFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mangaPayFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 390
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MangaPayFragment() {
        this(null);
    }

    public MangaPayFragment(@Nullable C7684b c7684b) {
        this.f74100b = c7684b;
        this.f74084I = "";
        this.f74085J = "";
        int iDpToPx = DimenUtilsKt.dpToPx(109.0d);
        this.f74089N = iDpToPx;
        this.f74090O = iDpToPx;
        this.f74094S = -1;
        this.f74096U = true;
        this.f74097V = true;
        this.f74098W = "";
        this.f74099X = LazyKt.lazy(new y(this, 3));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object hf(com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment r7, java.lang.String r8, java.lang.String r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.hf(com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment, java.lang.String, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public static final Object m7854if(MangaPayFragment mangaPayFragment, SuspendLambda suspendLambda) {
        mangaPayFragment.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(suspendLambda));
        BiliPay.recharge(mangaPayFragment, new JSONObject().toJSONString(), BiliAccounts.get(mangaPayFragment.getContext()).getAccessKey(), new m(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return orThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object jf(com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.jf(com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object kf(com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.kf(com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object lf(final com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment r8, com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.lf(com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment, com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object mf(final MangaPayFragment mangaPayFragment, final List list, final Function1 function1, Continuation continuation) {
        Object objInvoke;
        mangaPayFragment.getClass();
        if (list.isEmpty()) {
            View view = mangaPayFragment.f74121x;
            if (view != null) {
                view.setVisibility(8);
            }
            objInvoke = function1.invoke(continuation);
            if (objInvoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objInvoke = Unit.INSTANCE;
            }
        } else {
            View view2 = mangaPayFragment.f74121x;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = mangaPayFragment.f74081F;
            if (view3 != null) {
                Boxing.boxBoolean(view3.post(new Runnable(mangaPayFragment, list, function1) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MangaPayFragment f74141a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final List f74142b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final SuspendLambda f74143c;

                    {
                        this.f74141a = mangaPayFragment;
                        this.f74142b = list;
                        this.f74143c = (SuspendLambda) function1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:147:0x0404  */
                    /* JADX WARN: Removed duplicated region for block: B:154:0x0422  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instruction units count: 1366
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.c.run():void");
                    }
                }));
            }
            objInvoke = Unit.INSTANCE;
        }
        return objInvoke;
    }

    public static Map nf(MangaPayFragment mangaPayFragment, Map map, boolean z6, boolean z7, boolean z8, int i7) {
        StateFlow stateFlowAsStateFlow;
        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h hVar;
        Map map2 = map;
        if ((i7 & 1) != 0) {
            map2 = null;
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        if ((i7 & 8) != 0) {
            z8 = false;
        }
        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar = mangaPayFragment.f74087L;
        ButtonState buttonState = (dVar == null || (stateFlowAsStateFlow = FlowKt.asStateFlow(dVar.f74049c)) == null || (hVar = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h) stateFlowAsStateFlow.getValue()) == null) ? null : hVar.f74072c;
        int i8 = buttonState == null ? -1 : a.f74124a[buttonState.ordinal()];
        String str = i8 != 1 ? i8 != 2 ? i8 != 3 ? "" : "充值兑换并购买" : "立即充值" : "确认购买";
        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar2 = mangaPayFragment.f74087L;
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("chapter_id", dVar2 != null ? dVar2.O0() : ""), TuplesKt.to("manga_pay_type", mangaPayFragment.wf())});
        if (!z6) {
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar3 = mangaPayFragment.f74087L;
            String strValueOf = "";
            if (dVar3 != null) {
                StateFlow stateFlowAsStateFlow2 = FlowKt.asStateFlow(dVar3.f74048b);
                strValueOf = "";
                if (stateFlowAsStateFlow2 != null) {
                    com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.b bVar = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.b) stateFlowAsStateFlow2.getValue();
                    strValueOf = "";
                    if (bVar != null) {
                        strValueOf = String.valueOf(bVar.f74039b);
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                    }
                }
            }
            mapMutableMapOf.put("coin_count", strValueOf);
        }
        if (!z7) {
            mapMutableMapOf.put("pay_button_type", str);
        }
        if (!z8) {
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar4 = mangaPayFragment.f74087L;
            ComicShowUiStatus comicShowUiStatus = null;
            if (dVar4 != null) {
                StateFlow stateFlowAsStateFlow3 = FlowKt.asStateFlow(dVar4.f74047a);
                comicShowUiStatus = null;
                if (stateFlowAsStateFlow3 != null) {
                    com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c cVar = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c) stateFlowAsStateFlow3.getValue();
                    comicShowUiStatus = null;
                    if (cVar != null) {
                        comicShowUiStatus = cVar.f74042a;
                    }
                }
            }
            if ((comicShowUiStatus == null ? -1 : a.f74125b[comicShowUiStatus.ordinal()]) == 1) {
                com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar5 = mangaPayFragment.f74087L;
                int i9 = -1;
                if (dVar5 != null) {
                    StateFlow stateFlowAsStateFlow4 = FlowKt.asStateFlow(dVar5.f74047a);
                    i9 = -1;
                    if (stateFlowAsStateFlow4 != null) {
                        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c cVar2 = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c) stateFlowAsStateFlow4.getValue();
                        i9 = -1;
                        if (cVar2 != null) {
                            i9 = cVar2.f74045d;
                        }
                    }
                }
                C1612a.c(i9, "is_bulk_buy", "1", "bulk_buy_count", mapMutableMapOf);
            } else {
                mapMutableMapOf.put("is_bulk_buy", "0");
            }
        }
        if (map2 != null) {
            mapMutableMapOf.putAll(map2);
        }
        return mapMutableMapOf;
    }

    public static String tf(Float f7) {
        return f7 == null ? "" : new StringBuilder(new DecimalFormat("0.##").format(f7)).toString();
    }

    public static SpannableString zf(@ColorInt int i7, String str, Function1 function1) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new p(i7, str, function1), 0, spannableString.length(), 17);
        return spannableString;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Af(java.lang.String r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.Af(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Bf(kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.Bf(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void Cf(View view, boolean z6) {
        Window window;
        if (!z6) {
            MangaLoadingView mangaLoadingView = this.f74082G;
            if (mangaLoadingView != null) {
                mangaLoadingView.setVisibility(0);
                mangaLoadingView.f74074a.startAnimation(mangaLoadingView.f74075b);
                return;
            }
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setDimAmount(0.0f);
    }

    public final void Df(String str) {
        ToastHelper.showToast(requireContext(), str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Ef() {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.Ef():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Ff() {
        /*
            Method dump skipped, instruction units count: 1105
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.Ff():void");
    }

    public final void of() {
        PopupWindow popupWindow = this.f74092Q;
        if (popupWindow != null) {
            Contract contractAb = ConfigManager.Companion.ab();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                Thread threadCurrentThread = Thread.currentThread();
                if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                    IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                    Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                }
            }
            popupWindow.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            super.onCreate(r1)
            r0 = r6
            r1 = 1
            r2 = 2131888810(0x7f120aaa, float:1.9412266E38)
            r0.setStyle(r1, r2)
            r0 = r6
            androidx.lifecycle.ViewModelProvider r1 = new androidx.lifecycle.ViewModelProvider
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            java.lang.Class<com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d> r2 = com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d.class
            androidx.lifecycle.ViewModel r1 = r1.get(r2)
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d r1 = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d) r1
            r0.f74087L = r1
            r0 = r6
            r1 = 1
            r0.f74096U = r1
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()     // Catch: java.lang.Exception -> L45
            r7 = r0
            java.lang.String r0 = ""
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L49
            r0 = r7
            java.lang.String r1 = "comic_id"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L45
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L4c
            goto L49
        L45:
            r7 = move-exception
            goto L89
        L49:
            java.lang.String r0 = ""
            r7 = r0
        L4c:
            r0 = r6
            r1 = r7
            r0.f74084I = r1     // Catch: java.lang.Exception -> L45
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()     // Catch: java.lang.Exception -> L45
            r9 = r0
            r0 = r8
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L6f
            r0 = r9
            java.lang.String r1 = "epId"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L45
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L6f
            r0 = r8
            r7 = r0
            goto L6f
        L6f:
            r0 = r6
            r1 = r7
            r0.f74085J = r1     // Catch: java.lang.Exception -> L45
            r0 = r6
            r1 = r6
            android.content.Context r1 = r1.requireContext()     // Catch: java.lang.Exception -> L45
            com.bilibili.base.BiliGlobalPreferenceHelper r1 = com.bilibili.base.BiliGlobalPreferenceHelper.getInstance(r1)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "manga-pay-is-agree_protocol"
            r3 = 0
            boolean r1 = r1.optBoolean(r2, r3)     // Catch: java.lang.Exception -> L45
            r0.f74088M = r1     // Catch: java.lang.Exception -> L45
            goto L9c
        L89:
            java.lang.String r0 = "requireContext error in isAgreeProtocol, message: "
            r1 = r7
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = ", stack: "
            r3 = r7
            java.lang.String r3 = kotlin.ExceptionsKt.stackTraceToString(r3)
            java.lang.String r4 = "MangaPayFragmentTag"
            com.bilibili.adcommon.utils.i.a(r0, r1, r2, r3, r4)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        try {
            View viewInflate = layoutInflater.inflate(2131500913, viewGroup, false);
            this.f74081F = viewInflate;
            sf(viewInflate);
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setLayout(-1, -1);
                window.setGravity(17);
                window.setBackgroundDrawableResource(2131103315);
                Context context = getContext();
                if (context != null) {
                    window.setStatusBarColor(ContextCompat.getColor(context, 2131103315));
                }
            }
            rf();
            Cf(this.f74081F, true);
        } catch (Exception e7) {
            BLog.e("MangaPayFragmentTag", androidx.constraintlayout.motion.widget.p.a("onCreateView exception.... message:", e7.getMessage(), ", stack: ", ExceptionsKt.stackTraceToString(e7), ", will dismiss this dialog...."));
            this.f74096U = false;
            dismissAllowingStateLoss();
        }
        return this.f74081F;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        of();
        a.C0133a c0133a = this.f74086K;
        if (c0133a != null) {
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar = this.f74087L;
            boolean z6 = dVar != null && dVar.f74051e;
            boolean z7 = false;
            if (dVar != null) {
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(dVar.f74048b);
                z7 = false;
                if (stateFlowAsStateFlow != null) {
                    com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.b bVar = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.b) stateFlowAsStateFlow.getValue();
                    z7 = false;
                    if (bVar != null) {
                        z7 = false;
                        if (bVar.f74038a) {
                            z7 = true;
                        }
                    }
                }
            }
            c0133a.f25594a.resumeWith(Result.constructor-impl(new C7685c(z6, z7)));
        }
        if (this.f74096U) {
            ComicShowUiStatus comicShowUiStatus = this.f74093R;
            if ((comicShowUiStatus == null ? -1 : a.f74125b[comicShowUiStatus.ordinal()]) == 1) {
                pf().h(nf(this, null, true, true, true, 1));
            } else {
                pf().i(nf(this, null, true, true, true, 1));
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final MangaBuriedReporter pf() {
        return (MangaBuriedReporter) this.f74099X.getValue();
    }

    public final void qf(View view) {
        Window window;
        if (view != null) {
            view.setVisibility(0);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount(0.5f);
        }
        MangaLoadingView mangaLoadingView = this.f74082G;
        if (mangaLoadingView != null) {
            mangaLoadingView.setVisibility(8);
            mangaLoadingView.f74075b.cancel();
        }
    }

    public final void rf() {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initFlow$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initFlow$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initFlow$3(this, null), 3, (Object) null);
    }

    public final void sf(View view) {
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(requireContext());
        View viewFindViewById = view != null ? view.findViewById(2131316909) : null;
        this.f74083H = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(ContextCompat.getColor(requireContext(), R$color.f64616Wh0));
        }
        TextView textView = view != null ? (TextView) view.findViewById(2131316941) : null;
        this.f74080E = textView;
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView textView2 = this.f74080E;
        if (textView2 != null) {
            textView2.setHighlightColor(ContextCompat.getColor(requireContext(), 2131103315));
        }
        final int i7 = 0;
        SpannableString spannableStringZf = zf(ContextCompat.getColor(requireContext(), R$color.Pi5), getResources().getString(2131838495), new Function1(this, i7) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f74147a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f74148b;

            {
                this.f74147a = i7;
                this.f74148b = this;
            }

            public final Object invoke(Object obj) {
                switch (this.f74147a) {
                    case 0:
                        BLRouter.routeTo(RouteRequestKt.toRouteRequest("https://manga.bilibili.com/blackboard/activity-70IF5pV45G.html").newBuilder().build(), (MangaPayFragment) this.f74148b);
                        break;
                    default:
                        ((Router) this.f74148b).launch((Uri) obj);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        SpannableString spannableStringZf2 = zf(ContextCompat.getColor(requireContext(), R$color.Pi5), getResources().getString(2131838494), new f(this, 0));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getResources().getString(2131838465));
        spannableStringBuilder.append((CharSequence) spannableStringZf).append((CharSequence) spannableStringZf2);
        TextView textView3 = this.f74080E;
        if (textView3 != null) {
            textView3.setText(spannableStringBuilder);
        }
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(2131316911) : null;
        this.f74113p = recyclerView;
        if (recyclerView != null) {
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(this, context) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initView$1$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MangaPayFragment f74127a;

                {
                    this.f74127a = this;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollHorizontally() {
                    return this.f74127a.f74116s;
                }
            });
            recyclerView.addItemDecoration(new RecyclerView.ItemDecoration());
            MangaCommonAdapter mangaCommonAdapter = new MangaCommonAdapter();
            MangaCommonAdapter.MangaRVType.BuyCollectionType.getType();
            mangaCommonAdapter.f74008a = this;
            this.f74114q = mangaCommonAdapter;
            recyclerView.setAdapter(mangaCommonAdapter);
        }
        RecyclerView recyclerView2 = view != null ? (RecyclerView) view.findViewById(2131316912) : null;
        if (recyclerView2 != null) {
            final Context context2 = recyclerView2.getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(this, context2) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initView$2$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MangaPayFragment f74128a;

                {
                    this.f74128a = this;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollHorizontally() {
                    return this.f74128a.f74123z;
                }
            });
            recyclerView2.addItemDecoration(new RecyclerView.ItemDecoration());
            MangaCommonAdapter mangaCommonAdapter2 = new MangaCommonAdapter();
            MangaCommonAdapter.MangaRVType.PayLevelType.getType();
            mangaCommonAdapter2.f74008a = this;
            this.f74122y = mangaCommonAdapter2;
            recyclerView2.setAdapter(mangaCommonAdapter2);
        }
        this.f74103e = view != null ? (TextView) view.findViewById(2131316937) : null;
        this.f74104f = view != null ? (TextView) view.findViewById(2131316930) : null;
        this.f74101c = view != null ? (TextView) view.findViewById(2131316943) : null;
        BiliImageView biliImageViewFindViewById = view != null ? view.findViewById(2131317639) : null;
        this.f74107j = biliImageViewFindViewById;
        if (biliImageViewFindViewById != null) {
            biliImageViewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MangaPayFragment f74151a;

                {
                    this.f74151a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MangaPayFragment mangaPayFragment = this.f74151a;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mangaPayFragment), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initView$3$1(mangaPayFragment, null), 3, (Object) null);
                }
            });
        }
        View viewFindViewById2 = view != null ? view.findViewById(2131316883) : null;
        this.f74105g = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MangaPayFragment f74152a;

                {
                    this.f74152a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MangaPayFragment mangaPayFragment = this.f74152a;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mangaPayFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initView$4$1(mangaPayFragment, null), 3, (Object) null);
                }
            });
        }
        this.h = view != null ? (TextView) view.findViewById(2131316946) : null;
        ImageView imageView = view != null ? (ImageView) view.findViewById(2131316872) : null;
        this.f74106i = imageView;
        if (zIsNightTheme) {
            if (imageView != null) {
                imageView.setImageResource(2131234658);
            }
        } else if (imageView != null) {
            imageView.setImageResource(2131234657);
        }
        ImageView imageView2 = this.f74106i;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MangaPayFragment f74153a;

                {
                    this.f74153a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f74153a.dismissAllowingStateLoss();
                }
            });
        }
        this.f74102d = view != null ? (ImageView) view.findViewById(2131316871) : null;
        if (zIsNightTheme) {
            Drawable drawable = ContextCompat.getDrawable(requireContext(), 2131241736);
            if (drawable != null) {
                drawable.setTint(Color.parseColor("#9499A0"));
            }
            ImageView imageView3 = this.f74102d;
            if (imageView3 != null) {
                imageView3.setImageDrawable(drawable);
            }
        } else {
            Drawable drawable2 = ContextCompat.getDrawable(requireContext(), 2131241736);
            if (drawable2 != null) {
                drawable2.setTint(Color.parseColor("#61666D"));
            }
            ImageView imageView4 = this.f74102d;
            if (imageView4 != null) {
                imageView4.setImageResource(2131241736);
            }
        }
        ImageView imageView5 = this.f74102d;
        if (imageView5 != null) {
            imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MangaPayFragment f74154a;

                {
                    this.f74154a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MangaPayFragment mangaPayFragment = this.f74154a;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mangaPayFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initView$6$1(mangaPayFragment, null), 3, (Object) null);
                }
            });
        }
        this.f74108k = view != null ? (BiliImageView) view.findViewById(2131316873) : null;
        this.f74109l = view != null ? (LinearLayout) view.findViewById(2131316904) : null;
        this.f74110m = view != null ? (TextView) view.findViewById(2131316935) : null;
        this.f74111n = view != null ? (TextView) view.findViewById(2131316933) : null;
        this.f74112o = view != null ? (TextView) view.findViewById(2131316934) : null;
        this.f74115r = view != null ? (ImageView) view.findViewById(2131316900) : null;
        Drawable drawable3 = ContextCompat.getDrawable(requireContext(), 2131236655);
        if (drawable3 != null) {
            drawable3.setTint(ContextCompat.getColor(requireContext(), R$color.Pi5));
        }
        ImageView imageView6 = this.f74115r;
        if (imageView6 != null) {
            imageView6.setImageDrawable(drawable3);
        }
        this.f74117t = view != null ? (TextView) view.findViewById(2131316947) : null;
        this.f74118u = view != null ? (TextView) view.findViewById(2131316949) : null;
        this.f74119v = view != null ? (TextView) view.findViewById(2131316948) : null;
        this.f74120w = view != null ? (TextView) view.findViewById(2131316939) : null;
        ImageView imageView7 = view != null ? (ImageView) view.findViewById(2131316874) : null;
        if (zIsNightTheme) {
            if (imageView7 != null) {
                imageView7.setImageResource(2131241740);
            }
        } else if (imageView7 != null) {
            imageView7.setImageResource(2131241739);
        }
        this.f74121x = view != null ? view.findViewById(2131316882) : null;
        if (view != null) {
        }
        Button button = view != null ? (Button) view.findViewById(2131316879) : null;
        this.f74076A = button;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MangaPayFragment f74155a;

                {
                    this.f74155a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MangaPayFragment mangaPayFragment = this.f74155a;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mangaPayFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initView$7$1(mangaPayFragment, null), 3, (Object) null);
                }
            });
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initView$8(this, null), 3, (Object) null);
        ImageView imageView8 = view != null ? (ImageView) view.findViewById(2131316875) : null;
        this.f74078C = imageView8;
        if (this.f74088M) {
            if (imageView8 != null) {
                imageView8.setImageResource(2131234628);
            }
        } else if (imageView8 != null) {
            imageView8.setImageResource(2131234626);
        }
        ImageView imageView9 = this.f74078C;
        if (imageView9 != null) {
            imageView9.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.opd.app.bizcommon.mangapaysdk.view.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MangaPayFragment f74156a;

                {
                    this.f74156a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MangaPayFragment mangaPayFragment = this.f74156a;
                    mangaPayFragment.of();
                    boolean z6 = mangaPayFragment.f74088M;
                    mangaPayFragment.f74088M = !z6;
                    if (z6) {
                        ImageView imageView10 = mangaPayFragment.f74078C;
                        if (imageView10 != null) {
                            imageView10.setImageResource(2131234626);
                        }
                    } else {
                        ImageView imageView11 = mangaPayFragment.f74078C;
                        if (imageView11 != null) {
                            imageView11.setImageResource(2131234628);
                        }
                    }
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mangaPayFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$initView$9$1(mangaPayFragment, null), 3, (Object) null);
                }
            });
        }
        this.f74079D = view != null ? (TextView) view.findViewById(2131316897) : null;
        TextView textView4 = this.f74103e;
        if (textView4 != null) {
            textView4.setTextColor(ContextCompat.getColor(requireContext(), R$color.Ga10));
        }
        TextView textView5 = this.f74120w;
        if (textView5 != null) {
            textView5.setTextColor(ContextCompat.getColor(requireContext(), R$color.Ga10));
        }
        MangaLoadingView mangaLoadingView = null;
        if (view != null) {
            mangaLoadingView = (MangaLoadingView) view.findViewById(2131316884);
        }
        this.f74082G = mangaLoadingView;
    }

    public final String uf(Float f7, boolean z6) {
        if (f7 == null) {
            return "";
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(2131838480));
        if (z6) {
            sb.append(getResources().getString(2131838482));
        }
        sb.append(decimalFormat.format(f7));
        return sb.toString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c vf() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment.vf():com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String wf() throws NoWhenBranchMatchedException {
        String str;
        StateFlow stateFlowAsStateFlow;
        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c cVar;
        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar = this.f74087L;
        ComicShowUiStatus comicShowUiStatus = (dVar == null || (stateFlowAsStateFlow = FlowKt.asStateFlow(dVar.f74047a)) == null || (cVar = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.c) stateFlowAsStateFlow.getValue()) == null) ? null : cVar.f74042a;
        switch (comicShowUiStatus == null ? -1 : a.f74125b[comicShowUiStatus.ordinal()]) {
            case -1:
                str = "null上报";
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                str = "单话付费";
                break;
            case 4:
            case 6:
                str = "卷话付费";
                break;
            case 5:
                str = "单卷付费";
                break;
        }
        return str;
    }

    public final String xf(Integer num) {
        String string;
        if ((num != null ? num.intValue() : 0) <= 0) {
            string = getResources().getString(2131838466);
        } else {
            string = getResources().getString(2131838503) + num + getResources().getString(2131838508);
        }
        return string;
    }

    public final void yf(int i7, @NotNull MangaCommonAdapter.b bVar) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MangaPayFragment$onClickAction$1(bVar, this, i7, null), 3, (Object) null);
    }
}
