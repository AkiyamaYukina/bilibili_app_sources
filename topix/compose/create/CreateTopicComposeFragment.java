package com.bilibili.topix.compose.create;

import Di0.C1602f;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.O;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.input.w;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.C4549f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.common.C4628q;
import com.bapis.bilibili.app.viewunite.v1.Q;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.topix.create.TitleStatus;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import o0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/CreateTopicComposeFragment.class */
@StabilityInferred(parameters = 0)
public final class CreateTopicComposeFragment extends androidx_fragment_app_Fragment implements IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f112459b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/CreateTopicComposeFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f112460a;

        static {
            int[] iArr = new int[TitleStatus.values().length];
            try {
                iArr[TitleStatus.Short.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[TitleStatus.Invalid.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[TitleStatus.Valid.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f112460a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.topix.compose.create.CreateTopicComposeFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/CreateTopicComposeFragment$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CreateTopicComposeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CreateTopicComposeFragment createTopicComposeFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = createTopicComposeFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) BLKV.getKvs$default(this.this$0.requireContext(), "topix_blkv_config", false, 0, 6, (Object) null).get("topic_create_page_has_shown", Boolean.FALSE)).booleanValue()) {
                this.this$0.rf();
                BLKV.getKvs$default(this.this$0.requireContext(), "topix_blkv_config", false, 0, 6, (Object) null).putBoolean("topic_create_page_has_shown", true);
            }
            return Unit.INSTANCE;
        }
    }

    public CreateTopicComposeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.topix.compose.create.CreateTopicComposeFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10625invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.topix.compose.create.CreateTopicComposeFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10626invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f112459b = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TopicCreateViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.topix.compose.create.CreateTopicComposeFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10627invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.topix.compose.create.CreateTopicComposeFragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10628invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.CreateTopicComposeFragment$special$$inlined$viewModels$default$4.m10628invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.topix.compose.create.CreateTopicComposeFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m10629invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.CreateTopicComposeFragment$special$$inlined$viewModels$default$5.m10629invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "dt.topic-create.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void hf(final State<C> state, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(38581779);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(38581779, i9, -1, "com.bilibili.topix.compose.create.CreateTopicComposeFragment.CreatePage (CreateTopicComposeFragment.kt:168)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object objA = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                objA = C4549f.a(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState = (MutableState) objA;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object objA2 = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                objA2 = C4549f.a(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState2 = (MutableState) objA2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Object objA3 = objRememberedValue3;
            if (objRememberedValue3 == companion.getEmpty()) {
                objA3 = C4549f.a(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState3 = (MutableState) objA3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Object objA4 = objRememberedValue4;
            if (objRememberedValue4 == companion.getEmpty()) {
                objA4 = C4549f.a(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState4 = (MutableState) objA4;
            WindowInsets.Companion companion2 = WindowInsets.Companion;
            int bottom = WindowInsets_androidKt.getIme(companion2, composerStartRestartGroup, 6).getBottom((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            float fMo1268toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo1268toDpu2uoSUM(bottom - (((Number) mutableState4.getValue()).intValue() + (((Number) mutableState3.getValue()).intValue() + (((Number) mutableState2.getValue()).intValue() + ((Number) mutableState.getValue()).intValue()))));
            final float fMo1268toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo1268toDpu2uoSUM(bottom);
            ScaffoldKt.m1742Scaffold27mzLpw(SizeKt.fillMaxSize$default(PaddingKt.m1346paddingqDBjuR0$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, WindowInsetsKt.union(WindowInsets_androidKt.getStatusBars(companion2, composerStartRestartGroup, 6), WindowInsets_androidKt.getDisplayCutout(companion2, composerStartRestartGroup, 6)))), 0.0f, 0.0f, 0.0f, ((Dp) com.bilibili.ad.adview.videodetail.pausedpage.brand.loopcard.u.a(Dp.m3878boximpl(fMo1268toDpu2uoSUM), 0)).m3894unboximpl(), 7, null), 0.0f, 1, null), null, ComposableLambdaKt.rememberComposableLambda(432159640, true, new Function2(state, this) { // from class: com.bilibili.topix.compose.create.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CreateTopicComposeFragment f112566a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final State f112567b;

                {
                    this.f112566a = this;
                    this.f112567b = state;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
                    /*
                        r11 = this;
                        r0 = r12
                        androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                        r16 = r0
                        r0 = r13
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        r14 = r0
                        r0 = r14
                        r1 = 3
                        r0 = r0 & r1
                        r1 = 2
                        if (r0 == r1) goto L1b
                        r0 = 1
                        r15 = r0
                        goto L1e
                    L1b:
                        r0 = 0
                        r15 = r0
                    L1e:
                        r0 = r16
                        r1 = r15
                        r2 = r14
                        r3 = 1
                        r2 = r2 & r3
                        boolean r0 = r0.shouldExecute(r1, r2)
                        if (r0 == 0) goto Lb6
                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r0 == 0) goto L3c
                        r0 = 432159640(0x19c23b98, float:2.00832E-23)
                        r1 = r14
                        r2 = -1
                        java.lang.String r3 = "com.bilibili.topix.compose.create.CreateTopicComposeFragment.CreatePage.<anonymous> (CreateTopicComposeFragment.kt:200)"
                        androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                    L3c:
                        r0 = r11
                        com.bilibili.topix.compose.create.CreateTopicComposeFragment r0 = r0.f112566a
                        r17 = r0
                        r0 = r17
                        r1 = 2131843358(0x7f11591e, float:1.9320078E38)
                        java.lang.String r0 = r0.getString(r1)
                        r18 = r0
                        r0 = r16
                        r1 = r17
                        boolean r0 = r0.changedInstance(r1)
                        r15 = r0
                        r0 = r16
                        java.lang.Object r0 = r0.rememberedValue()
                        r13 = r0
                        r0 = r15
                        if (r0 != 0) goto L6f
                        r0 = r13
                        r12 = r0
                        r0 = r13
                        androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                        java.lang.Object r1 = r1.getEmpty()
                        if (r0 != r1) goto L81
                    L6f:
                        com.bilibili.topix.compose.create.CreateTopicComposeFragment$CreatePage$1$1$1 r0 = new com.bilibili.topix.compose.create.CreateTopicComposeFragment$CreatePage$1$1$1
                        r1 = r0
                        r2 = r17
                        r1.<init>(r2)
                        r12 = r0
                        r0 = r16
                        r1 = r12
                        r0.updateRememberedValue(r1)
                    L81:
                        r0 = r18
                        r1 = 0
                        r2 = r12
                        kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                        r3 = 0
                        r4 = -1704398460(0xffffffff9a68f184, float:-4.817157E-23)
                        r5 = 1
                        com.bilibili.topix.compose.create.B r6 = new com.bilibili.topix.compose.create.B
                        r7 = r6
                        r8 = r11
                        androidx.compose.runtime.State r8 = r8.f112567b
                        r9 = r17
                        r7.<init>(r8, r9)
                        r7 = r16
                        r8 = 54
                        androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r4, r5, r6, r7, r8)
                        r5 = r16
                        r6 = 24576(0x6000, float:3.4438E-41)
                        r7 = 10
                        com.bilibili.compose.widget.BiliTopAppBarKt.BiliTopAppBar-hGBTI10(r0, r1, r2, r3, r4, r5, r6, r7)
                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r0 == 0) goto Lbd
                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                        goto Lbd
                    Lb6:
                        r0 = r16
                        r0.skipToGroupEnd()
                    Lbd:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.y.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1240853679, true, new Function3(this, state, fMo1268toDpu2uoSUM2, mutableState2, mutableState3, mutableState4, mutableState) { // from class: com.bilibili.topix.compose.create.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CreateTopicComposeFragment f112568a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final State f112569b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f112570c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final MutableState f112571d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final MutableState f112572e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final MutableState f112573f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final MutableState f112574g;

                {
                    this.f112568a = this;
                    this.f112569b = state;
                    this.f112570c = fMo1268toDpu2uoSUM2;
                    this.f112571d = mutableState2;
                    this.f112572e = mutableState3;
                    this.f112573f = mutableState4;
                    this.f112574g = mutableState;
                }

                /* JADX WARN: Removed duplicated region for block: B:104:0x0684  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x02e4  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x039b  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x03d9  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0559  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
                    /*
                        Method dump skipped, instruction units count: 1768
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 12582912, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, state, i7) { // from class: com.bilibili.topix.compose.create.A

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CreateTopicComposeFragment f112447a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final State f112448b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f112449c;

                {
                    this.f112447a = this;
                    this.f112448b = state;
                    this.f112449c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f112449c | 1);
                    this.f112447a.hf(this.f112448b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: if, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10622if(final boolean r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.CreateTopicComposeFragment.m10622if(boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0404  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jf(final int r27, androidx.compose.runtime.Composer r28, final androidx.compose.ui.Modifier r29, final kotlin.jvm.functions.Function1 r30, final boolean r31) {
        /*
            Method dump skipped, instruction units count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.CreateTopicComposeFragment.jf(int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void kf(final Modifier modifier, final I i7, final Function1<? super androidx.compose.ui.text.input.G, Unit> function1, final float f7, Composer composer, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1039834856);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        int i10 = i9;
        if ((i8 & 48) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(i7) ? 32 : 16);
        }
        int i11 = i10;
        if ((i8 & 384) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
        }
        int i12 = i11;
        if ((i8 & 3072) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(f7) ? 2048 : 1024);
        }
        int i13 = i12;
        if ((i8 & 24576) == 0) {
            i13 = i12 | (composerStartRestartGroup.changedInstance(this) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i13 & 9363) != 9362, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1039834856, i13, -1, "com.bilibili.topix.compose.create.CreateTopicComposeFragment.TopicDesc (CreateTopicComposeFragment.kt:615)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(modifier, 0.0f, Dp.m3880constructorimpl(10), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i14 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxWidth$default, biliTheme.getColors(composerStartRestartGroup, i14).getBg1-0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            float f8 = 12;
            float fM3880constructorimpl = Dp.m3880constructorimpl(f8);
            float f9 = 8;
            TextKt.m1772Text4IGK_g(getString(2131843395), PaddingKt.m1343paddingVpY3zN4(modifierFillMaxWidth$default2, fM3880constructorimpl, Dp.m3880constructorimpl(f9)), biliTheme.getColors(composerStartRestartGroup, i14).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i14).getT14b(), composerStartRestartGroup, 48, 0, 65528);
            long j7 = biliTheme.getColors(composerStartRestartGroup, i14).getBrand_pink-0d7_KjU();
            final long j8 = biliTheme.getColors(composerStartRestartGroup, i14).getText4-0d7_KjU();
            long j9 = biliTheme.getColors(composerStartRestartGroup, i14).getText1-0d7_KjU();
            androidx.compose.ui.text.input.G g7 = i7.f112472a;
            VisualTransformation.Companion.getClass();
            boolean zChanged = composerStartRestartGroup.changed(g7);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                androidx.compose.ui.text.input.G g8 = i7.f112472a;
                AnnotatedString annotatedString = g8.f45498a;
                w.a.C0221a c0221a = w.a.f45592a;
                objRememberedValue = new O(annotatedString, c0221a);
                b0 b0Var = g8.f45500c;
                if (b0Var != null) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(annotatedString);
                    SpanStyle spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null);
                    long j10 = b0Var.f124436a;
                    builder.addStyle(spanStyle, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                    objRememberedValue = new O(builder.toAnnotatedString(), c0221a);
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final O o7 = (O) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = C4549f.a(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Object objMutableStateOf$default = objRememberedValue3;
            if (objRememberedValue3 == companion3.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            }
            final MutableState mutableState2 = (MutableState) objMutableStateOf$default;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Object objMutableStateOf$default2 = objRememberedValue4;
            if (objRememberedValue4 == companion3.getEmpty()) {
                objMutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(new Rect(0.0f, 0.0f, 0.0f, 0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default2);
            }
            final MutableState mutableState3 = (MutableState) objMutableStateOf$default2;
            Dp dpM3878boximpl = Dp.m3878boximpl(f7);
            boolean z6 = ((Rect) mutableState3.getValue()).getBottom() - ((float) scrollStateRememberScrollState.getValue()) > ((float) ((Number) mutableState.getValue()).intValue());
            boolean zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion3.getEmpty()) {
                objRememberedValue5 = new CreateTopicComposeFragment$TopicDesc$1$1$1(scrollStateRememberScrollState, mutableState3, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(dpM3878boximpl, Boolean.valueOf(z6), (Function2) objRememberedValue5, composerStartRestartGroup, (i13 >> 9) & 14);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m1344paddingVpY3zN4$default(columnScopeInstance.weight(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false), Dp.m3880constructorimpl(f8), 0.0f, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
            int i15 = i13 & 112;
            boolean z7 = i15 == 32;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(o7);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if ((z7 | zChangedInstance) || objRememberedValue6 == companion3.getEmpty()) {
                objRememberedValue6 = new Function1(mutableState, mutableState2, i7, o7, mutableState3) { // from class: com.bilibili.topix.compose.create.i

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MutableState f112514a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MutableState f112515b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final I f112516c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final O f112517d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final MutableState f112518e;

                    {
                        this.f112514a = mutableState;
                        this.f112515b = mutableState2;
                        this.f112516c = i7;
                        this.f112517d = o7;
                        this.f112518e = mutableState3;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object invoke(Object obj) {
                        LayoutCoordinates parentCoordinates = ((LayoutCoordinates) obj).getParentCoordinates();
                        this.f112514a.setValue(Integer.valueOf(parentCoordinates != null ? (int) (parentCoordinates.mo3153getSizeYbymL2g() & 4294967295L) : 0));
                        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f112515b.getValue();
                        if (textLayoutResult != null) {
                            androidx.compose.ui.text.input.G g9 = this.f112516c.f112472a;
                            long j11 = g9.f45499b;
                            int i16 = b0.f124435c;
                            int i17 = (int) (j11 >> 32);
                            if (i17 >= 0 && i17 <= g9.f45498a.getText().length()) {
                                this.f112518e.setValue(textLayoutResult.getCursorRect(this.f112517d.f45530b.b(i17)));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierVerticalScroll$default, (Function1) objRememberedValue6);
            SolidColor solidColor = new SolidColor(j7, null);
            TextStyle textStyleMerge = biliTheme.getTextStyle(composerStartRestartGroup, i14).getT14().merge(new TextStyle(j9, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            boolean z8 = i15 == 32;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(o7);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if ((z8 | zChangedInstance2) || objRememberedValue7 == companion3.getEmpty()) {
                objRememberedValue7 = new Function1(i7, o7, mutableState2, mutableState3) { // from class: com.bilibili.topix.compose.create.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final I f112519a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final O f112520b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final MutableState f112521c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final MutableState f112522d;

                    {
                        this.f112519a = i7;
                        this.f112520b = o7;
                        this.f112521c = mutableState2;
                        this.f112522d = mutableState3;
                    }

                    public final Object invoke(Object obj) {
                        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                        this.f112521c.setValue(textLayoutResult);
                        androidx.compose.ui.text.input.G g9 = this.f112519a.f112472a;
                        long j11 = g9.f45499b;
                        int i16 = b0.f124435c;
                        int i17 = (int) (j11 >> 32);
                        if (i17 >= 0 && i17 <= g9.f45498a.getText().length()) {
                            this.f112522d.setValue(textLayoutResult.getCursorRect(this.f112520b.f45530b.b(i17)));
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            BasicTextFieldKt.BasicTextField(i7.f112472a, function1, modifierOnGloballyPositioned, false, false, textStyleMerge, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) objRememberedValue7, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-345970661, true, new Function3(i7, this, j8) { // from class: com.bilibili.topix.compose.create.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final I f112523a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CreateTopicComposeFragment f112524b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f112525c;

                {
                    this.f112523a = i7;
                    this.f112524b = this;
                    this.f112525c = j8;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function2 = (Function2) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i16 = iIntValue;
                    if ((iIntValue & 6) == 0) {
                        i16 = iIntValue | (composer2.changedInstance(function2) ? 4 : 2);
                    }
                    if (composer2.shouldExecute((i16 & 19) != 18, 1 & i16)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-345970661, i16, -1, "com.bilibili.topix.compose.create.CreateTopicComposeFragment.TopicDesc.<anonymous>.<anonymous> (CreateTopicComposeFragment.kt:684)");
                        }
                        Modifier.Companion companion4 = Modifier.Companion;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion4);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion5, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                        Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion5, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (this.f112523a.f112472a.f45498a.getText().length() == 0) {
                            composer2.startReplaceGroup(1912219803);
                            TextKt.m1772Text4IGK_g(this.f112524b.getString(2131843476), (Modifier) null, this.f112525c, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composer2, BiliTheme.$stable).getT14(), composer2, 0, 0, 65530);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1912497377);
                            composer2.endReplaceGroup();
                        }
                        if (androidx.compose.ui.graphics.O.c(composer2, i16 & 14, function2)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 >> 3) & 112, 196608, 12248);
            TextKt.m1772Text4IGK_g(C4628q.a((int) i7.f112475d, (int) i7.f112476e, "/"), PaddingKt.m1345paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(4), Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f9)), biliTheme.getColors(composerStartRestartGroup, i14).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3795getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i14).getT12(), composerStartRestartGroup, 48, 0, 65016);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, modifier, i7, function1, f7, i8) { // from class: com.bilibili.topix.compose.create.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CreateTopicComposeFragment f112528a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f112529b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final I f112530c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function1 f112531d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final float f112532e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f112533f;

                {
                    this.f112528a = this;
                    this.f112529b = modifier;
                    this.f112530c = i7;
                    this.f112531d = function1;
                    this.f112532e = f7;
                    this.f112533f = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f112533f | 1);
                    this.f112528a.kf(this.f112529b, this.f112530c, this.f112531d, this.f112532e, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lf(final int r27, androidx.compose.runtime.Composer r28, final androidx.compose.ui.Modifier r29, final kotlin.jvm.functions.Function0 r30, final kotlin.jvm.functions.Function1 r31) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.CreateTopicComposeFragment.lf(int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void mf(final int i7, Composer composer, final Modifier modifier, final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(679290973);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679290973, i9, -1, "com.bilibili.topix.compose.create.CreateTopicComposeFragment.TopicLimit (CreateTopicComposeFragment.kt:775)");
            }
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(str, PaddingKt.m1343paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Dp.m3880constructorimpl(12), Dp.m3880constructorimpl(8)), biliTheme.getColors(composerStartRestartGroup, i10).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12(), composerStartRestartGroup, (i9 >> 3) & 14, 3120, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, modifier, str, i7) { // from class: com.bilibili.topix.compose.create.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CreateTopicComposeFragment f112534a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f112535b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f112536c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f112537d;

                {
                    this.f112534a = this;
                    this.f112535b = modifier;
                    this.f112536c = str;
                    this.f112537d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f112537d | 1);
                    this.f112534a.mf(iUpdateChangedFlags, (Composer) obj, this.f112535b, this.f112536c);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void nf(final J j7, final Function1 function1, final FocusRequester focusRequester, final Function3 function3, Composer composer, final int i7) {
        int i8;
        long jA;
        Composer composerStartRestartGroup = composer.startRestartGroup(1834434835);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i8;
        if ((i7 & 384) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(focusRequester) ? 256 : 128);
        }
        int i10 = i9;
        if ((i7 & 3072) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024);
        }
        int i11 = i10;
        if ((i7 & 24576) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(this) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 9363) != 9362, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1834434835, i11, -1, "com.bilibili.topix.compose.create.CreateTopicComposeFragment.TopicName (CreateTopicComposeFragment.kt:440)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(10), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxWidth$default, biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f7 = 12;
            Modifier modifierM1343paddingVpY3zN4 = PaddingKt.m1343paddingVpY3zN4(modifierFillMaxWidth$default2, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(8));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1343paddingVpY3zN4);
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
            TextKt.m1772Text4IGK_g(getString(2131843361), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i12).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i12).getT14b(), composerStartRestartGroup, 0, 0, 65530);
            TitleStatus titleStatus = j7.f112478b;
            int i13 = titleStatus == null ? -1 : a.f112460a[titleStatus.ordinal()];
            String string = i13 != 1 ? i13 != 2 ? i13 != 3 ? null : getString(2131843425) : getString(2131843484) : getString(2131843465);
            TitleStatus titleStatus2 = j7.f112478b;
            if (string == null) {
                composerStartRestartGroup.startReplaceGroup(1882810369);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1882810370);
                if (StringsKt.isBlank(string)) {
                    composerStartRestartGroup.startReplaceGroup(1509681739);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1508974722);
                    Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, Dp.m3880constructorimpl(2), Dp.m3880constructorimpl(6), 0.0f, 9, null);
                    int iM3795getEnde0LSkKk = TextAlign.Companion.m3795getEnde0LSkKk();
                    TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i12).getT12();
                    int iM3827getEllipsisgIe3tQ8 = TextOverflow.Companion.m3827getEllipsisgIe3tQ8();
                    if (titleStatus2 == TitleStatus.Valid) {
                        jA = Q.a(composerStartRestartGroup, 1509455253, biliTheme, composerStartRestartGroup, i12);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1509546672);
                        jA = biliTheme.getColors(composerStartRestartGroup, i12).getStress_red-0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    TextKt.m1772Text4IGK_g(string, modifierM1346paddingqDBjuR0$default, jA, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(iM3795getEnde0LSkKk), 0L, iM3827getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t12, composerStartRestartGroup, 0, 3120, 54776);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            int i14 = titleStatus2 == null ? -1 : a.f112460a[titleStatus2.ordinal()];
            Integer num = (i14 == 1 || i14 == 2) ? 2131241127 : i14 != 3 ? null : 2131241128;
            if (num == null) {
                composerStartRestartGroup.startReplaceGroup(1883695450);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1883695451);
                int iIntValue = num.intValue();
                Modifier modifierM1346paddingqDBjuR0$default2 = PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(2), 0.0f, 0.0f, 13, null);
                float f8 = 16;
                ImageKt.Image(PainterResources_androidKt.painterResource(iIntValue, composerStartRestartGroup, 0), (String) null, SizeKt.m1374sizeVpY3zN4(modifierM1346paddingqDBjuR0$default2, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 120);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            long j8 = biliTheme.getColors(composerStartRestartGroup, i12).getBrand_pink-0d7_KjU();
            final long j9 = biliTheme.getColors(composerStartRestartGroup, i12).getText4-0d7_KjU();
            BasicTextFieldKt.BasicTextField(j7.f112477a, (Function1<? super androidx.compose.ui.text.input.G, Unit>) function1, FocusRequesterModifierKt.focusRequester(PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(f7), 0.0f, 2, null), focusRequester), false, false, biliTheme.getTextStyle(composerStartRestartGroup, i12).getT14().merge(new TextStyle(biliTheme.getColors(composerStartRestartGroup, i12).getText1-0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null)), KeyboardOptions.m1527copyINvB4aQ$default(KeyboardOptions.Companion.getDefault(), 0, (Boolean) null, 0, ImeAction.Companion.m3692getNexteUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (Object) null), (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(j8, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1287762304, true, new Function3(j7, this, j9) { // from class: com.bilibili.topix.compose.create.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final J f112550a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CreateTopicComposeFragment f112551b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f112552c;

                {
                    this.f112550a = j7;
                    this.f112551b = this;
                    this.f112552c = j9;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function2 = (Function2) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    int i15 = iIntValue2;
                    if ((iIntValue2 & 6) == 0) {
                        i15 = iIntValue2 | (composer2.changedInstance(function2) ? 4 : 2);
                    }
                    if (composer2.shouldExecute((i15 & 19) != 18, 1 & i15)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1287762304, i15, -1, "com.bilibili.topix.compose.create.CreateTopicComposeFragment.TopicName.<anonymous>.<anonymous> (CreateTopicComposeFragment.kt:504)");
                        }
                        Modifier.Companion companion4 = Modifier.Companion;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion4);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion5, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
                        Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion5, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (this.f112550a.f112477a.f45498a.getText().length() == 0) {
                            composer2.startReplaceGroup(-1024858208);
                            TextKt.m1772Text4IGK_g(this.f112551b.getString(2131854509), (Modifier) null, this.f112552c, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composer2, BiliTheme.$stable).getT14(), composer2, 0, 0, 65530);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1024578712);
                            composer2.endReplaceGroup();
                        }
                        if (androidx.compose.ui.graphics.O.c(composer2, i15 & 14, function2)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i11 & 112, 196608, 16280);
            Modifier modifierM1346paddingqDBjuR0$default3 = PaddingKt.m1346paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default3);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            function3.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((((i11 & 7168) | 6) >> 6) & 112) | 6));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, j7, function1, focusRequester, function3, i7) { // from class: com.bilibili.topix.compose.create.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CreateTopicComposeFragment f112553a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final J f112554b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f112555c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final FocusRequester f112556d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function3 f112557e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f112558f;

                {
                    this.f112553a = this;
                    this.f112554b = j7;
                    this.f112555c = function1;
                    this.f112556d = focusRequester;
                    this.f112557e = function3;
                    this.f112558f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f112558f | 1);
                    FocusRequester focusRequester2 = this.f112556d;
                    Function3 function32 = this.f112557e;
                    this.f112553a.nf(this.f112554b, this.f112555c, focusRequester2, function32, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void of(java.util.List<com.bilibili.topix.model.SynonymTopicItem> r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.CreateTopicComposeFragment.of(java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = null;
        String string2 = arguments != null ? arguments.getString("name") : null;
        Bundle arguments2 = getArguments();
        String string3 = arguments2 != null ? arguments2.getString("desc") : null;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string = arguments3.getString("scene");
        }
        StringBuilder sbA = G0.b.a("Creating creation page with init data title ", string2, " desc ", string3, " scene ");
        sbA.append(string);
        BLog.i("CreateTopicFragment", sbA.toString());
        TopicCreateViewModel topicCreateViewModelPf = pf();
        if (string2 == null) {
            string2 = "";
        }
        if (string3 == null) {
            string3 = "";
        }
        if (string == null) {
            string = "";
        }
        topicCreateViewModelPf.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(topicCreateViewModelPf), (CoroutineContext) null, (CoroutineStart) null, new TopicCreateViewModel$initView$1(topicCreateViewModelPf, string2, string3, string, null), 3, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1883276293, true, new Function2(this) { // from class: com.bilibili.topix.compose.create.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreateTopicComposeFragment f112500a;

            {
                this.f112500a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1883276293, iIntValue, -1, "com.bilibili.topix.compose.create.CreateTopicComposeFragment.onCreateView.<anonymous>.<anonymous> (CreateTopicComposeFragment.kt:144)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1259343549, true, new Function2(this.f112500a, 1) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.p

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f81450a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f81451b;

                        {
                            this.f81450a = i;
                            this.f81451b = obj;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:63:0x0335  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16) {
                            /*
                                Method dump skipped, instruction units count: 1129
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5796p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new AnonymousClass1(this, null));
        super.onViewCreated(view, bundle);
    }

    public final TopicCreateViewModel pf() {
        return (TopicCreateViewModel) this.f112459b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [GO.m, java.lang.Object] */
    public final void qf() {
        BottomSheetDialogFragment bottomSheetDialogFragmentA;
        Context context = getContext();
        if (context != null) {
            ?? obj = new Object();
            ((GO.m) obj).b = getString(2131843356);
            ((GO.m) obj).d = getString(2131842822);
            ((GO.m) obj).a = "https://www.bilibili.com/blackboard/activity-huatijieshao.html";
            bottomSheetDialogFragmentA = obj.a(context);
        } else {
            bottomSheetDialogFragmentA = null;
        }
        if (bottomSheetDialogFragmentA != null) {
            bottomSheetDialogFragmentA.show(getChildFragmentManager(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [GO.m, java.lang.Object] */
    public final void rf() {
        BottomSheetDialogFragment bottomSheetDialogFragmentA;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            ?? obj = new Object();
            ((GO.m) obj).b = getString(2131843491);
            ((GO.m) obj).d = getString(2131842822);
            ((GO.m) obj).a = MultipleThemeUtils.isNightTheme(context) ? "https://www.bilibili.com/h5/topic-active/topic-intro?night=1" : "https://www.bilibili.com/h5/topic-active/topic-intro";
            bottomSheetDialogFragmentA = obj.a(context2);
        } else {
            bottomSheetDialogFragmentA = null;
        }
        if (bottomSheetDialogFragmentA != null) {
            bottomSheetDialogFragmentA.show(getChildFragmentManager(), null);
        }
    }
}
