package com.bilibili.ogv.misc.timeline;

import android.app.Application;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import bolts.Task;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.misc.timeline.j;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay;
import com.bilibili.xpref.Xpref;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/j.class */
@StabilityInferred(parameters = 0)
public final class j extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69456a = System.currentTimeMillis() / ((long) 1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f69457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f69459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final BangumiTimelineDay f69460e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/j$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/j$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f69461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextView f69462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f69463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final BiliImageView f69464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public BangumiTimeline f69465e;

        public b(@NotNull View view) {
            super(view);
            this.f69461a = (TextView) view.findViewById(2131308254);
            this.f69462b = (TextView) view.findViewById(2131308958);
            this.f69463c = (TextView) view.findViewById(2131312539);
            this.f69464d = view.findViewById(2131298941);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NotNull View view) {
            BangumiTimeline bangumiTimeline = this.f69465e;
            if (bangumiTimeline != null) {
                Map<String, String> map = bangumiTimeline.f69539t;
                Map<String, String> mapEmptyMap = map;
                if (map == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                Neurons.reportClick(false, "pgc.bangumi-timeline.works.0.click", mapEmptyMap);
                String str = this.f69465e.f69536q;
                if (str == null || str.length() == 0) {
                    Nl0.h.b(view.getContext(), String.valueOf(this.f69465e.f69521a), this.f69465e.b(), "", 8, "pgc.bangumi-timeline.0.0", 0, "", null, 30720);
                } else {
                    Nl0.h.e(view.getContext(), this.f69465e.f69536q, null, 8, "pgc.bangumi-timeline.0.0");
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/j$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public ImageView f69466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public ImageView f69467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public Calendar f69468c;
    }

    public j(@NotNull BangumiTimelineDay bangumiTimelineDay, boolean z6, boolean z7, boolean z8, @NotNull String str) {
        this.f69459d = "";
        this.f69457b = z6;
        this.f69458c = z8;
        this.f69459d = str;
        this.f69460e = bangumiTimelineDay;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        BangumiTimelineDay bangumiTimelineDay = this.f69460e;
        if (bangumiTimelineDay == null || bangumiTimelineDay.m() == null || this.f69460e.m().size() == 0) {
            return 0;
        }
        boolean zN = this.f69460e.n();
        int i7 = zN ? 1 : 0;
        if (this.f69460e.n()) {
            i7 = zN ? 1 : 0;
            if (this.f69458c) {
                i7 = (zN ? 1 : 0) + 1;
            }
        }
        return this.f69460e.m().size() + (i7 == true ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (this.f69460e.n() && this.f69460e.m().size() > 0 && i7 == this.f69460e.f69550g) ? 2 : (this.f69458c && i7 == getItemCount() - 1) ? 3 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof b) {
            int i8 = i7;
            if (this.f69460e.n()) {
                i8 = i7;
                if (i7 >= this.f69460e.f69550g) {
                    i8 = i7 - 1;
                }
            }
            b bVar = (b) viewHolder;
            bVar.f69465e = this.f69460e.m().get(i8);
            Context context = bVar.itemView.getContext();
            BiliImageView biliImageView = bVar.f69464d;
            String strD = bVar.f69465e.d();
            String strA = (strD == null || strD.length() == 0) ? bVar.f69465e.a() : bVar.f69465e.d();
            float f7 = context == null ? 2.0f : context.getResources().getDisplayMetrics().density;
            Nl0.f.e(biliImageView, strA, Nl0.f.g(f7, 60), Nl0.f.g(f7, 60));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            BangumiTimeline bangumiTimeline = bVar.f69465e;
            if (bangumiTimeline.f69526f && !this.f69457b) {
                int i9 = bangumiTimeline.f69537r;
                if (com.bilibili.ogv.pub.season.b.a(i9 <= 0 ? com.bilibili.ogv.pub.season.a.f71781i : new com.bilibili.ogv.pub.season.a(i9))) {
                    spannableStringBuilder.append((CharSequence) bVar.itemView.getResources().getString(2131822169));
                } else {
                    spannableStringBuilder.append((CharSequence) bVar.itemView.getResources().getString(2131822170));
                }
                spannableStringBuilder.setSpan(new r(bVar.itemView.getContext()), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) bVar.f69465e.f69522b);
            bVar.f69462b.setText(spannableStringBuilder);
            bVar.f69461a.setVisibility(0);
            String str = bVar.f69465e.f69528i;
            if (str == null || str.length() == 0) {
                bVar.f69461a.setText(2131822173);
            } else {
                bVar.f69461a.setText(bVar.f69465e.f69528i);
                bVar.f69461a.setVisibility(!bVar.f69465e.f69540u ? 4 : 0);
            }
            long j7 = bVar.f69465e.f69530k;
            long j8 = this.f69456a;
            if (j7 <= j8) {
                bVar.f69461a.setTextColor(ThemeUtils.getColorById(bVar.itemView.getContext(), R$color.Ga5));
            } else {
                bVar.f69461a.setTextColor(ThemeUtils.getColorById(bVar.itemView.getContext(), R$color.Ga10));
            }
            if (bVar.f69465e.h()) {
                bVar.f69462b.setTextColor(ThemeUtils.getColorById(bVar.itemView.getContext(), R$color.Ga5));
                bVar.f69463c.setTextColor(ThemeUtils.getColorById(bVar.itemView.getContext(), R$color.Ga5));
                String str2 = bVar.f69465e.f69533n;
                if (str2 == null || str2.length() == 0) {
                    bVar.f69463c.setVisibility(8);
                } else {
                    bVar.f69463c.setVisibility(0);
                    bVar.f69463c.setText(bVar.f69465e.f69533n);
                }
            } else {
                bVar.f69463c.setVisibility(0);
                BangumiTimeline bangumiTimeline2 = bVar.f69465e;
                if (bangumiTimeline2.f69525e == 0) {
                    if (bangumiTimeline2.f69530k - j8 < 14400) {
                        TextView textView = bVar.f69463c;
                        textView.setText(textView.getResources().getString(2131822177, bVar.f69465e.h));
                    } else {
                        bVar.f69463c.setText(bangumiTimeline2.h);
                    }
                    bVar.f69463c.setTextColor(ThemeUtils.getColorById(bVar.itemView.getContext(), R$color.Ga5));
                } else {
                    bVar.f69463c.setText(bangumiTimeline2.h);
                    bVar.f69463c.setTextColor(ThemeUtils.getColorById(bVar.itemView.getContext(), 2131103284));
                }
            }
        }
        if (viewHolder instanceof c) {
            final c cVar = (c) viewHolder;
            cVar.f69466a.setRotation(0.0f);
            cVar.f69467b.setRotation(0.0f);
            final int i10 = 0;
            cVar.f69466a.postDelayed(new Runnable(cVar, i10) { // from class: com.bilibili.ogv.misc.timeline.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f69469a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f69470b;

                {
                    this.f69469a = i10;
                    this.f69470b = cVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f69469a) {
                        case 0:
                            j.c cVar2 = (j.c) this.f69470b;
                            cVar2.f69466a.animate().rotation(((cVar2.f69468c.get(12) / 60.0f) * 20) + ((cVar2.f69468c.get(10) / 12.0f) * 360.0f)).start();
                            cVar2.f69467b.animate().rotation((cVar2.f69468c.get(12) / 60.0f) * 360.0f).start();
                            break;
                        case 1:
                            EditText editText = (EditText) this.f69470b;
                            ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                            break;
                        default:
                            Task.callInBackground(new qg1.a((Application) this.f69470b));
                            break;
                    }
                }
            }, 500L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.bilibili.ogv.misc.timeline.j$c] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        ?? bVar;
        if (i7 == 1) {
            bVar = new b(p.a(viewGroup, 2131493200, viewGroup, false));
        } else if (i7 == 2) {
            View viewA = p.a(viewGroup, 2131493201, viewGroup, false);
            ?? viewHolder = new RecyclerView.ViewHolder(viewA);
            TextView textView = (TextView) viewA.findViewById(2131313262);
            Calendar calendar = Calendar.getInstance(Locale.CHINA);
            calendar.setTimeZone(DesugarTimeZone.getTimeZone("GMT+8"));
            viewHolder.f69468c = calendar;
            int i8 = calendar.get(11);
            int i9 = calendar.get(12);
            int i10 = i8;
            if (Xpref.getSharedPreferences(viewA.getContext(), "bili_main_settings_preferences").getBoolean(viewA.getContext().getString(2131833490), false)) {
                i10 = i8;
                if (i8 < 6) {
                    i10 = i8 + 24;
                }
            }
            textView.setText(viewA.getResources().getString(2131822175, Integer.valueOf(i10), Integer.valueOf(i9)));
            viewHolder.f69466a = (ImageView) viewA.findViewById(2131298913);
            viewHolder.f69467b = (ImageView) viewA.findViewById(2131298934);
            ((TextView) viewA.findViewById(2131308958)).setText(this.f69459d);
            bVar = viewHolder;
        } else {
            if (i7 != 3) {
                throw new IllegalStateException(("Unknown type " + i7).toString());
            }
            View viewA2 = p.a(viewGroup, 2131493177, viewGroup, false);
            bVar = new RecyclerView.ViewHolder(viewA2);
            TextView textView2 = (TextView) viewA2.findViewById(2131313120);
            ImageView imageView = (ImageView) viewA2.findViewById(2131303444);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(viewA2.getResources().getString(2131822171));
            spannableStringBuilder.setSpan(new ClickableSpan(), 0, 4, 33);
            textView2.setText(spannableStringBuilder);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            imageView.setOnClickListener(new h(this, 0));
        }
        return bVar;
    }
}
