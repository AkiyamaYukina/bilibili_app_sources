package com.bilibili.pegasus.holders.bannerv8;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4852b0;
import com.bilibili.pegasus.PegasusDataParser;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/u.class */
@StabilityInferred(parameters = 1)
public final class u implements PegasusHolderInfo<gp0.c, BannerV8Holder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final x f77827a = new Object();

    @NotNull
    public final Class<gp0.c> getDataClass() {
        return gp0.c.class;
    }

    @NotNull
    public final PegasusDataParser<gp0.c> getDataParser() {
        return this.f77827a;
    }

    @NotNull
    public final String getViewType() {
        return "banner_v8";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new BannerV8Holder(C4852b0.inflate(layoutInflater, viewGroup, false).f53986a, false);
    }
}
