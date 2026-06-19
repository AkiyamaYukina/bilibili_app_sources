package com.bilibili.search2.result.all;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchSpecialItem;
import dt0.AbstractC6843f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/N.class */
@StabilityInferred(parameters = 0)
public final class N extends AbstractC6843f<SearchSpecialItem> implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliImageView f87147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f87148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f87149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TagSpanTextView f87150d;

    /* JADX WARN: Multi-variable type inference failed */
    public N(@NotNull Bl.K k7) {
        super(k7.a);
        this.f87147a = this.itemView.findViewById(2131298941);
        this.f87148b = (TextView) this.itemView.findViewById(2131308958);
        this.f87149c = (TextView) this.itemView.findViewById(2131297143);
        this.f87150d = this.itemView.findViewById(2131299190);
        this.itemView.setOnClickListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        com.bilibili.search2.utils.extension.c.a(this.f87147a, ((SearchSpecialItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        this.f87148b.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchSpecialItem) getData()).getTitle(), 0, 4, (Object) null));
        if (TextUtils.isEmpty(((SearchSpecialItem) getData()).getBadge())) {
            this.f87149c.setVisibility(8);
        } else {
            this.f87149c.setText(((SearchSpecialItem) getData()).getBadge());
            this.f87149c.setVisibility(0);
        }
        com.bilibili.search2.utils.B.i(this.f87150d, ((SearchSpecialItem) getData()).getBadgeTag(), ((SearchSpecialItem) getData()).getBadgeIcon(), ((SearchSpecialItem) getData()).getDesc(), new OS0.v(this, 3), null, false, null, 2032);
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return this.f87148b;
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final String getDefaultModuleType() {
        return "special";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (TextUtils.isEmpty(((SearchSpecialItem) getData()).getUri())) {
            return;
        }
        Uri uri = Uri.parse(((SearchSpecialItem) getData()).getUri());
        Uri uriBuild = uri;
        if (uri != null) {
            if (TextUtils.isEmpty("from_spmid")) {
                uriBuild = uri;
            } else {
                try {
                    uriBuild = uri.buildUpon().appendQueryParameter("from_spmid", "search.search-result.0.0").build();
                } catch (Exception e7) {
                    uriBuild = uri;
                }
            }
        }
        Os0.e.f(view.getContext(), uriBuild);
        String linkType = ((SearchSpecialItem) getData()).getLinkType();
        if (linkType == null) {
            linkType = "special";
        }
        Xs0.b.i("search.search-result.search-card.all.click", "", linkType, (BaseSearchItem) getData(), Xs0.b.b("special", "0"), null, null, null, null, null, false, null, 8160);
        clickWithRefreshStatus();
    }
}
