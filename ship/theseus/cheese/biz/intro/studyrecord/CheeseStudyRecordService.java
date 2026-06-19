package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordService.class */
@StabilityInferred(parameters = 0)
public final class CheeseStudyRecordService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f90196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f90197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f90198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f90199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f90200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final y f90201g;

    @Inject
    public CheeseStudyRecordService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull BackActionRepository backActionRepository, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull y yVar) {
        this.f90195a = coroutineScope;
        this.f90196b = theseusFloatLayerService;
        this.f90197c = gVar;
        this.f90198d = backActionRepository;
        this.f90199e = pageReportService;
        this.f90200f = cVar;
        this.f90201g = yVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.z] */
    @NotNull
    public final RunningUIComponent a(@NotNull StudyRecord studyRecord) {
        final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(studyRecord);
        final Ref.LongRef longRef = new Ref.LongRef();
        return new RunningUIComponent(new w(MutableStateFlow, new Function0(longRef, this, MutableStateFlow) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.LongRef f90291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CheeseStudyRecordService f90292b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final MutableStateFlow f90293c;

            {
                this.f90291a = longRef;
                this.f90292b = this;
                this.f90293c = MutableStateFlow;
            }

            public final Object invoke() {
                Unit unit;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Ref.LongRef longRef2 = this.f90291a;
                if (jCurrentTimeMillis - longRef2.element < 500) {
                    unit = Unit.INSTANCE;
                } else {
                    longRef2.element = jCurrentTimeMillis;
                    CheeseStudyRecordService cheeseStudyRecordService = this.f90292b;
                    BuildersKt.launch$default(cheeseStudyRecordService.f90195a, (CoroutineContext) null, (CoroutineStart) null, new CheeseStudyRecordService$createComponent$1$1(this.f90293c, cheeseStudyRecordService, null), 3, (Object) null);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, new ZF0.i(this, 5), new Md.d(this, 3)), 0, new CheeseStudyRecordService$createComponent$4(this, MutableStateFlow, null), 2);
    }
}
