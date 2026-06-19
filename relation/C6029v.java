package com.bilibili.relation;

import Di0.C1602f;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.C4549f;
import androidx.media3.exoplayer.analytics.C4666h;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.iconfont.KtxKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.relation.W;
import com.bilibili.relation.api.AttentionGroup;
import com.bilibili.relation.api.RelationService;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.relation.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/v.class */
public final class C6029v {

    /* JADX INFO: renamed from: com.bilibili.relation.v$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/v$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function2<String, String, Unit> f86188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AttentionGroup f86189b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super String, ? super String, Unit> function2, AttentionGroup attentionGroup) {
            this.f86188a = function2;
            this.f86189b = attentionGroup;
        }

        public final Object invoke() {
            AttentionGroup attentionGroup = this.f86189b;
            String str = attentionGroup.groupId;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            String str3 = attentionGroup.groupName;
            this.f86188a.invoke(str2, str3 != null ? str3 : "");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.relation.v$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/v$b.class */
    public static final class b implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f86190a;

        public b(List list) {
            this.f86190a = list;
        }

        public final Object invoke(Object obj) {
            this.f86190a.get(((Number) obj).intValue());
            return null;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.relation.v$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/v$c.class */
    public static final class c implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f86191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f86192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function2 f86193c;

        public c(List list, Map map, Function2 function2) {
            this.f86191a = list;
            this.f86192b = map;
            this.f86193c = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.C6029v.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final long j7, @Nullable final Function0 function0, @NotNull final Function2 function2, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1876293119);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function2) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1876293119, i10, -1, "com.bilibili.relation.AttentionGroupContent (AttentionGroupContent.kt:86)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object objMutableStateOf$default = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(W.c.f85987a, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            }
            final MutableState mutableState = (MutableState) objMutableStateOf$default;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object objMutableStateMapOf = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                objMutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objMutableStateMapOf);
            }
            final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objMutableStateMapOf;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Object arrayList = objRememberedValue3;
            if (objRememberedValue3 == companion.getEmpty()) {
                arrayList = new ArrayList();
                composerStartRestartGroup.updateRememberedValue(arrayList);
            }
            final List list = (List) arrayList;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Object objA = objRememberedValue4;
            if (objRememberedValue4 == companion.getEmpty()) {
                objA = C4549f.a(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState2 = (MutableState) objA;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Object objMutableStateMapOf2 = objRememberedValue5;
            if (objRememberedValue5 == companion.getEmpty()) {
                objMutableStateMapOf2 = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objMutableStateMapOf2);
            }
            final SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) objMutableStateMapOf2;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue6;
            if (objRememberedValue6 == companion.getEmpty()) {
                obj = (RelationService) ServiceGenerator.createService(RelationService.class);
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            final RelationService relationService = (RelationService) obj;
            final String accessKey = BiliAccounts.get(context).getAccessKey();
            int iIntValue = ((Number) mutableState2.getValue()).intValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(relationService);
            boolean zChanged = composerStartRestartGroup.changed(accessKey);
            boolean z6 = (i10 & 14) == 4;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | zChangedInstance2 | zChanged | z6 | zChangedInstance3) || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new AttentionGroupContentKt$AttentionGroupContent$2$1(context, relationService, accessKey, j7, mutableState, snapshotStateMap, snapshotStateMap2, list, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            EffectsKt.LaunchedEffect(Integer.valueOf(iIntValue), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(950304981, true, new Function3(context, snapshotStateMap, relationService, accessKey, j7, function2, list, function0, snapshotStateMap2, mutableState2, mutableState) { // from class: com.bilibili.relation.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f86120a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SnapshotStateMap f86121b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final RelationService f86122c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f86123d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f86124e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function2 f86125f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final List f86126g;
                public final Function0 h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final SnapshotStateMap f86127i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final MutableState f86128j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final MutableState f86129k;

                {
                    this.f86120a = context;
                    this.f86121b = snapshotStateMap;
                    this.f86122c = relationService;
                    this.f86123d = accessKey;
                    this.f86124e = j7;
                    this.f86125f = function2;
                    this.f86126g = list;
                    this.h = function0;
                    this.f86127i = snapshotStateMap2;
                    this.f86128j = mutableState2;
                    this.f86129k = mutableState;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) throws kotlin.NoWhenBranchMatchedException {
                    /*
                        Method dump skipped, instruction units count: 1100
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.C6025q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(j7, function0, function2, i7) { // from class: com.bilibili.relation.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f86130a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f86131b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function2 f86132c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f86133d;

                {
                    this.f86130a = j7;
                    this.f86131b = function0;
                    this.f86132c = function2;
                    this.f86133d = i7;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f86133d | 1);
                    Function0 function02 = this.f86131b;
                    Function2 function22 = this.f86132c;
                    C6029v.a(this.f86130a, function02, function22, (Composer) obj2, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function0 r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.C6029v.b(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@NotNull final Function0 function0, @NotNull final C6013e c6013e, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-617244142);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(c6013e) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-617244142, i9, -1, "com.bilibili.relation.CreateGroupContent (AttentionGroupContent.kt:720)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object objMutableStateOf$default = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            }
            final MutableState mutableState = (MutableState) objMutableStateOf$default;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                obj = (RelationService) ServiceGenerator.createService(RelationService.class);
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            final RelationService relationService = (RelationService) obj;
            final String accessKey = BiliAccounts.get(context).getAccessKey();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxWidth$default, biliTheme.getColors(composerStartRestartGroup, i10).getGa1-0d7_KjU(), null, 2, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            O4.d.c(companion4, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str = (String) mutableState.getValue();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Object iVar = objRememberedValue3;
            if (objRememberedValue3 == companion.getEmpty()) {
                iVar = new HF0.i(mutableState, 3);
                composerStartRestartGroup.updateRememberedValue(iVar);
            }
            d(str, (Function1) iVar, composerStartRestartGroup, 48);
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(16, 6, composerStartRestartGroup, companion2);
            DividerKt.m1691DivideroMI9zvI(null, biliTheme.getColors(composerStartRestartGroup, i10).getLine_regular-0d7_KjU(), Dp.m3880constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 384, 9);
            Modifier modifierM1169backgroundbw27NRU$default2 = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3880constructorimpl(56)), biliTheme.getColors(composerStartRestartGroup, i10).getBg1-0d7_KjU(), null, 2, null);
            boolean zIsBlank = StringsKt.isBlank((String) mutableState.getValue());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(relationService);
            boolean zChanged = composerStartRestartGroup.changed(accessKey);
            boolean z6 = (i9 & 112) == 32;
            boolean z7 = (i9 & 14) == 4;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | zChangedInstance2 | zChanged | z6 | z7) || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0(context, relationService, accessKey, mutableState, c6013e, function0) { // from class: com.bilibili.relation.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Context f86104a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final RelationService f86105b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f86106c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final MutableState f86107d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final C6013e f86108e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final Function0 f86109f;

                    {
                        this.f86104a = context;
                        this.f86105b = relationService;
                        this.f86106c = accessKey;
                        this.f86107d = mutableState;
                        this.f86108e = c6013e;
                        this.f86109f = function0;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object invoke() {
                        Context context2 = this.f86104a;
                        String str2 = (String) this.f86107d.getValue();
                        C6024p c6024p = new C6024p(0, this.f86108e, this.f86109f);
                        Vn.g gVar = new Vn.g(context2, 4);
                        if (StringsKt.isBlank(str2)) {
                            gVar.invoke(context2.getString(2131858014));
                        } else {
                            this.f86105b.createGroup(this.f86106c, str2).enqueue(new C6030w(context2, c6024p, gVar));
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(modifierM1169backgroundbw27NRU$default2, !zIsBlank, null, null, null, (Function0) objRememberedValue4, 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion4, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131821402, composerStartRestartGroup, 0), BoxScopeInstance.INSTANCE.align(companion2, companion3.getCenter()), !StringsKt.isBlank((String) mutableState.getValue()) ? C4666h.a(composerStartRestartGroup, -979851021, biliTheme, composerStartRestartGroup, i10) : com.bapis.bilibili.app.viewunite.v1.Q.a(composerStartRestartGroup, -979850125, biliTheme, composerStartRestartGroup, i10), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, com.bilibili.compose.theme.d.a().getT16(), composerStartRestartGroup, 0, 0, 65528);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C6022n(function0, c6013e, i7));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(final String str, final Function1<? super String, Unit> function1, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1249243906);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249243906, i9, -1, "com.bilibili.relation.CreateGroupInput (AttentionGroupContent.kt:223)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m1344paddingVpY3zN4$default(companion, Dp.m3880constructorimpl(16), 0.0f, 2, null), 0.0f, 1, null), Dp.m3880constructorimpl(44));
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(com.bilibili.ad.adview.liveroom.answer.fragment.compont.H.a(8, modifierM1358height3ABfNKs, biliTheme.getColors(composerStartRestartGroup, i10).getBg1-0d7_KjU()), Dp.m3880constructorimpl(12), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131858015, composerStartRestartGroup, 0), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, com.bilibili.compose.theme.d.a().getT14(), composerStartRestartGroup, 0, 0, 65530);
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3880constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (str.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(1236969061);
                TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131821405, composerStartRestartGroup, 0), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, com.bilibili.compose.theme.d.a().getT14(), composerStartRestartGroup, 0, 0, 65530);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1237172266);
                composerStartRestartGroup.endReplaceGroup();
            }
            BasicTextFieldKt.BasicTextField(str, function1, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, TextStyle.m3586copyp1EtxEg$default(com.bilibili.compose.theme.d.a().getT14(), biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, Brush.Companion.m2579verticalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU()), Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composerStartRestartGroup, (i9 & 14) | 100663680 | (i9 & 112), 0, 48856);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, str, function1) { // from class: com.bilibili.relation.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f86114a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f86115b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f86116c;

                {
                    this.f86114a = str;
                    this.f86115b = function1;
                    this.f86116c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f86116c | 1);
                    C6029v.d(this.f86114a, this.f86115b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-986192689);
        if (composerStartRestartGroup.shouldExecute(i7 != 0, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986192689, i7, -1, "com.bilibili.relation.EmptyView (AttentionGroupContent.kt:488)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterRememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 2131238943), composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(2131858010, composerStartRestartGroup, 0);
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(48));
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i8 = BiliTheme.$stable;
            IconKt.m1714Iconww6aTOc(painterRememberDrawablePainter, strStringResource, modifierM1372size3ABfNKs, biliTheme.getColors(composerStartRestartGroup, i8).getGa5-0d7_KjU(), composerStartRestartGroup, Painter.$stable | 384, 0);
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(12, 6, composerStartRestartGroup, companion);
            TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131858010, composerStartRestartGroup, 0), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i8).getText3-0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7) { // from class: com.bilibili.relation.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f86097a;

                {
                    this.f86097a = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C6029v.e((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f86097a | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(Composer composer, final int i7, final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1398813433);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1398813433, i8, -1, "com.bilibili.relation.ErrorView (AttentionGroupContent.kt:457)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterRememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 2131238943), composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(2131858011, composerStartRestartGroup, 0);
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(48));
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            IconKt.m1714Iconww6aTOc(painterRememberDrawablePainter, strStringResource, modifierM1372size3ABfNKs, biliTheme.getColors(composerStartRestartGroup, i9).getGa5-0d7_KjU(), composerStartRestartGroup, Painter.$stable | 384, 0);
            TextKt.m1772Text4IGK_g(str, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i9).getText3-0d7_KjU(), v0.a(12, 6, 14, composerStartRestartGroup, companion), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 3072, 0, 131058);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, i7) { // from class: com.bilibili.relation.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f86095a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f86096b;

                {
                    this.f86095a = str;
                    this.f86096b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C6029v.f((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f86096b | 1), this.f86095a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(Function0<Unit> function0, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(765278725);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(765278725, i8, -1, "com.bilibili.relation.GroupHeader (AttentionGroupContent.kt:272)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(44));
            float f7 = 16;
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(modifierM1358height3ABfNKs, Dp.m3880constructorimpl(f7), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(2131858019, composerStartRestartGroup, 0);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(strStringResource, boxScopeInstance.align(companion, companion2.getCenterStart()), biliTheme.getColors(composerStartRestartGroup, i9).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, com.bilibili.compose.theme.d.a().getT14b(), composerStartRestartGroup, 0, 0, 65528);
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenterEnd());
            boolean z6 = (i8 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.bilibili.ad.adview.videodetail.pausedpage.i(function0, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(modifierAlign, false, null, null, null, (Function0) objRememberedValue, 15, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(2131233870, composerStartRestartGroup, 0), "", SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(f7)), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, biliTheme.getColors(composerStartRestartGroup, i9).getText2-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 25008, 40);
            TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131821396, composerStartRestartGroup, 0), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i9).getText2-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, com.bilibili.compose.theme.d.a().getT12(), composerStartRestartGroup, 0, 0, 65530);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Fc1.d(function0, i7, 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h(final AttentionGroup attentionGroup, final boolean z6, final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1806218170);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(attentionGroup) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1806218170, i10, -1, "com.bilibili.relation.GroupItem (AttentionGroupContent.kt:351)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, null, null, null, function0, 15, null);
            float f7 = 16;
            Modifier modifierM1343paddingVpY3zN4 = PaddingKt.m1343paddingVpY3zN4(modifierM1186clickableoSLSa3U$default, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1343paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String str = attentionGroup.groupName;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            long sp = TextUnitKt.getSp(15);
            FontWeight normal = FontWeight.Companion.getNormal();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(str2, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU(), sp, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-772698511);
                Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(22)), RoundedCornerShapeKt.getCircleShape()), biliTheme.getColors(composerStartRestartGroup, i11).getBrand_pink-0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
                O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                IconKt.m1714Iconww6aTOc(DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 2131238786), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(2131858017, composerStartRestartGroup, 0), BoxScopeInstance.INSTANCE.align(SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(f7)), companion2.getCenter()), biliTheme.getColors(composerStartRestartGroup, i11).getWh0-0d7_KjU(), composerStartRestartGroup, Painter.$stable, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-771961517);
                BoxKt.Box(BorderKt.m1174borderziNgDLE(ClipKt.clip(SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(22)), RoundedCornerShapeKt.getCircleShape()), Dp.m3880constructorimpl(1), Brush.Companion.m2573linearGradientmHitzGk$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i11).getText4-0d7_KjU()), Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i11).getText4-0d7_KjU())}), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(attentionGroup, z6, function0, i7) { // from class: com.bilibili.relation.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AttentionGroup f86100a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f86101b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f86102c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f86103d;

                {
                    this.f86100a = attentionGroup;
                    this.f86101b = z6;
                    this.f86102c = function0;
                    this.f86103d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f86103d | 1);
                    C6029v.h(this.f86100a, this.f86101b, this.f86102c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(final java.util.List<? extends com.bilibili.relation.api.AttentionGroup> r14, final java.util.Map<java.lang.String, java.lang.String> r15, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r16, androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.C6029v.i(java.util.List, java.util.Map, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void j(Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1024856962);
        if (composerStartRestartGroup.shouldExecute(i7 != 0, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1024856962, i7, -1, "com.bilibili.relation.LoadingView (AttentionGroupContent.kt:441)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProgressIndicatorKt.m1728CircularProgressIndicatorLxG7B9w(SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(40)), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getBrand_pink-0d7_KjU(), 0.0f, 0L, 0, composerStartRestartGroup, 6, 28);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7) { // from class: com.bilibili.relation.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f86066a;

                {
                    this.f86066a = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C6029v.j((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f86066a | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(android.content.Context r9, com.bilibili.relation.api.RelationService r10, java.lang.String r11, long r12, com.bilibili.relation.C6027t r14, com.bilibili.relation.C6028u r15, kotlin.coroutines.jvm.internal.ContinuationImpl r16) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.C6029v.k(android.content.Context, com.bilibili.relation.api.RelationService, java.lang.String, long, com.bilibili.relation.t, com.bilibili.relation.u, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
