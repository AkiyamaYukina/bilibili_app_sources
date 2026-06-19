package com.bilibili.relation;

import Di0.C1602f;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.L8;
import androidx.compose.material3.M8;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.PopupBgColor;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialog;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.theme.R$color;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.relation.A;
import com.bilibili.relation.FollowStateManager;
import com.bilibili.relation.api.Attention;
import com.bilibili.relation.api.RelationApiCallback;
import com.bilibili.relation.api.RelationApiManager;
import com.bilibili.relation.api.ResponseChangeRelation;
import com.bilibili.relation.utils.FollowFlowHelper;
import java.util.HashMap;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.router.Router;
import kntr.common.comment.card.model.comment.CommentUserInfoRendererModel;
import kntr.common.router.UrisKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/FollowMenuContentKt.class */
public final class FollowMenuContentKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/FollowMenuContentKt$a.class */
    public static final class a extends BiliApiDataCallback<Attention> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f85897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f85898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C6033z f85899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f85900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f85901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f85902g;
        public final FollowFlowHelper.FollowFlowCallback h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final c0 f85903i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final FollowStateManager.FollowChangeListener f85904j;

        public a(Context context, Rect rect, C6033z c6033z, long j7, boolean z6, boolean z7, FollowFlowHelper.FollowFlowCallback followFlowCallback, c0 c0Var, FollowStateManager.FollowChangeListener followChangeListener) {
            this.f85897b = context;
            this.f85898c = rect;
            this.f85899d = c6033z;
            this.f85900e = j7;
            this.f85901f = z6;
            this.f85902g = z7;
            this.h = followFlowCallback;
            this.f85903i = c0Var;
            this.f85904j = followChangeListener;
        }

        /* JADX WARN: Type inference failed for: r0v19, types: [com.bilibili.relation.P] */
        /* JADX WARN: Type inference failed for: r0v22, types: [com.bilibili.relation.Q] */
        /* JADX WARN: Type inference failed for: r0v23, types: [com.bilibili.relation.S] */
        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(Attention attention) {
            Attention attention2 = attention;
            if (attention2 == null) {
                return;
            }
            boolean z6 = attention2.special == 1;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Context context = this.f85897b;
            final long j7 = this.f85900e;
            final boolean z7 = this.f85901f;
            final boolean z8 = this.f85902g;
            final FollowFlowHelper.FollowFlowCallback followFlowCallback = this.h;
            final c0 c0Var = this.f85903i;
            final boolean z9 = z6;
            final ?? r02 = new Function1(context, j7, z9, z7, z8, followFlowCallback, c0Var, objectRef) { // from class: com.bilibili.relation.P

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f85953a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f85954b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f85955c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final boolean f85956d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f85957e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final FollowFlowHelper.FollowFlowCallback f85958f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final c0 f85959g;
                public final Ref.ObjectRef h;

                {
                    this.f85953a = context;
                    this.f85954b = j7;
                    this.f85955c = z9;
                    this.f85956d = z7;
                    this.f85957e = z8;
                    this.f85958f = followFlowCallback;
                    this.f85959g = c0Var;
                    this.h = objectRef;
                }

                public final Object invoke(Object obj) {
                    ScreenAdjustPopupDialog screenAdjustPopupDialog;
                    Context context2 = this.f85953a;
                    ((Boolean) obj).booleanValue();
                    HashMap<String, String> map = this.f85959g.f86054e;
                    String accessKey = BiliAccounts.get(context2).getAccessKey();
                    long j8 = this.f85954b;
                    boolean z10 = this.f85955c;
                    boolean z11 = this.f85956d;
                    boolean z12 = this.f85957e;
                    FollowFlowHelper.FollowFlowCallback followFlowCallback2 = this.f85958f;
                    if (z10) {
                        if (map != null) {
                            map.put("action_type", "interaction_special_unfollow");
                            map.put(NotificationCompat.CATEGORY_STATUS, UR0.D.c(z11, z12));
                            UR0.D.d(map);
                        }
                        RelationApiManager.removeSpecial(accessKey, String.valueOf(j8), new d0(context2, true, followFlowCallback2));
                    } else {
                        if (map != null) {
                            map.put("action_type", "interaction_special_follow");
                            map.put(NotificationCompat.CATEGORY_STATUS, UR0.D.c(z11, z12));
                            UR0.D.d(map);
                        }
                        RelationApiManager.addSpecial(accessKey, String.valueOf(j8), new d0(context2, false, followFlowCallback2));
                    }
                    Object obj2 = this.h.element;
                    if (obj2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        screenAdjustPopupDialog = null;
                    } else {
                        screenAdjustPopupDialog = (ScreenAdjustPopupDialog) obj2;
                    }
                    screenAdjustPopupDialog.dismiss();
                    return Unit.INSTANCE;
                }
            };
            final C6033z c6033z = this.f85899d;
            final ?? r03 = new Function0(context, j7, c6033z, objectRef) { // from class: com.bilibili.relation.Q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f85960a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f85961b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final C6033z f85962c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Ref.ObjectRef f85963d;

                {
                    this.f85960a = context;
                    this.f85961b = j7;
                    this.f85962c = c6033z;
                    this.f85963d = objectRef;
                }

                public final Object invoke() {
                    ScreenAdjustPopupDialog screenAdjustPopupDialog;
                    Context context2 = this.f85960a;
                    C6033z c6033z2 = this.f85962c;
                    FollowMenuContentKt.f(context2, this.f85961b, c6033z2.f86243b, c6033z2.f86244c);
                    Object obj = this.f85963d.element;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        screenAdjustPopupDialog = null;
                    } else {
                        screenAdjustPopupDialog = (ScreenAdjustPopupDialog) obj;
                    }
                    screenAdjustPopupDialog.dismiss();
                    return Unit.INSTANCE;
                }
            };
            final FollowStateManager.FollowChangeListener followChangeListener = this.f85904j;
            final ?? r04 = new Function0(context, j7, c0Var, z7, z8, followFlowCallback, followChangeListener, c6033z, objectRef) { // from class: com.bilibili.relation.S

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f85964a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f85965b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final c0 f85966c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final boolean f85967d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f85968e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final FollowFlowHelper.FollowFlowCallback f85969f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final FollowStateManager.FollowChangeListener f85970g;
                public final C6033z h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final Ref.ObjectRef f85971i;

                {
                    this.f85964a = context;
                    this.f85965b = j7;
                    this.f85966c = c0Var;
                    this.f85967d = z7;
                    this.f85968e = z8;
                    this.f85969f = followFlowCallback;
                    this.f85970g = followChangeListener;
                    this.h = c6033z;
                    this.f85971i = objectRef;
                }

                public final Object invoke() {
                    ScreenAdjustPopupDialog screenAdjustPopupDialog;
                    Context context2 = this.f85964a;
                    c0 c0Var2 = this.f85966c;
                    int i7 = c0Var2.f86050a;
                    String str = c0Var2.f86051b;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    String str3 = c0Var2.f86052c;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "";
                    }
                    String str5 = c0Var2.f86053d;
                    String str6 = str5;
                    if (str5 == null) {
                        str6 = "";
                    }
                    HashMap<String, String> map = c0Var2.f86054e;
                    String str7 = c0Var2.f86055f;
                    if (str7 == null) {
                        str7 = "";
                    }
                    FollowMenuContentKt.g(context2, this.f85965b, i7, str2, str4, str6, this.f85967d, this.f85968e, map, str7, this.f85969f, this.f85970g, this.h.f86242a);
                    Object obj = this.f85971i.element;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        screenAdjustPopupDialog = null;
                    } else {
                        screenAdjustPopupDialog = (ScreenAdjustPopupDialog) obj;
                    }
                    screenAdjustPopupDialog.dismiss();
                    return Unit.INSTANCE;
                }
            };
            final boolean z10 = z6;
            ScreenAdjustPopupDialog screenAdjustPopupDialog = new ScreenAdjustPopupDialog(context, this.f85898c, ComposableLambdaKt.composableLambdaInstance(-1177039472, true, new Function2(z10, r02, r03, r04) { // from class: com.bilibili.relation.T

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f85972a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final P f85973b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Q f85974c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final S f85975d;

                {
                    this.f85972a = z10;
                    this.f85973b = r02;
                    this.f85974c = r03;
                    this.f85975d = r04;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1177039472, iIntValue, -1, "com.bilibili.relation.createFollowPopupDialog.<no name provided>.onDataSuccess.<anonymous> (FollowMenuContent.kt:169)");
                        }
                        FollowMenuContentKt.a(this.f85972a, this.f85973b, this.f85974c, this.f85975d, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }), 200, (MutableStateFlow) null, c6033z.f86244c, (PopupBgColor) null, false, true, 208, (DefaultConstructorMarker) null);
            objectRef.element = screenAdjustPopupDialog;
            screenAdjustPopupDialog.show();
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/FollowMenuContentKt$b.class */
    public static final class b implements RelationApiCallback<ResponseChangeRelation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f85905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FollowStateManager.FollowChangeListener f85906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FollowFlowHelper.FollowFlowCallback f85907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f85908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Function0<Unit> f85909e;

        public b(long j7, FollowStateManager.FollowChangeListener followChangeListener, FollowFlowHelper.FollowFlowCallback followFlowCallback, Context context, Function0<Unit> function0) {
            this.f85905a = j7;
            this.f85906b = followChangeListener;
            this.f85907c = followFlowCallback;
            this.f85908d = context;
            this.f85909e = function0;
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final boolean isCancel() {
            Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.f85908d);
            boolean z6 = false;
            if (activityFindActivityOrNull != null) {
                z6 = false;
                if (activityFindActivityOrNull.isFinishing()) {
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final void onDataSuccess(ResponseChangeRelation responseChangeRelation) {
            FollowStateManager.Companion.getInstance().notify(this.f85905a, false, this.f85906b);
            FollowFlowHelper.FollowFlowCallback followFlowCallback = this.f85907c;
            if (followFlowCallback != null) {
                followFlowCallback.onUnFollowSuccess();
            }
            ToastHelper.showToastShort(this.f85908d, 2131847632);
            this.f85909e.invoke();
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final void onError(Throwable th) {
            FollowFlowHelper.FollowFlowCallback followFlowCallback = this.f85907c;
            if (followFlowCallback == null || !followFlowCallback.onUnFollowError(th)) {
                return;
            }
            String message = th instanceof BiliApiException ? ((BiliApiException) th).getMessage() : !ConnectivityMonitor.getInstance().isNetworkActive() ? this.f85908d.getString(2131847652) : null;
            String string = message;
            if (TextUtils.isEmpty(message)) {
                string = this.f85908d.getString(2131847616);
            }
            ToastHelper.showToastShort(this.f85908d, string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ba  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r9, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function1 r10, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0 r11, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0 r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.FollowMenuContentKt.a(boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final int r26, final int r27, androidx.compose.runtime.Composer r28, final java.lang.String r29, final kotlin.jvm.functions.Function0 r30) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.FollowMenuContentKt.b(int, int, androidx.compose.runtime.Composer, java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(@org.jetbrains.annotations.NotNull final com.bilibili.relation.B r8, @org.jetbrains.annotations.NotNull final com.bilibili.relation.H r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, final int r11) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.FollowMenuContentKt.c(com.bilibili.relation.B, com.bilibili.relation.H, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@NotNull J j7, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1140415544);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1140415544, i8, -1, "com.bilibili.relation.SingleUnFollowMenuContent (FollowMenuContent.kt:451)");
            }
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m3880constructorimpl(8), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b(2131238951, (i8 << 6) & 896, composerStartRestartGroup, StringResources_androidKt.stringResource(2131821393, composerStartRestartGroup, 0), j7);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.ad.adview.videodetail.pausedpage.brand.h(j7, i7, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.bilibili.relation.J] */
    public static final void e(@NotNull final Context context, @NotNull Rect rect, final long j7, final boolean z6, final boolean z7, @NotNull A a7, @NotNull final c0 c0Var, @NotNull final C6033z c6033z, @Nullable final FollowFlowHelper.FollowFlowCallback followFlowCallback, @Nullable FollowStateManager.FollowChangeListener followChangeListener) {
        if (Intrinsics.areEqual(a7, A.a.f85874a)) {
            RelationApiManager.getRelation(BiliAccounts.get(context).getAccessKey(), String.valueOf(j7), new a(context, rect, c6033z, j7, z6, z7, followFlowCallback, c0Var, followChangeListener));
            return;
        }
        if (Intrinsics.areEqual(a7, A.b.f85875a)) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            ScreenAdjustPopupDialog screenAdjustPopupDialog = new ScreenAdjustPopupDialog(context, rect, ComposableLambdaKt.composableLambdaInstance(-2008635948, true, new L8(1, new B(booleanRef, context, j7, c6033z, objectRef), new Function0(booleanRef, context, j7, c0Var, z6, z7, followFlowCallback, c6033z, objectRef) { // from class: com.bilibili.relation.H

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.BooleanRef f85919a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Context f85920b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f85921c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final c0 f85922d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f85923e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final boolean f85924f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final FollowFlowHelper.FollowFlowCallback f85925g;
                public final C6033z h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final Ref.ObjectRef f85926i;

                {
                    this.f85919a = booleanRef;
                    this.f85920b = context;
                    this.f85921c = j7;
                    this.f85922d = c0Var;
                    this.f85923e = z6;
                    this.f85924f = z7;
                    this.f85925g = followFlowCallback;
                    this.h = c6033z;
                    this.f85926i = objectRef;
                }

                public final Object invoke() {
                    ScreenAdjustPopupDialog screenAdjustPopupDialog2;
                    Context context2 = this.f85920b;
                    this.f85919a.element = true;
                    c0 c0Var2 = this.f85922d;
                    int i7 = c0Var2.f86050a;
                    String str = c0Var2.f86051b;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    String str3 = c0Var2.f86052c;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "";
                    }
                    String str5 = c0Var2.f86053d;
                    String str6 = str5;
                    if (str5 == null) {
                        str6 = "";
                    }
                    HashMap<String, String> map = c0Var2.f86054e;
                    String str7 = c0Var2.f86055f;
                    if (str7 == null) {
                        str7 = "";
                    }
                    FollowMenuContentKt.g(context2, this.f85921c, i7, str2, str4, str6, this.f85923e, this.f85924f, map, str7, this.f85925g, null, this.h.f86242a);
                    Object obj = this.f85926i.element;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        screenAdjustPopupDialog2 = null;
                    } else {
                        screenAdjustPopupDialog2 = (ScreenAdjustPopupDialog) obj;
                    }
                    screenAdjustPopupDialog2.dismiss();
                    return Unit.INSTANCE;
                }
            })), 200, (MutableStateFlow) null, new M8(1, booleanRef, c6033z), (PopupBgColor) null, false, true, 208, (DefaultConstructorMarker) null);
            objectRef.element = screenAdjustPopupDialog;
            screenAdjustPopupDialog.show();
            return;
        }
        if (Intrinsics.areEqual(a7, A.c.f85876a)) {
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            final ?? r8 = new Function0(context, j7, c0Var, z6, z7, followFlowCallback, c6033z, objectRef2) { // from class: com.bilibili.relation.J

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f85932a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f85933b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final c0 f85934c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final boolean f85935d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f85936e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final FollowFlowHelper.FollowFlowCallback f85937f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final C6033z f85938g;
                public final Ref.ObjectRef h;

                {
                    this.f85932a = context;
                    this.f85933b = j7;
                    this.f85934c = c0Var;
                    this.f85935d = z6;
                    this.f85936e = z7;
                    this.f85937f = followFlowCallback;
                    this.f85938g = c6033z;
                    this.h = objectRef2;
                }

                public final Object invoke() {
                    ScreenAdjustPopupDialog screenAdjustPopupDialog2;
                    Context context2 = this.f85932a;
                    c0 c0Var2 = this.f85934c;
                    int i7 = c0Var2.f86050a;
                    String str = c0Var2.f86051b;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    String str3 = c0Var2.f86052c;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "";
                    }
                    String str5 = c0Var2.f86053d;
                    String str6 = str5;
                    if (str5 == null) {
                        str6 = "";
                    }
                    HashMap<String, String> map = c0Var2.f86054e;
                    String str7 = c0Var2.f86055f;
                    if (str7 == null) {
                        str7 = "";
                    }
                    FollowMenuContentKt.g(context2, this.f85933b, i7, str2, str4, str6, this.f85935d, this.f85936e, map, str7, this.f85937f, null, this.f85938g.f86242a);
                    Object obj = this.h.element;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        screenAdjustPopupDialog2 = null;
                    } else {
                        screenAdjustPopupDialog2 = (ScreenAdjustPopupDialog) obj;
                    }
                    screenAdjustPopupDialog2.dismiss();
                    return Unit.INSTANCE;
                }
            };
            ScreenAdjustPopupDialog screenAdjustPopupDialog2 = new ScreenAdjustPopupDialog(context, rect, ComposableLambdaKt.composableLambdaInstance(-742565163, true, new Function2(r8) { // from class: com.bilibili.relation.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final J f85939a;

                {
                    this.f85939a = r8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-742565163, iIntValue, -1, "com.bilibili.relation.createFollowPopupDialog.<anonymous> (FollowMenuContent.kt:263)");
                        }
                        FollowMenuContentKt.d(this.f85939a, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }), 200, (MutableStateFlow) null, c6033z.f86244c, (PopupBgColor) null, false, true, 208, (DefaultConstructorMarker) null);
            objectRef2.element = screenAdjustPopupDialog2;
            screenAdjustPopupDialog2.show();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.relation.L, kotlin.jvm.functions.Function0] */
    public static final void f(@NotNull Context context, final long j7, @NotNull final Function2<? super List<String>, ? super List<String>, Unit> function2, @NotNull final Function0<Unit> function0) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        ComponentActivity componentActivity = (ComponentActivity) ContextUtilKt.findTypedActivityOrNull(context, ComponentActivity.class);
        if (componentActivity == null) {
            return;
        }
        final int i7 = 0;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final ?? r02 = new Function0(i7, booleanRef, function0) { // from class: com.bilibili.relation.L

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f85940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f85941b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f85942c;

            {
                this.f85940a = i7;
                this.f85941b = booleanRef;
                this.f85942c = function0;
            }

            public final Object invoke() {
                switch (this.f85940a) {
                    case 0:
                        Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) this.f85941b;
                        if (!booleanRef2.element) {
                            booleanRef2.element = true;
                            ((Function0) this.f85942c).invoke();
                        }
                        break;
                    default:
                        ((Router) this.f85941b).launch(UrisKt.toUri(((CommentUserInfoRendererModel.e) this.f85942c).b));
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final com.bilibili.app.screen.adjust.widget.q qVar = new com.bilibili.app.screen.adjust.widget.q(componentActivity, composeView, G.b.a, (String) null, 0.0f, false, false, 0, (a.b) null, (MutableStateFlow) null, R$color.main_Ga1, 12280);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), (CoroutineContext) null, (CoroutineStart) null, new FollowMenuContentKt$handleSetGroupClick$1(qVar, r02, null), 3, (Object) null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-356710048, true, new Function2(j7, r02, qVar, function2) { // from class: com.bilibili.relation.M

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f85943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final L f85944b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.app.screen.adjust.widget.q f85945c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Function2 f85946d;

            {
                this.f85943a = j7;
                this.f85944b = r02;
                this.f85945c = qVar;
                this.f85946d = function2;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-356710048, iIntValue, -1, "com.bilibili.relation.handleSetGroupClick.<anonymous> (FollowMenuContent.kt:536)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-802985192, true, new Function2(this.f85943a, this.f85944b, this.f85945c, this.f85946d) { // from class: com.bilibili.relation.C

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final long f85882a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final L f85883b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final com.bilibili.app.screen.adjust.widget.q f85884c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final Function2 f85885d;

                        {
                            this.f85882a = j;
                            this.f85883b = l;
                            this.f85884c = qVar;
                            this.f85885d = function2;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                            /*
                                r7 = this;
                                r0 = r8
                                androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                                r13 = r0
                                r0 = r9
                                java.lang.Integer r0 = (java.lang.Integer) r0
                                int r0 = r0.intValue()
                                r10 = r0
                                r0 = r10
                                r1 = 3
                                r0 = r0 & r1
                                r1 = 2
                                if (r0 == r1) goto L1b
                                r0 = 1
                                r11 = r0
                                goto L1e
                            L1b:
                                r0 = 0
                                r11 = r0
                            L1e:
                                r0 = r13
                                r1 = r11
                                r2 = r10
                                r3 = 1
                                r2 = r2 & r3
                                boolean r0 = r0.shouldExecute(r1, r2)
                                if (r0 == 0) goto Laf
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L3c
                                r0 = -802985192(0xffffffffd0236b18, float:-1.0966819E10)
                                r1 = r10
                                r2 = -1
                                java.lang.String r3 = "com.bilibili.relation.handleSetGroupClick.<anonymous>.<anonymous> (FollowMenuContent.kt:537)"
                                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                            L3c:
                                r0 = r7
                                com.bilibili.relation.L r0 = r0.f85883b
                                r14 = r0
                                r0 = r13
                                r1 = r14
                                boolean r0 = r0.changed(r1)
                                r12 = r0
                                r0 = r7
                                com.bilibili.app.screen.adjust.widget.q r0 = r0.f85884c
                                r15 = r0
                                r0 = r13
                                r1 = r15
                                boolean r0 = r0.changedInstance(r1)
                                r11 = r0
                                r0 = r13
                                java.lang.Object r0 = r0.rememberedValue()
                                r9 = r0
                                r0 = r12
                                r1 = r11
                                r0 = r0 | r1
                                if (r0 != 0) goto L7a
                                r0 = r9
                                r8 = r0
                                r0 = r9
                                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                                java.lang.Object r1 = r1.getEmpty()
                                if (r0 != r1) goto L8f
                            L7a:
                                com.bilibili.app.comm.emoticon.ui.W r0 = new com.bilibili.app.comm.emoticon.ui.W
                                r1 = r0
                                r2 = 1
                                r3 = r14
                                r4 = r15
                                r1.<init>(r2, r3, r4)
                                r8 = r0
                                r0 = r13
                                r1 = r8
                                r0.updateRememberedValue(r1)
                            L8f:
                                r0 = r8
                                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                                r8 = r0
                                r0 = r7
                                long r0 = r0.f85882a
                                r1 = r8
                                r2 = r7
                                kotlin.jvm.functions.Function2 r2 = r2.f85885d
                                r3 = r13
                                r4 = 0
                                com.bilibili.relation.C6029v.a(r0, r1, r2, r3, r4)
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto Lb6
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                goto Lb6
                            Laf:
                                r0 = r13
                                r0.skipToGroupEnd()
                            Lb6:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.C.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        qVar.b();
    }

    public static final void g(@NotNull Context context, long j7, int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, boolean z7, @Nullable HashMap<String, String> map, @NotNull String str4, @Nullable FollowFlowHelper.FollowFlowCallback followFlowCallback, @Nullable FollowStateManager.FollowChangeListener followChangeListener, @NotNull Function0<Unit> function0) {
        UR0.D.f();
        if (map != null) {
            map.put("action_type", "interaction_unfollow");
            map.put(NotificationCompat.CATEGORY_STATUS, UR0.D.c(z6, z7));
            UR0.D.d(map);
        }
        RelationApiManager.modifyRelation(j7, 2, i7, str2, str3, str, str4, new b(j7, followChangeListener, followFlowCallback, context, function0));
    }
}
