package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/a.class */
@StabilityInferred(parameters = 1)
public final class a<V extends IAdMerchandiseViewEntry> implements UIComponent.ViewEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final V f100568a;

    public a(@NotNull V v7) {
        this.f100568a = v7;
    }

    @NotNull
    public final View getRoot() {
        return this.f100568a.getAdRoot();
    }
}
