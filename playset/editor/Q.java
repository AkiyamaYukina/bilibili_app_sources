package com.bilibili.playset.editor;

import H3.t0;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.bfs.BfsResponse;
import com.bilibili.bfs.BfsUploader;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/Q.class */
public final class Q {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/Q$a.class */
    public final class a implements Callback<BfsResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f84799a;

        public a(b bVar) {
            this.f84799a = bVar;
        }

        public final void onFailure(Call<BfsResponse> call, Throwable th) {
            b bVar = this.f84799a;
            if (bVar != null) {
                bVar.onFailure();
            }
        }

        public final void onResponse(Call<BfsResponse> call, Response<BfsResponse> response) {
            if (response.isSuccessful()) {
                b bVar = this.f84799a;
                BfsResponse bfsResponse = (BfsResponse) response.body();
                if (bfsResponse == null || TextUtils.isEmpty(bfsResponse.location)) {
                    bVar.onFailure();
                } else {
                    bVar.onSuccess(bfsResponse.location);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/Q$b.class */
    public interface b {
        void onFailure();

        void onSuccess(String str);
    }

    public static void a(Bitmap bitmap, b bVar) {
        if (ConnectivityMonitor.getInstance().isNetworkActive() && bitmap != null) {
            BfsUploader.newCall(BfsUploader.newRequest("medialist").dir("cover").image(bitmap).accesskey(new t0(5)).build()).enqueue(new a(bVar));
        }
    }
}
