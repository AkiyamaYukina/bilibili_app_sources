package com.bilibili.topix.detail.timeline;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.topix.model.TopixTimelineEvents;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/timeline/e.class */
@StabilityInferred(parameters = 0)
public class e extends RecyclerView.Adapter<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function3<? super TopixTimelineEvents, ? super Integer, ? super String, Unit> f112669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f112670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<TopixTimelineEvents> f112671d = new ArrayList();

    public e(boolean z6, @Nullable Function3<? super TopixTimelineEvents, ? super Integer, ? super String, Unit> function3, @Nullable Function0<Unit> function0) {
        this.f112668a = z6;
        this.f112669b = function3;
        this.f112670c = function0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f112671d).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
        /*
            r5 = this;
            r0 = r6
            com.bilibili.topix.detail.timeline.h r0 = (com.bilibili.topix.detail.timeline.h) r0
            r6 = r0
            r0 = r5
            java.util.List<com.bilibili.topix.model.TopixTimelineEvents> r0 = r0.f112671d
            r1 = r7
            java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
            com.bilibili.topix.model.TopixTimelineEvents r0 = (com.bilibili.topix.model.TopixTimelineEvents) r0
            r11 = r0
            r0 = r5
            boolean r0 = r0.f112668a
            r9 = r0
            r0 = 0
            r8 = r0
            r0 = r9
            if (r0 == 0) goto L2e
            r0 = r7
            r1 = r5
            int r1 = r1.getItemCount()
            r2 = 1
            int r1 = r1 - r2
            if (r0 != r1) goto L2e
            r0 = 1
            r7 = r0
            goto L30
        L2e:
            r0 = 0
            r7 = r0
        L30:
            r0 = r6
            android.view.View r0 = r0.itemView
            r1 = r11
            r0.setTag(r1)
            r0 = r7
            if (r0 == 0) goto L42
            r0 = 0
            r7 = r0
            goto L45
        L42:
            r0 = 8
            r7 = r0
        L45:
            r0 = r6
            com.bilibili.magicasakura.widgets.TintTextView r0 = r0.b
            r1 = r7
            r0.setVisibility(r1)
            r0 = r6
            com.bilibili.bplus.followingcard.widget.EllipsizingTextView r0 = r0.a
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L95
            r0 = r12
            r1 = 2
            r0.setMaxLines(r1)
            r0 = r11
            if (r0 == 0) goto L72
            r0 = r11
            java.lang.String r0 = r0.getTitle()
            r10 = r0
            r0 = r10
            r6 = r0
            r0 = r10
            if (r0 != 0) goto L75
        L72:
            java.lang.String r0 = ""
            r6 = r0
        L75:
            android.text.SpannableString r0 = new android.text.SpannableString
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            r0 = r11
            if (r0 == 0) goto L8b
            r0 = r11
            boolean r0 = r0.getTextExpanded()
            if (r0 != 0) goto L8d
        L8b:
            r0 = 1
            r8 = r0
        L8d:
            r0 = r12
            r1 = r6
            r2 = 1
            r3 = r8
            r0.O(r1, r2, r3)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.detail.timeline.e.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new h(viewGroup, this.f112669b, this.f112670c);
    }
}
