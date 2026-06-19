package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.HolderExtra;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusHolderData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/a.class */
@StabilityInferred(parameters = 0)
public final class C5592a extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75894k = "AttachStateComponent";

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/a$a.class */
    public static final class C0486a implements RecyclerView.OnChildAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView f75895a;

        public C0486a(RecyclerView recyclerView) {
            this.f75895a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewAttachedToWindow(View view) {
            HolderExtra extra;
            PegasusHolderData bindData = this.f75895a.getChildViewHolder(view).getBindData();
            if (bindData == null || (extra = bindData.getExtra()) == null) {
                return;
            }
            extra.setHasAttached(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewDetachedFromWindow(View view) {
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f75894k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        recyclerView.addOnChildAttachStateChangeListener(new C0486a(recyclerView));
    }
}
