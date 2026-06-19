package com.bilibili.playset.playlist.adapters;

import Jb.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import es0.C6972b;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import os0.AbstractC8255a;
import os0.C8259e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/adapters/FavFooterHolder.class */
@StabilityInferred(parameters = 0)
public final class FavFooterHolder extends AbstractC8255a<C8259e> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Companion f85190d = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6972b f85191c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/adapters/FavFooterHolder$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final FavFooterHolder create(@NotNull ViewGroup viewGroup, @Nullable Function0<Unit> function0) {
            FavFooterHolder favFooterHolder = new FavFooterHolder(C6972b.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            favFooterHolder.f85191c.f117376b.setOnClickListener(new i(function0, 4));
            return favFooterHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/adapters/FavFooterHolder$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f85192a;

        static {
            int[] iArr = new int[FavFooterItem$Companion$LoadMoreType.values().length];
            try {
                iArr[FavFooterItem$Companion$LoadMoreType.LOAD_MORE_STATUS_GONE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FavFooterItem$Companion$LoadMoreType.LOAD_MORE_CLEAN_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f85192a = iArr;
        }
    }

    public FavFooterHolder(@NotNull C6972b c6972b) {
        super(c6972b.f117375a);
        this.f85191c = c6972b;
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final FavFooterHolder create(@NotNull ViewGroup viewGroup, @Nullable Function0<Unit> function0) {
        return f85190d.create(viewGroup, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // os0.AbstractC8256b
    public final void bind() {
        int i7 = a.f85192a[((C8259e) p0()).f124939b.ordinal()];
        C6972b c6972b = this.f85191c;
        if (i7 == 1) {
            ListExtentionsKt.gone(c6972b.f117375a);
            ListExtentionsKt.gone(c6972b.f117377c);
            ListExtentionsKt.gone(c6972b.f117376b);
        } else {
            if (i7 != 2) {
                ListExtentionsKt.gone(c6972b.f117375a);
                return;
            }
            ListExtentionsKt.visible(c6972b.f117375a);
            ListExtentionsKt.visible(c6972b.f117377c);
            ListExtentionsKt.visible(c6972b.f117376b);
        }
    }
}
