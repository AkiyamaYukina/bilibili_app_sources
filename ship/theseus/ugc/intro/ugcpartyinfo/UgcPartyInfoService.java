package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ugc.intro.UgcCardStatusRepository;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService;
import com.bilibili.ship.theseus.united.page.intro.module.season.Y;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService.class */
@StabilityInferred(parameters = 0)
public final class UgcPartyInfoService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f97403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f97404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UgcCardStatusRepository f97405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final i f97406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f97407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f97408g;

    @NotNull
    public final Y h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f97409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonService f97410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97411k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f97412a;

        static {
            int[] iArr = new int[ReserveBizType.values().length];
            try {
                iArr[ReserveBizType.BizTypeReserveActivity.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f97412a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f97413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UgcPartyInfoService f97414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.ObjectRef<e> f97415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.BooleanRef f97416d;

        public b(g gVar, UgcPartyInfoService ugcPartyInfoService, Ref.ObjectRef<e> objectRef, Ref.BooleanRef booleanRef) {
            this.f97413a = gVar;
            this.f97414b = ugcPartyInfoService;
            this.f97415c = objectRef;
            this.f97416d = booleanRef;
        }
    }

    @Inject
    public UgcPartyInfoService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ActivityColorRepository activityColorRepository, @NotNull UgcCardStatusRepository ugcCardStatusRepository, @NotNull i iVar, @NotNull PageReportService pageReportService, @NotNull IInteractLayerService iInteractLayerService, @NotNull Y y6, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull UnitedSeasonService unitedSeasonService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f97402a = coroutineScope;
        this.f97403b = context;
        this.f97404c = activityColorRepository;
        this.f97405d = ugcCardStatusRepository;
        this.f97406e = iVar;
        this.f97407f = pageReportService;
        this.f97408g = iInteractLayerService;
        this.h = y6;
        this.f97409i = unitedSeasonDetailRepository;
        this.f97410j = unitedSeasonService;
        this.f97411k = introContentSizeRepository;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull g gVar) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        c cVar = gVar.f97438d;
        this.f97406e.f97443b.setValue(Boolean.valueOf(cVar.f97423a));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return new RunningUIComponent(new f(this.f97403b, new b(gVar, this, objectRef, booleanRef), this.f97411k.f100020a), 0, new UgcPartyInfoService$create$1(this, cVar, objectRef, null), 2);
    }
}
