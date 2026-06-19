package com.bilibili.playset.decoration;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.playset.decoration.FlexibleDividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/d.class */
public final class d extends FlexibleDividerDecoration {
    public b h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/d$a.class */
    public static class a extends FlexibleDividerDecoration.b<a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f84248g;

        /* JADX INFO: renamed from: com.bilibili.playset.decoration.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/d$a$a.class */
        public final class C0565a implements b {
            @Override // com.bilibili.playset.decoration.d.b
            public final int a() {
                return 0;
            }

            @Override // com.bilibili.playset.decoration.d.b
            public final int b() {
                return 0;
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.playset.decoration.d$b, java.lang.Object] */
        public a(Context context) {
            super(context);
            this.f84248g = new Object();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.playset.decoration.FlexibleDividerDecoration, com.bilibili.playset.decoration.d] */
        public final d a() {
            ?? itemDecoration = new RecyclerView.ItemDecoration();
            itemDecoration.f84232a = FlexibleDividerDecoration.DividerType.DRAWABLE;
            com.bilibili.playset.decoration.b bVar = this.f84240b;
            if (bVar == null) {
                TypedArray typedArrayObtainStyledAttributes = this.f84239a.obtainStyledAttributes(FlexibleDividerDecoration.f84231g);
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
                itemDecoration.f84234c = new com.bilibili.playset.decoration.a(drawable);
            } else {
                itemDecoration.f84234c = bVar;
            }
            itemDecoration.f84235d = this.f84241c;
            itemDecoration.f84233b = this.f84242d;
            itemDecoration.f84236e = this.f84243e;
            itemDecoration.f84237f = this.f84244f;
            itemDecoration.h = this.f84248g;
            return itemDecoration;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/d$b.class */
    public interface b {
        int a();

        int b();
    }

    public final int c(int i7, RecyclerView recyclerView) {
        FlexibleDividerDecoration.d dVar = this.f84235d;
        if (dVar != null) {
            return dVar.a();
        }
        FlexibleDividerDecoration.c cVar = this.f84234c;
        if (cVar != null) {
            return cVar.a().getIntrinsicHeight();
        }
        throw new RuntimeException("failed to get size");
    }
}
