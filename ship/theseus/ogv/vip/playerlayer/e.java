package com.bilibili.ship.theseus.ogv.vip.playerlayer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.material3.S1;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.GradientColorVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/e.class */
@StabilityInferred(parameters = 0)
public final class e extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PromptBarVo f94864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerToastVo f94865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final S1 f94866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f94867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f94868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f94869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f94870g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f94871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f94872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f94873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f94874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f94875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f94876n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final TextVo f94877o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final TextVo f94878p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final GradientDrawable f94879q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final GradientDrawable f94880r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final GradientDrawable f94881s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final GradientDrawable f94882t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final GradientDrawable f94883u;

    public e(@NotNull Context context, @NotNull PromptBarVo promptBarVo, @NotNull PlayerToastVo playerToastVo, @NotNull S1 s12) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        GradientDrawable gradientDrawable3;
        Integer numB;
        Integer numA;
        Integer numB2;
        Integer numA2;
        Integer numB3;
        Integer numA3;
        Integer numB4;
        Integer numA4;
        Integer numB5;
        this.f94864a = promptBarVo;
        this.f94865b = playerToastVo;
        this.f94866c = s12;
        TextVo textVo = promptBarVo.d().size() == 2 ? (TextVo) CollectionsKt.getOrNull(promptBarVo.d(), 0) : null;
        this.f94877o = textVo;
        TextVo textVo2 = promptBarVo.d().size() == 2 ? (TextVo) CollectionsKt.getOrNull(promptBarVo.d(), 1) : (TextVo) CollectionsKt.getOrNull(promptBarVo.d(), 0);
        this.f94878p = textVo2;
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        gradientDrawable4.setOrientation(orientation);
        GradientColorVo gradientColorVoF = promptBarVo.f();
        int iIntValue = (gradientColorVoF == null || (numB5 = gradientColorVoF.b()) == null) ? 0 : numB5.intValue();
        gradientDrawable4.setColors(new int[]{iIntValue, (gradientColorVoF == null || (numA4 = gradientColorVoF.a()) == null) ? iIntValue : numA4.intValue()});
        gradientDrawable4.setCornerRadius(Uj0.c.a(6, context));
        this.f94879q = gradientDrawable4;
        if (textVo != null) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(orientation);
            gradientDrawable.setCornerRadius(Uj0.c.a(100, context));
            GradientColorVo gradientColorVoF2 = textVo.f();
            int iIntValue2 = (gradientColorVoF2 == null || (numB4 = gradientColorVoF2.b()) == null) ? 0 : numB4.intValue();
            GradientColorVo gradientColorVoF3 = textVo.f();
            gradientDrawable.setColors(new int[]{iIntValue2, (gradientColorVoF3 == null || (numA3 = gradientColorVoF3.a()) == null) ? 0 : numA3.intValue()});
        } else {
            gradientDrawable = null;
        }
        this.f94880r = gradientDrawable;
        if (textVo2 != null) {
            gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setOrientation(orientation);
            gradientDrawable2.setCornerRadius(Uj0.c.a(100, context));
            GradientColorVo gradientColorVoF4 = textVo2.f();
            int iIntValue3 = (gradientColorVoF4 == null || (numB3 = gradientColorVoF4.b()) == null) ? 0 : numB3.intValue();
            GradientColorVo gradientColorVoF5 = textVo2.f();
            gradientDrawable2.setColors(new int[]{iIntValue3, (gradientColorVoF5 == null || (numA2 = gradientColorVoF5.a()) == null) ? 0 : numA2.intValue()});
        } else {
            gradientDrawable2 = null;
        }
        this.f94881s = gradientDrawable2;
        if ((textVo != null ? textVo.e() : null) != null) {
            gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setOrientation(orientation);
            gradientDrawable3.setCornerRadius(Uj0.c.a(2, context));
            GradientColorVo gradientColorVoF6 = textVo.e().f();
            int iIntValue4 = (gradientColorVoF6 == null || (numB2 = gradientColorVoF6.b()) == null) ? 0 : numB2.intValue();
            GradientColorVo gradientColorVoF7 = textVo.e().f();
            gradientDrawable3.setColors(new int[]{iIntValue4, (gradientColorVoF7 == null || (numA = gradientColorVoF7.a()) == null) ? 0 : numA.intValue()});
        } else {
            gradientDrawable3 = null;
        }
        this.f94882t = gradientDrawable3;
        GradientDrawable gradientDrawable5 = null;
        if ((textVo2 != null ? textVo2.e() : null) != null) {
            gradientDrawable5 = new GradientDrawable();
            gradientDrawable5.setOrientation(orientation);
            gradientDrawable5.setCornerRadius(Uj0.c.a(2, context));
            GradientColorVo gradientColorVoF8 = textVo2.e().f();
            int iIntValue5 = (gradientColorVoF8 == null || (numB = gradientColorVoF8.b()) == null) ? 0 : numB.intValue();
            GradientColorVo gradientColorVoF9 = textVo2.e().f();
            int iIntValue6 = 0;
            if (gradientColorVoF9 != null) {
                Integer numA5 = gradientColorVoF9.a();
                iIntValue6 = 0;
                if (numA5 != null) {
                    iIntValue6 = numA5.intValue();
                }
            }
            gradientDrawable5.setColors(new int[]{iIntValue5, iIntValue6});
        }
        this.f94883u = gradientDrawable5;
    }
}
