package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import Di0.C1602f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.M0;
import com.bilibili.app.comment3.ui.holder.i0;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.image.BiliImageKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.united.page.restrictionlayer.PlayListItemVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/P.class */
@StabilityInferred(parameters = 0)
public final class P implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<PlayListItemVo> f102814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102815c;

    public P(@NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @NotNull List list, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.J j7) {
        this.f102813a = m7;
        this.f102814b = list;
        this.f102815c = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final java.util.List r16, final androidx.compose.ui.Modifier r17, float r18, final long r19, final kotlin.jvm.functions.Function2 r21, androidx.compose.foundation.lazy.LazyListState r22, final boolean r23, final androidx.compose.runtime.internal.ComposableLambda r24, androidx.compose.runtime.Composer r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.P.a(java.util.List, androidx.compose.ui.Modifier, float, long, kotlin.jvm.functions.Function2, androidx.compose.foundation.lazy.LazyListState, boolean, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(Modifier modifier, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1160725379);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1160725379, i9, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionPlaylistUIComponent.AutoScrollingPlaylistUI (RestrictionPlaylistUIComponent.kt:142)");
            }
            final boolean z6 = !this.f102813a.o();
            a(this.f102814b, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null), 0.0f, 16L, ComposableLambdaKt.rememberComposableLambda(782397106, true, new Function2(z6) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.L

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f102803a;

                {
                    this.f102803a = z6;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(782397106, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionPlaylistUIComponent.AutoScrollingPlaylistUI.<anonymous> (RestrictionPlaylistUIComponent.kt:151)");
                        }
                        SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(this.f102803a ? 12 : 16)), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), null, false, ComposableLambdaKt.rememberComposableLambda(952057453, true, new Function3(this, z6) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.M

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final P f102804a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f102805b;

                {
                    this.f102804a = this;
                    this.f102805b = z6;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PlayListItemVo playListItemVo = (PlayListItemVo) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(952057453, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionPlaylistUIComponent.AutoScrollingPlaylistUI.<anonymous> (RestrictionPlaylistUIComponent.kt:153)");
                    }
                    this.f102804a.d(playListItemVo, this.f102805b, composer2, iIntValue & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 << 21) & 234881024) | 14183424);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.pegasus.categoryv2.v(i7, 1, this, modifier));
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-170537815, true, new i0(this, 1)));
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c(final com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, final com.bilibili.ship.theseus.united.page.restrictionlayer.J j7, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-685399971);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(m7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(j7) : composerStartRestartGroup.changedInstance(j7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(this) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-685399971, i10, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionPlaylistUIComponent.Content (RestrictionPlaylistUIComponent.kt:65)");
            }
            final boolean z6 = !m7.o();
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1661564907, true, new Function2(m7, z6, j7, this) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.J

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102795a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f102796b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102797c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final P f102798d;

                {
                    this.f102795a = m7;
                    this.f102796b = z6;
                    this.f102797c = j7;
                    this.f102798d = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x043d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                    /*
                        Method dump skipped, instruction units count: 1208
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.J.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, m7, j7, i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final P f102799a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102800b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102801c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f102802d;

                {
                    this.f102799a = this;
                    this.f102800b = m7;
                    this.f102801c = j7;
                    this.f102802d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102802d | 1);
                    com.bilibili.ship.theseus.united.page.restrictionlayer.J j8 = this.f102801c;
                    this.f102799a.c(this.f102800b, j8, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void d(final PlayListItemVo playListItemVo, final boolean z6, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1234247869);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(playListItemVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1234247869, i9, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionPlaylistUIComponent.PlaylistItemUI (RestrictionPlaylistUIComponent.kt:161)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1413806475, true, new Function2(z6, playListItemVo) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.F

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f102781a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PlayListItemVo f102782b;

                {
                    this.f102781a = z6;
                    this.f102782b = playListItemVo;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1413806475, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionPlaylistUIComponent.PlaylistItemUI.<anonymous> (RestrictionPlaylistUIComponent.kt:163)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierWrapContentSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion3, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        boolean z7 = this.f102781a;
                        Modifier modifierM1374sizeVpY3zN4 = z7 ? SizeKt.m1374sizeVpY3zN4(companion, Dp.m3880constructorimpl(64), Dp.m3880constructorimpl(85)) : SizeKt.m1374sizeVpY3zN4(companion, Dp.m3880constructorimpl(101), Dp.m3880constructorimpl(135));
                        float f7 = 4;
                        Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(androidx.compose.foundation.text.contextmenu.internal.J.a(modifierM1374sizeVpY3zN4, f7), Color.m2628copywmQWz5c$default(Color.Companion.m2666getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopEnd(), false);
                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1169backgroundbw27NRU$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                        O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                        Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        PlayListItemVo playListItemVo2 = this.f102782b;
                        String str = playListItemVo2.f102618c;
                        Modifier modifierA = androidx.compose.foundation.text.contextmenu.internal.J.a(AlphaKt.alpha(modifierM1374sizeVpY3zN4, 0.8f), f7);
                        ContentScale.Companion companion4 = ContentScale.Companion;
                        BiliImageKt.BiliImage(str, modifierA, "", false, 0, (String) null, false, ComposableLambdaKt.rememberComposableLambda(1035514746, true, new com.bilibili.biligame.compose.widget.f(boxScopeInstance, 1), composer2, 54), (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composer2, 817889664, 0, 3448);
                        String str2 = playListItemVo2.f102620e.f71494f;
                        if (str2 == null) {
                            composer2.startReplaceGroup(1075923790);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1075923791);
                            BiliImageKt.BiliImage(str2, boxScopeInstance.align(SizeKt.m1358height3ABfNKs(SizeKt.wrapContentWidth$default(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 13, null), null, false, 3, null), Dp.m3880constructorimpl(16)), companion2.getTopEnd()), "", false, 0, (String) null, false, C6396e.f102850a, companion2.getTopEnd(), companion4.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 918552960, 0, 3192);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (z7) {
                            composer2.startReplaceGroup(1967873795);
                            composer2.endReplaceGroup();
                        } else {
                            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(M0.a(f7, 1967185719, composer2, companion), 0.0f, 1, null), composer2, 6);
                            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1378widthInVpY3zN4(companion, Dp.m3880constructorimpl(0), Dp.m3880constructorimpl(101)), null, false, 3, null);
                            BiliTheme biliTheme = BiliTheme.INSTANCE;
                            int i10 = BiliTheme.$stable;
                            TextKt.m1772Text4IGK_g(playListItemVo2.f102617b, modifierWrapContentHeight$default, biliTheme.getColors(composer2, i10).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composer2, i10).getT12(), composer2, 48, 3120, 54776);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, playListItemVo, z6, i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.G

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final P f102783a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PlayListItemVo f102784b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f102785c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f102786d;

                {
                    this.f102783a = this;
                    this.f102784b = playListItemVo;
                    this.f102785c = z6;
                    this.f102786d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102786d | 1);
                    this.f102783a.d(this.f102784b, this.f102785c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
