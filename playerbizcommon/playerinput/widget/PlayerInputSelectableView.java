package com.bilibili.playerbizcommon.playerinput.widget;

import Pq0.b;
import Rq0.c;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/playerinput/widget/PlayerInputSelectableView.class */
public final class PlayerInputSelectableView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f80252a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/playerinput/widget/PlayerInputSelectableView$a.class */
    public final class a extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            rect.right = NewPlayerUtilsKt.toPx(6.0f);
        }
    }

    @JvmOverloads
    public PlayerInputSelectableView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PlayerInputSelectableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public PlayerInputSelectableView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        b bVar = new b();
        this.f80252a = bVar;
        FrameLayout.inflate(context, 2131498438, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131309022);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(bVar);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration());
    }

    @Nullable
    public final c getSelectedItem() {
        return this.f80252a.f19060b;
    }

    public final void setOnSelectedCallback(@NotNull Qq0.b bVar) {
        this.f80252a.getClass();
    }
}
