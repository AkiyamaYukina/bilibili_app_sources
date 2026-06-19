package com.bilibili.ogv.misc.topicplaylist;

import E2.C1612a;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.ogv.misc.topicplaylist.TopicPlayListVo;
import com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/c.class */
@StabilityInferred(parameters = 0)
public final class c extends tv.danmaku.bili.widget.section.adapter.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f69642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final FavoTopicPlayListSubFragment f69643g;

    @NotNull
    public List<TopicPlayListVo.TopicPlayListItemVo> h = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends BaseViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f69644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final BiliImageView f69645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TextView f69646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final TextView f69647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final TextView f69648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final ImageView f69649g;

        public a(@NotNull View view, @NotNull c cVar) {
            super(view, cVar);
            this.f69644b = (ConstraintLayout) view.findViewById(2131303897);
            this.f69645c = view.findViewById(2131309109);
            this.f69646d = (TextView) view.findViewById(2131309129);
            this.f69647e = (TextView) view.findViewById(2131309107);
            this.f69648f = (TextView) view.findViewById(2131309105);
            this.f69649g = (ImageView) view.findViewById(2131304384);
        }
    }

    public c(@NotNull Context context, @NotNull FavoTopicPlayListSubFragment favoTopicPlayListSubFragment) {
        this.f69642f = context;
        this.f69643g = favoTopicPlayListSubFragment;
    }

    public final void fillSection(@Nullable BaseSectionAdapter.SectionManager sectionManager) {
        int size = this.h.size();
        if (size <= 0 || sectionManager == null) {
            return;
        }
        sectionManager.addSectionWithNone(size, 263);
    }

    public final void onBindHolder(@Nullable BaseViewHolder baseViewHolder, final int i7, @Nullable View view) {
        String strA;
        if (!((ArrayList) this.h).isEmpty() && (baseViewHolder instanceof a)) {
            TopicPlayListVo.TopicPlayListItemVo topicPlayListItemVo = (TopicPlayListVo.TopicPlayListItemVo) ((ArrayList) this.h).get(getIndexInSection(i7));
            String str = topicPlayListItemVo.f69631b;
            a aVar = (a) baseViewHolder;
            Nl0.f.d(aVar.f69645c, str);
            aVar.f69646d.setText(topicPlayListItemVo.f69632c);
            aVar.f69647e.setText(topicPlayListItemVo.a());
            aVar.f69647e.setTextColor(ContextCompat.getColor(this.f69642f, R$color.Ga5));
            TextView textView = aVar.f69648f;
            Context context = this.f69642f;
            long jB = topicPlayListItemVo.b() * ((long) 1000);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j7 = jCurrentTimeMillis - jB;
            if (j7 < 60000) {
                strA = context.getString(2131821773);
            } else if (j7 < 3600000) {
                strA = context.getString(2131822160, Long.valueOf(j7 / 60000));
            } else if (j7 < 86400000) {
                strA = context.getString(2131822159, Long.valueOf(j7 / 3600000));
            } else {
                if (i.f69659a <= 0) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(jCurrentTimeMillis);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    i.f69659a = calendar.getTimeInMillis() - 86400000;
                }
                if (jB >= i.f69659a) {
                    strA = context.getString(2131832132);
                } else {
                    if (i.f69660b <= 0) {
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(jCurrentTimeMillis);
                        int i8 = calendar2.get(1);
                        calendar2.clear();
                        calendar2.set(1, i8);
                        i.f69660b = calendar2.getTimeInMillis();
                    }
                    if (jB >= i.f69660b) {
                        if (i.f69661c == null) {
                            i.f69661c = new SimpleDateFormat("M-d", Locale.getDefault());
                        }
                        strA = Z.a(jB, i.f69661c);
                    } else {
                        if (i.f69662d == null) {
                            i.f69662d = new SimpleDateFormat("yyyy-M-d", Locale.getDefault());
                        }
                        strA = Z.a(jB, i.f69662d);
                    }
                }
            }
            textView.setText(context.getString(2131821896, strA));
            aVar.f69648f.setTextColor(ContextCompat.getColor(this.f69642f, R$color.Ga5));
            View.OnClickListener onClickListener = new View.OnClickListener(this, i7) { // from class: com.bilibili.ogv.misc.topicplaylist.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c f69638a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f69639b;

                {
                    this.f69638a = this;
                    this.f69639b = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    c cVar = this.f69638a;
                    int i9 = this.f69639b;
                    FavoTopicPlayListSubFragment favoTopicPlayListSubFragment = cVar.f69643g;
                    if (favoTopicPlayListSubFragment.f69624g || i9 > ((ArrayList) favoTopicPlayListSubFragment.f69622e).size()) {
                        return;
                    }
                    String str2 = ((TopicPlayListVo.TopicPlayListItemVo) ((ArrayList) favoTopicPlayListSubFragment.f69622e).get(i9)).f69635f;
                    if (str2 != null && str2.length() != 0) {
                        Nl0.h.c(favoTopicPlayListSubFragment.requireContext(), str2, 0, 64, "main.topic.0.0");
                    }
                    int i10 = ((TopicPlayListVo.TopicPlayListItemVo) ((ArrayList) favoTopicPlayListSubFragment.f69622e).get(i9)).f69630a;
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    C1612a.c(i10, "type", "2", TextSource.CFG_CONTENT, mapCreateMapBuilder);
                    Unit unit = Unit.INSTANCE;
                    Neurons.reportClick(false, "main.topic.contents.0.click", MapsKt.build(mapCreateMapBuilder));
                }
            };
            ConstraintLayout constraintLayout = aVar.f69644b;
            constraintLayout.setOnClickListener(onClickListener);
            aVar.f69649g.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.ogv.misc.topicplaylist.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c f69640a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f69641b;

                {
                    this.f69640a = this;
                    this.f69641b = i7;
                }

                /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.Fragment, com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    c cVar = this.f69640a;
                    int i9 = this.f69641b;
                    FavoTopicPlayListSubFragment favoTopicPlayListSubFragment = cVar.f69643g;
                    favoTopicPlayListSubFragment.getClass();
                    CollectionsKt.emptyList();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BangumiBottomSheet.SheetItem(99, favoTopicPlayListSubFragment.getString(2131821895), 0));
                    g gVar = new g(favoTopicPlayListSubFragment, i9);
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("sheet_item_list", new ArrayList<>(arrayList));
                    bundle.putBoolean("sheet_item_show_check_icon", true);
                    bundle.putInt("sheet_item_show_current_sheet_item_id", -1);
                    ?? bangumiBottomSheet = new BangumiBottomSheet();
                    bangumiBottomSheet.setArguments(bundle);
                    bangumiBottomSheet.f73184g = gVar;
                    bangumiBottomSheet.show(favoTopicPlayListSubFragment.getChildFragmentManager(), "");
                }
            });
            boolean zA = Cj0.a.a(this.f69642f);
            BiliImageView biliImageView = aVar.f69645c;
            if (zA) {
                constraintLayout.setBackgroundColor(-13421773);
                biliImageView.setBackgroundColor(ContextCompat.getColor(this.f69642f, 2131100314));
            } else {
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this.f69642f, R.color.white));
                biliImageView.setBackgroundColor(ContextCompat.getColor(this.f69642f, 2131100304));
            }
        }
    }

    @NotNull
    public final BaseViewHolder onCreateHolder(@NotNull ViewGroup viewGroup, int i7) {
        return new a(LayoutInflater.from(this.f69642f).inflate(2131493164, viewGroup, false), this);
    }
}
