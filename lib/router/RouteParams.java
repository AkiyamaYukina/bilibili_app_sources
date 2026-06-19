package com.bilibili.lib.router;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/RouteParams.class */
public final class RouteParams {

    @Nullable
    public final Context context;
    public final Bundle extras;
    public final Uri uri;

    public RouteParams(@Nullable Context context, Uri uri, Bundle bundle) {
        this.context = context;
        this.uri = uri;
        this.extras = bundle;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || RouteParams.class != obj.getClass()) {
            return false;
        }
        RouteParams routeParams = (RouteParams) obj;
        Uri uri = this.uri;
        if (uri == null || !uri.equals(routeParams.uri)) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        Uri uri = this.uri;
        return uri != null ? uri.hashCode() : 0;
    }
}
