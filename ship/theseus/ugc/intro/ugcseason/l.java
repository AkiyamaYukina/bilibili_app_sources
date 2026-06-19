package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import Vu0.G;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService;
import com.bilibili.upper.module.aistory.test.base.BaseAIStoryPageFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/l.class */
@StabilityInferred(parameters = 0)
public final class l implements UIComponent<n<G>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i f97504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97506c = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new com.bilibili.bililive.room.ui.roomv3.voice.i(this, 2));

    public l(@NotNull i iVar, @NotNull StateFlow stateFlow) {
        this.f97504a = iVar;
        this.f97505b = stateFlow;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        G g7 = (G) ((n) viewEntry).a;
        ConstraintLayout constraintLayout = g7.f25818a;
        TextView textView = g7.f25822e;
        TextView textView2 = g7.f25821d;
        TextView textView3 = g7.f25820c;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(constraintLayout, this.f97506c);
        final int i7 = 1;
        g7.f25819b.setOnClickListener(new View.OnClickListener(this, i7) { // from class: HF0.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8382b;

            {
                this.f8381a = i7;
                this.f8382b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f8381a) {
                    case 0:
                        BaseAIStoryPageFragment baseAIStoryPageFragment = (BaseAIStoryPageFragment) this.f8382b;
                        baseAIStoryPageFragment.nf();
                        baseAIStoryPageFragment.rf();
                        break;
                    default:
                        com.bilibili.ship.theseus.ugc.intro.ugcseason.l lVar = (com.bilibili.ship.theseus.ugc.intro.ugcseason.l) this.f8382b;
                        com.bilibili.ship.theseus.ugc.intro.ugcseason.i iVar = lVar.f97504a;
                        UnitedSeasonService.b(iVar.f97500d.f97464n, (C6353o) iVar.f97498b.element, null, 6);
                        lVar.f97504a.b(false);
                        break;
                }
            }
        });
        i iVar = this.f97504a;
        textView.setText(((C6353o) iVar.f97498b.element).f101674f);
        if (StringsKt.isBlank(iVar.c())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(iVar.c());
        }
        textView3.setText(iVar.a());
        iVar.f97497a.element = new k(textView3, this);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcSimpleSeasonComponent$bindToView$4(this, constraintLayout, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(G.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
