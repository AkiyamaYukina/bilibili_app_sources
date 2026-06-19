package com.bilibili.relation;

import Di0.C1602f;
import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialog;
import com.bilibili.relation.api.RelationApiManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import tv.danmaku.bili.ui.main2.mineV2.RelationService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/G.class */
public final /* synthetic */ class G implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f85914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f85915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef f85916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RelationService.modifyDialog.2.d f85917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RelationService.modifyDialog.2.e f85918e;

    public /* synthetic */ G(Context context, long j7, Ref.ObjectRef objectRef, RelationService.modifyDialog.2.d dVar, RelationService.modifyDialog.2.e eVar) {
        this.f85914a = context;
        this.f85915b = j7;
        this.f85916c = objectRef;
        this.f85917d = dVar;
        this.f85918e = eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        final Context context = this.f85914a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(320520423, iIntValue, -1, "com.bilibili.relation.createDeleteFansPopupDialog.<anonymous> (FollowMenuContent.kt:293)");
            }
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m3880constructorimpl(8), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1344paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer);
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(2131858023, composer, 0);
            final Ref.ObjectRef objectRef = this.f85916c;
            final RelationService.modifyDialog.2.d dVar = this.f85917d;
            final RelationService.modifyDialog.2.e eVar = this.f85918e;
            final long j7 = this.f85915b;
            FollowMenuContentKt.b(2131242678, 0, composer, strStringResource, new Function0(context, j7, objectRef, dVar, eVar) { // from class: com.bilibili.relation.I

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f85927a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f85928b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Ref.ObjectRef f85929c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final RelationService.modifyDialog.2.d f85930d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final RelationService.modifyDialog.2.e f85931e;

                {
                    this.f85927a = context;
                    this.f85928b = j7;
                    this.f85929c = objectRef;
                    this.f85930d = dVar;
                    this.f85931e = eVar;
                }

                public final Object invoke() {
                    ScreenAdjustPopupDialog screenAdjustPopupDialog;
                    Context context2 = this.f85927a;
                    c70.e eVar2 = new c70.e(this.f85930d, 2);
                    com.bilibili.biligame.ui.minigame.more.g gVar = new com.bilibili.biligame.ui.minigame.more.g(this.f85931e, 4);
                    long j8 = this.f85928b;
                    RelationApiManager.modifyRelation(j8, 2, 0, "", "", "", "", new U(j8, context2, eVar2, gVar));
                    Object obj3 = this.f85929c.element;
                    if (obj3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        screenAdjustPopupDialog = null;
                    } else {
                        screenAdjustPopupDialog = (ScreenAdjustPopupDialog) obj3;
                    }
                    screenAdjustPopupDialog.dismiss();
                    return Unit.INSTANCE;
                }
            });
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
