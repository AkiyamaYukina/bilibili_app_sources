package com.bilibili.lib.projection.internal.control;

import Ie0.d;
import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import ie0.C7564c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import je0.InterfaceC7668i;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import le0.InterfaceC7845m;
import oe0.C8205a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/NewBubbleHelper.class */
public final class NewBubbleHelper {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final io.reactivex.rxjava3.subjects.a<NeedShowNewBubble> f63022m = io.reactivex.rxjava3.subjects.a.d(NeedShowNewBubble.UNKNOWN);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f63023n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f63024a = new CompositeDisposable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f63025b = CaptureSchema.OLD_INVALID_ID_STRING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final InterfaceC7845m f63026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f63027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f63028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f63029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f63030g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f63031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public a f63032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<ProjectionOperationConfig> f63033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Boolean> f63034l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/NewBubbleHelper$NeedShowNewBubble.class */
    public static final class NeedShowNewBubble {
        private static final EnumEntries $ENTRIES;
        private static final NeedShowNewBubble[] $VALUES;
        public static final NeedShowNewBubble FIRST_ENTER_FULL_PROJ_FRAGMENT = new NeedShowNewBubble("FIRST_ENTER_FULL_PROJ_FRAGMENT", 0);
        public static final NeedShowNewBubble HALF_TO_FULL_SCREEN = new NeedShowNewBubble("HALF_TO_FULL_SCREEN", 1);
        public static final NeedShowNewBubble SUSPENSION_BUBBLE_CLICK = new NeedShowNewBubble("SUSPENSION_BUBBLE_CLICK", 2);
        public static final NeedShowNewBubble BACK_TO_FOREEND = new NeedShowNewBubble("BACK_TO_FOREEND", 3);
        public static final NeedShowNewBubble UNKNOWN = new NeedShowNewBubble("UNKNOWN", 4);

        private static final /* synthetic */ NeedShowNewBubble[] $values() {
            return new NeedShowNewBubble[]{FIRST_ENTER_FULL_PROJ_FRAGMENT, HALF_TO_FULL_SCREEN, SUSPENSION_BUBBLE_CLICK, BACK_TO_FOREEND, UNKNOWN};
        }

        static {
            NeedShowNewBubble[] needShowNewBubbleArr$values = $values();
            $VALUES = needShowNewBubbleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(needShowNewBubbleArr$values);
        }

        private NeedShowNewBubble(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<NeedShowNewBubble> getEntries() {
            return $ENTRIES;
        }

        public static NeedShowNewBubble valueOf(String str) {
            return (NeedShowNewBubble) Enum.valueOf(NeedShowNewBubble.class, str);
        }

        public static NeedShowNewBubble[] values() {
            return (NeedShowNewBubble[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/NewBubbleHelper$a.class */
    public interface a {
        void a(@Nullable ProjectionOperationConfig.NewThirdProjBubbleConfig newThirdProjBubbleConfig);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/NewBubbleHelper$b.class */
    public static final class b extends BiliApiCallback<GeneralResponse<ProjectionOperationConfig>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NewBubbleHelper f63035b;

        public b(NewBubbleHelper newBubbleHelper) {
            this.f63035b = newBubbleHelper;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            BLog.e("NewBubbleHelper", "Get projection operation config failed", th);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onFailure(Call<GeneralResponse<ProjectionOperationConfig>> call, Throwable th) {
            BLog.e("NewBubbleHelper", "Get projection operation config failed", th);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onSuccess(GeneralResponse<ProjectionOperationConfig> generalResponse) {
            GeneralResponse<ProjectionOperationConfig> generalResponse2 = generalResponse;
            if ((generalResponse2 != null ? generalResponse2.data : null) != null) {
                io.reactivex.rxjava3.subjects.a<ProjectionOperationConfig> aVar = this.f63035b.f63033k;
                ProjectionOperationConfig projectionOperationConfig = generalResponse2.data;
                ProjectionOperationConfig projectionOperationConfig2 = projectionOperationConfig;
                if (projectionOperationConfig == null) {
                    projectionOperationConfig2 = new ProjectionOperationConfig();
                }
                aVar.onNext(projectionOperationConfig2);
            }
        }
    }

    public NewBubbleHelper(int i7) {
        this.f63026c = C7564c.f121625a.h(i7);
        Application application = BiliContext.application();
        String accessKey = BiliAccounts.get(application != null ? application.getApplicationContext() : null).getAccessKey();
        this.f63031i = accessKey == null ? "" : accessKey;
        this.f63033k = io.reactivex.rxjava3.subjects.a.d(new ProjectionOperationConfig());
        this.f63034l = io.reactivex.rxjava3.subjects.a.d(Boolean.FALSE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(long j7, long j8, long j9, long j10, String str, String str2, String str3) {
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    this.f63027d = j7;
                    this.f63028e = j8;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    this.f63027d = j7;
                    this.f63028e = j8;
                    this.f63029f = j9;
                    this.f63030g = j10;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    this.f63027d = j7;
                    this.f63028e = j8;
                    this.f63029f = j9;
                    this.f63030g = j10;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    this.h = j7;
                }
                break;
        }
        ((InterfaceC7668i) ServiceGenerator.createService(InterfaceC7668i.class)).getProjectionOperation(this.f63031i, String.valueOf(16), str, String.valueOf(this.f63027d), String.valueOf(this.f63028e), String.valueOf(this.f63029f), String.valueOf(this.f63030g), String.valueOf(this.h), String.valueOf(0), d.e(0) ? "1" : "0", str2, str3).enqueue(new b(this));
    }

    public final void b() {
        io.reactivex.rxjava3.subjects.a aVarF;
        InterfaceC7845m interfaceC7845m = this.f63026c;
        if (interfaceC7845m != null && (aVarF = interfaceC7845m.f()) != null) {
            Disposable disposableSubscribe = Observable.combineLatest(aVarF, f63022m, com.bilibili.lib.projection.internal.control.b.f63067a).subscribe(new c(this));
            CompositeDisposable compositeDisposable = this.f63024a;
            if (compositeDisposable != null) {
                compositeDisposable.add(disposableSubscribe);
            }
        }
        Disposable disposableSubscribe2 = Observable.zip(this.f63034l, this.f63033k, C8205a.f124593a).subscribe(new com.bilibili.lib.projection.internal.control.a(this));
        CompositeDisposable compositeDisposable2 = this.f63024a;
        if (compositeDisposable2 != null) {
            compositeDisposable2.add(disposableSubscribe2);
        }
    }
}
