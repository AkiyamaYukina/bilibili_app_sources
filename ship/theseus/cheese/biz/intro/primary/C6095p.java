package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import Di0.C1602f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.cheese.pay.model.PayCouponVo;
import com.bilibili.cheese.pay.model.Tag;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6095p;
import fu0.C7185g;
import fu0.C7186h;
import fu0.C7199v;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import oj0.C8225f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p.class */
@StabilityInferred(parameters = 0)
public final class C6095p extends com.bilibili.app.gemini.ui.m<C7199v> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f89751g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<PayCouponVo>> f89752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<Unit> f89753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<d> f89754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a f89755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f89756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f89757f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<PayCouponVo> f89758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6095p f89759b;

        public a(@NotNull C6095p c6095p, List<PayCouponVo> list) {
            this.f89759b = c6095p;
            this.f89758a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f89758a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
            b bVar = (b) viewHolder;
            final PayCouponVo payCouponVo = (PayCouponVo) CollectionsKt.getOrNull(this.f89758a, i7);
            if (payCouponVo == null) {
                bVar.getClass();
                return;
            }
            C7186h c7186h = bVar.f89760a;
            final Context context = c7186h.f119545a.getContext();
            String couponTitle = payCouponVo.getCouponTitle();
            if (couponTitle != null && !StringsKt.isBlank(couponTitle)) {
                c7186h.f119548d.setContent(ComposableLambdaKt.composableLambdaInstance(-1094818111, true, new Function2(payCouponVo, context) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PayCouponVo f89767a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Context f89768b;

                    {
                        this.f89767a = payCouponVo;
                        this.f89768b = context;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        final Context context2 = this.f89768b;
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1094818111, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent.CouponLayerItemHolder.updateView.<anonymous> (CheesePrimaryFloatLayerComponent.kt:228)");
                            }
                            final PayCouponVo payCouponVo2 = this.f89767a;
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1721470473, true, new Function2(payCouponVo2, context2) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.s

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final PayCouponVo f89771a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Context f89772b;

                                {
                                    this.f89771a = payCouponVo2;
                                    this.f89772b = context2;
                                }

                                public final Object invoke(Object obj3, Object obj4) {
                                    final Context context3 = this.f89772b;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1721470473, iIntValue2, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent.CouponLayerItemHolder.updateView.<anonymous>.<anonymous> (CheesePrimaryFloatLayerComponent.kt:229)");
                                        }
                                        int iMo1265roundToPx0680j_4 = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo1265roundToPx0680j_4(Dp.m3880constructorimpl(6));
                                        ComposableLambda composableLambda = O.f89651a;
                                        final PayCouponVo payCouponVo3 = this.f89771a;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(503464009, true, new Function2(payCouponVo3, context3) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.t

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final PayCouponVo f89773a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final Context f89774b;

                                            {
                                                this.f89773a = payCouponVo3;
                                                this.f89774b = context3;
                                            }

                                            public final Object invoke(Object obj5, Object obj6) {
                                                List couponTags;
                                                Context context4 = this.f89774b;
                                                Composer composer3 = (Composer) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(503464009, iIntValue3, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent.CouponLayerItemHolder.updateView.<anonymous>.<anonymous>.<anonymous> (CheesePrimaryFloatLayerComponent.kt:235)");
                                                    }
                                                    PayCouponVo payCouponVo4 = this.f89773a;
                                                    if (payCouponVo4.getCouponSelected()) {
                                                        List listCreateListBuilder = CollectionsKt.createListBuilder();
                                                        List couponTags2 = payCouponVo4.getCouponTags();
                                                        if (couponTags2 == null) {
                                                            couponTags2 = CollectionsKt.emptyList();
                                                        }
                                                        listCreateListBuilder.addAll(couponTags2);
                                                        listCreateListBuilder.add(new Tag(context4.getString(2131838553)));
                                                        couponTags = CollectionsKt.build(listCreateListBuilder);
                                                    } else {
                                                        couponTags = payCouponVo4.getCouponTags();
                                                    }
                                                    if (couponTags == null) {
                                                        composer3.startReplaceGroup(671063834);
                                                        composer3.endReplaceGroup();
                                                    } else {
                                                        composer3.startReplaceGroup(671063835);
                                                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                                        Modifier.Companion companion = Modifier.Companion;
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                                                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                        if (composer3.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer3.startReusableNode();
                                                        if (composer3.getInserting()) {
                                                            composer3.createNode(constructor);
                                                        } else {
                                                            composer3.useNode();
                                                        }
                                                        Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer3);
                                                        O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                                                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        composer3.startReplaceGroup(1563664368);
                                                        int i8 = 0;
                                                        for (Object obj7 : couponTags) {
                                                            if (i8 < 0) {
                                                                CollectionsKt.throwIndexOverflow();
                                                            }
                                                            String tag = ((Tag) obj7).getTag();
                                                            BiliTheme biliTheme = BiliTheme.INSTANCE;
                                                            int i9 = BiliTheme.$stable;
                                                            TextStyle textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composer3, i9).getT10(), biliTheme.getColors(composer3, i9).getOperate_orange-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                                            Modifier.Companion companion3 = Modifier.Companion;
                                                            Modifier modifierA = androidx.room.coroutines.f.a(2, companion3, biliTheme.getColors(composer3, i9).getOperate_orange_thin-0d7_KjU());
                                                            float f7 = 3;
                                                            TextKt.m1772Text4IGK_g(tag, PaddingKt.m1343paddingVpY3zN4(modifierA, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(1)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM3586copyp1EtxEg$default, composer3, 0, 0, 65532);
                                                            if (i8 < CollectionsKt.getLastIndex(couponTags)) {
                                                                SpacerKt.Spacer(Fa.K.a(f7, 1054301648, composer3, companion3), composer3, 6);
                                                                composer3.endReplaceGroup();
                                                            } else {
                                                                composer3.startReplaceGroup(1054431383);
                                                                composer3.endReplaceGroup();
                                                            }
                                                            i8++;
                                                        }
                                                        com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.o.a(composer3);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer3.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, composer2, 54);
                                        String couponTitle2 = payCouponVo3.getCouponTitle();
                                        String str = couponTitle2;
                                        if (couponTitle2 == null) {
                                            str = "";
                                        }
                                        BiliTheme biliTheme = BiliTheme.INSTANCE;
                                        int i8 = BiliTheme.$stable;
                                        C8225f.a(composableLambda, composableLambdaRememberComposableLambda, str, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composer2, i8).getT13b(), biliTheme.getColors(composer2, i8).getText1-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), iMo1265roundToPx0680j_4, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), composer2, 196662);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
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
            }
            c7186h.f119547c.setText(payCouponVo.getExpireTime());
            c7186h.f119546b.setImageDrawable(payCouponVo.getSelectState() ? AppCompatResources.getDrawable(context, 2131241811) : AppCompatResources.getDrawable(context, 2131241812));
            final C6095p c6095p = bVar.f89761b;
            c7186h.f119545a.setOnClickListener(new View.OnClickListener(c6095p, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6095p f89769a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89770b;

                {
                    this.f89769a = c6095p;
                    this.f89770b = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f89769a.f89756e.tryEmit(new C6095p.c.b(this.f89770b));
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(this.f89759b, C7186h.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C7186h f89760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6095p f89761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C6095p c6095p, C7186h c7186h) {
            super(c7186h.f119545a);
            this.f89761b = c6095p;
            this.f89760a = c7186h;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p$c.class */
    @StabilityInferred(parameters = 1)
    public static abstract class c {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p$c$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p$c$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final View f89762a;

            public a(@NotNull View view) {
                this.f89762a = view;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f89762a, ((a) obj).f89762a);
            }

            public final int hashCode() {
                return this.f89762a.hashCode();
            }

            @NotNull
            public final String toString() {
                return cf.b.b(this.f89762a, "OnClickCloseLayer(view=", ")");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p$c$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p$c$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f89763a;

            public b(int i7) {
                this.f89763a = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f89763a == ((b) obj).f89763a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f89763a);
            }

            @NotNull
            public final String toString() {
                return C4277b.a(this.f89763a, ")", new StringBuilder("OnClickCouponItem(pos="));
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p$c$c.class */
        @StabilityInferred(parameters = 1)
        public static final class C0620c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0620c f89764a = new c();
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p$c$d */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p$c$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f89765a = new c();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.p$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/p$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<PayCouponVo> f89766a;

        public d() {
            this(0);
        }

        public /* synthetic */ d(int i7) {
            this((List<PayCouponVo>) CollectionsKt.emptyList());
        }

        public d(@NotNull List<PayCouponVo> list) {
            this.f89766a = list;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f89766a, ((d) obj).f89766a);
        }

        public final int hashCode() {
            return this.f89766a.hashCode();
        }

        @NotNull
        public final String toString() {
            return com.bapis.bilibili.account.interfaces.v1.k.a("State(list=", ")", this.f89766a);
        }
    }

    public C6095p(@NotNull Flow flow, @NotNull Flow flow2, @NotNull StateFlow stateFlow) {
        this.f89752a = stateFlow;
        this.f89753b = flow;
        this.f89754c = flow2;
        MutableSharedFlow<c> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 3, BufferOverflow.DROP_OLDEST);
        this.f89756e = MutableSharedFlow;
        this.f89757f = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.bilibili.ship.theseus.cheese.biz.intro.primary.C6095p r5, android.content.Context r6, java.util.List r7, fu0.C7185g r8) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.C6095p.c(com.bilibili.ship.theseus.cheese.biz.intro.primary.p, android.content.Context, java.util.List, fu0.g):void");
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C7199v c7199v = (C7199v) viewBinding;
        Context context = c7199v.f119619f.getContext();
        c7199v.f119619f.setClickable(true);
        C7185g c7185gInflate = C7185g.inflate(LayoutInflater.from(context), c7199v.f119615b, true);
        c7199v.f119617d.setOnClickListener(new com.bilibili.lib.projection.internal.widget.r(1));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheesePrimaryFloatLayerComponent$bind$3(c7199v, this, c7185gInflate, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7199v c7199vInflate = C7199v.inflate(layoutInflater, viewGroup, false);
        c7199vInflate.f119618e.addItemDecoration(new C6100v(Uj0.c.b(12, context), Uj0.c.b(8, context), Uj0.c.b(4, context)));
        return c7199vInflate;
    }
}
