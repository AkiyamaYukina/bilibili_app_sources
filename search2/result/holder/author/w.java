package com.bilibili.search2.result.holder.author;

import Ps0.C2784e;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.opus.lightpublish.page.comment.y;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchAuthorNew;
import com.bilibili.search2.utils.B;
import dt0.AbstractC6843f;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/w.class */
@StabilityInferred(parameters = 0)
public final class w extends AbstractC6843f<SearchAuthorNew.AvItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BaseSearchItem f87897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f87898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f87899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f87900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f87901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f87902f;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull ViewGroup viewGroup, @NotNull BaseSearchItem baseSearchItem) {
        super(p.a(viewGroup, 2131494396, viewGroup, false));
        this.f87897a = baseSearchItem;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f87898b = LazyKt.lazy(lazyThreadSafetyMode, new com.bilibili.bililive.room.ui.roomv3.hybrid.h(this, 1));
        this.f87899c = LazyKt.lazy(lazyThreadSafetyMode, new y(this, 3));
        this.f87900d = LazyKt.lazy(lazyThreadSafetyMode, new Sf.b(this, 3));
        this.f87901e = LazyKt.lazy(lazyThreadSafetyMode, new Sf.c(this, 3));
        this.f87902f = LazyKt.lazy(lazyThreadSafetyMode, new com.bilibili.ad.composecomponent.feedbackpanel.s(this, 3));
        this.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.search2.result.holder.author.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final w f87896a;

            {
                this.f87896a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.author.w, dt0.f] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ?? r02 = this.f87896a;
                String uri = ((SearchAuthorNew.AvItem) r02.getData()).getUri();
                if (uri != null && !StringsKt.isBlank(uri)) {
                    String uri2 = ((SearchAuthorNew.AvItem) r02.getData()).getUri();
                    Uri uriBuild = null;
                    if (!TextUtils.isEmpty(uri2)) {
                        try {
                            Uri.Builder builderBuildUpon = Uri.parse(uri2).buildUpon();
                            builderBuildUpon.appendQueryParameter("from_spmid", "search.search-result.0.0");
                            builderBuildUpon.appendQueryParameter("jumpFrom", "3");
                            uriBuild = builderBuildUpon.build();
                        } catch (Exception e7) {
                            BLog.e("SearchSpmidConstants", e7);
                        }
                    }
                    if (uriBuild != null) {
                        Os0.e.g(Os0.e.f18030a, view.getContext(), uriBuild.toString());
                    }
                }
                String linkType = ((SearchAuthorNew.AvItem) r02.getData()).getLinkType();
                String str = linkType;
                if (linkType == null) {
                    str = "app_user";
                }
                Xs0.b.i("search.search-result.search-card.all.click", null, str, r02.f87897a, ((SearchAuthorNew.AvItem) r02.getData()).getParam(), String.valueOf(r02.getAdapterPosition() + 1), "search.search-result.app-user.video-more", null, null, null, false, null, 8064);
                r02.clickWithRefreshStatus();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        Integer numB = com.bilibili.search2.utils.s.b(this.itemView.getContext(), 30, false);
        int iIntValue = numB != null ? numB.intValue() : (TR.n.a(this.itemView).widthPixels - ListExtentionsKt.toPx(40.0f)) / 3;
        Lazy lazy = this.f87898b;
        BiliImageView biliImageView = (BiliImageView) lazy.getValue();
        ViewGroup.LayoutParams layoutParams = ((BiliImageView) lazy.getValue()).getLayoutParams();
        layoutParams.width = iIntValue;
        biliImageView.setLayoutParams(layoutParams);
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = iIntValue;
        view.setLayoutParams(layoutParams2);
        com.bilibili.search2.utils.extension.c.a((BiliImageView) lazy.getValue(), ((SearchAuthorNew.AvItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        ((TintTextView) this.f87900d.getValue()).setText(ColorTagHandler.decode$default(this.itemView.getContext(), com.bilibili.search2.api.oversea.b.a((com.bilibili.search2.api.oversea.a) getData()), 0, 4, (Object) null));
        ListExtentionsKt.setTextWithIcon$default((VectorTextView) this.f87899c.getValue(), ((SearchAuthorNew.AvItem) getData()).getViewContent(), ((SearchAuthorNew.AvItem) getData()).getIconType(), R$color.Graph_white, 0.0f, 0.0f, 48, (Object) null);
        Lazy lazy2 = this.f87902f;
        ((View) lazy2.getValue()).setVisibility(ListExtentionsKt.toVisibility(((SearchAuthorNew.AvItem) getData()).getChargeLabel() != null));
        C2784e chargeLabel = ((SearchAuthorNew.AvItem) getData()).getChargeLabel();
        if (chargeLabel != null) {
            chargeLabel.f19186c = 12;
            chargeLabel.f19187d = 12;
        }
        B.c((View) lazy2.getValue(), ((SearchAuthorNew.AvItem) getData()).getChargeLabel());
        Lazy lazy3 = this.f87901e;
        ((TintTextView) lazy3.getValue()).setText(((SearchAuthorNew.AvItem) getData()).getCTimeLabelV2());
        TintTextView tintTextView = (TintTextView) lazy3.getValue();
        boolean z6 = false;
        if (((View) lazy2.getValue()).getVisibility() == 0) {
            z6 = true;
        }
        tintTextView.setVisibility(ListExtentionsKt.toVisibility(!z6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6843f, dt0.AbstractC6839b
    public final void bind(@NotNull List<Object> list) {
        super.bind(list);
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            ((TintTextView) this.f87900d.getValue()).setText(ColorTagHandler.decode$default(this.itemView.getContext(), com.bilibili.search2.api.oversea.b.a((com.bilibili.search2.api.oversea.a) getData()), 0, 4, (Object) null));
        }
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return (TintTextView) this.f87900d.getValue();
    }
}
