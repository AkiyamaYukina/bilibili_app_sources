package com.bilibili.socialize.share.core.helper;

import Ev0.e;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.room.m;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.socialize.share.core.SocializeMedia;
import com.bilibili.socialize.share.core.shareparam.BaseShareParam;
import com.bilibili.socialize.share.core.shareparam.ShareImage;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/ShareImageDownloader.class */
public final class ShareImageDownloader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public b f104986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SocializeMedia f104987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public BaseShareParam f104988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104989d = m.a(null, 1, null, Dispatchers.getIO());

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/ShareImageDownloader$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104990a;

        static {
            int[] iArr = new int[SocializeMedia.values().length];
            try {
                iArr[SocializeMedia.WEIXIN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SocializeMedia.WEIXIN_MONMENT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SocializeMedia.HUAWEI.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[SocializeMedia.SINA.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f104990a = iArr;
        }
    }

    public static boolean c(@NotNull String str) {
        return ((Boolean) BuildersKt.runBlocking$default((CoroutineContext) null, new ShareImageDownloader$isGif$1(str, null), 1, (Object) null)).booleanValue();
    }

    public final void a(Context context, ShareImage shareImage, e eVar) {
        BiliImageLoader.INSTANCE.acquireDownloadOnly(context, (Lifecycle) null).useRaw().url(shareImage.f105014c).submit().subscribe(new com.bilibili.socialize.share.core.helper.a(shareImage, this, eVar));
    }

    public final void b(ShareImage shareImage, e eVar) {
        BuildersKt.launch$default(this.f104989d, (CoroutineContext) null, (CoroutineStart) null, new ShareImageDownloader$getThumbBytes$1(shareImage, this, eVar, null), 3, (Object) null);
    }
}
