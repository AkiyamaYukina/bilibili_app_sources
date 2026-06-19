package com.bilibili.playerbizcommon.utils;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.I0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieComposition;
import com.bilibili.base.BiliContext;
import com.bilibili.commons.io.IOUtils;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper.class */
public final class ModGetHelper {

    @NotNull
    public static final ModGetHelper INSTANCE = new ModGetHelper();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$a.class */
    public interface a {
        void a(@Nullable LottieComposition lottieComposition);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$b.class */
    public interface b {
        default void a() {
        }

        void b(@NotNull LottieComposition lottieComposition);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$c.class */
    public interface c {
        void a(@Nullable SVGAVideoEntity sVGAVideoEntity);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$d.class */
    public interface d {
        default void a() {
        }

        void b();

        void c(@NotNull SVGAVideoEntity sVGAVideoEntity);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$e.class */
    public static final class e implements SVGAParser.ParseCompletion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileInputStream f80267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f80268b;

        public e(FileInputStream fileInputStream, d dVar) {
            this.f80267a = fileInputStream;
            this.f80268b = dVar;
        }

        public final void onCacheExist() {
        }

        public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
            IOUtils.closeQuietly(this.f80267a);
            d dVar = this.f80268b;
            if (dVar != null) {
                dVar.c(sVGAVideoEntity);
            }
        }

        public final void onError() {
            IOUtils.closeQuietly(this.f80267a);
            d dVar = this.f80268b;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$f.class */
    public static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f80269a;

        public f(c cVar) {
            this.f80269a = cVar;
        }

        @Override // com.bilibili.playerbizcommon.utils.ModGetHelper.d
        public final void a() {
            c cVar = this.f80269a;
            if (cVar != null) {
                cVar.a(null);
            }
        }

        @Override // com.bilibili.playerbizcommon.utils.ModGetHelper.d
        public final void b() {
            c cVar = this.f80269a;
            if (cVar != null) {
                cVar.a(null);
            }
        }

        @Override // com.bilibili.playerbizcommon.utils.ModGetHelper.d
        public final void c(SVGAVideoEntity sVGAVideoEntity) {
            c cVar = this.f80269a;
            if (cVar != null) {
                cVar.a(sVGAVideoEntity);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.utils.ModGetHelper$getLottieFileFromMod$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$getLottieFileFromMod$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $callback;
        final File $lottieFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, File file, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = aVar;
            this.$lottieFile = file;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$lottieFile, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ModGetHelper$getLottieFileFromMod$1$result$1 modGetHelper$getLottieFileFromMod$1$result$1 = new ModGetHelper$getLottieFileFromMod$1$result$1(this.$lottieFile, null);
                this.label = 1;
                Object objWithContext = BuildersKt.withContext(io2, modGetHelper$getLottieFileFromMod$1$result$1, this);
                obj = objWithContext;
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LottieComposition lottieComposition = (LottieComposition) obj;
            a aVar = this.$callback;
            if (aVar != null) {
                aVar.a(lottieComposition);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.utils.ModGetHelper$getLottieFileFromModV2$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$getLottieFileFromModV2$1.class */
    public static final class C57801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final b $callback;
        final File $lottieFile;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57801(b bVar, File file, Continuation<? super C57801> continuation) {
            super(2, continuation);
            this.$callback = bVar;
            this.$lottieFile = file;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C57801 c57801 = new C57801(this.$callback, this.$lottieFile, continuation);
            c57801.L$0 = obj;
            return c57801;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), (CoroutineStart) null, new ModGetHelper$getLottieFileFromModV2$1$result$1(this.$lottieFile, null), 2, (Object) null);
                this.label = 1;
                Object objAwait = deferredAsync$default.await(this);
                obj = objAwait;
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LottieComposition lottieComposition = (LottieComposition) obj;
            if (lottieComposition != null) {
                b bVar = this.$callback;
                if (bVar != null) {
                    bVar.b(lottieComposition);
                }
            } else {
                b bVar2 = this.$callback;
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void getLottieFileFromMod(@NotNull ModResource modResource, @Nullable String str, @Nullable a aVar) {
        File fileRetrieveFile = modResource.retrieveFile(str);
        if (fileRetrieveFile == null || !fileRetrieveFile.exists()) {
            return;
        }
        try {
            BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), (CoroutineStart) null, new AnonymousClass1(aVar, fileRetrieveFile, null), 2, (Object) null);
        } catch (FileNotFoundException e7) {
            e7.printStackTrace();
        }
    }

    @JvmStatic
    public static final void getLottieFileFromModV2(@Nullable LifecycleOwner lifecycleOwner, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable b bVar) {
        Application application = BiliContext.application();
        Context applicationContext = application != null ? application.getApplicationContext() : null;
        ModResource modeResource = getModeResource(applicationContext, str, str2);
        if (lifecycleOwner == null || applicationContext == null || modeResource == null) {
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        File fileRetrieveFile = modeResource.retrieveFile(str3);
        if (fileRetrieveFile == null || !fileRetrieveFile.exists()) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            try {
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getMain(), (CoroutineStart) null, new C57801(bVar, fileRetrieveFile, null), 2, (Object) null);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final ModResource getModeResource(@Nullable Context context, @NotNull String str, @NotNull String str2) {
        if (context == null) {
            return null;
        }
        ModResource modResource = ModResourceClient.getInstance().get(context, str, str2);
        if (!modResource.isAvailable()) {
            modResource = null;
        }
        return modResource;
    }

    @JvmStatic
    public static final void getSvgaFile(@Nullable File file, @Nullable d dVar) {
        Application application = BiliContext.application();
        Context applicationContext = application != null ? application.getApplicationContext() : null;
        if (file == null || !file.exists() || applicationContext == null) {
            if (dVar != null) {
                dVar.a();
            }
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                new SVGAParser(applicationContext).parse(fileInputStream, file.getName(), new e(fileInputStream, dVar));
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    @JvmStatic
    public static final void getSvgaFileFromMod(@Nullable Context context, @NotNull ModResource modResource, @Nullable String str, @Nullable c cVar) {
        getSvgaFile(modResource.retrieveFile(str), new f(cVar));
    }

    @JvmStatic
    public static final void getSvgaFileFromModV2(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable d dVar) {
        Application application = BiliContext.application();
        Context applicationContext = application != null ? application.getApplicationContext() : null;
        ModResource modeResource = getModeResource(applicationContext, str, str2);
        if (applicationContext != null && modeResource != null) {
            getSvgaFile(modeResource.retrieveFile(str3), dVar);
        } else if (dVar != null) {
            dVar.a();
        }
    }

    @Nullable
    public final ModResource getOrUpdateModResource(@Nullable Context context, @NotNull String str, @NotNull String str2) {
        ModResource modeResource = getModeResource(context, str, str2);
        if (modeResource == null || !modeResource.isAvailable()) {
            ModResourceClient.getInstance().update(BiliContext.application(), I0.a(str, str2, true), (ModResourceClient.OnUpdateCallback) null);
        }
        return modeResource;
    }
}
