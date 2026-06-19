package com.bilibili.ship.theseus.sail.immatureplay;

import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.player.mediaplay.q;
import javax.inject.Inject;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8043a f96168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f96169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final q f96170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7893a f96171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f96172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final wv0.a f96173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f96174g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.sail.immatureplay.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/a$a.class */
    public static final /* synthetic */ class C0806a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f96175a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.OGV.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.UGC.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f96175a = iArr;
        }
    }

    @Inject
    public a(@NotNull C8043a c8043a, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull q qVar, @NotNull C7893a c7893a, @NotNull PageAdRepository pageAdRepository, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService) {
        this.f96168a = c8043a;
        this.f96169b = pageBackgroundPlayRepository;
        this.f96170c = qVar;
        this.f96171d = c7893a;
        this.f96172e = pageAdRepository;
        this.f96173f = aVar;
        this.f96174g = pageReportService;
    }
}
