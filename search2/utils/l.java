package com.bilibili.search2.utils;

import android.content.ContentProviderClient;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f88832a = new a(null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/l$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public ContentProviderClient f88833a;

        public a(@Nullable ContentProviderClient contentProviderClient) {
            this.f88833a = contentProviderClient;
        }

        public final void finalize() throws Throwable {
            if (this.f88833a != null) {
                Log.e("Provider", "You have not call release() on ProviderOperation, ContentProviderClient may leak!");
                ContentProviderClient contentProviderClient = this.f88833a;
                if (contentProviderClient != null) {
                    try {
                        contentProviderClient.release();
                    } catch (Exception e7) {
                    }
                }
                this.f88833a = null;
            }
        }
    }
}
