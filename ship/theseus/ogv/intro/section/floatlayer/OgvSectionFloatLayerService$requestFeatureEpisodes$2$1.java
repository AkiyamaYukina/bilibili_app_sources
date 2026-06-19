package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.h;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.u;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonRights;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$requestFeatureEpisodes$2$1.class */
final class OgvSectionFloatLayerService$requestFeatureEpisodes$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final u.a $caVm;
    final EpisodeSection $featureEpisodeSection;
    final List<EpisodeSection> $previewSections;
    final SectionFloatLayerSeason $season;
    final long $seasonId;
    final String $splitText;
    final o.b $vm;
    final h.a $wrapVm;
    private Object L$0;
    int label;
    final OgvSectionFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$requestFeatureEpisodes$2$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$requestFeatureEpisodes$2$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final EpisodeSection $featureEpisodeSection;
        final SectionFloatLayerSeason $season;
        final long $seasonId;
        int label;
        final OgvSectionFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EpisodeSection episodeSection, OgvSectionFloatLayerService ogvSectionFloatLayerService, SectionFloatLayerSeason sectionFloatLayerSeason, long j7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$featureEpisodeSection = episodeSection;
            this.this$0 = ogvSectionFloatLayerService;
            this.$season = sectionFloatLayerSeason;
            this.$seasonId = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$featureEpisodeSection, this.this$0, this.$season, this.$seasonId, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r0 = r5
                int r0 = r0.label
                if (r0 != 0) goto L9b
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection r0 = r0.$featureEpisodeSection
                boolean r0 = r0.d()
                if (r0 == 0) goto L87
                r0 = r5
                com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService r0 = r0.this$0
                Gu0.a r0 = r0.f93620b
                r12 = r0
                r0 = r5
                com.bilibili.ship.theseus.ogv.intro.section.floatlayer.SectionFloatLayerSeason r0 = r0.$season
                r6 = r0
                r0 = r6
                com.bilibili.ship.theseus.ogv.season.OgvSeasonRights r0 = r0.f93640b
                r11 = r0
                r0 = r12
                java.lang.Class r0 = r0.getClass()
                r0 = r6
                com.bilibili.ship.theseus.ogv.season.TestSwitch r0 = r0.f93643e
                boolean r0 = r0.c()
                r8 = r0
                r0 = r11
                boolean r0 = r0.g()
                r7 = r0
                r0 = r8
                if (r0 == 0) goto L4c
                r0 = r7
                if (r0 == 0) goto L4c
                goto L87
            L4c:
                r0 = r5
                com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService r0 = r0.this$0
                Gu0.a r0 = r0.f93620b
                r6 = r0
                r0 = r5
                long r0 = r0.$seasonId
                r9 = r0
                r0 = r6
                java.lang.Class r0 = r0.getClass()
                r0 = r9
                boolean r0 = Gu0.a.o(r0)
                r7 = r0
                r0 = r5
                com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService r0 = r0.this$0
                Gu0.a r0 = r0.f93620b
                r1 = r5
                long r1 = r1.$seasonId
                r2 = r7
                r0.p(r1, r2)
                r0 = r5
                com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService r0 = r0.this$0
                kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f93629l
                r1 = r7
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                r0.setValue(r1)
                goto L97
            L87:
                r0 = r5
                com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService r0 = r0.this$0
                kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f93629l
                r1 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                r0.setValue(r1)
            L97:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L9b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$requestFeatureEpisodes$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$requestFeatureEpisodes$2$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$requestFeatureEpisodes$2$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final u.a $caVm;
        final EpisodeSection $featureEpisodeSection;
        final List<EpisodeSection> $previewSections;
        final SectionFloatLayerSeason $season;
        final String $splitText;
        final o.b $vm;
        final h.a $wrapVm;
        int label;
        final OgvSectionFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvSectionFloatLayerService ogvSectionFloatLayerService, SectionFloatLayerSeason sectionFloatLayerSeason, EpisodeSection episodeSection, List<EpisodeSection> list, String str, o.b bVar, h.a aVar, u.a aVar2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvSectionFloatLayerService;
            this.$season = sectionFloatLayerSeason;
            this.$featureEpisodeSection = episodeSection;
            this.$previewSections = list;
            this.$splitText = str;
            this.$vm = bVar;
            this.$wrapVm = aVar;
            this.$caVm = aVar2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$season, this.$featureEpisodeSection, this.$previewSections, this.$splitText, this.$vm, this.$wrapVm, this.$caVm, continuation);
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
            Gu0.a aVar = this.this$0.f93620b;
            SectionFloatLayerSeason sectionFloatLayerSeason = this.$season;
            OgvSeasonRights ogvSeasonRights = sectionFloatLayerSeason.f93640b;
            aVar.getClass();
            if (!(sectionFloatLayerSeason.f93643e.c() && ogvSeasonRights.g()) || this.$featureEpisodeSection.h.isEmpty() || this.$previewSections.isEmpty()) {
                OgvSectionFloatLayerService ogvSectionFloatLayerService = this.this$0;
                SectionFloatLayerSeason sectionFloatLayerSeason2 = this.$season;
                EpisodeSection episodeSection = this.$featureEpisodeSection;
                o.b bVar = this.$vm;
                h.a aVar2 = this.$wrapVm;
                u.a aVar3 = this.$caVm;
                ogvSectionFloatLayerService.getClass();
                bVar.q(episodeSection.h.isEmpty() ? ogvSectionFloatLayerService.f93619a.getString(2131851649) : ogvSectionFloatLayerService.f93619a.getString(2131846730, String.valueOf(episodeSection.h.size())));
                aVar2.f93670d = bVar.f93694c;
                aVar2.f93671e = episodeSection.b().f93542a;
                aVar3.f93723a.setValue(episodeSection.b().f93543b);
                aVar2.m();
                ogvSectionFloatLayerService.d(episodeSection, episodeSection.f93524b, sectionFloatLayerSeason2, bVar, aVar2);
            } else {
                OgvSectionFloatLayerService ogvSectionFloatLayerService2 = this.this$0;
                SectionFloatLayerSeason sectionFloatLayerSeason3 = this.$season;
                EpisodeSection episodeSection2 = this.$featureEpisodeSection;
                List<EpisodeSection> list = this.$previewSections;
                String str = this.$splitText;
                o.b bVar2 = this.$vm;
                h.a aVar4 = this.$wrapVm;
                u.a aVar5 = this.$caVm;
                ogvSectionFloatLayerService2.getClass();
                bVar2.o(false);
                bVar2.q(ogvSectionFloatLayerService2.f93619a.getString(2131846730, String.valueOf(episodeSection2.h.size())));
                aVar4.f93670d = bVar2.f93694c;
                aVar4.n(false);
                aVar4.f93671e = episodeSection2.b().f93542a;
                aVar5.f93723a.setValue(episodeSection2.b().f93543b);
                aVar4.m();
                ogvSectionFloatLayerService2.c(episodeSection2, list, str, episodeSection2.f93524b, sectionFloatLayerSeason3, bVar2, aVar4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvSectionFloatLayerService$requestFeatureEpisodes$2$1(EpisodeSection episodeSection, OgvSectionFloatLayerService ogvSectionFloatLayerService, SectionFloatLayerSeason sectionFloatLayerSeason, long j7, List<EpisodeSection> list, String str, o.b bVar, h.a aVar, u.a aVar2, Continuation<? super OgvSectionFloatLayerService$requestFeatureEpisodes$2$1> continuation) {
        super(2, continuation);
        this.$featureEpisodeSection = episodeSection;
        this.this$0 = ogvSectionFloatLayerService;
        this.$season = sectionFloatLayerSeason;
        this.$seasonId = j7;
        this.$previewSections = list;
        this.$splitText = str;
        this.$vm = bVar;
        this.$wrapVm = aVar;
        this.$caVm = aVar2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvSectionFloatLayerService$requestFeatureEpisodes$2$1 ogvSectionFloatLayerService$requestFeatureEpisodes$2$1 = new OgvSectionFloatLayerService$requestFeatureEpisodes$2$1(this.$featureEpisodeSection, this.this$0, this.$season, this.$seasonId, this.$previewSections, this.$splitText, this.$vm, this.$wrapVm, this.$caVm, continuation);
        ogvSectionFloatLayerService$requestFeatureEpisodes$2$1.L$0 = obj;
        return ogvSectionFloatLayerService$requestFeatureEpisodes$2$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$featureEpisodeSection, this.this$0, this.$season, this.$seasonId, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$season, this.$featureEpisodeSection, this.$previewSections, this.$splitText, this.$vm, this.$wrapVm, this.$caVm, null), 3, (Object) null);
    }
}
