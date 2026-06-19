package com.bilibili.ship.theseus.ogv.intro.paybar;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ogv.intro.paybar.a;
import com.bilibili.ship.theseus.ogv.playviewextra.PayTip;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.report.d;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/OgvPayBarUIComponentService.class */
@StabilityInferred(parameters = 0)
public final class OgvPayBarUIComponentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f93334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f93336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.community.a f93337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Flow<PayTip> f93338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f93339g;

    @NotNull
    public final d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f93340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93341j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/OgvPayBarUIComponentService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f93342a;

        static {
            int[] iArr = new int[PayTip.ShowType.values().length];
            try {
                iArr[PayTip.ShowType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PayTip.ShowType.PAY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PayTip.ShowType.SINGLE_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PayTip.ShowType.SINGLE_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PayTip.ShowType.LEFT_TEXT_RIGHT_BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f93342a = iArr;
        }
    }

    @Inject
    public OgvPayBarUIComponentService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull OgvSeason ogvSeason, @NotNull InterfaceC6388m interfaceC6388m, @NotNull com.bilibili.ship.theseus.ogv.intro.community.a aVar, @NotNull Flow<PayTip> flow, @NotNull PageReportService pageReportService, @NotNull d dVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f93333a = coroutineScope;
        this.f93334b = context;
        this.f93335c = ogvSeason;
        this.f93336d = interfaceC6388m;
        this.f93337e = aVar;
        this.f93338f = flow;
        this.f93339g = pageReportService;
        this.h = dVar;
        this.f93340i = cVar;
        this.f93341j = introContentSizeRepository;
    }

    @NotNull
    public final RunningUIComponent a() {
        a.C0708a c0708a = new a.C0708a(new b(this, 0), new c(this));
        return new RunningUIComponent(new com.bilibili.ship.theseus.ogv.intro.paybar.a(c0708a), 0, new OgvPayBarUIComponentService$create$1(this, c0708a, null), 2);
    }

    public final int b(@ColorRes int i7, Integer num, Integer num2) {
        if (Cj0.a.a(this.f93334b)) {
            num = num2;
        }
        return num != null ? num.intValue() : ContextCompat.getColor(this.f93334b, i7);
    }
}
