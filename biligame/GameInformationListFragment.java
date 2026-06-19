package com.bilibili.biligame;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameInformation;
import com.bilibili.biligame.api.BiligamePage;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.call.BiliGameCallback;
import com.bilibili.biligame.report.ReportExtra;
import com.bilibili.biligame.report.ReportHelper;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.ui.image.GameImageViewV2;
import com.bilibili.biligame.utils.GameImageExtensionsKt;
import com.bilibili.biligame.utils.KotlinExtensionsKt;
import com.bilibili.biligame.utils.OnSafeClickListener;
import com.bilibili.biligame.widget.BaseSimpleListLoadFragment;
import com.bilibili.biligame.widget.BaseSimpleLoadMoreSectionAdapter;
import com.bilibili.okretro.call.BiliCall;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameInformationListFragment.class */
@StabilityInferred(parameters = 0)
public final class GameInformationListFragment extends BaseSimpleListLoadFragment<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f62124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f62125c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameInformationListFragment$a.class */
    public final class a extends BaseSimpleLoadMoreSectionAdapter<BiligameInformation, b> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final GameInformationListFragment f62126j;

        public a(GameInformationListFragment gameInformationListFragment) {
            this.f62126j = gameInformationListFragment;
        }

        public final boolean isStartExpose(@NotNull BaseViewHolder baseViewHolder) {
            return true;
        }

        public final BaseSimpleLoadMoreSectionAdapter.ViewHolder onCreateVH(ViewGroup viewGroup, int i7) {
            View viewA = p.a(viewGroup, 2131496465, viewGroup, false);
            GameInformationListFragment gameInformationListFragment = this.f62126j;
            return new b(gameInformationListFragment, viewA, this, gameInformationListFragment.f62125c);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameInformationListFragment$b.class */
    public final class b extends BaseSimpleLoadMoreSectionAdapter.ViewHolder<BiligameInformation> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f62127g;
        public final TextView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TextView f62128i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final GameImageViewV2 f62129j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final GameInformationListFragment f62130k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull GameInformationListFragment gameInformationListFragment, @NotNull View view, @Nullable a aVar, String str) {
            super(view, aVar);
            this.f62130k = gameInformationListFragment;
            this.f62127g = str;
            this.h = (TextView) view.findViewById(2131297424);
            this.f62128i = (TextView) view.findViewById(2131297423);
            this.f62129j = view.findViewById(2131297422);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Map<String, String> getExposeExtra() {
            if (this.itemView.getTag() == null || !(this.itemView.getTag() instanceof BiligameInformation)) {
                return null;
            }
            return MapsKt.mutableMapOf(new Pair[]{new Pair("sub_title", ((BiligameInformation) this.itemView.getTag()).getTitle())});
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final String getExposeId() {
            if (this.itemView.getTag() == null || !(this.itemView.getTag() instanceof BiligameInformation)) {
                return super/*com.bilibili.biligame.widget.viewholder.BaseExposeViewHolder*/.getExposeId();
            }
            int gameBaseId = ((BiligameInformation) this.itemView.getTag()).getGameBaseId();
            return gameBaseId > 0 ? String.valueOf(gameBaseId) : ((BiligameInformation) this.itemView.getTag()).getTitle();
        }

        @NotNull
        public final String getExposeModule() {
            return "track-content-list";
        }

        @NotNull
        public final String getExposeName() {
            String str = this.f62127g;
            return str != null ? str : super/*com.bilibili.biligame.widget.viewholder.BaseExposeViewHolder*/.getExposeName();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void setup(Object obj) {
            BiligameInformation biligameInformation = (BiligameInformation) obj;
            if (biligameInformation == null) {
                return;
            }
            this.itemView.setTag(biligameInformation);
            if (!TextUtils.isEmpty(biligameInformation.getTitle())) {
                this.h.setText(biligameInformation.getTitle());
            }
            if (TextUtils.isEmpty(biligameInformation.getSubTitle())) {
                this.f62128i.setVisibility(8);
            } else {
                this.f62128i.setText(biligameInformation.getSubTitle());
                this.f62128i.setVisibility(0);
            }
            String bgImageUrl = biligameInformation.getBgImageUrl();
            BaseSimpleListLoadFragment baseSimpleListLoadFragment = this.f62130k;
            GameImageExtensionsKt.displayGameImage(this.f62129j, bgImageUrl, KotlinExtensionsKt.dp2px(332, baseSimpleListLoadFragment.requireContext()), KotlinExtensionsKt.dp2px(186, baseSimpleListLoadFragment.requireContext()));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameInformationListFragment$c.class */
    public static final class c extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BaseViewHolder f62131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GameInformationListFragment f62132d;

        public c(BaseViewHolder baseViewHolder, GameInformationListFragment gameInformationListFragment) {
            this.f62131c = baseViewHolder;
            this.f62132d = gameInformationListFragment;
        }

        public final void onSafeClick(View view) {
            Object tag = this.f62131c.itemView.getTag();
            BiligameInformation biligameInformation = tag instanceof BiligameInformation ? (BiligameInformation) tag : null;
            if (biligameInformation == null) {
                return;
            }
            ReportHelper value = ReportHelper.getHelperInstance(this.f62132d.getContext()).setGadata("1111011").setModule("track-content-list").setValue(biligameInformation.getGameBaseId());
            String str = this.f62132d.f62125c;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            value.setExtra(ReportExtra.createWithTitle(str2).put("sub_title", biligameInformation.getTitle())).clickReport();
            BiligameRouterHelper.openUrl(this.f62132d.getContext(), biligameInformation.getLink());
        }
    }

    public final BaseSimpleLoadMoreSectionAdapter createAdapter() {
        return new a(this);
    }

    public final void handleClick(@NotNull BaseViewHolder baseViewHolder) {
        super.handleClick(baseViewHolder);
        if (baseViewHolder instanceof b) {
            baseViewHolder.itemView.setOnClickListener(new c(baseViewHolder, this));
        }
    }

    @Nullable
    public final BiliCall<BiligameApiResponse<BiligamePage<BiligameInformation>>> loadPage(int i7, int i8, boolean z6) {
        BiliGameCall<BiligameApiResponse<BiligamePage<BiligameInformation>>> gameInformationList = getApiService().getGameInformationList(this.f62124b, i7, i8);
        gameInformationList.setCacheReadable(false);
        gameInformationList.setCacheWritable(false);
        gameInformationList.enqueue((BiliGameCallback<BiligameApiResponse<BiligamePage<BiligameInformation>>>) new BaseSimpleListLoadFragment.SimplePageApiCallback(this, i7, i7));
        return gameInformationList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreateSafe(@Nullable Bundle bundle) {
        super/*com.bilibili.biligame.widget.BaseLoadFragment*/.onCreateSafe(bundle);
        Bundle arguments = getArguments();
        this.f62124b = arguments != null ? arguments.getString("id") : null;
        Bundle arguments2 = getArguments();
        String string = null;
        if (arguments2 != null) {
            string = arguments2.getString("title");
        }
        this.f62125c = string;
    }

    public final boolean pvReport() {
        return true;
    }

    @NotNull
    public final String reportClassName() {
        return "GameInformationListActivity";
    }
}
