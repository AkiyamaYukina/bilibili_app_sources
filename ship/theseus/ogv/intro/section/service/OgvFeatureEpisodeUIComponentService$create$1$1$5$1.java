package com.bilibili.ship.theseus.ogv.intro.section.service;

import android.net.Uri;
import androidx.appcompat.widget.C3259x;
import com.bilibili.ship.theseus.ogv.C6153e;
import com.bilibili.ship.theseus.ogv.intro.section.ui.u;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1$1$5$1.class */
public final class OgvFeatureEpisodeUIComponentService$create$1$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final u.a $item;
    final int $pos;
    final u $seasonListUIComponent;
    int label;
    final OgvFeatureEpisodeUIComponentService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1$1$5$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvFeatureEpisodeUIComponentService f93741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f93742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f93743c;

        public a(OgvFeatureEpisodeUIComponentService ogvFeatureEpisodeUIComponentService, u uVar, int i7) {
            this.f93741a = ogvFeatureEpisodeUIComponentService;
            this.f93742b = uVar;
            this.f93743c = i7;
        }

        public final Object emit(Object obj, Continuation continuation) {
            long jLongValue = ((Number) obj).longValue();
            OgvFeatureEpisodeUIComponentService ogvFeatureEpisodeUIComponentService = this.f93741a;
            PageReportService.g(ogvFeatureEpisodeUIComponentService.h, "united.player-video-detail.season.0.click", null, 6);
            if (ogvFeatureEpisodeUIComponentService.f93737i.a()) {
                Uri.Builder builderPath = new Uri.Builder().scheme(LogReportStrategy.TAG_DEFAULT).authority("pgc").path("season");
                if (jLongValue > 0) {
                    builderPath.appendQueryParameter("season_id", String.valueOf(jLongValue));
                }
                Qj0.g.e(ogvFeatureEpisodeUIComponentService.f93739k, builderPath.appendQueryParameter("from_spmid", "united.player-video-detail.playlist-series.0").build());
            } else {
                this.f93742b.e(jLongValue);
                C6153e.f(ogvFeatureEpisodeUIComponentService.f93736g, Boxing.boxLong(jLongValue), null, 0, C3259x.a(this.f93743c + 1, "united.player-video-detail.series."), 0, 6);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvFeatureEpisodeUIComponentService$create$1$1$5$1(u.a aVar, OgvFeatureEpisodeUIComponentService ogvFeatureEpisodeUIComponentService, u uVar, int i7, Continuation<? super OgvFeatureEpisodeUIComponentService$create$1$1$5$1> continuation) {
        super(2, continuation);
        this.$item = aVar;
        this.this$0 = ogvFeatureEpisodeUIComponentService;
        this.$seasonListUIComponent = uVar;
        this.$pos = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvFeatureEpisodeUIComponentService$create$1$1$5$1(this.$item, this.this$0, this.$seasonListUIComponent, this.$pos, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Long> mutableSharedFlow = this.$item.f93885a.f93887b;
            a aVar = new a(this.this$0, this.$seasonListUIComponent, this.$pos);
            this.label = 1;
            if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
