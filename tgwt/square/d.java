package com.bilibili.tgwt.square;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/d.class */
@StabilityInferred(parameters = 0)
public final class d implements UIComponent<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CommonCard f112111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f112112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f112113c = new ExposureEntry(Pl0.b.f19035a, new Be1.q(this, 5));

    public d(@NotNull CommonCard commonCard, @NotNull String str) {
        this.f112111a = commonCard;
        this.f112112b = str;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        e eVar = (e) viewEntry;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(eVar.f112114a, this.f112113c);
        CommonCard commonCard = this.f112111a;
        Nl0.f.d(eVar.f112116c, commonCard.f112020b);
        eVar.f112117d.setText(commonCard.f112019a);
        eVar.f112118e.setText(commonCard.f112021c);
        eVar.f112115b.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.prestart.b(this, 1));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new e(LayoutInflater.from(context).inflate(2131500197, viewGroup, false));
    }
}
