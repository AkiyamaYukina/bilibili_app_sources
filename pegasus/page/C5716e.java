package com.bilibili.pegasus.page;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.animation.core.C3328k0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import com.bilibili.pegasus.PegasusHeaderManager;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/e.class */
@StabilityInferred(parameters = 0)
public final class C5716e implements PegasusHeaderManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinearLayout f78392a;

    public C5716e(@NotNull LinearLayout linearLayout) {
        this.f78392a = linearLayout;
    }

    public final void addHeader(@NotNull View view, @NotNull String str) {
        view.setTag(2131312948, str);
        this.f78392a.addView(view);
    }

    public final boolean hasHeader(@NotNull String str) {
        Object obj;
        Iterator it = ViewGroupKt.getChildren(this.f78392a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((View) next).getTag(2131312948), str)) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    public final void removeAll() {
        this.f78392a.removeAllViews();
    }

    public final void removeHeader(@NotNull View view) {
        this.f78392a.removeView(view);
    }

    public final void removeHeader(@NotNull String str) {
        Iterator it = SequencesKt.filter(ViewGroupKt.getChildren(this.f78392a), new C3328k0(str, 3)).iterator();
        while (it.hasNext()) {
            this.f78392a.removeView((View) it.next());
        }
    }
}
