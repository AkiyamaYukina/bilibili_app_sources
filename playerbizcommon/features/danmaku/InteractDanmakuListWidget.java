package com.bilibili.playerbizcommon.features.danmaku;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.playerbizcommon.features.danmaku.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oq0.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/InteractDanmakuListWidget.class */
public final class InteractDanmakuListWidget extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final RecyclerView f79624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextView f79625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final View f79626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final a f79627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public k f79628e;

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
        FrameLayout.inflate(context, 2131496355, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131306580);
        this.f79624a = recyclerView;
        TextView textView = (TextView) findViewById(2131308660);
        this.f79625b = textView;
        this.f79626c = findViewById(2131301012);
        a aVar = new a();
        this.f79627d = aVar;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(aVar);
        }
        if (textView != null) {
            textView.setOnClickListener(new HT0.a(this, 4));
        }
    }

    public final void setActionCallback(@NotNull k kVar) {
        this.f79628e = kVar;
    }

    public final void setBackButtonVisible(boolean z6) {
        if (z6) {
            TextView textView = this.f79625b;
            if (textView != null) {
                textView.setCompoundDrawables(null, null, null, null);
            }
            TextView textView2 = this.f79625b;
            if (textView2 != null) {
                textView2.setCompoundDrawablePadding(0);
                return;
            }
            return;
        }
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), 2131235846, null);
        TextView textView3 = this.f79625b;
        if (textView3 != null) {
            textView3.setCompoundDrawables(drawable, null, null, null);
        }
        TextView textView4 = this.f79625b;
        if (textView4 != null) {
            textView4.setCompoundDrawablePadding((int) DpUtils.dp2px(getContext(), 10.0f));
        }
    }

    public final void setCommandDmOperationCallback(@NotNull a.b bVar) {
        a aVar = this.f79627d;
        if (aVar != null) {
            aVar.f79630b = bVar;
        }
    }

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
            View view = this.f79626c;
            if (view != null) {
                view.setVisibility(0);
            }
            RecyclerView recyclerView = this.f79624a;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f79624a;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        View view2 = this.f79626c;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        a aVar = this.f79627d;
        if (aVar != null) {
            aVar.f79629a.clear();
            ArrayList<CommandsDanmaku> arrayList3 = aVar.f79629a;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList) {
                if (!Intrinsics.areEqual(((CommandsDanmaku) obj).getCommand(), "#SSCHECKIN#")) {
                    arrayList4.add(obj);
                }
            }
            final kntr.app.tribee.publish.ui.v2.internal.b bVar = new kntr.app.tribee.publish.ui.v2.internal.b(1);
            arrayList3.addAll(CollectionsKt.sortedWith(arrayList4, new Comparator(bVar) { // from class: oq0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final kntr.app.tribee.publish.ui.v2.internal.b f124881a;

                {
                    this.f124881a = bVar;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ((Number) this.f124881a.invoke(obj2, obj3)).intValue();
                }
            }));
            aVar.notifyDataSetChanged();
        }
    }
}
