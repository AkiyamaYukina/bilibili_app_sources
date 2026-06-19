package com.bilibili.ship.theseus.ugc.intro.questionaire;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/c.class */
@StabilityInferred(parameters = 0)
public final class c implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableState f97149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f97150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<String> f97152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final f f97154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final g f97155g;

    @NotNull
    public final h h;

    public c(@NotNull MutableState mutableState, @NotNull MutableState mutableState2, @NotNull String str, @NotNull List list, @NotNull StateFlow stateFlow, @NotNull f fVar, @NotNull g gVar, @NotNull h hVar) {
        this.f97149a = mutableState;
        this.f97150b = mutableState2;
        this.f97151c = str;
        this.f97152d = list;
        this.f97153e = stateFlow;
        this.f97154f = fVar;
        this.f97155g = gVar;
        this.h = hVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(2016431357, true, new Function2(this) { // from class: com.bilibili.ship.theseus.ugc.intro.questionaire.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f97147a;

            {
                this.f97147a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2016431357, iIntValue, -1, "com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireComponent.bindToView.<anonymous> (QuestionnaireComponent.kt:36)");
                    }
                    final c cVar = this.f97147a;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1336869445, true, new Function2(cVar) { // from class: com.bilibili.ship.theseus.ugc.intro.questionaire.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final c f97148a;

                        {
                            this.f97148a = cVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x01b7  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x0200  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20) {
                            /*
                                Method dump skipped, instruction units count: 601
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.questionaire.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
