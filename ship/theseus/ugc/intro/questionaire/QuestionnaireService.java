package com.bilibili.ship.theseus.ugc.intro.questionaire;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import javax.inject.Inject;
import kntr.app.digital.backpack.aggregate.k;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import rj0.C8528c;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService.class */
@StabilityInferred(parameters = 0)
public final class QuestionnaireService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f97142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rW0.a<IntroRecycleViewService> f97143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f97144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final e f97145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97146f;

    @Inject
    public QuestionnaireService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull rW0.a<IntroRecycleViewService> aVar, @NotNull PageReportService pageReportService, @NotNull e eVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f97141a = coroutineScope;
        this.f97142b = hVar;
        this.f97143c = aVar;
        this.f97144d = pageReportService;
        this.f97145e = eVar;
        this.f97146f = introContentSizeRepository;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.bilibili.ship.theseus.ugc.intro.questionaire.f] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.bilibili.ship.theseus.ugc.intro.questionaire.g] */
    @NotNull
    public final RunningUIComponent a(@NotNull final d dVar) {
        if (i.f97179a) {
            BLog.w("QuestionnaireService-create", "[theseus-ugc-QuestionnaireService-create] questionnaire info already showing", (Throwable) null);
            return new RunningUIComponent(new com.bilibili.app.gemini.ui.e(StateFlowKt.MutableStateFlow(Float.valueOf(0.0f))), 0, (Function1) null, 6);
        }
        final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(dVar.f97162g), null, 2, null);
        final MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(-1L, null, 2, null);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        this.f97145e.f97166a = true;
        final int i7 = 0;
        return new RunningUIComponent(new c(mutableStateMutableStateOf$default, mutableStateMutableStateOf$default2, dVar.f97160e, dVar.f97161f, this.f97146f.f100020a, new Function0(i7, this, dVar) { // from class: com.bilibili.ship.theseus.ugc.intro.questionaire.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f97167a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f97168b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f97169c;

            {
                this.f97167a = i7;
                this.f97168b = this;
                this.f97169c = dVar;
            }

            public final Object invoke() {
                switch (this.f97167a) {
                    case 0:
                        i.f97179a = true;
                        QuestionnaireService questionnaireService = (QuestionnaireService) this.f97168b;
                        questionnaireService.getClass();
                        d dVar2 = (d) this.f97169c;
                        PageReportService.i(questionnaireService.f97144d, "united.player-video-detail.user-satisfaction-component.0.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("questionnaire_type", dVar2.f97159d), TuplesKt.to("questionnaire_title", dVar2.f97160e), TuplesKt.to("questionnaire_answer", CollectionsKt.p(dVar2.f97161f, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62))}), 4);
                        break;
                    default:
                        yW0.b bVar = ((k) this.f97168b).m;
                        if (bVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("reportServiceProvider");
                            bVar = null;
                        }
                        MZ0.c cVar = (MZ0.c) bVar.get();
                        String str = (String) this.f97169c;
                        cVar.a("sqzz.activity.bag.0.show", MapsKt.mapOf(TuplesKt.to("page_from", str == null ? "" : str)));
                        Sm.d dVar3 = C8528c.f126680a;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        dVar3.a("sqzz.activity.kntr.bag.show", MapsKt.mapOf(TuplesKt.to("page_from", str2)));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function2(mutableStateMutableStateOf$default2, dVar, this, booleanRef, mutableStateMutableStateOf$default) { // from class: com.bilibili.ship.theseus.ugc.intro.questionaire.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableState f97170a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f97171b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final QuestionnaireService f97172c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Ref.BooleanRef f97173d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final MutableState f97174e;

            {
                this.f97170a = mutableStateMutableStateOf$default2;
                this.f97171b = dVar;
                this.f97172c = this;
                this.f97173d = booleanRef;
                this.f97174e = mutableStateMutableStateOf$default;
            }

            public final Object invoke(Object obj, Object obj2) {
                d dVar2 = this.f97171b;
                this.f97170a.setValue(Long.valueOf(((ArrayList) dVar2.f97161f).indexOf(r0)));
                Ref.BooleanRef booleanRef2 = this.f97173d;
                QuestionnaireService questionnaireService = this.f97172c;
                BuildersKt.launch$default(questionnaireService.f97141a, (CoroutineContext) null, (CoroutineStart) null, new QuestionnaireService$create$close$1(booleanRef2, this.f97174e, questionnaireService, (c) obj2, null), 3, (Object) null);
                PageReportService.g(questionnaireService.f97144d, "united.player-video-detail.user-satisfaction-component.select.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("questionnaire_type", dVar2.f97159d), TuplesKt.to("questionnaire_title", dVar2.f97160e), TuplesKt.to("questionnaire_answer", CollectionsKt.p(dVar2.f97161f, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62)), TuplesKt.to("select_answer", (String) obj)}), 4);
                p.j(2131841683);
                return Unit.INSTANCE;
            }
        }, new h(this, dVar, booleanRef, mutableStateMutableStateOf$default)), 0, new QuestionnaireService$create$4(dVar, this, booleanRef, mutableStateMutableStateOf$default, null), 2);
    }
}
