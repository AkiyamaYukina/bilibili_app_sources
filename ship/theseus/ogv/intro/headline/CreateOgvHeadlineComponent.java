package com.bilibili.ship.theseus.ogv.intro.headline;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.ogv.intro.headline.i;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import tl0.C8669a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent.class */
@StabilityInferred(parameters = 0)
public final class CreateOgvHeadlineComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f93094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.community.a f93095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f93098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.web.b f93099g;

    @NotNull
    public final Lifecycle h;

    @Inject
    public CreateOgvHeadlineComponent(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.ogv.intro.community.a aVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull OgvSeason ogvSeason, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.ogv.web.b bVar, @NotNull Lifecycle lifecycle) {
        this.f93093a = coroutineScope;
        this.f93094b = context;
        this.f93095c = aVar;
        this.f93096d = introContentSizeRepository;
        this.f93097e = ogvSeason;
        this.f93098f = pageReportService;
        this.f93099g = bVar;
        this.h = lifecycle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r5) == r0) goto L35;
     */
    /* JADX WARN: Path cross not found for [B:24:0x00d8, B:33:0x0122], limit reached: 36 */
    /* JADX WARN: Path cross not found for [B:33:0x0122, B:24:0x00d8], limit reached: 36 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099 A[PHI: r5 r6 r7
  0x0099: PHI (r5v5 com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$intervalPlayFollowAnimation$1) = 
  (r5v2 com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$intervalPlayFollowAnimation$1)
  (r5v3 com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$intervalPlayFollowAnimation$1)
  (r5v2 com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$intervalPlayFollowAnimation$1)
 binds: [B:18:0x0094, B:34:0x0149, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r6v3 com.bilibili.ship.theseus.ogv.intro.headline.i$a) = 
  (r6v0 com.bilibili.ship.theseus.ogv.intro.headline.i$a)
  (r6v1 com.bilibili.ship.theseus.ogv.intro.headline.i$a)
  (r6v5 com.bilibili.ship.theseus.ogv.intro.headline.i$a)
 binds: [B:18:0x0094, B:34:0x0149, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r7v3 long) = (r7v0 long), (r7v1 long), (r7v5 long) binds: [B:18:0x0094, B:34:0x0149, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0149 -> B:19:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent r5, com.bilibili.ship.theseus.ogv.intro.headline.i.a r6, long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent.a(com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent, com.bilibili.ship.theseus.ogv.intro.headline.i$a, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final StateListDrawable b(boolean z6) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        float fA = Uj0.c.a(12, this.f93094b);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fA);
        if (z6) {
            gradientDrawable.setColor(ContextCompat.getColor(this.f93094b, 2131101527));
        } else {
            gradientDrawable.setColor(ContextCompat.getColor(this.f93094b, 2131103964));
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(fA);
        if (z6) {
            gradientDrawable2.setColor(ContextCompat.getColor(this.f93094b, R$color.Ga2));
        } else {
            gradientDrawable2.setColor(ContextCompat.getColor(this.f93094b, 2131103284));
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(fA);
        if (z6) {
            gradientDrawable3.setColor(ContextCompat.getColor(this.f93094b, 2131101527));
            gradientDrawable3.setAlpha(77);
        } else {
            gradientDrawable3.setColor(ContextCompat.getColor(this.f93094b, R$color.Ga1));
        }
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        return stateListDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.ui.RunningUIComponent c(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.headline.OgvHeadlineData r14) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent.c(com.bilibili.ship.theseus.ogv.intro.headline.OgvHeadlineData):com.bilibili.app.gemini.ui.RunningUIComponent");
    }

    public final void d(i.a aVar, boolean z6, com.bilibili.ogv.pub.season.a aVar2, boolean z7) {
        StateListDrawable stateListDrawableB;
        if (z6 != aVar.f93156s) {
            aVar.f93156s = z6;
            aVar.notifyPropertyChanged(232);
        }
        String strA = C8669a.a(this.f93094b, aVar2, z6, z7);
        if (z6) {
            if (aVar.f93155r) {
                aVar.f93155r = false;
                aVar.notifyPropertyChanged(226);
            }
            stateListDrawableB = b(true);
            int color = ContextCompat.getColor(this.f93094b, R$color.Ga5);
            if (color != aVar.f93148k) {
                aVar.f93148k = color;
                aVar.notifyPropertyChanged(222);
            }
            if (z7) {
                Drawable drawable = AppCompatResources.getDrawable(this.f93094b, 2131241799);
                if (drawable != null) {
                    int iB = Uj0.c.b(16.0f, this.f93094b);
                    drawable.setBounds(0, 0, iB, iB);
                }
                if (!Intrinsics.areEqual(drawable, aVar.f93154q)) {
                    aVar.f93154q = drawable;
                    aVar.notifyPropertyChanged(224);
                }
                if (true != aVar.f93147j) {
                    aVar.f93147j = true;
                    aVar.notifyPropertyChanged(225);
                }
            } else if (aVar.f93147j) {
                aVar.f93147j = false;
                aVar.notifyPropertyChanged(225);
            }
        } else {
            stateListDrawableB = b(false);
            int color2 = ContextCompat.getColor(this.f93094b, R$color.Wh0_u);
            if (color2 != aVar.f93148k) {
                aVar.f93148k = color2;
                aVar.notifyPropertyChanged(222);
            }
            Drawable drawable2 = AppCompatResources.getDrawable(this.f93094b, 2131236687);
            if (drawable2 != null) {
                int iB2 = Uj0.c.b(14.0f, this.f93094b);
                drawable2.setBounds(0, 0, iB2, iB2);
            }
            if (!Intrinsics.areEqual(drawable2, aVar.f93154q)) {
                aVar.f93154q = drawable2;
                aVar.notifyPropertyChanged(224);
            }
            if (true != aVar.f93147j) {
                aVar.f93147j = true;
                aVar.notifyPropertyChanged(225);
            }
        }
        if (!Intrinsics.areEqual(strA, aVar.f93151n)) {
            aVar.f93151n = strA;
            aVar.notifyPropertyChanged(221);
        }
        if (Intrinsics.areEqual(stateListDrawableB, aVar.f93146i)) {
            return;
        }
        aVar.f93146i = stateListDrawableB;
        aVar.notifyPropertyChanged(217);
    }
}
