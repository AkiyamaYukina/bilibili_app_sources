package com.bilibili.music.podcast.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicNormalLoadView.class */
public final class MusicNormalLoadView extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67101e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Map<Integer, a> f67102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Integer, View> f67103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public b f67105d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicNormalLoadView$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<Pair<Integer, View.OnClickListener>> f67107b = new ArrayList();

        public a(@LayoutRes int i7) {
            this.f67106a = i7;
        }

        @NotNull
        public final void a(@IdRes int i7, @NotNull View.OnClickListener onClickListener) {
            ((ArrayList) this.f67107b).add(new Pair(Integer.valueOf(i7), onClickListener));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicNormalLoadView$b.class */
    public interface b {
        void a(int i7, @NotNull View view);
    }

    public MusicNormalLoadView(@NotNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View$OnTouchListener, java.lang.Object] */
    public MusicNormalLoadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f67102a = MapsKt.emptyMap();
        this.f67103b = new LinkedHashMap();
        this.f67104c = Integer.MIN_VALUE;
        setOnTouchListener(new Object());
        setVisibility(8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bilibili.music.podcast.d.f66416d);
        int color = typedArrayObtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R$color.f64616Wh0));
        typedArrayObtainStyledAttributes.recycle();
        setBackgroundColor(color);
    }

    public final void a(int i7) {
        Object objInflate;
        b bVar;
        View viewFindViewById;
        setVisibility(i7 == Integer.MIN_VALUE ? 8 : 0);
        if (i7 == Integer.MIN_VALUE) {
            ((LinkedHashMap) this.f67103b).clear();
            removeAllViews();
            return;
        }
        this.f67104c = i7;
        a aVar = this.f67102a.get(Integer.valueOf(i7));
        if (aVar == null) {
            return;
        }
        Map<Integer, View> map = this.f67103b;
        int i8 = aVar.f67106a;
        Object obj = ((LinkedHashMap) map).get(Integer.valueOf(i8));
        if (obj == null) {
            objInflate = LayoutInflater.from(getContext()).inflate(i8, (ViewGroup) this, false);
        } else {
            View view = (View) obj;
            ViewParent parent = view.getParent();
            objInflate = obj;
            if (parent != null) {
                objInflate = obj;
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                    objInflate = obj;
                }
            }
        }
        for (Pair pair : (ArrayList) aVar.f67107b) {
            View view2 = (View) objInflate;
            if (view2 != null && (viewFindViewById = view2.findViewById(((Number) pair.getFirst()).intValue())) != null) {
                viewFindViewById.setOnClickListener((View.OnClickListener) pair.getSecond());
            }
        }
        View view3 = (View) objInflate;
        if (view3 != null && (bVar = this.f67105d) != null) {
            bVar.a(i7, view3);
        }
        removeAllViews();
        addView(view3);
    }

    public final int getLoadContentType() {
        return this.f67104c;
    }

    public final void setLoadContent(@NotNull Map<Integer, a> map) {
        this.f67102a = map;
    }

    public final void setLoadViewShowListener(@Nullable b bVar) {
        this.f67105d = bVar;
    }
}
