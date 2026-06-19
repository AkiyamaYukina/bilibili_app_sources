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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8043a f96177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f96178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final q f96179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7893a f96180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f96181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final wv0.a f96182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f96183g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/c$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f96184a;

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
            f96184a = iArr;
        }
    }

    @Inject
    public c(@NotNull C8043a c8043a, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull q qVar, @NotNull C7893a c7893a, @NotNull PageAdRepository pageAdRepository, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService) {
        this.f96177a = c8043a;
        this.f96178b = pageBackgroundPlayRepository;
        this.f96179c = qVar;
        this.f96180d = c7893a;
        this.f96181e = pageAdRepository;
        this.f96182f = aVar;
        this.f96183g = pageReportService;
    }
}
