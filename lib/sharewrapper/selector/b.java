package com.bilibili.lib.sharewrapper.selector;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/b.class */
public final class b extends ArrayAdapter<SharePlatform> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharePlatformPanel f64460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SharePlatformPanel sharePlatformPanel, Context context, List list) {
        super(context, 0, list);
        this.f64460a = sharePlatformPanel;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public final View getView(int i7, @Nullable View view, @NonNull ViewGroup viewGroup) {
        View viewA = p.a(viewGroup, 2131496563, viewGroup, false);
        SharePlatformView sharePlatformView = (SharePlatformView) viewA.findViewById(2131297531);
        float f7 = this.f64460a.f64452c;
        if (f7 != -1.0f) {
            sharePlatformView.setCompoundDrawablePadding((int) f7);
        }
        SharePlatform item = getItem(i7);
        viewA.setBackgroundDrawable(null);
        sharePlatformView.setTopIcon(item.iconId);
        sharePlatformView.setText(item.titleId);
        return viewA;
    }
}
