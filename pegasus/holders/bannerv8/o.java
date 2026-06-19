package com.bilibili.pegasus.holders.bannerv8;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4850a0;
import com.bilibili.pegasus.PegasusDataParser;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/o.class */
@StabilityInferred(parameters = 1)
public final class o implements PegasusHolderInfo<gp0.c, BannerV8Holder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final x f77814a = new Object();

    @NotNull
    public final Class<gp0.c> getDataClass() {
        return gp0.c.class;
    }

    @Nullable
    public final PegasusDataParser<gp0.c> getDataParser() {
        return this.f77814a;
    }

    @NotNull
    public final String getViewType() {
        return "banner_single_v8";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new BannerV8Holder(C4850a0.inflate(layoutInflater, viewGroup, false).f53975a, true);
    }
}
