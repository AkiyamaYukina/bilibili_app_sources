package com.bilibili.upper.module.cover_v2.service;

import D21.a;
import EH0.p;
import KH0.i;
import LH0.a;
import R50.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.studio.editor.timeline.UpperEngineScene;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import java.util.ArrayList;
import java.util.List;
import kntr.app.upper.manuscript.extension.ResizeMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/MultiCoverDraftService.class */
@StabilityInferred(parameters = 0)
@Keep
public class MultiCoverDraftService {
    public static final int $stable = 8;

    @NotNull
    private MultiCoverDraft draftInfo;

    @NotNull
    private final i engine;
    private int trySnapshotCount;

    @NotNull
    private final String TAG = "MultiCoverDraftService";
    private final int trySnapshotCountMax = 6;

    /* JADX INFO: renamed from: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService$generateCover$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/MultiCoverDraftService$generateCover$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $keepDelay;
        final float $mixRatio;
        final Function1<String, Unit> $onResult;
        final String $savePath;
        int label;
        final MultiCoverDraftService this$0;

        /* JADX INFO: renamed from: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService$generateCover$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/MultiCoverDraftService$generateCover$1$1.class */
        public static final class C12261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Function1<String, Unit> $onResult;
            final String $path;
            int label;
            final MultiCoverDraftService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C12261(String str, MultiCoverDraftService multiCoverDraftService, Function1<? super String, Unit> function1, Continuation<? super C12261> continuation) {
                super(2, continuation);
                this.$path = str;
                this.this$0 = multiCoverDraftService;
                this.$onResult = function1;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C12261(this.$path, this.this$0, this.$onResult, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = this.$path;
                if (str == null || str.length() != 0) {
                    this.$onResult.invoke(this.$path);
                } else {
                    M.b("generateCover grabImage fail engine.scene = ", this.this$0.getEngine().f12744b.getInfo(), this.this$0.TAG);
                    this.$onResult.invoke((Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService$generateCover$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/MultiCoverDraftService$generateCover$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Function1<String, Unit> $onResult;
            final String $path;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function1<? super String, Unit> function1, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$onResult = function1;
                this.$path = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$onResult, this.$path, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$onResult.invoke(this.$path);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService$generateCover$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/MultiCoverDraftService$generateCover$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Function1<String, Unit> $onResult;
            int label;
            final MultiCoverDraftService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(MultiCoverDraftService multiCoverDraftService, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = multiCoverDraftService;
                this.$onResult = function1;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$onResult, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                M.b("generateCover takeSnapshot fail engine.scene = ", this.this$0.getEngine().f12744b.getInfo(), this.this$0.TAG);
                this.$onResult.invoke((Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(MultiCoverDraftService multiCoverDraftService, boolean z6, float f7, String str, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = multiCoverDraftService;
            this.$keepDelay = z6;
            this.$mixRatio = f7;
            this.$savePath = str;
            this.$onResult = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$keepDelay, this.$mixRatio, this.$savePath, this.$onResult, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 421
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService$takeSnapshotInner$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/MultiCoverDraftService$takeSnapshotInner$1.class */
    public static final class C66781 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final MultiCoverDraftService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66781(MultiCoverDraftService multiCoverDraftService, Continuation<? super C66781> continuation) {
            super(continuation);
            this.this$0 = multiCoverDraftService;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.takeSnapshotInner(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService$takeSnapshotInner$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/MultiCoverDraftService$takeSnapshotInner$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MH0.b $renderer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MH0.b bVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$renderer = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$renderer, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NH0.c.b(this.$renderer.f16067d);
            return Unit.INSTANCE;
        }
    }

    public MultiCoverDraftService(@NotNull i iVar, @NotNull MultiCoverDraft multiCoverDraft) {
        this.engine = iVar;
        this.draftInfo = multiCoverDraft;
    }

    private final Bitmap createMixCoverBitmap(Bitmap bitmap, RectF rectF, float f7) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        float f8 = width;
        float f9 = height;
        E21.b bVar = new E21.b(f8, f9);
        a.a aVar = new a.a(bVar);
        if (rectF != null) {
            if (rectF.right > f8) {
                rectF.right = f8;
            }
            if (rectF.bottom > f9) {
                rectF.bottom = f9;
            }
            if (rectF.left < 0.0f) {
                rectF.left = 0.0f;
            }
            if (rectF.top < 0.0f) {
                rectF.top = 0.0f;
            }
            aVar.b = new E21.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        } else {
            aVar.b = a.a.a(bVar, 1.3333334f);
        }
        a.b bVar2 = new a.b(ResizeMode.FILL, f7);
        ((ArrayList) aVar.c).clear();
        CollectionsKt.e(aVar.c, new a.b[]{bVar2});
        E21.a aVar2 = (E21.a) CollectionsKt.getOrNull(new D21.a(aVar).a(), 0);
        Bitmap bitmapCreateBitmap = bitmap;
        if ((aVar2 != null ? aVar2.d() : 0.0f) > 0.0f) {
            if ((aVar2 != null ? aVar2.c() : 0.0f) <= 0.0f) {
                bitmapCreateBitmap = bitmap;
            } else {
                bitmapCreateBitmap = bitmap;
                if (aVar2 != null) {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) aVar2.a, (int) aVar2.b, (int) aVar2.d(), (int) aVar2.c());
                }
            }
        }
        return bitmapCreateBitmap;
    }

    private final Bitmap cropBitmap(Bitmap bitmap, RectF rectF) {
        int i7 = (int) rectF.left;
        int i8 = (int) rectF.top;
        return Bitmap.createBitmap(bitmap, i7, i8, ((int) rectF.right) - i7, ((int) rectF.bottom) - i8);
    }

    public static /* synthetic */ void generateCover$default(MultiCoverDraftService multiCoverDraftService, float f7, String str, boolean z6, Function1 function1, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateCover");
        }
        if ((i7 & 4) != 0) {
            z6 = true;
        }
        multiCoverDraftService.generateCover(f7, str, z6, function1);
    }

    public static /* synthetic */ void generateMainCover$default(MultiCoverDraftService multiCoverDraftService, float f7, boolean z6, Function1 function1, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateMainCover");
        }
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        multiCoverDraftService.generateMainCover(f7, z6, function1);
    }

    public static /* synthetic */ void generateSubCover$default(MultiCoverDraftService multiCoverDraftService, UpperLiveWindowExt upperLiveWindowExt, MultiCoverDraft multiCoverDraft, float f7, boolean z6, Function1 function1, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateSubCover");
        }
        if ((i7 & 8) != 0) {
            z6 = true;
        }
        multiCoverDraftService.generateSubCover(upperLiveWindowExt, multiCoverDraft, f7, z6, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateSubCover$lambda$1(Function1 function1, i iVar, String str) {
        function1.invoke(str);
        iVar.c();
        return Unit.INSTANCE;
    }

    private final RectF getCropImageRectByScale(Bitmap bitmap) {
        RectF videoTouchRect = this.engine.f12745c.getVideoTouchRect();
        int[] originImageWH = this.engine.f12749g.getOriginImageWH();
        if (originImageWH.length == 2 && originImageWH[0] != 0 && originImageWH[1] != 0) {
            float fWidth = videoTouchRect.width();
            float fHeight = videoTouchRect.height();
            int width = bitmap.getWidth();
            float f7 = width / originImageWH[0];
            float height = bitmap.getHeight() / originImageWH[1];
            float f8 = videoTouchRect.left * f7;
            videoTouchRect.left = f8;
            videoTouchRect.right = (fWidth * f7) + f8;
            float f9 = videoTouchRect.top * height;
            videoTouchRect.top = f9;
            videoTouchRect.bottom = (fHeight * height) + f9;
        }
        if (videoTouchRect.left < 0.0f) {
            videoTouchRect.left = 0.0f;
        }
        if (videoTouchRect.top < 0.0f) {
            videoTouchRect.top = 0.0f;
        }
        if (videoTouchRect.right > bitmap.getWidth()) {
            videoTouchRect.right = bitmap.getWidth();
        }
        if (videoTouchRect.bottom > bitmap.getHeight()) {
            videoTouchRect.bottom = bitmap.getHeight();
        }
        return videoTouchRect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String saveBitmapToFile(android.graphics.Bitmap r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService.saveBitmapToFile(android.graphics.Bitmap, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String saveCropPicture(Bitmap bitmap, float f7, String str) {
        try {
            LH0.a aVar = this.engine.f12746d;
            float f8 = aVar.f14537b.left;
            RectF rectF = aVar.f14536a;
            float fCeil = (float) Math.ceil((((int) (f8 - rectF.left)) / rectF.width()) * bitmap.getWidth());
            float f9 = aVar.f14537b.top;
            RectF rectF2 = aVar.f14536a;
            float fCeil2 = (float) Math.ceil((((int) (f9 - rectF2.top)) / rectF2.height()) * bitmap.getHeight());
            float fWidth = (aVar.f14537b.width() / aVar.f14536a.width()) * bitmap.getWidth();
            float fCropRatio = fWidth / this.engine.f12745c.cropRatio();
            float width = fWidth;
            if (fCeil + fWidth > bitmap.getWidth()) {
                width = bitmap.getWidth() - fCeil;
            }
            float height = fCropRatio;
            if (fCeil2 + fCropRatio > bitmap.getHeight()) {
                height = bitmap.getHeight() - fCeil2;
            }
            if (fCeil < 0.0f || fCeil2 < 0.0f || width <= 0.0f || height <= 0.0f) {
                bitmap.recycle();
                return "";
            }
            if (f7 <= 0.0f) {
                return saveBitmapToFile(Bitmap.createBitmap(bitmap, (int) fCeil, (int) fCeil2, (int) width, (int) height), str);
            }
            RectF cropImageRectByScale = getCropImageRectByScale(bitmap);
            if (((int) cropImageRectByScale.width()) > 0 && ((int) cropImageRectByScale.height()) > 0) {
                Bitmap bitmapCropBitmap = cropBitmap(bitmap, cropImageRectByScale);
                float f10 = fCeil - cropImageRectByScale.left;
                float f11 = fCeil2 - cropImageRectByScale.top;
                Bitmap bitmapCreateMixCoverBitmap = createMixCoverBitmap(bitmapCropBitmap, new RectF(f10, f11, width + f10, height + f11), f7);
                if (bitmapCreateMixCoverBitmap != null) {
                    return saveBitmapToFile(bitmapCreateMixCoverBitmap, str);
                }
                bitmap.recycle();
                return null;
            }
            bitmap.recycle();
            return null;
        } finally {
            bitmap.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object takeSnapshot(Continuation<? super Bitmap> continuation) {
        this.trySnapshotCount = 0;
        return takeSnapshotInner(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object takeSnapshotInner(kotlin.coroutines.Continuation<? super android.graphics.Bitmap> r7) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService.takeSnapshotInner(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final i createSubDraftEngine(@NotNull UpperLiveWindowExt upperLiveWindowExt, @Nullable MultiCoverDraft multiCoverDraft) {
        OH0.b bVar;
        MultiCoverConfig config;
        List<OH0.b> listC = this.engine.f12745c.getMainStrategy().c();
        if (listC == null || (bVar = (OH0.b) CollectionsKt.firstOrNull(listC)) == null) {
            return null;
        }
        MultiCoverDraft multiCoverDraftM10652clone = multiCoverDraft == null ? this.draftInfo.m10652clone() : multiCoverDraft;
        MultiCoverConfig multiCoverConfigM10653clone = this.engine.f12745c.m10653clone();
        multiCoverConfigM10653clone.setCurrentSeekTime((multiCoverDraft == null || (config = multiCoverDraft.getConfig()) == null) ? 0L : config.getCurrentSeekTime());
        p pVar = p.f4125a;
        Context baseContext = FoundationAlias.getFapp().getBaseContext();
        pVar.getClass();
        multiCoverConfigM10653clone.setOutputImagePath(p.f(baseContext, false));
        multiCoverConfigM10653clone.setMainStrategy(bVar);
        try {
            i iVar = new i(FoundationAlias.getFapp().getBaseContext(), UpperEngineScene.PUBLISH_MULTI_COVER_CROP_SUB, multiCoverConfigM10653clone, a.C0078a.a(multiCoverConfigM10653clone), multiCoverDraftM10652clone);
            iVar.g();
            iVar.d();
            iVar.f12751j = upperLiveWindowExt;
            com.bilibili.studio.editor.timeline.i iVar2 = iVar.f12748f;
            if (iVar2 != null) {
                iVar2.f108301c = upperLiveWindowExt;
                r rVar = iVar2.f108304f;
                if (rVar != null) {
                    rVar.r(iVar2.i(), upperLiveWindowExt);
                }
            }
            return iVar;
        } catch (Throwable th) {
            BLog.e("MultiVideoEngine", "create error", th);
            throw th;
        }
    }

    public final void generateCover(float f7, @NotNull String str, boolean z6, @NotNull Function1<? super String, Unit> function1) {
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, z6, f7, str, function1, null), 3, (Object) null);
    }

    public final void generateMainCover(float f7, boolean z6, @NotNull Function1<? super String, Unit> function1) {
        BLog.e(this.TAG, "generateMainCover engine.config=" + this.engine.f12745c);
        generateCover(f7, this.engine.f12745c.getOutputImagePath(), z6, function1);
    }

    public final void generateSubCover(@NotNull UpperLiveWindowExt upperLiveWindowExt, @Nullable MultiCoverDraft multiCoverDraft, float f7, boolean z6, @NotNull Function1<? super String, Unit> function1) {
        i iVarCreateSubDraftEngine = createSubDraftEngine(upperLiveWindowExt, multiCoverDraft);
        if (iVarCreateSubDraftEngine == null) {
            function1.invoke((Object) null);
            return;
        }
        iVarCreateSubDraftEngine.d();
        iVarCreateSubDraftEngine.f12751j = upperLiveWindowExt;
        com.bilibili.studio.editor.timeline.i iVar = iVarCreateSubDraftEngine.f12748f;
        if (iVar != null) {
            iVar.f108301c = upperLiveWindowExt;
            r rVar = iVar.f108304f;
            if (rVar != null) {
                rVar.r(iVar.i(), upperLiveWindowExt);
            }
        }
        iVarCreateSubDraftEngine.f12757p.generateCover(f7, iVarCreateSubDraftEngine.f12745c.getOutputImagePath(), z6, new com.bilibili.lib.imageviewer.c<>(2, function1, iVarCreateSubDraftEngine));
    }

    @NotNull
    public final MultiCoverDraft getDraftInfo() {
        return this.draftInfo;
    }

    @NotNull
    public final i getEngine() {
        return this.engine;
    }

    public final void saveDraft() {
        BLog.e("MultiCoverConfig", "saveDraft: " + this.engine.f12745c);
        SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
        String coverKey = this.engine.f12745c.getCoverKey();
        if (coverKey == null) {
            return;
        }
        JH0.a.f(coverKey, this.draftInfo, this.engine.f12745c, false);
    }

    public final void setDraftInfo(@NotNull MultiCoverDraft multiCoverDraft) {
        this.draftInfo = multiCoverDraft;
    }
}
