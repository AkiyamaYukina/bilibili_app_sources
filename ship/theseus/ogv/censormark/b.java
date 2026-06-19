package com.bilibili.ship.theseus.ogv.censormark;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.mobile.BLHumanActionParamsType;
import kntr.app.ad.common.inspector.ui.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/b.class */
@StabilityInferred(parameters = 1)
public final class b implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f91685a;

    public b(@NotNull g gVar) {
        this.f91685a = gVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final int i7 = 0;
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1185427489, true, new Function2(this, i7) { // from class: com.bilibili.ship.theseus.ogv.censormark.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f91683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f91684b;

            {
                this.f91683a = i7;
                this.f91684b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f91683a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1185427489, iIntValue, -1, "com.bilibili.ship.theseus.ogv.censormark.CensorMarkUIComponent.bindToView.<anonymous> (CensorMarkUi.kt:38)");
                            }
                            f.a(((b) this.f91684b).f91685a, composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        Composer composer2 = (Composer) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1119094140, iIntValue2, -1, "kntr.app.ad.common.inspector.ui.MinimalisticTopBar.<anonymous> (InspectorScreen.kt:889)");
                            }
                            Object objRememberedValue = composer2.rememberedValue();
                            Object bVar = objRememberedValue;
                            if (objRememberedValue == Composer.Companion.getEmpty()) {
                                bVar = new Mx0.b((MutableState) this.f91684b, 4);
                                composer2.updateRememberedValue(bVar);
                            }
                            ButtonKt.TextButton((Function0<Unit>) bVar, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) y.j, composer2, 805306374, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_MAX_SIZE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new UIComponent.b(composeView);
    }
}
