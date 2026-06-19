package com.bilibili.pegasus.components.interest;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/l.class */
@StabilityInferred(parameters = 0)
public final class l extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextView f76343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliImageView f76344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View f76345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterestChooseItem f76346d;

    public l(@NotNull View view) {
        super(view);
        this.f76343a = (TextView) view.findViewById(2131308958);
        this.f76344b = view.findViewById(2131301546);
        this.f76345c = view.findViewById(2131298242);
    }
}
