package com.bilibili.ogv.misc.sponsor;

import Nl0.f;
import Nl0.g;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.autofill.r;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ogv.misc.sponsor.BangumiCategoryIndex;
import com.bilibili.ogv.misc.sponsor.a;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/a.class */
public final class a extends tv.danmaku.bili.widget.section.adapter.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<BangumiCategoryIndex.Bangumi> f69385g = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69384f = 1;

    /* JADX INFO: renamed from: com.bilibili.ogv.misc.sponsor.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/a$a.class */
    public static final class C0424a extends BaseViewHolder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f69386g = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f69387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BiliImageView f69388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f69389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f69390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public BangumiCategoryIndex.Bangumi f69391f;

        public C0424a(View view, a aVar) {
            super(view, aVar);
            this.f69389d = (TextView) view.findViewById(2131308733);
            this.f69387b = (TextView) view.findViewById(2131308958);
            this.f69390e = (TextView) view.findViewById(2131315718);
            this.f69388c = view.findViewById(2131298941);
        }
    }

    public static String O(long j7, Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Time time = new Time();
        Time time2 = new Time();
        time.set(jCurrentTimeMillis);
        time2.set(j7);
        int julianDay = Time.getJulianDay(time.toMillis(true), time.gmtoff) - Time.getJulianDay(time2.toMillis(true), time2.gmtoff);
        if (julianDay == 0) {
            return context.getString(2131832125) + String.format(Locale.ROOT, "%d:%02d", Integer.valueOf(time2.hour), Integer.valueOf(time2.minute));
        }
        if (julianDay == 1) {
            return context.getString(2131832132) + String.format(Locale.ROOT, "%d:%02d", Integer.valueOf(time2.hour), Integer.valueOf(time2.minute));
        }
        int i7 = time.year;
        int i8 = time2.year;
        if (i7 == i8) {
            return (time2.month + 1) + context.getString(2131831406) + time2.monthDay + context.getString(2131825419);
        }
        String strValueOf = String.valueOf(i8);
        String strSubstring = strValueOf;
        if (strValueOf.length() > 2) {
            strSubstring = strValueOf.substring(2);
        }
        StringBuilder sbA = r.a(strSubstring);
        sbA.append(context.getString(2131838324));
        sbA.append(time2.month + 1);
        sbA.append(context.getString(2131831406));
        return sbA.toString();
    }

    public final void fillSection(BaseSectionAdapter.SectionManager sectionManager) {
        sectionManager.addSectionWithNone(((ArrayList) this.f69385g).size(), 100);
    }

    public final void handleClick(final BaseViewHolder baseViewHolder) {
        if (baseViewHolder instanceof C0424a) {
            ((C0424a) baseViewHolder).itemView.setOnClickListener(new View.OnClickListener(baseViewHolder) { // from class: xk0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BaseViewHolder f129290a;

                {
                    this.f129290a = baseViewHolder;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BangumiCategoryIndex.Bangumi bangumi = ((a.C0424a) this.f129290a).f69391f;
                    if (bangumi != null) {
                        Nl0.h.b(view.getContext(), bangumi.f69319e, "", "", 17, "main.member-index.0.0", 0, "", null, 30720);
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.ogv.misc.sponsor.a$a] */
    public final void onBindHolder(BaseViewHolder baseViewHolder, int i7, View view) {
        String str;
        if (baseViewHolder instanceof C0424a) {
            ?? r02 = (C0424a) baseViewHolder;
            int i8 = this.f69384f;
            BangumiCategoryIndex.Bangumi bangumi = (BangumiCategoryIndex.Bangumi) ((ArrayList) this.f69385g).get(baseViewHolder.getAdapterPosition());
            r02.f69391f = bangumi;
            if (bangumi == null) {
                return;
            }
            Context context = r02.itemView.getContext();
            f.c(r02.f69388c, context, bangumi.f69315a);
            if (i8 == 1) {
                str = g.a(bangumi.f69316b, "0") + context.getString(2131821961);
            } else if (i8 == 2) {
                str = O(bangumi.f69321g * 1000, context) + context.getString(2131821962);
            } else if (bangumi.f69320f > 0) {
                str = O(bangumi.f69320f * 1000, context) + context.getString(2131821960);
            } else {
                str = "";
            }
            r02.f69389d.setText(str);
            r02.f69387b.setText(bangumi.h);
            r02.f69389d.setVisibility(0);
            String string = String.format(context.getString(2131821957), bangumi.f69318d);
            if (bangumi.f69318d.equalsIgnoreCase(CaptureSchema.OLD_INVALID_ID_STRING)) {
                if (System.currentTimeMillis() > bangumi.f69320f * 1000) {
                    string = context.getString(2131821959);
                } else {
                    String string2 = context.getString(2131821956);
                    string = string2;
                    if (i8 == 2) {
                        r02.f69389d.setText("");
                        r02.f69389d.setVisibility(4);
                        string = string2;
                    }
                }
            } else if (bangumi.f69317c == 2) {
                string = String.format(context.getString(2131822188), bangumi.f69322i);
            } else if (TextUtils.isDigitsOnly(bangumi.f69318d.trim())) {
                string = String.format(context.getString(2131821958), bangumi.f69318d);
            }
            r02.f69390e.setText(string);
        }
    }

    public final BaseViewHolder onCreateHolder(ViewGroup viewGroup, int i7) {
        int i8 = C0424a.f69386g;
        return new C0424a(p.a(viewGroup, 2131493151, viewGroup, false), this);
    }
}
