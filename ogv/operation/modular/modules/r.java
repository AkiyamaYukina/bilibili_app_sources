package com.bilibili.ogv.operation.modular.modules;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.collection.ArrayMap;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.common.executors.UiThreadImmediateExecutorService;
import com.google.common.base.Optional;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import kntr.base.android.legacy.context.ContextUtilKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/r.class */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ArrayMap<String, Bitmap> f70740a = new ArrayMap<>();

    public static final Single a(final Context context, final String str) {
        return Single.create(new SingleOnSubscribe(str, context) { // from class: com.bilibili.ogv.operation.modular.modules.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f70729a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f70730b;

            {
                this.f70729a = str;
                this.f70730b = context;
            }

            public final void subscribe(SingleEmitter singleEmitter) {
                Context context2 = this.f70730b;
                String str2 = this.f70729a;
                if (str2 == null || str2.length() == 0) {
                    singleEmitter.onSuccess(Optional.absent());
                    return;
                }
                Bitmap bitmap = r.f70740a.get(str2);
                if (bitmap != null) {
                    singleEmitter.onSuccess(Optional.of(bitmap));
                    return;
                }
                ImageDataSource imageDataSourceSubmit = BiliImageLoader.INSTANCE.acquire(ContextUtilKt.requireFragmentActivity(context2)).useOrigin().asDecodedImage().url(str2).submit();
                C5484o c5484o = new C5484o(singleEmitter);
                imageDataSourceSubmit.subscribe(new com.bilibili.ogvcommon.image.a(c5484o), UiThreadImmediateExecutorService.getInstance());
            }
        });
    }
}
