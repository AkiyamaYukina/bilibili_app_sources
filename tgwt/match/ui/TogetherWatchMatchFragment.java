package com.bilibili.tgwt.match.ui;

import DD0.f0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import cf.p;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.bean.AnimationInfo;
import com.bilibili.lib.image2.bean.BiliAnimatable;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.FateMatchVo;
import com.bilibili.tgwt.match.ui.TogetherWatchMatchFragment;
import hm.c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchMatchFragment extends BaseFragment implements IMiniPlayerContainer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JD0.d f111478b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f111480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f111481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f111482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111483g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f111484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f111485j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f111488m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public FateMatchVo f111490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f111491p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public TogetherWatchAuthorizeDialog f111494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Job f111495t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f111479c = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);

    @NotNull
    public Type h = Type.DEFAULT;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f111486k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f111487l = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f111489n = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f111492q = System.currentTimeMillis();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public ErrorType f111493r = ErrorType.ERROR_NO_FATE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final b f111496u = new b(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Yk0.a f111497v = new Yk0.a(this, 1);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$ErrorType.class */
    public static final class ErrorType {
        private static final EnumEntries $ENTRIES;
        private static final ErrorType[] $VALUES;
        private int type;
        public static final ErrorType ERROR_NO_FATE = new ErrorType("ERROR_NO_FATE", 0, 0);
        public static final ErrorType ERROR_FATE_NO_NET = new ErrorType("ERROR_FATE_NO_NET", 1, 1);
        public static final ErrorType ERROR_FATE_MATCH_SERVER = new ErrorType("ERROR_FATE_MATCH_SERVER", 2, 2);
        public static final ErrorType ERROR_FATE_MATCH_TIME = new ErrorType("ERROR_FATE_MATCH_TIME", 3, 3);

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{ERROR_NO_FATE, ERROR_FATE_NO_NET, ERROR_FATE_MATCH_SERVER, ERROR_FATE_MATCH_TIME};
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(errorTypeArr$values);
        }

        private ErrorType(String str, int i7, int i8) {
            this.type = i8;
        }

        @NotNull
        public static EnumEntries<ErrorType> getEntries() {
            return $ENTRIES;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i7) {
            this.type = i7;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$Type.class */
    public static final class Type {
        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;

        @NotNull
        public static final a Companion;
        private final int type;
        public static final Type DEFAULT = new Type("DEFAULT", 0, 0);
        public static final Type CREATE = new Type("CREATE", 1, 1);
        public static final Type MATCH_FROM_SQUARE = new Type("MATCH_FROM_SQUARE", 2, 2);
        public static final Type MATCH_FROM_SEARCH = new Type("MATCH_FROM_SEARCH", 3, 3);
        public static final Type MATCH_FROM_INVITE = new Type("MATCH_FROM_INVITE", 4, 4);
        public static final Type MATCH_FROM_MERGE = new Type("MATCH_FROM_MERGE", 5, 5);
        public static final Type MATCH_FROM_DETAIL = new Type("MATCH_FROM_DETAIL", 6, 6);
        public static final Type CREATE_FROM_DETAIL = new Type("CREATE_FROM_DETAIL", 7, 7);
        public static final Type FATE_FROM_DETAIL = new Type("FATE_FROM_DETAIL", 8, 8);
        public static final Type FATE_FROM_SQUARE = new Type("FATE_FROM_SQUARE", 9, 9);
        public static final Type FATE_FROM_MATCH = new Type("FATE_FROM_MATCH", 10, 10);
        public static final Type MATCH_FROM_CARD = new Type("MATCH_FROM_CARD", 11, 11);
        public static final Type MATCH_FROM_WAIT = new Type("MATCH_FROM_WAIT", 12, 12);
        public static final Type MATCH_FROM_DETAIL_PLAYER = new Type("MATCH_FROM_DETAIL_PLAYER", 13, 13);
        public static final Type MATCH_FROM_INLINE_ROOM = new Type("MATCH_FROM_INLINE_ROOM", 14, 14);
        public static final Type MATCH_FROM_HOT_ROOM = new Type("MATCH_FROM_HOT_ROOM", 15, 15);
        public static final Type CREATE_FROM_ROOM = new Type("CREATE_FROM_ROOM", 16, 16);
        public static final Type FATE_FROM_ROOM = new Type("FATE_FROM_ROOM", 17, 17);
        public static final Type CREATE_FROM_ACTIVITY_ROOM = new Type("CREATE_FROM_ACTIVITY_ROOM", 18, 18);
        public static final Type MATCH_FROM_ACTIVITY_ROOM = new Type("MATCH_FROM_ACTIVITY_ROOM", 19, 19);
        public static final Type MATCH_FROM_SQUARE_HOT_ROOM = new Type("MATCH_FROM_SQUARE_HOT_ROOM", 20, 20);
        public static final Type CREATE_FROM_SQUARE_HOT_ROOM = new Type("CREATE_FROM_SQUARE_HOT_ROOM", 21, 22);
        public static final Type MATCH_FROM_CHAT_HALL_HOT_ROOM = new Type("MATCH_FROM_CHAT_HALL_HOT_ROOM", 22, 23);
        public static final Type CREATE_FROM_SHARE_PANEL_ROOM = new Type("CREATE_FROM_SHARE_PANEL_ROOM", 23, 24);
        public static final Type CREATE_MIKE_ROOM = new Type("CREATE_MIKE_ROOM", 24, 25);
        public static final Type JOIN_MIKE_ROOM = new Type("JOIN_MIKE_ROOM", 25, 26);

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$Type$a.class */
        public static final class a {
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEFAULT, CREATE, MATCH_FROM_SQUARE, MATCH_FROM_SEARCH, MATCH_FROM_INVITE, MATCH_FROM_MERGE, MATCH_FROM_DETAIL, CREATE_FROM_DETAIL, FATE_FROM_DETAIL, FATE_FROM_SQUARE, FATE_FROM_MATCH, MATCH_FROM_CARD, MATCH_FROM_WAIT, MATCH_FROM_DETAIL_PLAYER, MATCH_FROM_INLINE_ROOM, MATCH_FROM_HOT_ROOM, CREATE_FROM_ROOM, FATE_FROM_ROOM, CREATE_FROM_ACTIVITY_ROOM, MATCH_FROM_ACTIVITY_ROOM, MATCH_FROM_SQUARE_HOT_ROOM, CREATE_FROM_SQUARE_HOT_ROOM, MATCH_FROM_CHAT_HALL_HOT_ROOM, CREATE_FROM_SHARE_PANEL_ROOM, CREATE_MIKE_ROOM, JOIN_MIKE_ROOM};
        }

        /* JADX WARN: Type inference failed for: r0v30, types: [com.bilibili.tgwt.match.ui.TogetherWatchMatchFragment$Type$a, java.lang.Object] */
        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
            Companion = new Object();
        }

        private Type(String str, int i7, int i8) {
            this.type = i8;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f111498a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.MATCH_FROM_SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Type.MATCH_FROM_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Type.FATE_FROM_MATCH.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Type.MATCH_FROM_WAIT.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Type.MATCH_FROM_DETAIL_PLAYER.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[Type.MATCH_FROM_ACTIVITY_ROOM.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[Type.MATCH_FROM_DETAIL.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[Type.FATE_FROM_SQUARE.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[Type.FATE_FROM_ROOM.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[Type.FATE_FROM_DETAIL.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[Type.CREATE.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[Type.CREATE_FROM_ACTIVITY_ROOM.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[Type.CREATE_FROM_DETAIL.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[Type.CREATE_FROM_SQUARE_HOT_ROOM.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[Type.CREATE_FROM_ROOM.ordinal()] = 15;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[Type.CREATE_MIKE_ROOM.ordinal()] = 16;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[Type.CREATE_FROM_SHARE_PANEL_ROOM.ordinal()] = 17;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[Type.MATCH_FROM_INVITE.ordinal()] = 18;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[Type.JOIN_MIKE_ROOM.ordinal()] = 19;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr[Type.MATCH_FROM_MERGE.ordinal()] = 20;
            } catch (NoSuchFieldError e26) {
            }
            try {
                iArr[Type.MATCH_FROM_INLINE_ROOM.ordinal()] = 21;
            } catch (NoSuchFieldError e27) {
            }
            try {
                iArr[Type.MATCH_FROM_HOT_ROOM.ordinal()] = 22;
            } catch (NoSuchFieldError e28) {
            }
            try {
                iArr[Type.MATCH_FROM_CHAT_HALL_HOT_ROOM.ordinal()] = 23;
            } catch (NoSuchFieldError e29) {
            }
            try {
                iArr[Type.MATCH_FROM_CARD.ordinal()] = 24;
            } catch (NoSuchFieldError e30) {
            }
            try {
                iArr[Type.MATCH_FROM_SQUARE_HOT_ROOM.ordinal()] = 25;
            } catch (NoSuchFieldError e31) {
            }
            f111498a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$b.class */
    public static final class b implements JD0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchMatchFragment f111499a;

        public b(TogetherWatchMatchFragment togetherWatchMatchFragment) {
            this.f111499a = togetherWatchMatchFragment;
        }

        @Override // JD0.a
        public final void a() {
            String str;
            TogetherWatchMatchFragment togetherWatchMatchFragment = this.f111499a;
            ErrorType errorType = togetherWatchMatchFragment.f111493r;
            if (errorType == ErrorType.ERROR_FATE_NO_NET || errorType == ErrorType.ERROR_FATE_MATCH_SERVER) {
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("operation", String.valueOf(togetherWatchMatchFragment.f111493r.getType()));
                Unit unit = Unit.INSTANCE;
                Neurons.reportClick(false, "pgc.watch-together-match.match-failed.0.click", MapsKt.build(mapCreateMapBuilder));
            }
            Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
            JD0.d dVar = togetherWatchMatchFragment.f111478b;
            JD0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                dVar2 = null;
            }
            if (dVar2.f11253g == 0) {
                str = "all";
            } else {
                JD0.d dVar3 = togetherWatchMatchFragment.f111478b;
                JD0.d dVar4 = dVar3;
                if (dVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar4 = null;
                }
                str = dVar4.f11253g == 1 ? DynamicModel.KEY_ABBR_DYNAMIC_CONFIG : "f";
            }
            mapCreateMapBuilder2.put("for_gender", str);
            Unit unit2 = Unit.INSTANCE;
            Neurons.reportClick(false, "pgc.watch-together-match.for-gender.0.click", MapsKt.build(mapCreateMapBuilder2));
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1(togetherWatchMatchFragment, new h(togetherWatchMatchFragment), null), 3, (Object) null);
        }

        @Override // JD0.a
        public final void b() {
            TogetherWatchMatchFragment togetherWatchMatchFragment = this.f111499a;
            togetherWatchMatchFragment.getClass();
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1(togetherWatchMatchFragment, new e(togetherWatchMatchFragment), null), 3, (Object) null);
        }
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final Rect getContainerUnavailableRect() {
        return new Rect();
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final String getMiniPlayerContainerKey() {
        return "together_page";
    }

    public final void jf(final long j7, final long j8, final String str, final long j9, final boolean z6) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JD0.d dVar = null;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$gotoTheater$1(null), 3, (Object) null);
        Type type = this.h;
        if (type == Type.MATCH_FROM_INLINE_ROOM || type == Type.MATCH_FROM_HOT_ROOM || type == Type.MATCH_FROM_CHAT_HALL_HOT_ROOM || type == Type.CREATE_FROM_ROOM || type == Type.CREATE_FROM_SQUARE_HOT_ROOM || type == Type.CREATE_FROM_SHARE_PANEL_ROOM || type == Type.CREATE_MIKE_ROOM) {
            Context contextRequireContext = requireContext();
            long j10 = this.f111481e;
            long j11 = this.f111482f;
            long j12 = this.f111480d;
            int type2 = this.h.getType();
            String str2 = z6 ? "2" : "1";
            String str3 = this.f111486k;
            String str4 = this.f111487l;
            JD0.d dVar2 = this.f111478b;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
            } else {
                dVar = dVar2;
            }
            gm.a.c(contextRequireContext, j10, j11, j12, String.valueOf(type2), str2, str3, str4, j7, str, dVar.f11259n, j8, this.f111488m, this.f111483g, j9);
            FragmentActivity fragmentActivityP3 = p3();
            if (fragmentActivityP3 != null) {
                fragmentActivityP3.finish();
                return;
            }
            return;
        }
        if (jCurrentTimeMillis - this.f111492q <= 500) {
            View view = getView();
            if (view != null) {
                view.postDelayed(new Runnable(this, z6, j7, str, j8, j9) { // from class: com.bilibili.tgwt.match.ui.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TogetherWatchMatchFragment f111506a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f111507b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final long f111508c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f111509d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final long f111510e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final long f111511f;

                    {
                        this.f111506a = this;
                        this.f111507b = z6;
                        this.f111508c = j7;
                        this.f111509d = str;
                        this.f111510e = j8;
                        this.f111511f = j9;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TogetherWatchMatchFragment togetherWatchMatchFragment = this.f111506a;
                        boolean z7 = this.f111507b;
                        long j13 = this.f111508c;
                        String str5 = this.f111509d;
                        long j14 = this.f111510e;
                        long j15 = this.f111511f;
                        Context context = togetherWatchMatchFragment.getContext();
                        if (context == null) {
                            return;
                        }
                        long j16 = togetherWatchMatchFragment.f111481e;
                        long j17 = togetherWatchMatchFragment.f111482f;
                        long j18 = togetherWatchMatchFragment.f111480d;
                        int type3 = togetherWatchMatchFragment.h.getType();
                        String str6 = z7 ? "2" : "1";
                        String str7 = togetherWatchMatchFragment.f111486k;
                        String str8 = togetherWatchMatchFragment.f111487l;
                        JD0.d dVar3 = togetherWatchMatchFragment.f111478b;
                        JD0.d dVar4 = dVar3;
                        if (dVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mVm");
                            dVar4 = null;
                        }
                        gm.a.c(context, j16, j17, j18, String.valueOf(type3), str6, str7, str8, j13, str5, dVar4.f11259n, j14, togetherWatchMatchFragment.f111488m, togetherWatchMatchFragment.f111483g, j15);
                        FragmentActivity fragmentActivityP32 = togetherWatchMatchFragment.p3();
                        if (fragmentActivityP32 != null) {
                            fragmentActivityP32.finish();
                        }
                    }
                }, (((long) BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) - jCurrentTimeMillis) + this.f111492q);
                return;
            }
            return;
        }
        Context contextRequireContext2 = requireContext();
        long j13 = this.f111481e;
        long j14 = this.f111482f;
        long j15 = this.f111480d;
        int type3 = this.h.getType();
        String str5 = z6 ? "2" : "1";
        String str6 = this.f111486k;
        String str7 = this.f111487l;
        JD0.d dVar3 = this.f111478b;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar3 = null;
        }
        gm.a.c(contextRequireContext2, j13, j14, j15, String.valueOf(type3), str5, str6, str7, j7, str, dVar3.f11259n, j8, this.f111488m, this.f111483g, j9);
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null) {
            fragmentActivityP32.finish();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void kf() {
        CharSequence charSequence;
        AnimationInfo animateInfo;
        BiliAnimatable animatable;
        AnimationInfo animateInfo2;
        BiliAnimatable animatable2;
        JD0.d dVar = this.f111478b;
        JD0.d dVar2 = null;
        JD0.d dVar3 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar3 = null;
        }
        dVar3.f11251e = false;
        JD0.d dVar4 = this.f111478b;
        JD0.d dVar5 = dVar4;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar5 = null;
        }
        ImageInfo imageInfo = dVar5.f11250d;
        if (imageInfo != null && (animateInfo2 = imageInfo.getAnimateInfo()) != null && (animatable2 = animateInfo2.getAnimatable()) != null) {
            animatable2.stop();
        }
        JD0.d dVar6 = this.f111478b;
        JD0.d dVar7 = dVar6;
        if (dVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar7 = null;
        }
        if (true != dVar7.f11257l) {
            dVar7.f11257l = true;
            dVar7.notifyPropertyChanged(396);
        }
        JD0.d dVar8 = this.f111478b;
        JD0.d dVar9 = dVar8;
        if (dVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar9 = null;
        }
        dVar9.q("再试试");
        JD0.d dVar10 = this.f111478b;
        JD0.d dVar11 = dVar10;
        if (dVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar11 = null;
        }
        ImageInfo imageInfo2 = dVar11.f11249c;
        if (imageInfo2 != null && (animateInfo = imageInfo2.getAnimateInfo()) != null && (animatable = animateInfo.getAnimatable()) != null) {
            animatable.stop();
        }
        switch (a.f111498a[this.h.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                JD0.d dVar12 = this.f111478b;
                JD0.d dVar13 = dVar12;
                if (dVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar13 = null;
                }
                dVar13.q("啊哦，匹配失败");
                charSequence = "啊哦，匹配失败";
                break;
            case 8:
            case 9:
            case 10:
            default:
                charSequence = "";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                JD0.d dVar14 = this.f111478b;
                JD0.d dVar15 = dVar14;
                if (dVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar15 = null;
                }
                dVar15.q("啊哦，创建失败");
                charSequence = "啊哦，创建失败";
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                JD0.d dVar16 = this.f111478b;
                JD0.d dVar17 = dVar16;
                if (dVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar17 = null;
                }
                dVar17.q("哦啊，进入失败");
                charSequence = "";
                break;
        }
        JD0.d dVar18 = this.f111478b;
        if (dVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
        } else {
            dVar2 = dVar18;
        }
        if (dVar2.f11259n) {
            c.a aVar = new c.a(requireContext());
            aVar.b("取消", new W60.c(this, 1));
            aVar.c("再试试", new Function1(this) { // from class: com.bilibili.tgwt.match.ui.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TogetherWatchMatchFragment f111515a;

                {
                    this.f111515a = this;
                }

                public final Object invoke(Object obj) {
                    TogetherWatchMatchFragment togetherWatchMatchFragment = this.f111515a;
                    togetherWatchMatchFragment.getClass();
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1(togetherWatchMatchFragment, new e(togetherWatchMatchFragment), null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            });
            aVar.b = charSequence;
            aVar.m = false;
            aVar.n = false;
            aVar.a().show();
        }
    }

    public final void lf() {
        AnimationInfo animateInfo;
        BiliAnimatable animatable;
        AnimationInfo animateInfo2;
        BiliAnimatable animatable2;
        Job job = this.f111495t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (!Connectivity.isConnected(Connectivity.getActiveNetworkInfo(getContext()))) {
            this.f111493r = ErrorType.ERROR_FATE_NO_NET;
        }
        int type = this.f111493r.getType();
        if (type == 1) {
            JD0.d dVar = this.f111478b;
            JD0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                dVar2 = null;
            }
            if (dVar2.h) {
                dVar2.h = false;
                dVar2.notifyPropertyChanged(266);
            }
            ToastHelper.showToastShort(getContext(), "啊哦，网络异常");
            JD0.d dVar3 = this.f111478b;
            JD0.d dVar4 = dVar3;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                dVar4 = null;
            }
            dVar4.n("重新匹配");
            JD0.d dVar5 = this.f111478b;
            if (dVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                dVar5 = null;
            }
            ImageInfo imageInfo = dVar5.f11248b;
            if (imageInfo != null && (animateInfo = imageInfo.getAnimateInfo()) != null && (animatable = animateInfo.getAnimatable()) != null) {
                animatable.stop();
            }
            Neurons.reportExposure$default(false, "pgc.watch-together-match.match-failed.0.show", MapsKt.mapOf(TuplesKt.to(Constant.IN_KEY_REASON, String.valueOf(this.f111493r.getType()))), (List) null, 8, (Object) null);
            return;
        }
        if (type != 2) {
            if (type != 3) {
                return;
            }
            c.a aVar = new c.a(requireContext());
            aVar.b("再试试", new Function1(this) { // from class: com.bilibili.tgwt.match.ui.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TogetherWatchMatchFragment f111513a;

                {
                    this.f111513a = this;
                }

                public final Object invoke(Object obj) {
                    p.b("operation", "4", "pgc.watch-together-match.match-failed.0.click", false);
                    TogetherWatchMatchFragment togetherWatchMatchFragment = this.f111513a;
                    togetherWatchMatchFragment.getClass();
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1(togetherWatchMatchFragment, new h(togetherWatchMatchFragment), null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            });
            aVar.c("加入放映室", new Function1(this) { // from class: com.bilibili.tgwt.match.ui.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TogetherWatchMatchFragment f111514a;

                {
                    this.f111514a = this;
                }

                public final Object invoke(Object obj) {
                    AnimationInfo animateInfo3;
                    BiliAnimatable animatable3;
                    TogetherWatchMatchFragment.Type type2 = TogetherWatchMatchFragment.Type.FATE_FROM_MATCH;
                    TogetherWatchMatchFragment togetherWatchMatchFragment = this.f111514a;
                    togetherWatchMatchFragment.h = type2;
                    JD0.d dVar6 = togetherWatchMatchFragment.f111478b;
                    JD0.d dVar7 = dVar6;
                    if (dVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVm");
                        dVar7 = null;
                    }
                    if (dVar7.f11252f) {
                        dVar7.f11252f = false;
                        dVar7.notifyPropertyChanged(ComposerKt.reuseKey);
                    }
                    JD0.d dVar8 = togetherWatchMatchFragment.f111478b;
                    JD0.d dVar9 = dVar8;
                    if (dVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVm");
                        dVar9 = null;
                    }
                    ImageInfo imageInfo2 = dVar9.f11250d;
                    if (imageInfo2 != null && (animateInfo3 = imageInfo2.getAnimateInfo()) != null && (animatable3 = animateInfo3.getAnimatable()) != null) {
                        animatable3.start();
                    }
                    JD0.d dVar10 = togetherWatchMatchFragment.f111478b;
                    JD0.d dVar11 = dVar10;
                    if (dVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVm");
                        dVar11 = null;
                    }
                    if (dVar11.f11257l) {
                        dVar11.f11257l = false;
                        dVar11.notifyPropertyChanged(396);
                    }
                    togetherWatchMatchFragment.f111492q = System.currentTimeMillis();
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$onMatchAndJoinClick$1(togetherWatchMatchFragment, 0L, 0L, null), 3, (Object) null);
                    JD0.d dVar12 = togetherWatchMatchFragment.f111478b;
                    if (dVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVm");
                        dVar12 = null;
                    }
                    dVar12.q("正在为你匹配放映室...");
                    Neurons.reportClick(false, "pgc.watch-together-match.match-failed.0.click", MapsKt.mapOf(TuplesKt.to("operation", "3")));
                    return Unit.INSTANCE;
                }
            });
            aVar.b = "当前无可匹配对象，去公开放映室看看吧";
            aVar.m = false;
            aVar.n = false;
            aVar.a().show();
            Neurons.reportExposure$default(false, "pgc.watch-together-match.match-failed.0.show", MapsKt.mapOf(TuplesKt.to(Constant.IN_KEY_REASON, String.valueOf(this.f111493r.getType()))), (List) null, 8, (Object) null);
            return;
        }
        JD0.d dVar6 = this.f111478b;
        JD0.d dVar7 = dVar6;
        if (dVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar7 = null;
        }
        if (dVar7.h) {
            dVar7.h = false;
            dVar7.notifyPropertyChanged(266);
        }
        ToastHelper.showToastShort(getContext(), "啊哦，服务异常");
        JD0.d dVar8 = this.f111478b;
        JD0.d dVar9 = dVar8;
        if (dVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar9 = null;
        }
        dVar9.n("重新匹配");
        JD0.d dVar10 = this.f111478b;
        if (dVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar10 = null;
        }
        ImageInfo imageInfo2 = dVar10.f11248b;
        if (imageInfo2 != null && (animateInfo2 = imageInfo2.getAnimateInfo()) != null && (animatable2 = animateInfo2.getAnimatable()) != null) {
            animatable2.stop();
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(Constant.IN_KEY_REASON, String.valueOf(this.f111493r.getType()));
        Unit unit = Unit.INSTANCE;
        Neurons.reportExposure$default(false, "pgc.watch-together-match.match-failed.0.show", MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        f0 f0VarInflate = f0.inflate(LayoutInflater.from(getContext()), viewGroup, false);
        JD0.d dVar = new JD0.d();
        this.f111478b = dVar;
        f0VarInflate.q(dVar);
        return f0VarInflate.getRoot();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        TogetherWatchAuthorizeDialog togetherWatchAuthorizeDialog = this.f111494s;
        if (togetherWatchAuthorizeDialog != null) {
            togetherWatchAuthorizeDialog.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Job job = this.f111495t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().setStatusBarColor(0);
        JD0.d dVar = this.f111478b;
        JD0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar2 = null;
        }
        if (dVar2.f11252f) {
            StatusBarCompat.setStatusBarLightMode(p3());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Type type;
        Long longOrNull;
        Integer intOrNull;
        Integer intOrNull2;
        Long longOrNull2;
        Integer intOrNull3;
        Long longOrNull3;
        Long longOrNull4;
        Long longOrNull5;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("roomId");
            this.f111480d = (string == null || (longOrNull5 = StringsKt.toLongOrNull(string)) == null) ? 0L : longOrNull5.longValue();
            String string2 = arguments.getString("seasonId");
            this.f111481e = (string2 == null || (longOrNull4 = StringsKt.toLongOrNull(string2)) == null) ? 0L : longOrNull4.longValue();
            String string3 = arguments.getString("episodeId");
            this.f111482f = (string3 == null || (longOrNull3 = StringsKt.toLongOrNull(string3)) == null) ? 0L : longOrNull3.longValue();
            Type.a aVar = Type.Companion;
            String string4 = arguments.getString("type");
            int iIntValue = (string4 == null || (intOrNull3 = StringsKt.toIntOrNull(string4)) == null) ? 0 : intOrNull3.intValue();
            aVar.getClass();
            switch (iIntValue) {
                case 1:
                    type = Type.CREATE;
                    break;
                case 2:
                    type = Type.MATCH_FROM_SQUARE;
                    break;
                case 3:
                    type = Type.MATCH_FROM_SEARCH;
                    break;
                case 4:
                    type = Type.MATCH_FROM_INVITE;
                    break;
                case 5:
                    type = Type.MATCH_FROM_MERGE;
                    break;
                case 6:
                    type = Type.MATCH_FROM_DETAIL;
                    break;
                case 7:
                    type = Type.CREATE_FROM_DETAIL;
                    break;
                case 8:
                    type = Type.FATE_FROM_DETAIL;
                    break;
                case 9:
                    type = Type.FATE_FROM_SQUARE;
                    break;
                case 10:
                    type = Type.FATE_FROM_MATCH;
                    break;
                case 11:
                    type = Type.MATCH_FROM_CARD;
                    break;
                case 12:
                    type = Type.MATCH_FROM_WAIT;
                    break;
                case 13:
                    type = Type.MATCH_FROM_DETAIL_PLAYER;
                    break;
                case 14:
                    type = Type.MATCH_FROM_INLINE_ROOM;
                    break;
                case 15:
                    type = Type.MATCH_FROM_HOT_ROOM;
                    break;
                case 16:
                    type = Type.CREATE_FROM_ROOM;
                    break;
                case 17:
                    type = Type.FATE_FROM_ROOM;
                    break;
                case 18:
                    type = Type.CREATE_FROM_ACTIVITY_ROOM;
                    break;
                case 19:
                    type = Type.MATCH_FROM_ACTIVITY_ROOM;
                    break;
                case 20:
                    type = Type.MATCH_FROM_SQUARE_HOT_ROOM;
                    break;
                case 21:
                default:
                    type = Type.DEFAULT;
                    break;
                case 22:
                    type = Type.CREATE_FROM_SQUARE_HOT_ROOM;
                    break;
                case 23:
                    type = Type.MATCH_FROM_CHAT_HALL_HOT_ROOM;
                    break;
                case 24:
                    type = Type.CREATE_FROM_SHARE_PANEL_ROOM;
                    break;
                case 25:
                    type = Type.CREATE_MIKE_ROOM;
                    break;
                case 26:
                    type = Type.JOIN_MIKE_ROOM;
                    break;
            }
            this.h = type;
            String string5 = arguments.getString("invitemid");
            this.f111484i = (string5 == null || (longOrNull2 = StringsKt.toLongOrNull(string5)) == null) ? 0L : longOrNull2.longValue();
            String string6 = arguments.getString("season_type");
            this.f111485j = (string6 == null || (intOrNull2 = StringsKt.toIntOrNull(string6)) == null) ? 0 : intOrNull2.intValue();
            JD0.d dVar = this.f111478b;
            JD0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                dVar2 = null;
            }
            String string7 = arguments.getString("is_landscape");
            boolean z6 = ((string7 == null || (intOrNull = StringsKt.toIntOrNull(string7)) == null) ? 0 : intOrNull.intValue()) == 1;
            if (z6 != dVar2.f11259n) {
                dVar2.f11259n = z6;
                dVar2.notifyPropertyChanged(335);
            }
            JD0.d dVar3 = this.f111478b;
            JD0.d dVar4 = dVar3;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                dVar4 = null;
            }
            String string8 = arguments.getString("landscape_cover");
            String str = string8;
            if (string8 == null) {
                str = "";
            }
            if (!Intrinsics.areEqual(str, dVar4.f11258m)) {
                dVar4.f11258m = str;
                dVar4.notifyPropertyChanged(334);
            }
            String string9 = arguments.getString("from_spmid");
            String str2 = string9;
            if (string9 == null) {
                str2 = "";
            }
            this.f111486k = str2;
            String string10 = arguments.getString("from_page");
            String str3 = string10;
            if (string10 == null) {
                str3 = "";
            }
            this.f111487l = str3;
            this.f111488m = Intrinsics.areEqual(arguments.getString("need_open_share"), "1");
            String string11 = arguments.getString("ext");
            if (string11 == null) {
                string11 = "";
            }
            this.f111489n = string11;
            String string12 = arguments.getString("target_room_id");
            long jLongValue = (string12 == null || (longOrNull = StringsKt.toLongOrNull(string12)) == null) ? 0L : longOrNull.longValue();
            if (jLongValue != 0) {
                this.h = Type.MATCH_FROM_MERGE;
                this.f111480d = jLongValue;
            }
        }
        this.f111492q = System.currentTimeMillis();
        switch (a.f111498a[this.h.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                JD0.d dVar5 = this.f111478b;
                JD0.d dVar6 = dVar5;
                if (dVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar6 = null;
                }
                if (dVar6.f11260o) {
                    dVar6.f11260o = false;
                    dVar6.notifyPropertyChanged(137);
                }
                JD0.d dVar7 = this.f111478b;
                JD0.d dVar8 = dVar7;
                if (dVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar8 = null;
                }
                if (dVar8.f11252f) {
                    dVar8.f11252f = false;
                    dVar8.notifyPropertyChanged(ComposerKt.reuseKey);
                }
                break;
            case 8:
            case 9:
            case 10:
                JD0.d dVar9 = this.f111478b;
                JD0.d dVar10 = dVar9;
                if (dVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar10 = null;
                }
                if (dVar10.f11260o) {
                    dVar10.f11260o = false;
                    dVar10.notifyPropertyChanged(137);
                }
                JD0.d dVar11 = this.f111478b;
                JD0.d dVar12 = dVar11;
                if (dVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar12 = null;
                }
                if (true != dVar12.f11252f) {
                    dVar12.f11252f = true;
                    dVar12.notifyPropertyChanged(ComposerKt.reuseKey);
                }
                break;
            default:
                JD0.d dVar13 = this.f111478b;
                JD0.d dVar14 = dVar13;
                if (dVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar14 = null;
                }
                if (true != dVar14.f11260o) {
                    dVar14.f11260o = true;
                    dVar14.notifyPropertyChanged(137);
                }
                break;
        }
        JD0.d dVar15 = this.f111478b;
        JD0.d dVar16 = dVar15;
        if (dVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar16 = null;
        }
        Context contextRequireContext = requireContext();
        dVar16.f11247a = this.f111496u;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) AppCompatResources.getDrawable(contextRequireContext, 2131240646);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        if (!Intrinsics.areEqual(bitmapDrawable, dVar16.f11256k)) {
            dVar16.f11256k = bitmapDrawable;
            dVar16.notifyPropertyChanged(395);
        }
        dVar16.q(contextRequireContext.getString(2131836321));
        long jMid = com.bilibili.ogv.infra.account.a.f67852b.mid();
        Lazy lazy = Nl0.i.f17294a;
        dVar16.o(((Number) Nl0.i.a(C3751q.a(jMid, "chat_fate_match_sex_select_"), 0)).intValue());
        dVar16.n(contextRequireContext.getString(2131836309));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$checkIsLoginAndPerform$1(this, null), 3, (Object) null);
    }
}
