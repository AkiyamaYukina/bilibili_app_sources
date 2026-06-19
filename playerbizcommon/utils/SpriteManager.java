package com.bilibili.playerbizcommon.utils;

import android.content.Context;
import com.bilibili.mediautils.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.C8397q;
import tv.danmaku.biliplayerv2.utils.PlayerStreamUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/SpriteManager.class */
public final class SpriteManager {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String TAG = "sprite";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f80271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final File f80272b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/SpriteManager$a.class */
    public static final class a {
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.utils.SpriteManager$download$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/SpriteManager$download$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $imageUri;
        final String $jsonUri;
        final String $spritePath;
        int label;
        final SpriteManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, SpriteManager spriteManager, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$jsonUri = str;
            this.$imageUri = str2;
            this.this$0 = spriteManager;
            this.$spritePath = str3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$jsonUri, this.$imageUri, this.this$0, this.$spritePath, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str2 = this.$jsonUri;
            if (str2 == null || str2.length() == 0 || (str = this.$imageUri) == null || str.length() == 0) {
                return Unit.INSTANCE;
            }
            String strA = this.this$0.a("player_seek_bar_sprite_" + this.$jsonUri.hashCode() + FileUtils.SUFFIX_JSON);
            if (strA == null) {
                return Unit.INSTANCE;
            }
            String strA2 = this.this$0.a("player_seek_bar_sprite_" + this.$imageUri.hashCode() + ".png");
            if (strA2 == null) {
                return Unit.INSTANCE;
            }
            PlayerStreamUtils playerStreamUtils = PlayerStreamUtils.INSTANCE;
            Response responseRequestUrl = playerStreamUtils.requestUrl(this.$jsonUri);
            if (responseRequestUrl != null) {
                try {
                    ResponseBody responseBodyBody = responseRequestUrl.body();
                    playerStreamUtils.writeStream2File(new BufferedInputStream(responseBodyBody != null ? responseBodyBody.byteStream() : null), strA);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(responseRequestUrl, (Throwable) null);
                } finally {
                }
            }
            responseRequestUrl = playerStreamUtils.requestUrl(this.$imageUri);
            if (responseRequestUrl != null) {
                try {
                    ResponseBody responseBodyBody2 = responseRequestUrl.body();
                    playerStreamUtils.writeStream2File(new BufferedInputStream(responseBodyBody2 != null ? responseBodyBody2.byteStream() : null), strA2);
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(responseRequestUrl, (Throwable) null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            SpriteManager.access$tryMergeFiles2(this.this$0, strA2, strA, this.$spritePath);
            return Unit.INSTANCE;
        }
    }

    public SpriteManager(@NotNull Context context) {
        this.f80271a = context;
        this.f80272b = context.getExternalFilesDir("player");
    }

    public static final void access$tryMergeFiles2(SpriteManager spriteManager, String str, String str2, String str3) {
        spriteManager.getClass();
        try {
            byte[] bytes = FilesKt.readBytes(new File(str2));
            byte[] bytes2 = FilesKt.readBytes(new File(str));
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes2.length + 12 + bytes.length);
            byteBufferAllocate.putInt(-1076903985);
            byteBufferAllocate.putInt(bytes2.length);
            byteBufferAllocate.putInt(bytes.length);
            byteBufferAllocate.put(bytes2);
            byteBufferAllocate.put(bytes);
            FilesKt.writeBytes(new File(str3), byteBufferAllocate.array());
        } catch (Exception e7) {
            C8397q.a("tryMergeFiles failed, ", TAG, e7);
        }
    }

    public final String a(String str) {
        File file = this.f80272b;
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            this.f80272b.mkdirs();
        }
        StringBuilder sb = new StringBuilder(this.f80272b.getPath());
        if (!StringsKt.v(sb, "/")) {
            sb.append(File.separator);
        }
        sb.append(str);
        return sb.toString();
    }

    @Nullable
    public final Object download(@Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str2, str, this, str3, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @NotNull
    public final Context getContext() {
        return this.f80271a;
    }

    @Nullable
    public final String getSpritePath(@Nullable String str, @Nullable String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        return a(androidx.compose.runtime.collection.d.a(str.hashCode(), str2.hashCode(), "player_seek_bar_", "_", ".sprite"));
    }
}
