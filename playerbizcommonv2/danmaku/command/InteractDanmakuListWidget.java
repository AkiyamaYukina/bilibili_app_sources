package com.bilibili.playerbizcommonv2.danmaku.command;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bplus.followinglist.module.item.comment.l;
import com.bilibili.playerbizcommonv2.danmaku.command.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mr0.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/command/InteractDanmakuListWidget.class */
@StabilityInferred(parameters = 0)
public final class InteractDanmakuListWidget extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final RecyclerView f80825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextView f80826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final View f80827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final a f80828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public f f80829e;

    @JvmOverloads
    public InteractDanmakuListWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public InteractDanmakuListWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public InteractDanmakuListWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        FrameLayout.inflate(context, 2131496628, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131306580);
        this.f80825a = recyclerView;
        TextView textView = (TextView) findViewById(2131308660);
        this.f80826b = textView;
        this.f80827c = findViewById(2131301012);
        a aVar = new a();
        this.f80828d = aVar;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(aVar);
        }
        if (textView != null) {
            textView.setOnClickListener(new l(this, 3));
        }
    }

    public final void setActionCallback(@NotNull f fVar) {
        this.f80829e = fVar;
    }

    public final void setBackButtonVisible(boolean z6) {
        if (z6) {
            TextView textView = this.f80826b;
            if (textView != null) {
                textView.setCompoundDrawables(null, null, null, null);
            }
            TextView textView2 = this.f80826b;
            if (textView2 != null) {
                textView2.setCompoundDrawablePadding(0);
                return;
            }
            return;
        }
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), 2131235846, null);
        TextView textView3 = this.f80826b;
        if (textView3 != null) {
            textView3.setCompoundDrawables(drawable, null, null, null);
        }
        TextView textView4 = this.f80826b;
        if (textView4 != null) {
            textView4.setCompoundDrawablePadding((int) DpUtils.dp2px(getContext(), 10.0f));
        }
    }

    public final void setCommandDmOperationCallback(@NotNull a.b bVar) {
        a aVar = this.f80828d;
        if (aVar != null) {
            aVar.f80831b = bVar;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, mr0.a] */
    public final void setData(@Nullable List<CommandsDanmaku> list) {
        ArrayList arrayList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((CommandsDanmaku) next).getContent() != null && (!StringsKt.isBlank(r0))) {
                    arrayList2.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            View view = this.f80827c;
            if (view != null) {
                view.setVisibility(0);
            }
            RecyclerView recyclerView = this.f80825a;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f80825a;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        View view2 = this.f80827c;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        a aVar = this.f80828d;
        if (aVar != null) {
            aVar.f80830a.clear();
            ArrayList<CommandsDanmaku> arrayList3 = aVar.f80830a;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList) {
                if (!Intrinsics.areEqual(((CommandsDanmaku) obj).getCommand(), "#SSCHECKIN#")) {
                    arrayList4.add(obj);
                }
            }
            final ?? obj2 = new Object();
            arrayList3.addAll(CollectionsKt.sortedWith(arrayList4, new Comparator(obj2) { // from class: mr0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C8035a f123855a;

                {
                    this.f123855a = obj2;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return ((Number) this.f123855a.invoke(obj3, obj4)).intValue();
                }
            }));
            aVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTitle(@org.jetbrains.annotations.Nullable java.lang.CharSequence r4) {
        /*
            r3 = this;
            r0 = r3
            android.widget.TextView r0 = r0.f80826b
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2e
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = r4
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L17
            goto L19
        L17:
            r0 = 0
            r4 = r0
        L19:
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L29
        L1f:
            r0 = r3
            android.content.Context r0 = r0.getContext()
            r1 = 2131846699(0x7f11662b, float:1.9326855E38)
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
        L29:
            r0 = r6
            r1 = r5
            r0.setText(r1)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.command.InteractDanmakuListWidget.setTitle(java.lang.CharSequence):void");
    }
}
