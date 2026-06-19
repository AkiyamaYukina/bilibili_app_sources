package com.bilibili.ship.theseus.ugc.intro.questionaire;

import androidx.compose.runtime.MutableState;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/h.class */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuestionnaireService f97175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f97176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.BooleanRef f97177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableState f97178d;

    public /* synthetic */ h(QuestionnaireService questionnaireService, d dVar, Ref.BooleanRef booleanRef, MutableState mutableState) {
        this.f97175a = questionnaireService;
        this.f97176b = dVar;
        this.f97177c = booleanRef;
        this.f97178d = mutableState;
    }

    public final Object invoke(Object obj) {
        Ref.BooleanRef booleanRef = this.f97177c;
        QuestionnaireService questionnaireService = this.f97175a;
        BuildersKt.launch$default(questionnaireService.f97141a, (CoroutineContext) null, (CoroutineStart) null, new QuestionnaireService$create$close$1(booleanRef, this.f97178d, questionnaireService, (c) obj, null), 3, (Object) null);
        d dVar = this.f97176b;
        PageReportService.g(questionnaireService.f97144d, "united.player-video-detail.user-satisfaction-component.close.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("questionnaire_type", dVar.f97159d), TuplesKt.to("questionnaire_title", dVar.f97160e), TuplesKt.to("questionnaire_answer", CollectionsKt.p(dVar.f97161f, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62))}), 4);
        return Unit.INSTANCE;
    }
}
