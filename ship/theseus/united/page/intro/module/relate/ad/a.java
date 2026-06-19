package com.bilibili.ship.theseus.united.page.intro.module.relate.ad;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/ad/a.class */
@StabilityInferred(parameters = 1)
public final class a<V extends IAdRelateViewEntry> implements UIComponent.ViewEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final V f101101a;

    public a(@NotNull V v7) {
        this.f101101a = v7;
    }

    @NotNull
    public final View getRoot() {
        return this.f101101a.getAdRoot();
    }
}
