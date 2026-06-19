package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.theme.R$color;
import com.bilibili.opd.app.core.config.ConfigService;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/m.class */
@StabilityInferred(parameters = 0)
public final class m extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository$special$$inlined$map$1 f93837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExposureEntryRecordService.a f93838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<View, Unit> f93839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Long f93840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f93841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f93842f;

    @Nullable
    public OgvBadgeInfo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f93844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f93845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f93846k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f93848m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public IconTextDrawable f93851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Drawable f93852q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f93854s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Drawable f93857v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Drawable f93860y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f93843g = "theseus_detail_playing.json";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public CharSequence f93847l = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f93849n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public String f93850o = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f93853r = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public String f93855t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public String f93856u = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public String f93858w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public String f93859x = "";

    public m(@NotNull OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1, @NotNull ExposureEntryRecordService.a aVar, @NotNull Function1 function1) {
        this.f93837a = ogvCurrentEpisodeRepository$special$$inlined$map$1;
        this.f93838b = aVar;
        this.f93839c = function1;
    }

    @NotNull
    public final Drawable m(@NotNull Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AppCompatResources.getColorStateList(context, R$color.Graph_bg_regular));
        gradientDrawable.setCornerRadius(Uj0.c.a(4, context));
        return gradientDrawable;
    }

    public final void n(@NotNull View view) {
        this.f93839c.invoke(view);
    }

    public final void o(@Nullable OgvEpisode ogvEpisode, @NotNull Context context) {
        SpannableString spannableString;
        boolean zAreEqual = Intrinsics.areEqual(ogvEpisode != null ? Long.valueOf(ogvEpisode.f93555a) : null, this.f93840d);
        if (zAreEqual != this.f93845j) {
            this.f93845j = zAreEqual;
            notifyPropertyChanged(550);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setBounds(0, 0, Uj0.c.b(14, context), Uj0.c.b(10, context));
        if (zAreEqual) {
            ImageSpan imageSpan = new ImageSpan(gradientDrawable);
            spannableString = new SpannableString(C4496a.a(ConfigService.ANY, this.f93841e));
            spannableString.setSpan(imageSpan, 0, 1, 34);
        } else {
            spannableString = new SpannableString(this.f93841e);
        }
        if (Intrinsics.areEqual(spannableString, this.f93847l)) {
            return;
        }
        this.f93847l = spannableString;
        notifyPropertyChanged(589);
    }
}
