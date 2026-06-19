package com.bilibili.playset.decoration;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/FlexibleDividerDecoration.class */
public abstract class FlexibleDividerDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f84231g = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DividerType f84232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b.a f84233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f84234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f84235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84237f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/FlexibleDividerDecoration$DividerType.class */
    public enum DividerType {
        DRAWABLE,
        PAINT,
        COLOR,
        SPACE
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/FlexibleDividerDecoration$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f84238a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.playset.decoration.FlexibleDividerDecoration$DividerType[] r0 = com.bilibili.playset.decoration.FlexibleDividerDecoration.DividerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.playset.decoration.FlexibleDividerDecoration.a.f84238a = r0
                r0 = r4
                com.bilibili.playset.decoration.FlexibleDividerDecoration$DividerType r1 = com.bilibili.playset.decoration.FlexibleDividerDecoration.DividerType.DRAWABLE     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.bilibili.playset.decoration.FlexibleDividerDecoration.a.f84238a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.bilibili.playset.decoration.FlexibleDividerDecoration$DividerType r1 = com.bilibili.playset.decoration.FlexibleDividerDecoration.DividerType.PAINT     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.bilibili.playset.decoration.FlexibleDividerDecoration.a.f84238a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.bilibili.playset.decoration.FlexibleDividerDecoration$DividerType r1 = com.bilibili.playset.decoration.FlexibleDividerDecoration.DividerType.COLOR     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.bilibili.playset.decoration.FlexibleDividerDecoration.a.f84238a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.bilibili.playset.decoration.FlexibleDividerDecoration$DividerType r1 = com.bilibili.playset.decoration.FlexibleDividerDecoration.DividerType.SPACE     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.decoration.FlexibleDividerDecoration.a.m8494clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/FlexibleDividerDecoration$b.class */
    public static class b<T extends b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f84239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.bilibili.playset.decoration.b f84240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.bilibili.playset.decoration.c f84241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f84242d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f84243e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f84244f = false;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/FlexibleDividerDecoration$b$a.class */
        public final class a {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.playset.decoration.FlexibleDividerDecoration$b$a, java.lang.Object] */
        public b(Context context) {
            this.f84239a = context;
            context.getResources();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/FlexibleDividerDecoration$c.class */
    public interface c {
        Drawable a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/FlexibleDividerDecoration$d.class */
    public interface d {
        int a();
    }

    public static int b(GridLayoutManager gridLayoutManager, int i7) {
        GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
        int spanCount = gridLayoutManager.getSpanCount();
        int spanGroupIndex = spanSizeLookup.getSpanGroupIndex(i7, spanCount);
        int spanSize = 0;
        while (i7 >= 0 && spanSizeLookup.getSpanGroupIndex(i7, spanCount) == spanGroupIndex) {
            spanSize += spanSizeLookup.getSpanSize(i7);
            i7--;
        }
        return spanSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.decoration.FlexibleDividerDecoration.a(int, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (a(childAdapterPosition, recyclerView)) {
            this.f84233b.getClass();
            com.bilibili.playset.decoration.d dVar = (com.bilibili.playset.decoration.d) this;
            if (dVar.f84237f) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, 0, dVar.c(childAdapterPosition, recyclerView));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a3  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r8, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r9, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r10) {
        /*
            Method dump skipped, instruction units count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.decoration.FlexibleDividerDecoration.onDraw(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        onDraw(canvas, recyclerView, state);
    }
}
